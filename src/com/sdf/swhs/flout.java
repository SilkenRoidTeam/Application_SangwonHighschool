package com.sdf.swhs;

	import android.app.Activity; 
import android.os.Bundle;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.text.Html;
import android.util.FloatMath;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

public class flout extends Activity implements OnTouchListener {

		 // These matrices will be used to move and zoom image
		 Matrix matrix = new Matrix();
		 Matrix savedMatrix = new Matrix();

		 private static final String TAG = "Touch" ;
		  
		 // We can be in one of these 3 states
		 static final int NONE = 0;
		 static final int DRAG = 1;
		 static final int ZOOM = 2;
		 int mode = NONE; 
		 
		 //Remeber some things for zooming
		 PointF start = new PointF();
		 PointF mid = new PointF();
		 float oldDist = 1f;
		 ImageView view = null;
		 
		    @Override
		    public void onCreate(Bundle savedInstanceState) {
		        super.onCreate(savedInstanceState);
		        setContentView(R.layout.flout);
		        getActionBar()/* or getSupportActionBar() */.setTitle(Html.fromHtml("<font color=\"white\">" + getString(R.string.app_name) + "</font>"));
		       view = (ImageView) findViewById(R.id.flout); 
		        view.setOnTouchListener(this);
		         
		    }
		 public boolean onTouch(View v, MotionEvent event) {
		  // TODO Auto-generated method stub
		  //ImageView view = (ImageView) v;  
		  // Dump touch event to log
		  dumpEvent(event);
		  switch (event.getAction() & MotionEvent.ACTION_MASK) {
		  case MotionEvent.ACTION_DOWN:
		   savedMatrix.set(matrix);
		   start.set(event.getX(), event.getY());
		   Log.d(TAG, "mode=DRAG" );
		   mode = DRAG;
		   break;
		   case MotionEvent.ACTION_UP:
		   case MotionEvent.ACTION_POINTER_UP:
		   mode = NONE;
		   Log.d(TAG, "mode=NONE" );
		   break;
		   case MotionEvent.ACTION_POINTER_DOWN:
		    oldDist = spacing(event);
		    Log.d(TAG, "oldDist=" + oldDist);
		    if (oldDist > 10f) {
		    savedMatrix.set(matrix);
		    midPoint(mid, event);
		    mode = ZOOM;
		    Log.d(TAG, "mode=ZOOM" );
		    }
		    break;

		   case MotionEvent.ACTION_MOVE:
		   if (mode == DRAG) {
		   matrix.set(savedMatrix);
		   matrix.postTranslate(event.getX() - start.x,
		   event.getY() - start.y);
		   }else if (mode == ZOOM) {
		    float newDist = spacing(event);
		    Log.d(TAG, "newDist=" + newDist);
		    if (newDist > 10f) {
		    matrix.set(savedMatrix);
		    float scale = newDist / oldDist;
		    matrix.postScale(scale, scale, mid.x, mid.y);
		    }
		   }
		   break;
		   
		  } 
		  // Perform the transformation
		  view.setImageMatrix(matrix);  
		  return true; // indicate event was handled
		 }
		 
		 /** Show an event in the LogCat view, for debugging */
		 @SuppressWarnings("deprecation")
		private void dumpEvent(MotionEvent event) {
		 String names[] = { "DOWN" , "UP" , "MOVE" , "CANCEL" , "OUTSIDE" ,
		 "POINTER_DOWN" , "POINTER_UP" , "7?" , "8?" , "9?" };
		 StringBuilder sb = new StringBuilder();
		 int action = event.getAction();
		 int actionCode = action & MotionEvent.ACTION_MASK;
		 sb.append("event ACTION_" ).append(names[actionCode]);
		 if (actionCode == MotionEvent.ACTION_POINTER_DOWN
		 || actionCode == MotionEvent.ACTION_POINTER_UP) {
		 sb.append("(pid " ).append(
		 action >> MotionEvent.ACTION_POINTER_ID_SHIFT);
		 sb.append(")" );
		 }
		 sb.append("[" );
		 for (int i = 0; i < event.getPointerCount(); i++) {
		 sb.append("#" ).append(i);
		 sb.append("(pid " ).append(event.getPointerId(i));
		 sb.append(")=" ).append((int) event.getX(i));
		 sb.append("," ).append((int) event.getY(i));
		 if (i + 1 < event.getPointerCount())
		 sb.append(";" );
		 }
		 sb.append("]" );
		 Log.d(TAG, sb.toString());
		 }
		 
		   private float spacing(MotionEvent event) {

		        float x = event.getX(0) - event.getX(1); 
		        float y = event.getY(0) - event.getY(1); 
		        return FloatMath.sqrt(x * x + y * y);

		   }
		   private void midPoint(PointF point, MotionEvent event) {
		    float x = event.getX(0) + event.getX(1);
		    float y = event.getY(0) + event.getY(1);
		    point.set(x / 2, y / 2);
		   }
		}

	


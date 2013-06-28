package com.sdf.swhs;

import android.graphics.PointF;
import android.os.Bundle; 
import android.view.Menu;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TabHost;
import com.nhn.android.maps.NMapActivity;
import com.nhn.android.maps.NMapController;
import com.nhn.android.maps.NMapView;
import com.nhn.android.maps.NMapView.OnMapStateChangeListener;
import com.nhn.android.maps.maplib.NGeoPoint;
import com.nhn.android.maps.nmapmodel.NMapError;
import com.nhn.android.maps.overlay.NMapPOIdata;
import com.nhn.android.mapviewer.overlay.NMapOverlayManager;

public class SchoolInfo extends NMapActivity implements OnMapStateChangeListener 
{
	private static final String API_KEY = "f95a1e4a06542c7093876d2440525700";
    NMapView mMapView = null;  
    NMapController mMapController = null;  
    LinearLayout MapContainer;
    NMapViewerResourceProvider mMapViewerResourceProvider = null;
    NMapOverlayManager mOverlayManager;

	  
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
	protected void onCreate(Bundle savedInstanceState) 
	{  
		super.onCreate(savedInstanceState); 
		setContentView(R.layout.schinfo);
		  TabHost tabHost = (TabHost)findViewById(R.id.tabhost);
	        tabHost.setup();
	        TabHost.TabSpec spec = tabHost.newTabSpec("tag4");
	       spec.setContent(R.id.introtab1);
	       spec.setIndicator(this.getResources().getString(R.string.symbol));
	       tabHost.addTab(spec);
	        spec = tabHost.newTabSpec("tag5");
	        spec.setContent(R.id.introtab2);
	        spec.setIndicator(this.getResources().getString(R.string.schsong));          
	        tabHost.addTab(spec);
	        spec = tabHost.newTabSpec("tag6");
	        spec.setContent(R.id.introtab3);
	        spec.setIndicator(this.getResources().getString(R.string.status));   
	        tabHost.addTab(spec);
	        spec = tabHost.newTabSpec("tag7");
	        spec.setContent(R.id.introtab4);
	        spec.setIndicator(this.getResources().getString(R.string.location));          
	        tabHost.addTab(spec);
	        tabHost.setCurrentTab(0);     
	        MapContainer = (LinearLayout)findViewById(R.id.mapView);  
	        mMapView = new NMapView(this);  
	        mMapController = mMapView.getMapController();  
	        mMapView.setApiKey(API_KEY);  
	        MapContainer.addView(mMapView);  
	        mMapView.setClickable(true);  
	        mMapView.setBuiltInZoomControls(true, null);      
	        mMapView.setOnMapStateChangeListener(this); 
	        mMapViewerResourceProvider = new NMapViewerResourceProvider(this);
	        mOverlayManager = new NMapOverlayManager(this, mMapView, mMapViewerResourceProvider);
	        int markerId = NMapPOIflagType.PIN;
	    	NMapPOIdata poiData = new NMapPOIdata(1, mMapViewerResourceProvider);
	    	poiData.beginPOIdata(1);
	    	poiData.addPOIitem(126.7522696, 37.4981240, "부천상원고등학교", markerId, 0);
	    	poiData.endPOIdata();
	        mOverlayManager.createPOIdataOverlay(poiData, null);
		         
	}  
	    @Override  
	    public void onMapInitHandler(NMapView mapview, NMapError errorInfo) {  
	        if (errorInfo == null) {
	            mMapController.setMapCenter(  
	                        new NGeoPoint(126.7522696, 37.4981240), 12);  
	        } else { 
	            android.util.Log.e("NMAP", "onMapInitHandler: error="   
	                        + errorInfo.toString());  
	        }  
	    }  
	    @Override  
	    public void onZoomLevelChange(NMapView mapview, int level) {}  
	    @Override  
	    public void onMapCenterChange(NMapView mapview, NGeoPoint center) {}  
	    @Override  
	    public void onAnimationStateChange(  
	                    NMapView arg0, int animType, int animState) {}  
	    @Override  
	    public void onMapCenterChangeFine(NMapView arg0) {}  
}
package com.sdf.swhs;

import android.content.*;
import android.net.*;
import android.view.View.*;
import android.widget.*;
import android.app.Activity; 
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle; 
import android.view.View;

	public class MainActivity extends Activity
	{		
		final Context context = this;
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Button Button1 = (Button)findViewById(R.id.Button1); 
        Button1.setOnClickListener(new View.OnClickListener(){ 
		 public void onClick(View v){ 		
		  Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/")); 
		  startActivity(i);
		                            }
							
    });
	
		ImageView info = (ImageView)findViewById(R.id.info); 
		info.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 	
				            AlertDialog.Builder alert = new AlertDialog.Builder(context);
				            alert.setTitle("정보");
				            alert.setMessage("체인지로그\nPreview-FINAL\n- 급식표 개발 완료\n- 시간표 디자인 완료\n- 학급홈피 연결\n- 학급홈피 일체화\n-기타 등등..\n\n개발자 : 10501 김문식\nVersion : Release-Beta 1"); 
				 
				            alert.setNegativeButton("확인", new DialogInterface.OnClickListener() {
				            public void onClick(DialogInterface dialog, int whichButton) { 
				 
				              }
				            });
				 
				            AlertDialog alertDialog = alert.create();
				            alertDialog.show();
				   
				        }
				});
				
	ImageButton flout = (ImageButton)findViewById(R.id.flout); 
		flout.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 	
					Intent i=new Intent(MainActivity.this,flout.class);
					startActivity(i);
				}
			});
			 		ImageButton notice = (ImageButton)findViewById(R.id.notice); 
		notice.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 	
	 Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
		 ("http://sw.hs.kr/?act=news.main&comm=com")); 
		 startActivity(myIntent);
				}
			});
		ImageButton ttselect = (ImageButton)findViewById(R.id.ttable); 
		ttselect.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 	
					Intent i=new Intent(MainActivity.this,ttselect.class);
					startActivity(i);
				
				}
				});
		Button food = (Button)findViewById(R.id.food); 
		food.setOnClickListener(new View.OnClickListener(){
				public void onClick(View v){ 			
				 	Intent i=new Intent(MainActivity.this,FoodActivity.class);
					startActivity(i);
			}
				});
		ImageButton classsite = (ImageButton) findViewById(R.id.classhp);
		classsite.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{ Intent i=new Intent(MainActivity.this,classhp.class);
			startActivity(i);
	    	}});
			
}
	}

	

		 


	

package com.sdf.swhs;

import android.net.*;
import android.view.View.*;
import android.widget.*;
import android.annotation.SuppressLint;
import android.app.Activity; 
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle; 
import android.os.Handler;
import android.os.Message;
import android.view.View;


	@SuppressLint("HandlerLeak")
	public class MainActivity extends Activity
	{		
		Handler handler;
	    ImageView splashImage;
		
		boolean m_close_flag = false;
        Handler m_close_handler = new Handler() {
            public void handleMessage(Message msg) {
                m_close_flag = false;
            }
        };
        public void onBackPressed () 
        {
            if(m_close_flag == false) { 
                Toast.makeText(this, "'뒤로' 키를 한번 더 누르면 종료됩니다.", Toast.LENGTH_LONG).show();
                m_close_flag = true;
                m_close_handler.sendEmptyMessageDelayed(0, 3000);
            } else { 
                super.onBackPressed();
            }
        }
        protected void onStop()
        {
            super.onStop();
            m_close_handler.removeMessages(0);
        }

		final Context context = this;
	@Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        startActivity(new Intent(this,SplashActivity.class));
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
				            alert.setMessage("체인지로그\n- 디자인 변경\n- Android 2.0.1 이상 지원\n- 시설 배치도 이미지 이동,확대&축소 가능\n- 앱 구조 최적화\n- 아이콘 변경\n- 종료 알림 추가\n- 로딩 이미지 추가\n\n개발자 : 10501 김문식\nVersion : Preview-FINAL"); 
				 
				            alert.setNegativeButton("확인", new DialogInterface.OnClickListener() {
				            public void onClick(DialogInterface dialog, int whichButton) { 
				 
				              }
				            });
				 
				            AlertDialog alertDialog = alert.create();
				            alertDialog.show();
				   
				        }
				});
				
	Button flout = (Button)findViewById(R.id.flout); 
		flout.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 	
					Intent i=new Intent(MainActivity.this,flout.class);
					startActivity(i);
				}
			});
			 		Button notice = (Button)findViewById(R.id.notice); 
		notice.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 	
	 Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
		 ("http://sw.hs.kr/?act=news.main&comm=com")); 
		 startActivity(myIntent);
				}
			});
		Button ttselect = (Button)findViewById(R.id.ttable); 
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
		Button classsite = (Button) findViewById(R.id.classhp);
		classsite.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{ Intent i=new Intent(MainActivity.this,classhp.class);
			startActivity(i);
	    	}});
		
}

	}
	

	

		 


	

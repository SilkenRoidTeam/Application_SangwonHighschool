//Copyright 2013 Written by K.M.S 
//Main Activity
//Reference to 'http://developer.android.com/, http://stackoverflow.com/'

package com.sdf.swhs;

import android.net.*;
import android.support.v4.app.FragmentActivity;
import android.text.Html;
import android.view.View.*;
import android.widget.*;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle; 
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


	@SuppressLint("HandlerLeak")
	public class MainActivity extends FragmentActivity
	{		
		//if you touched back button,showed exit message
		Handler handler;
		
		boolean m_close_flag = false;
        Handler m_close_handler = new Handler() {
            public void handleMessage(Message msg) {
                m_close_flag = false;
            }
        };
        public void onBackPressed () 
        {
            if(m_close_flag == false) { 
                Toast.makeText(this, "한번 더 누르시면 종료됩니다.", Toast.LENGTH_SHORT).show();
                m_close_flag = true;
                m_close_handler.sendEmptyMessageDelayed(0, 1000);
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
        
        getActionBar()/* or getSupportActionBar() */.setTitle(Html.fromHtml("<font color=\"white\">" + getString(R.string.app_name) + "</font>"));
        
        //link school web sites
        Button Button1 = (Button)findViewById(R.id.Button1); 
        Button1.setOnClickListener(new View.OnClickListener(){ 
		 public void onClick(View v){ 		
		  Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/")); 
		  startActivity(i);
		                            }
							
    });
	
        
				
	Button flout = (Button)findViewById(R.id.flout); 
		flout.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 	
					Intent i=new Intent(MainActivity.this,flout.class);
					startActivity(i);
				}
			});
		Button schinfo = (Button)findViewById(R.id.schinfo); 
		schinfo.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 	
					Intent i=new Intent(MainActivity.this,SchoolInfo.class);
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
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	 getMenuInflater().inflate(R.menu.actionitem, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {
        case R.id.info:	
        		 startActivity(new Intent(this, Preference.class));
            break;
        case R.id.kakaot:
       	 Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
       			 ("kakaolink://sendurl?msg=상원고등학교 앱이 3.0으로 업그레이드 되었습니다.\n다음 링크를 누르시고 View Raw를 누르면 다운로드가 시작됩니다.\n 다운로드 :&url=http://github.com/SpaceDroidF/Application_SangwonHighschool/tree/master/bin/SangwonHighschool.apk&appid=com.sdf.swhs&appver=2.0"));
       			 startActivity(myIntent);
       			 break;
        case R.id.kakaos:
         	 Intent ks = new Intent(Intent.ACTION_VIEW, Uri.parse
         			 ("storylink://posting?post=상원고등학교 앱이 3.0으로 업그레이드 되었습니다.\n다음 링크를 누르시고 View Raw를 누르면 다운로드가 시작됩니다.\n\n다운로드 :\nhttp://github.com/SpaceDroidF/Application_SangwonHighschool/tree/master/bin/SangwonHighschool.apk&appid=com.sdf.swhs&appver=2.0&apiver=1.0&appname=상원고등학교 APP"));
         			 startActivity(ks);
        default:
            return super.onOptionsItemSelected(item);
        }
        return true;
    }
    
	}
	

	

		 


	

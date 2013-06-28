package com.sdf.swhs;

import android.net.*;
import android.view.View.*;
import android.widget.*;
import android.annotation.SuppressLint;
import android.app.Activity; 
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle; 
import android.os.Handler;
import android.os.Message;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


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
                Toast.makeText(this, "�����ϽǷ��� '�ڷ�'��ư�� �ѹ� �� ��������.", Toast.LENGTH_SHORT).show();
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
        		 startActivity(new Intent(this, OtherPreferencesActivity.class));
            break;
        case R.id.kakaot:
       	 Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
       			 ("kakaolink://sendurl?msg=���ο� ��õ �������б� ���� ���Խ��ϴ�.���� ��� �߰��� ���� ���� ���������ϴ�.���� ��ũ�� �����ð� View Raw�� ������ �ٿ�ε尡 ���۵˴ϴ�.\n �ٿ�ε� :&url=http://github.com/SpaceDroidF/Application_SangwonHighschool/tree/master/bin/SangwonHighschool.apk&appid=com.sdf.swhs&appver=1.2.16"));
       			 startActivity(myIntent);
       			 break;
        case R.id.kakaos:
         	 Intent ks = new Intent(Intent.ACTION_VIEW, Uri.parse
         			 ("storylink://posting?post=���ο� ��õ �������б� ���� ���Խ��ϴ�.������ ���� �� ��� �߰��� ���� ���� ���������ϴ�.���� ��ũ�� �����ð� View Raw�� ������ �ٿ�ε尡 ���۵˴ϴ�.\n\n�ٿ�ε� :\nhttp://github.com/SpaceDroidF/Application_SangwonHighschool/tree/master/bin/SangwonHighschool.apk&appid=com.sdf.swhs&appver=1.2.16&apiver=1.0&appname=�������б� APP"));
         			 startActivity(ks);
        default:
            return super.onOptionsItemSelected(item);
        }
        return true;
    }
	}
	

	

		 


	

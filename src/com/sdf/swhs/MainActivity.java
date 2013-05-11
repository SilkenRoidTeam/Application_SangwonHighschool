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
import android.os.Handler;
import android.os.Message;
import android.view.View;


	public class MainActivity extends Activity
	{		
		
		boolean m_close_flag = false;
        Handler m_close_handler = new Handler() {
            public void handleMessage(Message msg) {
                m_close_flag = false;
            }
        };
        public void onBackPressed () 
        {
            if(m_close_flag == false) { 
                Toast.makeText(this, "Back Ű�� �ѹ� �� ������ ����˴ϴ�.", Toast.LENGTH_LONG).show();
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
				            alert.setTitle("����");
				            alert.setMessage("ü�����α�\n- ������ ����\n- Android 2.0.1 �̻� ����\n- �ü� ��ġ�� �̹��� �̵�,Ȯ��&��� ����\n- �� ���� ����ȭ\n- ������ ����\n- ���� �˸� �߰�\n\n������ : 10501 �蹮��\nVersion : Preview-FINAL"); 
				 
				            alert.setNegativeButton("Ȯ��", new DialogInterface.OnClickListener() {
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
	

	

		 


	

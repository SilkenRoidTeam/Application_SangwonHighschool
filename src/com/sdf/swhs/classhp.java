package com.sdf.swhs;

import android.app.Activity; 
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle; 
import android.view.View;
import android.widget.Button;
import android.widget.TabHost;


	public class classhp extends Activity
	{
		@Override
		public void onCreate(Bundle savedInstanceState) 
		{  
			super.onCreate(savedInstanceState); 
			setContentView(R.layout.classhp);
	
			Button g1c1 = (Button)findViewById(R.id.g1c1); 
			g1c1.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130101"));
					startActivity(myIntent);
				}});
			Button g1c2= (Button)findViewById(R.id.g1c2); 
			g1c2.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130102"));
					startActivity(myIntent);
				}});
			Button g1c3 = (Button)findViewById(R.id.g1c3); 
			g1c3.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130103"));
					startActivity(myIntent);
				}});
			Button g1c4 = (Button)findViewById(R.id.g1c4); 
			g1c4.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130104"));
					startActivity(myIntent);
				}	});
			Button g1c5 = (Button)findViewById(R.id.g1c5); 
			g1c5.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130105"));
					startActivity(myIntent);
				}});
			Button g1c6 = (Button)findViewById(R.id.g1c6); 
			g1c6.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130106"));
					startActivity(myIntent);
				}});
			Button g1c7 = (Button)findViewById(R.id.g1c7); 
			g1c7.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130107"));
					startActivity(myIntent);
				}	});
			Button g1c8 = (Button)findViewById(R.id.g1c8); 
			g1c8.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130108"));
					startActivity(myIntent);
				}});
			Button g1c9 = (Button)findViewById(R.id.g1c9); 
			g1c9.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130109"));
					startActivity(myIntent);
				}});
			Button g1c10 = (Button)findViewById(R.id.g1c10); 
			g1c10.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130110"));
					startActivity(myIntent);
				}});
			Button g2c1 = (Button)findViewById(R.id.g2c1); 
			g2c1.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130201"));
					startActivity(myIntent);
				}});
			Button g2c2= (Button)findViewById(R.id.g2c2); 
			g2c2.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130202"));
					startActivity(myIntent);
				}});
			Button g2c3 = (Button)findViewById(R.id.g2c3); 
			g2c3.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130203"));
					startActivity(myIntent);
				}});
			Button g2c4 = (Button)findViewById(R.id.g2c4); 
			g2c4.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130204"));
					startActivity(myIntent);
				}});
			Button g2c5 = (Button)findViewById(R.id.g2c5); 
			g2c5.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130205"));
					startActivity(myIntent);
				}});
			Button g2c6 = (Button)findViewById(R.id.g2c6); 
			g2c6.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130206"));
					startActivity(myIntent);
				}});
			Button g2c7 = (Button)findViewById(R.id.g2c7); 
			g2c7.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130207"));
					startActivity(myIntent);
				}});
			Button g2c8 = (Button)findViewById(R.id.g2c8); 
			g2c8.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130208"));
					startActivity(myIntent);
				}});
			Button g2c9 = (Button)findViewById(R.id.g2c9); 
			g2c9.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130209"));
					startActivity(myIntent);
				}});
			Button g2c10 = (Button)findViewById(R.id.g2c10); 
			g2c10.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130210"));
					startActivity(myIntent);
				}});
			Button g3c1 = (Button)findViewById(R.id.g3c1); 
			g3c1.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130301"));
					startActivity(myIntent);
				}});
			Button g3c2= (Button)findViewById(R.id.g3c2); 
			g3c2.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130302"));
					startActivity(myIntent);
				}});
			Button g3c3 = (Button)findViewById(R.id.g3c3); 
			g3c3.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130303"));
					startActivity(myIntent);
				}});
			Button g3c4 = (Button)findViewById(R.id.g3c4); 
			g3c4.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130304"));
					startActivity(myIntent);
				}});
			Button g3c5 = (Button)findViewById(R.id.g3c5); 
			g3c5.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130305"));
					startActivity(myIntent);
				}});
			Button g3c6 = (Button)findViewById(R.id.g3c6); 
			g3c6.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130306"));
					startActivity(myIntent);
				}});
			Button g3c7 = (Button)findViewById(R.id.g3c7); 
			g3c7.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130307"));
					startActivity(myIntent);
				}});
			Button g3c8 = (Button)findViewById(R.id.g3c8); 
			g3c8.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130308"));
					startActivity(myIntent);
				}});
			Button g3c9 = (Button)findViewById(R.id.g3c9); 
			g3c9.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130309"));
					startActivity(myIntent);
				}});
			Button g3c10 = (Button)findViewById(R.id.g3c10); 
			g3c10.setOnClickListener(new View.OnClickListener(){ 
				public void onClick(View v){ 
					Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://sw.hs.kr/cafe.php?cafe_id=20130310"));
					startActivity(myIntent);
				}});
			  TabHost tabHost = (TabHost)findViewById(R.id.tabhost);
		        tabHost.setup();
		        TabHost.TabSpec spec = tabHost.newTabSpec("tag1");
		       spec.setContent(R.id.tab1);
		       spec.setIndicator(this.getResources().getString(R.string.grade1));
		       tabHost.addTab(spec);
		        spec = tabHost.newTabSpec("tag2");
		        spec.setContent(R.id.tab2);
		        spec.setIndicator(this.getResources().getString(R.string.grade2));          
		        tabHost.addTab(spec);
		        spec = tabHost.newTabSpec("tag3");
		        spec.setContent(R.id.tab3);
		        spec.setIndicator(this.getResources().getString(R.string.grade3));   
		        tabHost.addTab(spec);
		        tabHost.setCurrentTab(0);     
		     
		    	
		}
}

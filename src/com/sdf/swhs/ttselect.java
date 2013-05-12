package com.sdf.swhs;

import android.app.Activity; 
import android.os.Bundle; 
import android.webkit.WebView;



	public class ttselect extends Activity
	{
		WebView wv;
		 @Override
		public void onCreate(Bundle savedInstanceState) 
		{  
			super.onCreate(savedInstanceState); 
			setContentView(R.layout.ttselect);
	wv=(WebView)findViewById(R.id.ttableview);
	wv.loadUrl("file:///android_asset/timetable.html");
		
		}
}

package com.sdf.swhs;

import android.app.Activity; 
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Bundle; 
import android.webkit.WebView;
import android.widget.Toast;

	public class ttselect extends Activity
	{
		WebView wv;
		ProgressDialog dialog;
		 @Override
		public void onCreate(Bundle savedInstanceState) 
		{  
			super.onCreate(savedInstanceState); 
			setContentView(R.layout.ttselect);
	wv=(WebView)findViewById(R.id.ttableview);
	wv.loadUrl("file:///android_asset/timetable.html");
		
		}
		 @SuppressWarnings("deprecation")
		public void onPageStarted(WebView view, String url, Bitmap favicon) {
			    dialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
			    dialog.setTitle(R.string.load);
			    dialog.setMessage(getText(R.string.ttload));
			    dialog.setProgress(0);
			    dialog.setMax(100);
			    dialog.setButton("취소", new DialogInterface.OnClickListener() {
			        public void onClick(DialogInterface dialog, int which) {
			            dialog.cancel();
			        }
			    });
			    dialog.show();
			}
			// 페이지 로딩시 
			public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
			    Toast.makeText(null, getText(R.string.tt_error) + description, Toast.LENGTH_SHORT).show();
			    if (dialog.isShowing()) {
			        dialog.cancel();
			    }
			}
			// 페이지 종료 
			public void onPageFinished(WebView view, String url) {
			    if (dialog.isShowing()) {
			        dialog.cancel();
			    }
			}
}

package com.sdf.swhs;

import android.app.Activity;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import toast.library.meal.*;
import android.app.ProgressDialog;
import android.content.Intent;

public class FoodActivity extends Activity
{
	private FoodSync FoodSync;
@Override
protected void onCreate(Bundle savedInstanceState) { 
	super.onCreate(savedInstanceState);
	setContentView(R.layout.food);
	getActionBar()/* or getSupportActionBar() */.setTitle(Html.fromHtml("<font color=\"white\">" + getString(R.string.app_name) + "</font>"));
  	 FoodSync = new FoodSync();
  	 FoodSync.execute("");
}
public class FoodSync extends AsyncTask<String, Integer, Long> {
	ProgressDialog foodload = ProgressDialog.show(FoodActivity.this,"", 
            "급식 데이터를 받는 중입니다.\n3G/LTE/LTE-A 데이터 네트워크를 사용하실 경우 데이터 통화료가 부과됩니다.\n(Wi-Fi 및 3G/LTE 무제한 제외).",true);
	String[] meal = new String[7];
	String[] date = new String[7];
	String[] dinner = new String[7];
	final TextView tv1 = (TextView)findViewById(R.id.date);
	final TextView tv2 = (TextView)findViewById(R.id.dinner);
	final TextView tv = (TextView)findViewById(R.id.food);
	@Override
	protected void onPostExecute(Long result) {
		Button mon = (Button)findViewById(R.id.mon);
		mon.setOnClickListener(new View.OnClickListener(){ 
			public void onClick(View v){
				if (tv == null){
					//tv.setText = ("중식이 없습니다.");
				}else{
				tv1.setText(date[1]);
				tv.setText(meal[1]);
				tv2.setText(dinner[1]);
				}}
			});
		Button tue = (Button)findViewById(R.id.tue); 
		tue.setOnClickListener(new View.OnClickListener(){ 
						public void onClick(View v){ 
							tv1.setText(date[2]);
							tv2.setText(dinner[2]);
							tv.setText(meal[2]);
						}
						});
		Button wed = (Button)findViewById(R.id.wed); 
		wed.setOnClickListener(new View.OnClickListener(){ 
						public void onClick(View v){ 
							tv1.setText(date[3]);
							tv2.setText(dinner[3]);
							tv.setText(meal[3]);
						}
						});
		Button thu = (Button)findViewById(R.id.thu); 
		thu.setOnClickListener(new View.OnClickListener(){ 
						public void onClick(View v){ 
							tv1.setText(date[4]);
							tv2.setText(dinner[4]);
							tv.setText(meal[4]);
						}
						});
		Button fri = (Button)findViewById(R.id.fri); 
		fri.setOnClickListener(new View.OnClickListener(){ 
						public void onClick(View v){ 
							tv1.setText(date[5]);
							tv2.setText(dinner[5]);
							tv.setText(meal[5]);
						}
						});
		tv1.setText(date[1]);
		tv.setText(meal[1]);
		tv2.setText(dinner[1]);
	super.onPostExecute(result);
	foodload.dismiss();
	}
	

	protected Long doInBackground(String... params) {
	String CountryCode, schulCode, schulCrseScCode, schulKndScCode, schMmealScCode;
	CountryCode = "goe.go.kr";
	schulCode = "J100005399";
	schulCrseScCode = "4";
	schulKndScCode = "04";
	schMmealScCode = "2";
	date = MealLibrary.getDate(CountryCode, schulCode, schulCrseScCode, schulKndScCode, schMmealScCode);
	meal = MealLibrary.getMeal(CountryCode, schulCode, schulCrseScCode, schulKndScCode, schMmealScCode);
	schMmealScCode = "3";
	dinner = MealLibrary.getMeal(CountryCode, schulCode, schulCrseScCode, schulKndScCode, schMmealScCode);
	return null;
	}

}
@Override
public boolean onCreateOptionsMenu(Menu menu) {
	 getMenuInflater().inflate(R.menu.foodshare, menu);
    return true;
}
@Override
public boolean onOptionsItemSelected(MenuItem item) {
    switch(item.getItemId()) {
    case R.id.kakaot_food:
   	 Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse
   			 ("kakaolink://sendurl?msg=[상원고등학교]\n오늘의 급식은\n[중식]"+(TextView)findViewById(R.id.food)+"[석식]입니다.&url=&appid=com.sdf.swhs&appver=3.0"));
   			 startActivity(myIntent);
   			 break;
    default:
        return super.onOptionsItemSelected(item);
    }
    return true;
}
}
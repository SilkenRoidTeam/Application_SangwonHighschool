package com.sdf.swhs;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import toast.library.meal.*;
import android.app.ProgressDialog;

public class FoodActivity extends Activity
{
	private FoodSync FoodSync;
@Override
protected void onCreate(Bundle savedInstanceState) { 
	super.onCreate(savedInstanceState);
	setContentView(R.layout.food);
  	 FoodSync = new FoodSync();
  	 FoodSync.execute("");
}
public class FoodSync extends AsyncTask<String, Integer, Long> {
	ProgressDialog foodload = ProgressDialog.show(FoodActivity.this,"", 
            "급식 데이터를 받는 중입니다.\n인터넷을 사용하므로 데이터 사용료가 부과됩니다(WI-FI 제외).",true);
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
				tv1.setText(date[1]);
				tv.setText(meal[1]);
				tv2.setText(dinner[1]);
			}
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
}
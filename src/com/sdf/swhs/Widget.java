package com.sdf.swhs;

import android.app.Activity;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.widget.RemoteViews;

public class Widget extends Activity {
	public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds){
	final int N = appWidgetIds.length;
	for (int i=0; i<N; i++) {
	int appWidgetId = appWidgetIds[i];
	RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.food);
	appWidgetManager.updateAppWidget(appWidgetId, views);
	}}
}

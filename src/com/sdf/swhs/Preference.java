//Copyright 2013 Written by K.M.S 
//Preference Menu
//Reference to 'http://developer.android.com/reference/android/preference/PreferenceFragment.html'

package com.sdf.swhs;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.text.Html;

public class Preference extends PreferenceActivity {
 
    @Override
    protected void onCreate(Bundle paramBundle)
    {
      super.onCreate(paramBundle);
      getActionBar()/* or getSupportActionBar() */.setTitle(Html.fromHtml("<font color=\"white\">" + getString(R.string.app_name) + "</font>"));
      addPreferencesFromResource(R.xml.settings);
    }
}



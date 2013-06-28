package com.sdf.swhs;

import java.util.List;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.preference.Preference;
import android.preference.PreferenceActivity;

public class OtherPreferencesActivity extends PreferenceActivity {
    @TargetApi(11)
	@Override
    public void onBuildHeaders(List<Header> target) {
        loadHeadersFromResource(R.xml.preference_headers, target);
    }
}
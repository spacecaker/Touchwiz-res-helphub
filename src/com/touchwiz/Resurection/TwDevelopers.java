package com.touchwiz.Resurection;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.Preference;
import android.content.Intent;
import android.net.Uri;

public class TwDevelopers extends PreferenceActivity{

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        addPreferencesFromResource(R.xml.twdevs);
        setContentView(R.layout.twdevelopers);
        findPreference("twchangelog").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            public boolean onPreferenceClick(Preference preference)
            {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://forum.xda-developers.com/showpost.php?p=43449443&postcount=2"));
                startActivity(intent);
                return true;
            }
        }
        );
        findPreference("twthread").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {
            public boolean onPreferenceClick(Preference preference)
            {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://forum.xda-developers.com/showthread.php?t=2358404"));
                startActivity(intent);
                return true;
            }
        }
        );
        findPreference("usefull").setOnPreferenceClickListener(new Preference.OnPreferenceClickListener() {

            public boolean onPreferenceClick(Preference preference)
            {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://forum.xda-developers.com/showpost.php?p=43449496&postcount=5"));
                startActivity(intent);
                return true;
            }
        }
        );
    }




}


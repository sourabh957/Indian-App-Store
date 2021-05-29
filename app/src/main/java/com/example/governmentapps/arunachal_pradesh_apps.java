package com.example.governmentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/*
1)Arogya Arunachal
	https://play.google.com/store/apps/details?id=com.mdindia.apr.android_aprapp

2)Arunachal Headlines
	https://play.google.com/store/apps/details?id=app.arunachalheadlines

3)Arunachal Pradesh Job Alerts
	https://play.google.com/store/apps/details?id=com.arunachal.pradesh.jobss

4)Geography of Arunachal Pradesh Hindi
	https://play.google.com/store/apps/details?id=com.GeographyArunachalPradesh.hea

5)Government Schemes in Arunachal Pradesh
	https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinarunachalpradesh

6)History of Arunachal Pradesh
	https://play.google.com/store/apps/details?id=com.historyisfun.arunachalpradesh

7)News Portal Arunachal Pradesh
	https://play.google.com/store/apps/details?id=aidapp.newsportalarunachalpradesh
 */

public class arunachal_pradesh_apps extends AppCompatActivity {

    private List<appStyle> arunachal_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arunachal_pradesh_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();

        arunachal_app_list.add(new appStyle("Arogya Arunachal", R.drawable.arogya_arunachal, "https://play.google.com/store/apps/details?id=com.mdindia.apr.android_aprapp"));
        arunachal_app_list.add(new appStyle("Arunachal Headlines", R.drawable.arunachal_headlines, "https://play.google.com/store/apps/details?id=app.arunachalheadlines"));
        arunachal_app_list.add(new appStyle("Arunachal Pradesh Job Alerts", R.drawable.arunachal_pradesh_jobs, "https://play.google.com/store/apps/details?id=com.arunachal.pradesh.jobss"));
        arunachal_app_list.add(new appStyle("Geography of Arunachal Pradesh Hindi", R.drawable.geography_of_arunachal_pradesh, "https://play.google.com/store/apps/details?id=com.GeographyArunachalPradesh.hea"));
        arunachal_app_list.add(new appStyle("Government Schemes in Arunachal Pradesh", R.drawable.government_schemes_in_ap, "https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinarunachalpradesh"));
        arunachal_app_list.add(new appStyle("History of Arunachal Pradesh", R.drawable.history_of_arunachal_pradesh, "https://play.google.com/store/apps/details?id=com.historyisfun.arunachalpradesh"));
        arunachal_app_list.add(new appStyle("News Portal Arunachal Pradesh", R.drawable.news_portal_arunachal_pradesh, "https://play.google.com/store/apps/details?id=aidapp.newsportalarunachalpradesh"));


        ListView aap = (ListView) findViewById(R.id.ArunachalAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = arunachal_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(arunachal_pradesh_apps.this, R.layout.list_view_layout, arunachal_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = arunachal_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
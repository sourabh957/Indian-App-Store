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
1)English <=> Mizo Dictionary
	https://play.google.com/store/apps/details?id=com.khampat.zoliana.dictionary

2)Government Schemes in Mizoram
	https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinmizoram

3)mCOVID-19
	https://play.google.com/store/apps/details?id=gov.mizoram.mcovid19

4)Mizoram Jobs
	https://play.google.com/store/apps/details?id=com.mizoram.jobss

5)Mizoram Lottery Results
	https://play.google.com/store/apps/details?id=com.autofillwand.mizoramlotteryresult

6)Mizobank Mobile Banking
	https://play.google.com/store/apps/details?id=com.lcode.mizoramrb

7)Mizoram News - A Daily Mizoram Newspaper Apps
	https://play.google.com/store/apps/details?id=com.mizoram.newspaper

8)Mizoram Property Returns
	https://play.google.com/store/apps/details?id=in.gov.mizoram.propertyreturns.propertyreturns

9)Mizoram Safety App
	https://play.google.com/store/apps/details?id=in.nic.mizoram.mizoramsafety

10)News Portal Mizoram
	https://play.google.com/store/apps/details?=aidapp.newsportalmizoram

11)Tour to Mizoram
	https://play.google.com/store/apps/details?id=com.vasithwam.apps.tourtomizoram

 */


public class mizoramApps extends AppCompatActivity {

    private List<appStyle> mizoram_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mizoram_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        mizoram_app_list.add(new appStyle("English <=> Mizo Dictionary", R.drawable.english_mizo_dictionary, "https://play.google.com/store/apps/details?id=com.khampat.zoliana.dictionary"));
        mizoram_app_list.add(new appStyle("Government Schemes in Mizoram", R.drawable.government_schemes_in_mizo, "https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinmizoram"));
        mizoram_app_list.add(new appStyle("mCOVID-19", R.drawable.mizo_covid, "https://play.google.com/store/apps/details?id=gov.mizoram.mcovid19"));
        mizoram_app_list.add(new appStyle("Mizoram Jobs", R.drawable.mizo_jobs, "https://play.google.com/store/apps/details?id=com.mizoram.jobss"));
        mizoram_app_list.add(new appStyle("Mizoram Lottery Results", R.drawable.mizo_lottery_results, "https://play.google.com/store/apps/details?id=com.autofillwand.mizoramlotteryresult"));
        mizoram_app_list.add(new appStyle("Mizobank Mobile Banking", R.drawable.mizo_mobile_banking, "https://play.google.com/store/apps/details?id=com.lcode.mizoramrb"));
        mizoram_app_list.add(new appStyle("Mizoram News - A Daily Mizoram Newspaper Apps", R.drawable.mizo_news, "https://play.google.com/store/apps/details?id=com.mizoram.newspaper"));
        mizoram_app_list.add(new appStyle("Mizoram Property Returns", R.drawable.mizo_property_returns, "https://play.google.com/store/apps/details?id=in.gov.mizoram.propertyreturns.propertyreturns"));
        mizoram_app_list.add(new appStyle("Mizoram Safety App", R.drawable.mizo_safety_app, "https://play.google.com/store/apps/details?id=in.nic.mizoram.mizoramsafety"));
        mizoram_app_list.add(new appStyle("News Portal Mizoram", R.drawable.news_portal_mizo, "https://play.google.com/store/apps/details?=aidapp.newsportalmizoram"));
        mizoram_app_list.add(new appStyle("Tour to Mizoram", R.drawable.tour_to_mizo, "https://play.google.com/store/apps/details?id=com.vasithwam.apps.tourtomizoram"));


        ListView aap = (ListView) findViewById(R.id.mizoramAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = mizoram_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(mizoramApps.this, R.layout.list_view_layout, mizoram_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = mizoram_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
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
1)Government Schemes in Meghalaya
	https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinmeghalaya

2)Meghalaya Jobs
	https://play.google.com/store/apps/details?id=com.meghalaya.jobss

3)Meghalaya (ML) RTO Vehicle Owner Details
	https://play.google.com/store/apps/details?id=com.binakapps.meghalayamlrtovehicleownerdetails

4)Meghalaya News - Daily Meghalaya Selected News App
	https://play.google.com/store/apps/details?id=com.meghalaya.newspaper

5)Meghalaya Police Citizen Services
	https://play.google.com/store/apps/details?id=megscrb.nic.in.citizenservices

6)Meghalaya Tourism
	https://play.google.com/store/apps/details?id=com.xlayer.meg.gov.tourism

7)Meghalaya Youth Network (MYN)
	https://play.google.com/store/apps/details?id=ipglobal.com

8)News Portal Meghalaya
	https://play.google.com/store/apps/details?id=aidapp.newsportalmeghalaya

9)Smart Shillong
	https://play.google.com/store/apps/details?id=com.ionicframework.shillongone874656

 */


public class meghalayaApps extends AppCompatActivity {

    private List<appStyle> meghalaya_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meghalaya_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        meghalaya_app_list.add(new appStyle("Government Schemes in Meghalaya", R.drawable.government_schemes_in_megh, "https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinmeghalaya"));
        meghalaya_app_list.add(new appStyle("Meghalaya Jobs", R.drawable.megh_jobs, "https://play.google.com/store/apps/details?id=com.meghalaya.jobss"));
        meghalaya_app_list.add(new appStyle("Meghalaya (ML) RTO Vehicle Owner Details", R.drawable.megh_ml_rto, "https://play.google.com/store/apps/details?id=com.binakapps.meghalayamlrtovehicleownerdetails"));
        meghalaya_app_list.add(new appStyle("Meghalaya News - Daily Meghalaya Selected News App", R.drawable.megh_news, "https://play.google.com/store/apps/details?id=com.meghalaya.newspaper"));
        meghalaya_app_list.add(new appStyle("Meghalaya Police Citizen Services", R.drawable.megh_police, "https://play.google.com/store/apps/details?id=megscrb.nic.in.citizenservices"));
        meghalaya_app_list.add(new appStyle("Meghalaya Tourism", R.drawable.megh_tourism, "https://play.google.com/store/apps/details?id=com.xlayer.meg.gov.tourism"));
        meghalaya_app_list.add(new appStyle("Meghalaya Youth Network (MYN)", R.drawable.megh_youth_network, "https://play.google.com/store/apps/details?id=ipglobal.com"));
        meghalaya_app_list.add(new appStyle("News Portal Meghalaya", R.drawable.news_portal_megh, "https://play.google.com/store/apps/details?id=aidapp.newsportalmeghalaya"));
        meghalaya_app_list.add(new appStyle("Smart Shillong", R.drawable.smart_shillong, "https://play.google.com/store/apps/details?id=com.ionicframework.shillongone874656"));

        ListView aap = (ListView) findViewById(R.id.meghalayaAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = meghalaya_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(meghalayaApps.this, R.layout.list_view_layout, meghalaya_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = meghalaya_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
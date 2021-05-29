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
1)Goa 365
	https://play.google.com/store/apps/details?id=goa365.tv.io

2)Goa Exicse
	https://play.google.com/store/apps/details?id=com.nicgoa.goaexcisenic.goaexcise

3)Goa Hotels Booking
	https://play.google.com/store/apps/details?id=newdigitalapps.goahotels

4)Goa Jobs
	https://play.google.com/store/apps/details?id=com.goa.jobss

5)All Goa NewsPapers
	https://play.google.com/store/apps/details?id=a5starapps.com.goanewspapers

6)Goa Property
	https://play.google.com/store/apps/details?id=com.daanav.goaproperty

7)Goa Tourism
	https://play.google.com/store/apps/details?id=com.gtdc.gel

8)Goa App - Goa Tourism Travel Guide
	https://play.google.com/store/apps/details?id=goa.tourism

9)Goa Traffic Sentinel
	https://play.google.com/store/apps/details?id=com.gel.goaonline

10)Goa Vehicle Information
	https://play.google.com/store/apps/details?id=com.photographerapps.goavehicleinformation

11)Goa Water Billing
	https://play.google.com/store/apps/details?id=com.ctech.goawaterbilling

12)GOAPSC Exam
	https://play.google.com/store/apps/details?id=com.sanaedutech.goapsc

13)Government Schemes in Goa
	https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesingoa

 */

public class goaApps extends AppCompatActivity {

    private List<appStyle> goa_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goa_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        goa_app_list.add(new appStyle("Goa 365", R.drawable.goa_365, "https://play.google.com/store/apps/details?id=goa365.tv.io"));
        goa_app_list.add(new appStyle("Goa Exicse", R.drawable.goa_exicse, "https://play.google.com/store/apps/details?id=com.nicgoa.goaexcisenic.goaexcise"));
        goa_app_list.add(new appStyle("Goa Hotels Booking", R.drawable.goa_hotel_booking, "https://play.google.com/store/apps/details?id=newdigitalapps.goahotels"));
        goa_app_list.add(new appStyle("Goa Jobs", R.drawable.goa_jobs, "https://play.google.com/store/apps/details?id=com.goa.jobss"));
        goa_app_list.add(new appStyle("All Goa NewsPapers", R.drawable.goa_news_paper, "https://play.google.com/store/apps/details?id=a5starapps.com.goanewspapers"));
        goa_app_list.add(new appStyle("Goa Property", R.drawable.goa_property, "https://play.google.com/store/apps/details?id=com.daanav.goaproperty"));
        goa_app_list.add(new appStyle("Goa Tourism", R.drawable.goa_tourism, "https://play.google.com/store/apps/details?id=com.gtdc.gel"));
        goa_app_list.add(new appStyle("Goa App - Goa Tourism Travel Guide", R.drawable.goa_tourism_travel_guide, "https://play.google.com/store/apps/details?id=goa.tourism"));
        goa_app_list.add(new appStyle("Goa Traffic Sentinel", R.drawable.goa_traffic_sentinel, "https://play.google.com/store/apps/details?id=com.gel.goaonline"));
        goa_app_list.add(new appStyle("Goa Vehicle Information", R.drawable.goa_vehicle_information, "https://play.google.com/store/apps/details?id=com.photographerapps.goavehicleinformation"));
        goa_app_list.add(new appStyle("Goa Water Billing", R.drawable.goa_water_billing, "https://play.google.com/store/apps/details?id=com.ctech.goawaterbilling"));
        goa_app_list.add(new appStyle("GOAPSC Exam", R.drawable.goapsc_exam, "https://play.google.com/store/apps/details?id=com.sanaedutech.goapsc"));
        goa_app_list.add(new appStyle("Government Schemes in Goa", R.drawable.government_schemes_in_goa, "https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesingoa"));


        ListView aap = (ListView) findViewById(R.id.goaAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = goa_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(goaApps.this, R.layout.list_view_layout, goa_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = goa_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
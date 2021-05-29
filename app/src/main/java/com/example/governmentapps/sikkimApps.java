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
1)Government Schemes in Sikkim
	https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinsikkim

2)Sikkim Edutech
	https://play.google.com/store/apps/details?id=com.netspeq.sikkimedutech

3)Sikkim Express
	https://play.google.com/store/apps/details?id=sikkimexpress.com.sikkimexpressmobileapp

4)Sikkim Herald
	https://play.google.com/store/apps/details?id=com.sikkimherald.app

5)Sikkim Jobs
	https://play.google.com/store/apps/details?id=com.sikkim.jobss

6)Sikkim - News/Videos
	https://play.google.com/store/apps/details?id=com.buzzato.sikkim

7)Sikkim Prepaid Taxi
	https://play.google.com/store/apps/details?id=handshke.sikkimprepaidtaxi

8)Sikkim State Portal
	https://play.google.com/store/apps/details?id=com.sikkim.stateportal


 */


public class sikkimApps extends AppCompatActivity {

    private List<appStyle> sikkim_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sikkim_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        sikkim_app_list.add(new appStyle("Government Schemes In Sikkim", R.drawable.govenrment_schemes_in_sikkim, "https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinsikkim"));
        sikkim_app_list.add(new appStyle("Sikkim Edutech", R.drawable.sikkim_edutech, "https://play.google.com/store/apps/details?id=com.netspeq.sikkimedutech"));
        sikkim_app_list.add(new appStyle("Sikkim Express", R.drawable.sikkim_express, "https://play.google.com/store/apps/details?id=sikkimexpress.com.sikkimexpressmobileapp"));
        sikkim_app_list.add(new appStyle("Sikkim Herald", R.drawable.sikkim_herald, "https://play.google.com/store/apps/details?id=com.sikkimherald.app"));
        sikkim_app_list.add(new appStyle("Sikkim Jobs", R.drawable.sikkim_jobs, "https://play.google.com/store/apps/details?id=com.sikkim.jobss"));
        sikkim_app_list.add(new appStyle("Sikkim - News/Videos", R.drawable.sikkim_news_videos, "https://play.google.com/store/apps/details?id=com.buzzato.sikkim"));
        sikkim_app_list.add(new appStyle("Sikkim Prepaid Taxi", R.drawable.sikkim_prepaid_taxi, "https://play.google.com/store/apps/details?id=handshke.sikkimprepaidtaxi"));
        sikkim_app_list.add(new appStyle("Sikkim State Portal", R.drawable.sikkim_state_portal, "https://play.google.com/store/apps/details?id=com.sikkim.stateportal"));


        ListView aap = (ListView) findViewById(R.id.sikkimAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = sikkim_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(sikkimApps.this, R.layout.list_view_layout, sikkim_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = sikkim_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
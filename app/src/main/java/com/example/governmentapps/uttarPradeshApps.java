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
1)Digital UP - Utter Pradesh Online Seva Guide
	https://play.google.com/store/apps/details?id=com.edu.digitalup

2)Sewayojan (सेवायोजन विभाग, उत्तर प्रदेश)
	https://play.google.com/store/apps/details?id=sewayojanvibhag.sewayojan2016

3)UPCOP
	https://play.google.com/store/apps/details?id=uttarpradesh.citizen.app

4)उत्तर प्रदेश का इतिहास - History of Uttar Pradesh
	https://play.google.com/store/apps/details?id=com.historyisfun.uttarpradesh

5)Uttar Pradesh Rojgar Samachar - Daily Job Alert
	https://play.google.com/store/apps/details?id=com.mithila_tech.uttarpradesh_rojgarsamachar

6)Uttar Pradesh Jobs
	https://play.google.com/store/apps/details?id=com.uttar.pradesh.jobss

7)भूलेख - उत्तर प्रदेश (UP Bhulekh - Uttar Pradesh)
	https://play.google.com/store/apps/details?id=com.mobile.up

8)UP News, Uttar Pradesh Hindi News Taza Khabar
	https://play.google.com/store/apps/details?id=com.kkza.upnews

9)UP Police Traffic App
	https://play.google.com/store/apps/details?id=com.pspl.uptrafficpoliceapp

10)Uttar Pradesh Quick Bijli Bill Payment App
	https://play.google.com/store/apps/details?id=com.tipsforever.uttarpradeshbijlibillpaymentapp

11)UP : Uttar Pradesh Voter List 2020 ( उत्तर प्रदेश)
	https://play.google.com/store/apps/details?id=com.ariyan.up_voterlist1

12)Uttar Pradesh GK In Hindi - Theory, Quiz, OneLiner
	https://play.google.com/store/apps/details?id=com.aicsm.uttarpradeshgk

13)Yogi Adityanath (CM UP)
	https://play.google.com/store/apps/details?id=karmatics.com.yogiadityanath

14)Yogi Adityanath Yojana and Schemes 2017
	https://play.google.com/store/apps/details?id=com.yuvaneeds.yogiadityanathschemes

 */


public class uttarPradeshApps extends AppCompatActivity {

    private List<appStyle> uttarPradesh_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uttar_pradesh_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        uttarPradesh_app_list.add(new appStyle("Digital UP - Utter Pradesh Online Seva Guide", R.drawable.digital_up, "https://play.google.com/store/apps/details?id=andhrapradesh.board.textbook"));
        uttarPradesh_app_list.add(new appStyle("Sewayojan (सेवायोजन विभाग, उत्तर प्रदेश)", R.drawable.sewayojan_up, "https://play.google.com/store/apps/details?id=sewayojanvibhag.sewayojan2016"));
        uttarPradesh_app_list.add(new appStyle("UPCOP", R.drawable.up_cop, "https://play.google.com/store/apps/details?id=uttarpradesh.citizen.app"));
        uttarPradesh_app_list.add(new appStyle("उत्तर प्रदेश का इतिहास - History of Uttar Pradesh", R.drawable.up_history, "https://play.google.com/store/apps/details?id=com.historyisfun.uttarpradesh"));
        uttarPradesh_app_list.add(new appStyle("Uttar Pradesh Rojgar Samachar - Daily Job Alert", R.drawable.up_job_alert, "https://play.google.com/store/apps/details?id=com.mithila_tech.uttarpradesh_rojgarsamachar"));
        uttarPradesh_app_list.add(new appStyle("Uttar Pradesh Jobs", R.drawable.up_jobs, "https://play.google.com/store/apps/details?id=com.uttar.pradesh.jobss"));
        uttarPradesh_app_list.add(new appStyle("भूलेख - उत्तर प्रदेश (UP Bhulekh - Uttar Pradesh)", R.drawable.up_land_records, "https://play.google.com/store/apps/details?id=com.mobile.up"));
        uttarPradesh_app_list.add(new appStyle("UP News, Uttar Pradesh Hindi News Taza Khabar", R.drawable.up_news, "https://play.google.com/store/apps/details?id=com.kkza.upnews"));
        uttarPradesh_app_list.add(new appStyle("UP Police Traffic App", R.drawable.up_police_traffic_app, "https://play.google.com/store/apps/details?id=com.pspl.uptrafficpoliceapp"));
        uttarPradesh_app_list.add(new appStyle("Uttar Pradesh Quick Bijli Bill Payment App", R.drawable.up_quick_bijli, "https://play.google.com/store/apps/details?id=com.tipsforever.uttarpradeshbijlibillpaymentapp"));
        uttarPradesh_app_list.add(new appStyle("UP : Uttar Pradesh Voter List 2020 ( उत्तर प्रदेश)", R.drawable.up_voter_list, "https://play.google.com/store/apps/details?id=com.ariyan.up_voterlist1"));
        uttarPradesh_app_list.add(new appStyle("Uttar Pradesh GK In Hindi - Theory, Quiz, OneLiner", R.drawable.uttar_pradesh_gk, "https://play.google.com/store/apps/details?id=com.aicsm.uttarpradeshgk"));
        uttarPradesh_app_list.add(new appStyle("Yogi Adityanath (CM UP)", R.drawable.yogi_adityanath_cm, "https://play.google.com/store/apps/details?id=karmatics.com.yogiadityanath"));
        uttarPradesh_app_list.add(new appStyle("Yogi Adityanath Yojana and Schemes 2017", R.drawable.yogi_adityanath_yojana, "https://play.google.com/store/apps/details?id=com.yuvaneeds.yogiadityanathschemes"));


        ListView aap = (ListView) findViewById(R.id.uttarPradeshAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = uttarPradesh_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(uttarPradeshApps.this, R.layout.list_view_layout, uttarPradesh_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = uttarPradesh_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
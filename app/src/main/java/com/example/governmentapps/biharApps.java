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
1)Bihar Bijli Bill Pay(BBBP)
	https://play.google.com/store/apps/details?id=com.bbpa

2)Bihar government Job
	https://play.google.com/store/apps/details?id=com.appowork.bihargovjobs

3)Bihar Jobs
	https://play.google.com/store/apps/details?id=com.bihar.jobss

4)Bihar Land Record - Bhumi Jankari, Khasra Khetani
	https://play.google.com/store/apps/details?id=com.landrecord.bihar

5)Bihar Mukhyamantri Vishesh Sahayata
	https://play.google.com/store/apps/details?id=com.bih.nic.in.biharmukhyamantrisahayata

6)Bihar Voter List 2020( बिहार वोटर लिस्ट) Download
	https://play.google.com/store/apps/details?id=com.ariyan.biharvoterlist1

7) डिजिटल बिहार (Digital Bihar) 2020
	https://play.google.com/store/apps/details?id=com.gs.digitalbihar

8)Government Schemes in Bihar
	https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinbihar

 */


public class biharApps extends AppCompatActivity {

    private List<appStyle> bihar_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bihar_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        bihar_app_list.add(new appStyle("Bihar Bijli Bill Pay(BBBP)", R.drawable.bihar_bijli_bill_pay, "https://play.google.com/store/apps/details?id=com.bbpa"));
        bihar_app_list.add(new appStyle("Bihar government Job", R.drawable.bihar_government_jobs, "https://play.google.com/store/apps/details?id=com.appowork.bihargovjobs"));
        bihar_app_list.add(new appStyle("Bihar Jobs", R.drawable.bihar_jobs, "https://play.google.com/store/apps/details?id=com.bihar.jobss"));
        bihar_app_list.add(new appStyle("Bihar Land Record - Bhumi Jankari, Khasra Khetani", R.drawable.bihar_land_record, "https://play.google.com/store/apps/details?id=com.landrecord.bihar"));
        bihar_app_list.add(new appStyle("Bihar Mukhyamantri Vishesh Sahayata", R.drawable.bihar_mukhyamantri_vishesh, "https://play.google.com/store/apps/details?id=com.bih.nic.in.biharmukhyamantrisahayata"));
        bihar_app_list.add(new appStyle("Bihar Voter List 2020( बिहार वोटर लिस्ट) Download", R.drawable.bihar_voter_list_2020, "https://play.google.com/store/apps/details?id=com.ariyan.biharvoterlist1"));
        bihar_app_list.add(new appStyle("डिजिटल बिहार (Digital Bihar) 2020", R.drawable.digital_bihar, "https://play.google.com/store/apps/details?id=com.gs.digitalbihar"));
        bihar_app_list.add(new appStyle("Government Schemes in Bihar", R.drawable.government_schemes_in_bihar, "https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinbihar"));


        ListView aap = (ListView) findViewById(R.id.biharAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = bihar_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(  biharApps.this, R.layout.list_view_layout, bihar_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = bihar_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
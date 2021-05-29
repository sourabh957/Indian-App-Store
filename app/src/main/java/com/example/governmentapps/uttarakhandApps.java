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
1)Atal Ayushman Uttarakhand Yojana
	https://play.google.com/store/apps/details?id=kprsconsultants.aubrs

2)DevBhumi
	https://play.google.com/store/apps/details?id=uttarakhand.citizen.app

3)Government Schemes in Uttarakhand
	https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinuttarakhand

4)GPF Online Uttarakhand
	https://play.google.com/store/apps/details?id=gpfonline.com.uk

5)Uttarakhand Government Exam Paper (Mock Test)
	https://play.google.com/store/apps/details?id=com.e.uttarakhandeq

6)Uttarakhand Jobs
	https://play.google.com/store/apps/details?id=com.uttarakhand.jobss

7)भूलेख - उत्तराखंड (UK Bhulekh - Uttarakhand)
	https://play.google.com/store/apps/details?id=com.mobile.uk

8)Uttarakhand News, Jobs,Current Affairs and GK
	https://play.google.com/store/apps/details?id=com.pst.aipan

9)Uttarakhand Tourism
	https://play.google.com/store/apps/details?id=com.ytrtech.utdb

 */


public class uttarakhandApps extends AppCompatActivity {

    private List<appStyle> uttarakhand_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uttarakhand_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        uttarakhand_app_list.add(new appStyle("Atal Ayushman Uttarakhand Yojana", R.drawable.atal_ayushman_uttarakhand, "https://play.google.com/store/apps/details?id=kprsconsultants.aubrs"));
        uttarakhand_app_list.add(new appStyle("DevBhumi", R.drawable.dev_bhumi, "https://play.google.com/store/apps/details?id=uttarakhand.citizen.app"));
        uttarakhand_app_list.add(new appStyle("Government Schemes in Uttarakhand", R.drawable.government_schemes_in_uttarakhand, "https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinuttarakhand"));
        uttarakhand_app_list.add(new appStyle("GPF Online Uttarakhand", R.drawable.gpf_online_uttarakhand, "https://play.google.com/store/apps/details?id=gpfonline.com.uk"));
        uttarakhand_app_list.add(new appStyle("Uttarakhand Government Exam Paper (Mock Test)", R.drawable.uttarakhand_government_exam, "https://play.google.com/store/apps/details?id=com.e.uttarakhandeq"));
        uttarakhand_app_list.add(new appStyle("Uttarakhand Jobs", R.drawable.uttarakhand_jobs, "https://play.google.com/store/apps/details?id=com.uttarakhand.jobss"));
        uttarakhand_app_list.add(new appStyle("भूलेख - उत्तराखंड (UK Bhulekh - Uttarakhand)", R.drawable.uttarakhand_land_records, "https://play.google.com/store/apps/details?id=com.mobile.uk"));
        uttarakhand_app_list.add(new appStyle("Uttarakhand News, Jobs,Current Affairs and GK", R.drawable.uttarakhand_news_jobs_current_affairs, "https://play.google.com/store/apps/details?id=com.pst.aipan"));
        uttarakhand_app_list.add(new appStyle("Uttarakhand Tourism", R.drawable.uttarakhand_tourism, "https://play.google.com/store/apps/details?id=com.ytrtech.utdb"));


        ListView aap = (ListView) findViewById(R.id.uttarakhandAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = uttarakhand_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(uttarakhandApps.this, R.layout.list_view_layout, uttarakhand_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = uttarakhand_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
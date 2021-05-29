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
1)COVID-19 Care Tamil Nadu - (Official)
	https://play.google.com/store/apps/details?id=com.rvmatrix.corona

2)Government Schemes in Tamil Nadu
	https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesintamilnadu

3)TN Electricity (TNEB)
	https://play.google.com/store/apps/details?id=rd.tnelectricity

4)Tamilnadu Government App
	https://play.google.com/store/apps/details?id=com.rehanhanar.tamilnadugovernmentapp

5)Tamil Nadu Jobs
	https://play.google.com/store/apps/details?id=com.tamil.nadu.jobs

6)Tamilnadu Samacheer Textbooks
	https://play.google.com/store/apps/details?id=org.saravanakumar.mytextbooks

7)TamilNadu Temples
	https://play.google.com/store/apps/details?id=com.saimobileapps.templestamilnadu

8)Tamilnadu Textbook
	https://play.google.com/store/apps/details?id=tamilnadu.Board.textbooks

9)Tamilnadu Tours - தமிழக சுற்றுலா
	https://play.google.com/store/apps/details?id=nithra.tamilnadu.tour.places

10)Tamilnadu Vehicle Information
	https://play.google.com/store/apps/details?id=com.photographerapps.tamilnaduvehicleinformation

11)TNEPDS
	https://play.google.com/store/apps/details?id=com.omneAgate.PublicApp.activity


 */


public class tamilNaduApps extends AppCompatActivity {

    private List<appStyle> tamilNaduApps_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tamil_nadu_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        tamilNaduApps_app_list.add(new appStyle("COVID-19 Care Tamil Nadu - (Official)", R.drawable.covid_car_tn, "https://play.google.com/store/apps/details?id=com.rvmatrix.corona"));
        tamilNaduApps_app_list.add(new appStyle("Government Schemes in Tamil Nadu", R.drawable.govenrment_schemes_tn, "https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesintamilnadu"));
        tamilNaduApps_app_list.add(new appStyle("TN Electricity (TNEB)", R.drawable.tn_electricity, "https://play.google.com/store/apps/details?id=rd.tnelectricity"));
        tamilNaduApps_app_list.add(new appStyle("Tamilnadu Government App", R.drawable.tn_government_app, "https://play.google.com/store/apps/details?id=com.rehanhanar.tamilnadugovernmentapp"));
        tamilNaduApps_app_list.add(new appStyle("Tamil Nadu Jobs", R.drawable.tn_jobs, "https://play.google.com/store/apps/details?id=com.tamil.nadu.jobs"));
        tamilNaduApps_app_list.add(new appStyle("Tamilnadu Samacheer Textbooks", R.drawable.tn_samacheer_textbooks, "https://play.google.com/store/apps/details?id=org.saravanakumar.mytextbooks"));
        tamilNaduApps_app_list.add(new appStyle("TamilNadu Temples", R.drawable.tn_temples, "https://play.google.com/store/apps/details?id=com.saimobileapps.templestamilnadu"));
        tamilNaduApps_app_list.add(new appStyle("Tamilnadu Textbooks", R.drawable.tn_textbooks, "https://play.google.com/store/apps/details?id=tamilnadu.Board.textbooks"));
        tamilNaduApps_app_list.add(new appStyle("Tamilnadu Tours - தமிழக சுற்றுலா", R.drawable.tn_tours, "https://play.google.com/store/apps/details?id=nithra.tamilnadu.tour.places"));
        tamilNaduApps_app_list.add(new appStyle("Tamilnadu Vehicle Information", R.drawable.tn_vehicle_information, "https://play.google.com/store/apps/details?id=com.photographerapps.tamilnaduvehicleinformation"));
        tamilNaduApps_app_list.add(new appStyle("TNEPDS", R.drawable.tnepds, "https://play.google.com/store/apps/details?id=com.omneAgate.PublicApp.activity"));


        ListView aap = (ListView) findViewById(R.id.tamilNaduAppListID);

        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = tamilNaduApps_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(tamilNaduApps.this, R.layout.list_view_layout, tamilNaduApps_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = tamilNaduApps_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
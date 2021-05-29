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
1)BANGLORE ONE- KARNATAKA GOVT
	https://play.google.com/store/apps/details?id=com.banglore.ak

2)Karnataka Crop Survey - 2019
	https://play.google.com/store/apps/details?id=com.csk.officer.cropsurvey

3)Karnataka Government Jobs
	https://play.google.com/store/apps/details?id=com.karnataka.governmentjobs.latest

4)Karnataka Government Jobs
	https://play.google.com/store/apps/details?id=com.kannadaknowledgebank.karnatakagovernmentjobs

5)Karnataka Government Websites
	https://play.google.com/store/apps/details?id=com.anz.kagov

6)Karnataka Jobs
	https://play.google.com/store/apps/details?id=com.karnataka.jobss

7)Land Records Karnataka( Bhoomi Pani )
	https://play.google.com/store/apps/details?id=com.kannada.land_records_karnataka

8)Karnataka Mobile One
	https://play.google.com/store/apps/details?id=com.imi.karnatakamobileone

9)Karnataka Panchayat:ಜಿಲ್ಲಾ/ತಾಲೂಕು/ಗ್ರಾಮ ಪಂ.
	https://play.google.com/store/apps/details?id=com.gram.panchayati.karnataka

 */


public class karnatakaApps extends AppCompatActivity {

    private List<appStyle> karnataka_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karnataka_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        karnataka_app_list.add(new appStyle("BANGLORE ONE- KARNATAKA GOVT", R.drawable.banglore_one_karnataka_government, "https://play.google.com/store/apps/details?id=com.banglore.ak"));
        karnataka_app_list.add(new appStyle("Karnataka Crop Survey - 2019", R.drawable.karnataka_crop_survey, "https://play.google.com/store/apps/details?id=com.csk.officer.cropsurvey"));
        karnataka_app_list.add(new appStyle("Karnataka Government Jobs", R.drawable.karnataka_government_jobs, "https://play.google.com/store/apps/details?id=com.karnataka.governmentjobs.latest"));
        karnataka_app_list.add(new appStyle("Karnataka Government Jobs(Kannada)", R.drawable.karnataka_government_jobs_kannada, "https://play.google.com/store/apps/details?id=com.kannadaknowledgebank.karnatakagovernmentjobs"));
        karnataka_app_list.add(new appStyle("Karnataka Government Websites", R.drawable.karnataka_government_websites, "https://play.google.com/store/apps/details?id=com.anz.kagov"));
        karnataka_app_list.add(new appStyle("Land Records Karnataka( Bhoomi Pani )", R.drawable.karnataka_land_records, "https://play.google.com/store/apps/details?id=com.kannada.land_records_karnataka"));
        karnataka_app_list.add(new appStyle("Karnataka Mobile One", R.drawable.karnataka_mobile_one, "https://play.google.com/store/apps/details?id=com.imi.karnatakamobileone"));
        karnataka_app_list.add(new appStyle("Karnataka Panchayat:ಜಿಲ್ಲಾ/ತಾಲೂಕು/ಗ್ರಾಮ ಪಂ.", R.drawable.karnataka_panchayat, "https://play.google.com/store/apps/details?id=com.gram.panchayati.karnataka"));


        ListView aap = (ListView) findViewById(R.id.karnatakaAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = karnataka_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(karnatakaApps.this, R.layout.list_view_layout, karnataka_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = karnataka_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
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
1)COVID-19 Odisha
	https://play.google.com/store/apps/details?id=odisha.gov.covid19

2)DEATH AND BIRTH CERTIFICATE ODISHA
	https://play.google.com/store/apps/details?id=com.androidarray.death_birth_odisha

3)Mo Sarkar
	https://play.google.com/store/apps/details?id=com.news.mosarkar

4)Odia GK App - Odia General Knowledge
	https://play.google.com/store/apps/details?id=com.odiagk.app

5)Odisha Board Text Books
	https://play.google.com/store/apps/details?id=odishaboard.textbook

6)Odisha Electricity Bill Check & Pay App
	https://play.google.com/store/apps/details?id=com.odisha.electricity_bill_pay_app

7)Odisha Jobs
	https://play.google.com/store/apps/details?id=com.odisha.jobss

8)Odisha Job Alert
	https://play.google.com/store/apps/details?id=io.kodular.odishajobalert2017.Odisha

9)Odisha Bhulekh Land Record-Check Odisha BhulekhMap
	https://play.google.com/store/apps/details?id=com.ashrafkhalid938.odishabhulekh

10)Odisha Tourism
	https://play.google.com/store/apps/details?id=com.nic.department.odishatourism

 */


public class odishaApps extends AppCompatActivity {

    private List<appStyle> odisha_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odisha_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        odisha_app_list.add(new appStyle("COVID19-Odisha", R.drawable.covid_19_odisha, "https://play.google.com/store/apps/details?id=odisha.gov.covid19"));
        odisha_app_list.add(new appStyle("DEATH AND BIRTH CERTIFICATE ODISHA", R.drawable.death_and_birth_certificate_odisha, "https://play.google.com/store/apps/details?id=com.androidarray.death_birth_odisha"));
        odisha_app_list.add(new appStyle("Mo Sarkar", R.drawable.mo_sarkar, "https://play.google.com/store/apps/details?id=com.news.mosarkar"));
        odisha_app_list.add(new appStyle("Odia GK App - Odia General Knowledge", R.drawable.odia_gk_apps, "https://play.google.com/store/apps/details?id=com.odiagk.app"));
        odisha_app_list.add(new appStyle("Odisha Board Text Books", R.drawable.odisha_board_text_books, "https://play.google.com/store/apps/details?id=odishaboard.textbook"));
        odisha_app_list.add(new appStyle("Odisha Electricity Bill Check & Pay App", R.drawable.odisha_electricity_bill, "https://play.google.com/store/apps/details?id=com.odisha.electricity_bill_pay_app"));
        odisha_app_list.add(new appStyle("Odisha Jobs", R.drawable.odisha_job, "https://play.google.com/store/apps/details?id=com.odisha.jobss"));
        odisha_app_list.add(new appStyle("Odisha Job Alert", R.drawable.odisha_job_alert, "https://play.google.com/store/apps/details?id=io.kodular.odishajobalert2017.Odisha"));
        odisha_app_list.add(new appStyle("Odisha Bhulekh Land Record-Check Odisha BhulekhMap", R.drawable.odisha_land_record, "https://play.google.com/store/apps/details?id=com.ashrafkhalid938.odishabhulekh"));
        odisha_app_list.add(new appStyle("Odisha Tourism", R.drawable.odisha_tourism, "https://play.google.com/store/apps/details?id=com.nic.department.odishatourism"));


        ListView aap = (ListView) findViewById(R.id.odishaAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = odisha_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(odishaApps.this, R.layout.list_view_layout, odisha_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = odisha_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
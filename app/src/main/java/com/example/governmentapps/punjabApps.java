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
1)COVA Punjab
	https://play.google.com/store/apps/details?id=in.gov.punjab.cova

2)ePay Punjab
	https://play.google.com/store/apps/details?id=com.pitb.ePayGateway

3)PadhoPunjab
	https://play.google.com/store/apps/details?id=com.mis.vasoftwares.parhopunjab

4)PPSC Exam
	https://play.google.com/store/apps/details?id=com.sanaedutech.ppsc

5)Punjab Board Text Books, PSEB Books
	https://play.google.com/store/apps/details?id=punjabboard.books

6)Punjab Bus Time Table App
	https://play.google.com/store/apps/details?id=com.gargtec.punjabbus

7)Punjab Food Authority (Official)
	https://play.google.com/store/apps/details?id=com.pfaofficial

8)Punjab Gk
	https://play.google.com/store/apps/details?id=com.sandyverka.punjab_gk

9)Punjab Government's important contact numbers
	https://play.google.com/store/apps/details?id=com.phone.punjab

10)Punjab & Haryana High Court: PHHC eCourts Services
	https://play.google.com/store/apps/details?id=gov.highcourt.highcourt_ecourts_services

11)Punjab Jobs
	https://play.google.com/store/apps/details?id=com.punjab.jobss

12)Punjab mSewa
	https://play.google.com/store/apps/details?id=com.psegs.dgr.punjab_msewa

13)Punjab Patwari - Land area & Share Calculator
	https://play.google.com/store/apps/details?id=com.tiwana.jasu.punjabpatwari

14)Smart Village Punjab
	https://play.google.com/store/apps/details?id=in.gov.punjab.smartvillage

 */


public class punjabApps extends AppCompatActivity {

    private List<appStyle> punjab_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjab_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        punjab_app_list.add(new appStyle("COVA Punjab", R.drawable.cova_punjab, "https://play.google.com/store/apps/details?id=in.gov.punjab.cova"));
        punjab_app_list.add(new appStyle("ePay Punjab", R.drawable.e_pay_punjab, "https://play.google.com/store/apps/details?id=com.pitb.ePayGateway"));
        punjab_app_list.add(new appStyle("PadhoPunjab", R.drawable.padho_punjab, "https://play.google.com/store/apps/details?id=com.mis.vasoftwares.parhopunjab"));
        punjab_app_list.add(new appStyle("PPSC Exam", R.drawable.ppsc_exam, "https://play.google.com/store/apps/details?id=com.sanaedutech.ppsc"));
        punjab_app_list.add(new appStyle("Punjab Board Text Books, PSEB Books", R.drawable.punjab_board_text_books, "https://play.google.com/store/apps/details?id=punjabboard.books"));
        punjab_app_list.add(new appStyle("Punjab Bus Time Table App", R.drawable.punjab_bus_time_table, "https://play.google.com/store/apps/details?id=com.gargtec.punjabbus"));
        punjab_app_list.add(new appStyle("Punjab Food Authority (Official)", R.drawable.punjab_food_authority, "https://play.google.com/store/apps/details?id=com.pfaofficial"));
        punjab_app_list.add(new appStyle("Punjab Gk", R.drawable.punjab_gk, "https://play.google.com/store/apps/details?id=com.sandyverka.punjab_gk"));
        punjab_app_list.add(new appStyle("Punjab Government's important contact numbers", R.drawable.punjab_govt_important_numbers, "https://play.google.com/store/apps/details?id=com.phone.punjab"));
        punjab_app_list.add(new appStyle("Punjab & Haryana High Court: PHHC eCourts Services", R.drawable.punjab_haryana_high_court, "https://play.google.com/store/apps/details?id=gov.highcourt.highcourt_ecourts_services"));
        punjab_app_list.add(new appStyle("Punjab Jobs", R.drawable.punjab_jobs, "https://play.google.com/store/apps/details?id=com.punjab.jobss"));
        punjab_app_list.add(new appStyle("Punjab mSewa", R.drawable.punjab_m_sewa, "https://play.google.com/store/apps/details?id=com.psegs.dgr.punjab_msewa"));
        punjab_app_list.add(new appStyle("Punjab Patwari - Land area & Share Calculator", R.drawable.punjab_patwari, "https://play.google.com/store/apps/details?id=com.tiwana.jasu.punjabpatwari"));
        punjab_app_list.add(new appStyle("Smart Village Punjab", R.drawable.smart_village_punjab, "https://play.google.com/store/apps/details?id=in.gov.punjab.smartvillage"));

        ListView aap = (ListView) findViewById(R.id.punjabAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = punjab_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(punjabApps.this, R.layout.list_view_layout, punjab_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = punjab_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
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
1)BOARD OF REVENUE MP
	https://play.google.com/store/apps/details?id=shubham.nescant.revenue.mpboard

2) डिजिटल MP (Digital Madhya Pradesh Govt Guide)
	https://play.google.com/store/apps/details?id=com.ds.digitalmp

3)MP eNagarPalika Citizen App
	https://play.google.com/store/apps/details?id=com.mpenagarpalika.citizenapp

4)MP COVID RESPONSE APP
	https://play.google.com/store/apps/details?id=com.covidmp.coronago

5)MP ePapers
	https://play.google.com/store/apps/details?id=com.samikshaa.mpepapers

6)Madhya Pradesh Jobs
	https://play.google.com/store/apps/details?id=com.madhya.pradesh.jobss

7)MP Kisan App
	https://play.google.com/store/apps/details?id=in.gov.mapit.kisanapp

8)Mp Land Record, mp भू अभिलेख,खसरा,खतौनी,जाने
	https://play.google.com/store/apps/details?id=com.ladkunwarahirwar0000.MP_LANDRECORD

9)MP Mobile
	https://play.google.com/store/apps/details?id=in.mpo.mpmobile

10)Madhya Pradesh Shram Sewa App
	https://play.google.com/store/apps/details?id=com.nic.labourserviceportal

11)Madhya Pradesh State Board Books
	https://play.google.com/store/apps/details?id=madhyapradesh.board.textbooks

12)Shivraj Singh Chouhan
	https://play.google.com/store/apps/details?id=com.shivrajsinghchouhanapp

13)Swachh Madhya Pradesh
	https://play.google.com/store/apps/details?id=in.nic.bhopal.swatchbharatmission

 */


public class madhyaPradeshApps extends AppCompatActivity {

    private List<appStyle> madhyaPradesh_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madhya_pradesh_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        madhyaPradesh_app_list.add(new appStyle("BOARD OF REVENUE MP", R.drawable.board_of_revenue_mp, "https://play.google.com/store/apps/details?id=shubham.nescant.revenue.mpboard"));
        madhyaPradesh_app_list.add(new appStyle(" डिजिटल MP (Digital Madhya Pradesh Govt Guide)", R.drawable.digital_mp, "https://play.google.com/store/apps/details?id=com.ds.digitalmp"));
        madhyaPradesh_app_list.add(new appStyle("MP eNagarPalika Citizen App", R.drawable.mp_citizen_app, "https://play.google.com/store/apps/details?id=com.mpenagarpalika.citizenapp"));
        madhyaPradesh_app_list.add(new appStyle("MP COVID RESPONSE APP", R.drawable.mp_covid_response, "https://play.google.com/store/apps/details?id=com.covidmp.coronago"));
        madhyaPradesh_app_list.add(new appStyle("MP ePapers", R.drawable.mp_e_newspaper, "https://play.google.com/store/apps/details?id=com.samikshaa.mpepapers"));
        madhyaPradesh_app_list.add(new appStyle("Madhya Pradesh Jobs", R.drawable.mp_jobs, "https://play.google.com/store/apps/details?id=com.madhya.pradesh.jobss"));
        madhyaPradesh_app_list.add(new appStyle("MP kisan App", R.drawable.mp_kisan_app, "https://play.google.com/store/apps/details?id=in.gov.mapit.kisanapp"));
        madhyaPradesh_app_list.add(new appStyle("Mp Land Record, mp भू अभिलेख,खसरा,खतौनी,जाने", R.drawable.mp_land_record, "https://play.google.com/store/apps/details?id=com.ladkunwarahirwar0000.MP_LANDRECORD"));
        madhyaPradesh_app_list.add(new appStyle("MP Mobile", R.drawable.mp_mobile, "https://play.google.com/store/apps/details?id=in.mpo.mpmobile"));
        madhyaPradesh_app_list.add(new appStyle("Madhya Pradesh Shram Sewa App", R.drawable.mp_shram_sewa_app, "https://play.google.com/store/apps/details?id=com.nic.labourserviceportal"));
        madhyaPradesh_app_list.add(new appStyle("Madhya Pradesh State Board Books", R.drawable.mp_state_board_boks, "https://play.google.com/store/apps/details?id=madhyapradesh.board.textbooks"));
        madhyaPradesh_app_list.add(new appStyle("Shivraj Singh Chouhan", R.drawable.shivraj_singh_chouhan, "https://play.google.com/store/apps/details?id=com.shivrajsinghchouhanapp"));
        madhyaPradesh_app_list.add(new appStyle("Swachh Madhya Pradesh", R.drawable.swach_mp, "https://play.google.com/store/apps/details?id=in.nic.bhopal.swatchbharatmission"));


        ListView aap = (ListView) findViewById(R.id.madhyaPradeshAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = madhyaPradesh_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(madhyaPradeshApps.this, R.layout.list_view_layout, madhyaPradesh_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = madhyaPradesh_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
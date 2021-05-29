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
1)Board of school education Haryana
	https://play.google.com/store/apps/details?id=com.maibiz.bseh

2)Digital Kisan, Haryana
	https://play.google.com/store/apps/details?id=com.innobles.kishan

3)Government Schemes in Haryana
	https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinhariyana

4)CM Window Haryana
	https://play.google.com/store/apps/details?id=nic.sandeep.cmwindowstatustracking

5)Harpath Haryana
	https://play.google.com/store/apps/details?id=in.gov.nic.harpathcitizen

6)Haryana Current Affairs 2020
	https://play.google.com/store/apps/details?id=com.inpol.har.haryanacurrentaffairs2020

7)HSSC EXAM APP - HARYANA GK APP
	https://play.google.com/store/apps/details?id=com.myappminister.hsscexam

8)Haryana GK In Hindi
	https://play.google.com/store/apps/details?id=com.aicsm.harayanagkinhindi

9)Haryana government Jobs
	https://play.google.com/store/apps/details?id=com.appedusoft.haryanagovtjobs

10)Haryana Rojgar Samachar Hindi
	https://play.google.com/store/apps/details?id=com.mithila_tech.haryana_rojgar_samachar

11)Haryana jobs
	https://play.google.com/store/apps/details?id=sarkari.naukriinhindicopy

12)Startup Haryana
	https://play.google.com/store/apps/details?id=com.startupharyana

13)STV Haryana News
	https://play.google.com/store/apps/details?id=com.ni.stvharyananews
 */

public class haryanaApps extends AppCompatActivity {

    private List<appStyle> haryana_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haryana_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        haryana_app_list.add(new appStyle("Board of school education Haryana", R.drawable.board_school_education_haryana, "https://play.google.com/store/apps/details?id=com.maibiz.bseh"));
        haryana_app_list.add(new appStyle("Digital Kisan, Haryana", R.drawable.digital_kisan_haryana, "https://play.google.com/store/apps/details?id=com.innobles.kishan"));
        haryana_app_list.add(new appStyle("Government Schemes in Haryana", R.drawable.government_schemes_haryana, "https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinhariyana"));
        haryana_app_list.add(new appStyle("CM Window Haryana", R.drawable.harayan_cm_window, "https://play.google.com/store/apps/details?id=nic.sandeep.cmwindowstatustracking"));
        haryana_app_list.add(new appStyle("Harpath Haryana", R.drawable.harpath_haryana, "https://play.google.com/store/apps/details?id=in.gov.nic.harpathcitizen"));
        haryana_app_list.add(new appStyle("Haryana Current Affairs 2020", R.drawable.haryana_current_affairs_2020, "https://play.google.com/store/apps/details?id=com.inpol.har.haryanacurrentaffairs2020"));
        haryana_app_list.add(new appStyle("HSSC EXAM APP - HARYANA GK APP", R.drawable.haryana_gk_app, "https://play.google.com/store/apps/details?id=com.myappminister.hsscexam"));
        haryana_app_list.add(new appStyle("Haryana GK In Hindi", R.drawable.haryana_gk_hindi, "https://play.google.com/store/apps/details?id=com.aicsm.harayanagkinhindi"));
        haryana_app_list.add(new appStyle("Haryana Govenrment Jobs", R.drawable.haryana_government_jobs, "https://play.google.com/store/apps/details?id=com.appedusoft.haryanagovtjobs"));
        haryana_app_list.add(new appStyle("Haryana Rojgar Samachar Hindi", R.drawable.haryana_rojgar_hindi, "https://play.google.com/store/apps/details?id=com.mithila_tech.haryana_rojgar_samachar"));
        haryana_app_list.add(new appStyle("Startup Haryana", R.drawable.startup_haryana, "https://play.google.com/store/apps/details?id=com.startupharyana"));
        haryana_app_list.add(new appStyle("STV Haryana News", R.drawable.stv_haryana_news, "https://play.google.com/store/apps/details?id=com.ni.stvharyananews"));

        ListView aap = (ListView) findViewById(R.id.haryanaAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = haryana_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(haryanaApps.this, R.layout.list_view_layout, haryana_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = haryana_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
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
1)Advantage Assam
	https://play.google.com/store/apps/details?id=com.uipl.advntgassam

2)All Assam Career
	https://play.google.com/store/apps/details?id=com.allassamcareer.app

3)Assam Budget
	https://play.google.com/store/apps/details?id=com.kran.egufinassam

4)Assam Govt. Jobs
	https://play.google.com/store/apps/details?id=com.appedusoft.assamgovtjobs

5)Assam History - অসম বুৰঞ্জী প্ৰশ্ন উত্তৰ
	https://play.google.com/store/apps/details?id=com.deephost.assamhistory

6)Assam Job Card List
	https://play.google.com/store/apps/details?id=com.msiassamese.JOB_CARD

7)Assam Land Record
	https://play.google.com/store/apps/details?id=assam.landrecord

8)Assam News Channel Live
	https://play.google.com/store/apps/details?id=assam.newschannellive

9)Assam Voter List 2020
	https://play.google.com/store/apps/details?id=com.muslimspeakersinassamese.voter_list_assam

10)Government Schemes in Assam
	https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinassam

 */


public class assamApps extends AppCompatActivity {

    private List<appStyle> assam_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assam_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        assam_app_list.add(new appStyle("Advantage Assam", R.drawable.advantage_assam, "https://play.google.com/store/apps/details?id=com.uipl.advntgassam"));
        assam_app_list.add(new appStyle("All Assam Career", R.drawable.all_assam_carrer, "https://play.google.com/store/apps/details?id=com.allassamcareer.app"));
        assam_app_list.add(new appStyle("Assam Budget", R.drawable.assam_budget, "https://play.google.com/store/apps/details?id=com.kran.egufinassam"));
        assam_app_list.add(new appStyle("Assam Govt. Jobs", R.drawable.assam_govt_jobs, "https://play.google.com/store/apps/details?id=com.appedusoft.assamgovtjobs"));
        assam_app_list.add(new appStyle("Assam History - অসম বুৰঞ্জী প্ৰশ্ন উত্তৰ", R.drawable.assam_history, "https://play.google.com/store/apps/details?id=com.deephost.assamhistory"));
        assam_app_list.add(new appStyle("Assam Job Card List", R.drawable.assam_job_car_list, "https://play.google.com/store/apps/details?id=com.msiassamese.JOB_CARD"));
        assam_app_list.add(new appStyle("Assam Land Record", R.drawable.assam_land_record, "https://play.google.com/store/apps/details?id=assam.landrecord"));
        assam_app_list.add(new appStyle("Assam News Channel Live", R.drawable.assam_news_channel, "https://play.google.com/store/apps/details?id=assam.newschannellive"));
        assam_app_list.add(new appStyle("Assam Voter List 2020", R.drawable.assam_voter_list_2020, "https://play.google.com/store/apps/details?id=com.muslimspeakersinassamese.voter_list_assam"));
        assam_app_list.add(new appStyle("Government Schemes in Assam", R.drawable.government_schemes_in_assam, "https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinassam"));

        ListView aap = (ListView) findViewById(R.id.assamAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = assam_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(assamApps.this, R.layout.list_view_layout, assam_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = assam_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
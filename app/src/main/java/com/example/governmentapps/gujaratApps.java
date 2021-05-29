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
1)DGVCL
	https://play.google.com/store/apps/details?id=com.dgvcl.android.apps

2) Digital Gujarat
	https://play.google.com/store/apps/details?id=com.digital.gujarat

3)Gujarat Job Alert ( PC Job )
	https://play.google.com/store/apps/details?id=com.thunkable.android.pccomputeramreli.PC_Job_Alert

4)AnyRoR- Gujarat Land Records 7/12 ROR
	https://play.google.com/store/apps/details?id=com.anyror.gujrat

5)Gujarat Ration Card
	https://play.google.com/store/apps/details?id=gujarat.rationcard

6)GPSC (Official)
	https://play.google.com/store/apps/details?id=gov.gujarat.gpscojas

7)Gpsc Online
	https://play.google.com/store/apps/details?id=com.gpscvideo.gpsc

8)GSRTC
	https://play.google.com/store/apps/details?id=com.gsrtc.mobileweb

9)Citizen First Gujarat Police
	https://play.google.com/store/apps/details?id=com.tcs.digigov.mobility.dhs.citizen.gj

10)Garvi Gujarat, Office of Resident Commissioner
	https://play.google.com/store/apps/details?id=in.negd.garvigujarat

11)Gujarat Gas Limited - Mobile App
	https://play.google.com/store/apps/details?id=com.ggl.gujaratgas

12)Government Of Gujarat Services
	https://play.google.com/store/apps/details?id=com.gog.utilityapp

13)Gujarat Jobs
	https://play.google.com/store/apps/details?id=com.gujarat.jobss

14)Gujarati News & Gujarat Samachar - I am Gujarat
	https://play.google.com/store/apps/details?id=com.iag.reader

15)NCERT Gujarati Book (Gujarat Board)
	https://play.google.com/store/apps/details?id=com.nims.book

16)All Government Exam - ONLINE GUJARAT GK
	https://play.google.com/store/apps/details?id=onemarked.onlineservices.quizapp

17)Ration Card Guj
	https://play.google.com/store/apps/details?id=rd.rationcardgujaratonline

18)SATHI
	https://play.google.com/store/apps/details?id=foo.bar.GADMobile

19)Step Up Gujarat
	https://play.google.com/store/apps/details?id=com.stepup.stepupgujarat

20)Surat Municipal Corporation - Citizen’s Connect
	https://play.google.com/store/apps/details?id=in.smc

 */


public class gujaratApps extends AppCompatActivity {

    private List<appStyle> gujarat_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gujarat_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        gujarat_app_list.add(new appStyle("DGVCL", R.drawable.dgvcl, "https://play.google.com/store/apps/details?id=com.dgvcl.android.apps"));
        gujarat_app_list.add(new appStyle("Digital Gujarat", R.drawable.digital_gujarat, "https://play.google.com/store/apps/details?id=com.digital.gujarat"));
        gujarat_app_list.add(new appStyle("Gujarat Job Alert ( PC Job )", R.drawable.gj_job_alert, "https://play.google.com/store/apps/details?id=com.thunkable.android.pccomputeramreli.PC_Job_Alert"));
        gujarat_app_list.add(new appStyle("AnyRoR- Gujarat Land Records 7/12 ROR", R.drawable.gj_land_record, "https://play.google.com/store/apps/details?id=com.anyror.gujrat"));
        gujarat_app_list.add(new appStyle("Gujarat Ration Card", R.drawable.gj_ration_card, "https://play.google.com/store/apps/details?id=gujarat.rationcard"));
        gujarat_app_list.add(new appStyle("GPSC (Official)", R.drawable.gpsc_official, "https://play.google.com/store/apps/details?id=gov.gujarat.gpscojas"));
        gujarat_app_list.add(new appStyle("Gpsc Online", R.drawable.gpsc_online, "https://play.google.com/store/apps/details?id=com.gpscvideo.gpsc"));
        gujarat_app_list.add(new appStyle("GSRTC", R.drawable.gsrtc, "https://play.google.com/store/apps/details?id=com.gsrtc.mobileweb"));
        gujarat_app_list.add(new appStyle("Citizen First Gujarat Police", R.drawable.gujarat_citizen_police, "https://play.google.com/store/apps/details?id=com.tcs.digigov.mobility.dhs.citizen.gj"));
        gujarat_app_list.add(new appStyle("Garvi Gujarat, Office of Resident Commissioner", R.drawable.gujarat_garvi, "https://play.google.com/store/apps/details?id=in.negd.garvigujarat"));
        gujarat_app_list.add(new appStyle("Gujarat Gas Limited - Mobile App", R.drawable.gujarat_gas, "https://play.google.com/store/apps/details?id=com.ggl.gujaratgas"));
        gujarat_app_list.add(new appStyle("Government Of Gujarat Services", R.drawable.gujarat_government_services, "https://play.google.com/store/apps/details?id=com.gog.utilityapp"));
        gujarat_app_list.add(new appStyle("Gujarat Jobs", R.drawable.gujarat_jobs, "https://play.google.com/store/apps/details?id=com.gujarat.jobss"));
        gujarat_app_list.add(new appStyle("Gujarati News & Gujarat Samachar - I am Gujarat", R.drawable.gujarati_news, "https://play.google.com/store/apps/details?id=com.iag.reader"));
        gujarat_app_list.add(new appStyle("NCERT Gujarati Book (Gujarat Board)", R.drawable.ncert_gujarati_books, "https://play.google.com/store/apps/details?id=com.nims.book"));
        gujarat_app_list.add(new appStyle("All Government Exam - ONLINE GUJARAT GK", R.drawable.online_gujarat_gk, "https://play.google.com/store/apps/details?id=onemarked.onlineservices.quizapp"));
        gujarat_app_list.add(new appStyle("Ration Card Guj", R.drawable.ration_card_guj, "https://play.google.com/store/apps/details?id=rd.rationcardgujaratonline"));
        gujarat_app_list.add(new appStyle("SATHI", R.drawable.sathi, "https://play.google.com/store/apps/details?id=foo.bar.GADMobile"));
        gujarat_app_list.add(new appStyle("Step Up Gujarat", R.drawable.step_up_gujarat, "https://play.google.com/store/apps/details?id=com.stepup.stepupgujarat"));
        gujarat_app_list.add(new appStyle("Surat Municipal Corporation - Citizen’s Connect", R.drawable.surat_municipal_corporation, "https://play.google.com/store/apps/details?id=in.smc"));


        ListView aap = (ListView) findViewById(R.id.gujaratAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = gujarat_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(gujaratApps.this, R.layout.list_view_layout, gujarat_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = gujarat_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
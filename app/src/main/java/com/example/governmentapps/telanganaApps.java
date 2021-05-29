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
1)Government Schemes in Telangana
	https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesintelangana

2)Jobs In Telangana
	https://play.google.com/store/apps/details?id=com.telangana.jobss

3)MGNREGA Telangana State
	https://play.google.com/store/apps/details?id=com.manoappstore.mgnrega_ts

4)T-Ration
	https://play.google.com/store/apps/details?id=com.fsc.app.tg_nic_fsc

5)T Wallet- Govt Bill Payment, Money Transfer
	https://play.google.com/store/apps/details?id=com.telangana.twallet

6)Telangana Covid19 Tracker
	https://play.google.com/store/apps/details?id=com.corona.tscovid_19

7)Telangana eChallan
	https://play.google.com/store/apps/details?id=com.appifysoftware.telanganaechallan

8)Telangana Exams
	https://play.google.com/store/apps/details?id=com.s2techno.telanganexams

9)Telangana Bhoomi | Telangana Land Records | ROR
	https://play.google.com/store/apps/details?id=com.appsinfo21.Telangana_Land_Records

10)Telangana Land Records | ROR | Pahani
	https://play.google.com/store/apps/details?id=io.kodular.lsr90009.ts_dharani_adangal_ror

11)Telangana Ration Card Info
	https://play.google.com/store/apps/details?id=com.apschemes2020.Telangana_Ration_Card_Info

12)Telangana SCERT Textbooks
	https://play.google.com/store/apps/details?id=telangana.board.textbooks

13)TELANGANA STATE SKILL MISSION
	https://play.google.com/store/apps/details?id=cgg.gov.rykaadharapplication

14)Telangana Vehicle Information
	https://play.google.com/store/apps/details?id=com.kaipa.telanganavehicleinformation

15)TS RSMS
	https://play.google.com/store/apps/details?id=cgg.gov.in.rsms

16)TSLPRB Attendance
	https://play.google.com/store/apps/details?id=tslprb.mil.com.tslprbreport

 */


public class telanganaApps extends AppCompatActivity {

    private List<appStyle> telangana_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telangana_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        telangana_app_list.add(new appStyle("Government Schemes in Telangana", R.drawable.government_schemes_in_telangana, "https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesintelangana"));
        telangana_app_list.add(new appStyle("Jobs In Telangana", R.drawable.jobs_in_telangana, "https://play.google.com/store/apps/details?id=com.telangana.jobss"));
        telangana_app_list.add(new appStyle("MGNREGA Telangana State", R.drawable.mgnrega_telangana_state, "https://play.google.com/store/apps/details?id=com.manoappstore.mgnrega_ts"));
        telangana_app_list.add(new appStyle("T-Ration", R.drawable.t_ration, "https://play.google.com/store/apps/details?id=com.fsc.app.tg_nic_fsc"));
        telangana_app_list.add(new appStyle("T Wallet- Govt Bill Payment, Money Transfer", R.drawable.t_wallet_govt_bill_payment, "https://play.google.com/store/apps/details?id=com.telangana.twallet"));
        telangana_app_list.add(new appStyle("Telangana Covid19 Tracker", R.drawable.telangana_covid_tracker, "https://play.google.com/store/apps/details?id=com.corona.tscovid_19"));
        telangana_app_list.add(new appStyle("Telangana eChallan", R.drawable.telangana_e_challan, "https://play.google.com/store/apps/details?id=com.appifysoftware.telanganaechallan"));
        telangana_app_list.add(new appStyle("Telangana Exams", R.drawable.telangana_exams, "https://play.google.com/store/apps/details?id=com.s2techno.telanganexams"));
        telangana_app_list.add(new appStyle("Telangana Bhoomi | Telangana Land Records | ROR", R.drawable.telangana_land_records, "https://play.google.com/store/apps/details?id=com.appsinfo21.Telangana_Land_Records"));
        telangana_app_list.add(new appStyle("Telangana Land Records | ROR | Pahani", R.drawable.telangana_land_records_ror_pahani, "https://play.google.com/store/apps/details?id=in.apcfss.sw.navasakam.volunteer"));
        telangana_app_list.add(new appStyle("Telangana Ration Card Info", R.drawable.telangana_ration_card, "https://play.google.com/store/apps/details?id=com.apschemes2020.Telangana_Ration_Card_Info"));
        telangana_app_list.add(new appStyle("Telangana SCERT Textbooks", R.drawable.telangana_scert_textbooks, "https://play.google.com/store/apps/details?id=telangana.board.textbooks"));
        telangana_app_list.add(new appStyle("TELANGANA STATE SKILL MISSION", R.drawable.telangana_state_skill_mission, "https://play.google.com/store/apps/details?id=cgg.gov.rykaadharapplication"));
        telangana_app_list.add(new appStyle("Telangana Vehicle Information", R.drawable.telangana_vehicle_information, "https://play.google.com/store/apps/details?id=com.kaipa.telanganavehicleinformation"));
        telangana_app_list.add(new appStyle("TS RSMS", R.drawable.ts_rsms, "https://play.google.com/store/apps/details?id=cgg.gov.in.rsms"));
        telangana_app_list.add(new appStyle("TSLPRB Attendance", R.drawable.tslprb_attendence, "https://play.google.com/store/apps/details?id=tslprb.mil.com.tslprbreport"));

        ListView aap = (ListView) findViewById(R.id.telanganaAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = telangana_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(telanganaApps.this, R.layout.list_view_layout, telangana_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = telangana_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
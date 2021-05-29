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
1)Banglar Bhumi ( বাংলার ভুমি ) Khatian & Plot Info.
	https://play.google.com/store/apps/details?id=com.mobile.banglarbhumi

2)BengaliMatrimony® - The No. 1 choice of Bengalis
	https://play.google.com/store/apps/details?id=com.bengalimatrimony

3)COVID-19 West Bengal Government
	https://play.google.com/store/apps/details?id=com.pixxonai.covid19wb

4)Didi Ke Bolo দিদিকে বলো Mamata Banerjee
	https://play.google.com/store/apps/details?id=com.govtapps4all.didikebolo

5)WBePension
	https://play.google.com/store/apps/details?id=in.gov.wb.epension

6)West Bengal Emergency Fund
	https://play.google.com/store/apps/details?id=in.gov.wb.wbrelieffund

7)West Bengal Jobs
	https://play.google.com/store/apps/details?id=com.west.bengal.jobss

8)West Bengal Khatian / Plots Info
	https://play.google.com/store/apps/details?id=com.BhulekhOnline.WestBengalKhatianPlotsInfo

9)West Bengal Ration Card Status
	https://play.google.com/store/apps/details?id=com.techpathak.wbrationcardstatus

10)West Bengal State Book Board
	https://play.google.com/store/apps/details?id=westbengalboard.books

11)West Bengal Voter list (ভোটার লিস্ট) 2020 download
	https://play.google.com/store/apps/details?id=com.ariyan.voterlist.west_bengal1st

12)WBCS /WBPSC Exam
	https://play.google.com/store/apps/details?id=com.sanaedutech.wbpsc

 */


public class westBengalApps extends AppCompatActivity {

    private List<appStyle> westBengal_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_west_bengal_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        westBengal_app_list.add(new appStyle("Banglar Bhumi ( বাংলার ভুমি ) Khatian & Plot Info.", R.drawable.banglur_bhumi, "https://play.google.com/store/apps/details?id=com.mobile.banglarbhumi"));
        westBengal_app_list.add(new appStyle("BengaliMatrimony® - The No. 1 choice of Bengalis", R.drawable.bengali_matrimony, "https://play.google.com/store/apps/details?id=com.bengalimatrimony"));
        westBengal_app_list.add(new appStyle("COVID-19 West Bengal Government", R.drawable.covid_wb, "https://play.google.com/store/apps/details?id=com.pixxonai.covid19wb"));
        westBengal_app_list.add(new appStyle("Didi Ke Bolo দিদিকে বলো Mamata Banerjee", R.drawable.didi_ko_bolo, "https://play.google.com/store/apps/details?id=com.govtapps4all.didikebolo"));
        westBengal_app_list.add(new appStyle("WBePension", R.drawable.wb_e_pensions, "https://play.google.com/store/apps/details?id=in.gov.wb.epension"));
        westBengal_app_list.add(new appStyle("West Bengal Emergency Fund", R.drawable.wb_emergency_fund, "https://play.google.com/store/apps/details?id=in.gov.wb.wbrelieffund"));
        westBengal_app_list.add(new appStyle("West Bengal Jobs", R.drawable.wb_jobs, "https://play.google.com/store/apps/details?id=com.west.bengal.jobss"));
        westBengal_app_list.add(new appStyle("West Bengal Khatian / Plots Info", R.drawable.wb_khatain_plot_info, "https://play.google.com/store/apps/details?id=com.BhulekhOnline.WestBengalKhatianPlotsInfo"));
        westBengal_app_list.add(new appStyle("West Bengal State Book Board", R.drawable.wb_state_board_books, "https://play.google.com/store/apps/details?id=westbengalboard.books"));
        westBengal_app_list.add(new appStyle("West Bengal Voter list (ভোটার লিস্ট) 2020 download", R.drawable.wb_voter_list, "https://play.google.com/store/apps/details?id=com.ariyan.voterlist.west_bengal1st"));
        westBengal_app_list.add(new appStyle("WBCS /WBPSC Exam", R.drawable.wbcs_wbpsc_exam, "https://play.google.com/store/apps/details?id=com.sanaedutech.wbpsc"));


        ListView aap = (ListView) findViewById(R.id.westBengalAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = westBengal_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(westBengalApps.this, R.layout.list_view_layout, westBengal_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = westBengal_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
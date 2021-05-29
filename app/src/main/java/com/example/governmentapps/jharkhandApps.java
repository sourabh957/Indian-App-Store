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
1)JharBhoomi
	https://play.google.com/store/apps/details?id=com.kiu.jharbhoomi

2)Jharkhand Government Jobs GK & GS
	https://play.google.com/store/apps/details?id=com.expertschoice.jharkhandgk

3)Jharkhand Government Jobs
	https://play.google.com/store/apps/details?id=com.appowork.jharkhandgovtjobs

4)Jharkhand Rojgar Samachar - Daily Govt Job Alerts
	https://play.google.com/store/apps/details?id=com.mithila_tech.jharkhand_rojgar_samachar

5)Jharkhand News Live TV | Jharkhand News in Hindi
	https://play.google.com/store/apps/details?id=com.Jharkhand_News_Live_TV.Jharkhand_News_in_Hindi.Breaking_News

6)Jharkhand Results
	https://play.google.com/store/apps/details?id=com.result.jharkhand

7)Jharkhand Sahayta
	https://play.google.com/store/apps/details?id=in.nic.jhk.mukhyamantrisahayata

8)Jharkhand aaj ka taja khabar
	https://play.google.com/store/apps/details?id=com.appnewshunts.jharkhandnewstajakhabar
 */


public class jharkhandApps extends AppCompatActivity {

    private List<appStyle> jharkhand_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jharkhand_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        jharkhand_app_list.add(new appStyle("JharBhoomi", R.drawable.jhar_bhoomi, "https://play.google.com/store/apps/details?id=com.kiu.jharbhoomi"));
        jharkhand_app_list.add(new appStyle("Jharkhand Government Jobs GK & GS", R.drawable.jk_gk_and_gs, "https://play.google.com/store/apps/details?id=com.expertschoice.jharkhandgk"));
        jharkhand_app_list.add(new appStyle("Jharkhand Government Jobs", R.drawable.jk_government_jobs, "https://play.google.com/store/apps/details?id=com.appowork.jharkhandgovtjobs"));
        jharkhand_app_list.add(new appStyle("Jharkhand Rojgar Samachar - Daily Govt Job Alerts", R.drawable.jk_job_alert, "https://play.google.com/store/apps/details?id=com.mithila_tech.jharkhand_rojgar_samachar"));
        jharkhand_app_list.add(new appStyle("Jharkhand News Live TV | Jharkhand News in Hindi", R.drawable.jk_news_live, "https://play.google.com/store/apps/details?id=com.Jharkhand_News_Live_TV.Jharkhand_News_in_Hindi.Breaking_News"));
        jharkhand_app_list.add(new appStyle("Jharkhand Results", R.drawable.jk_results, "https://play.google.com/store/apps/details?id=com.result.jharkhand"));
        jharkhand_app_list.add(new appStyle("Jharkhand Sahayta", R.drawable.jk_sahayta, "https://play.google.com/store/apps/details?id=in.nic.jhk.mukhyamantrisahayata"));
        jharkhand_app_list.add(new appStyle("Jharkhand aaj ka taja khabar", R.drawable.jk_taja_khabar, "https://play.google.com/store/apps/details?id=com.appnewshunts.jharkhandnewstajakhabar"));

        ListView aap = (ListView) findViewById(R.id.jharkhandAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = jharkhand_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(jharkhandApps.this, R.layout.list_view_layout, jharkhand_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = jharkhand_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
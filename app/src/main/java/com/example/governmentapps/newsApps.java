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
1)Aaj Tak Live TV News - Latest Hindi India News App
	https://play.google.com/store/apps/details?id=in.AajTak.headlines

2)ANI News
	https://play.google.com/store/apps/details?id=com.ani.news

3)Dailyhunt - 100% Indian App for News & Videos
	https://play.google.com/store/apps/details?id=com.eterno

4)First India News
	https://play.google.com/store/apps/details?id=com.firstindiya

5)Hindi News - All Hindi News India UP Bihar Delhi
	https://play.google.com/store/apps/details?id=com.cosmic.sonus.news.india.hindi

6)IndiaTV News
	https://play.google.com/store/apps/details?id=com.indiatv.livetv

7)Latest English News & Free Live TV by India Today
	https://play.google.com/store/apps/details?id=com.indiatoday

8)NDTV India Hindi News
	https://play.google.com/store/apps/details?id=com.ndtv.india

9)Patrika Hindi News App: Latest Hindi News & ePaper
	https://play.google.com/store/apps/details?id=com.vserv.rajasthanpatrika

10)The Lallantop-latest viral news & videos in Hindi
	https://play.google.com/store/apps/details?id=com.thelallantop

11)The New Indian Express Epaper
	https://play.google.com/store/apps/details?id=com.readwhere.whitelabel.newindianexpress

12)Zee News - Latest India News, Hindi News Live TV
	https://play.google.com/store/apps/details?id=com.zeenews.hindinews

 */

public class newsApps extends AppCompatActivity {

    private List<appStyle> news_apps_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        news_apps_list.add(new appStyle("Aaj Tak Live TV News - Latest Hindi India News App", R.drawable.aajtak, "https://play.google.com/store/apps/details?id=in.AajTak.headlines"));
        news_apps_list.add(new appStyle("ANI News", R.drawable.ani_news, "https://play.google.com/store/apps/details?id=com.ani.news"));
        news_apps_list.add(new appStyle("Dailyhunt - 100% Indian App for News & Videos", R.drawable.dailyhunt, "https://play.google.com/store/apps/details?id=com.eterno"));
        news_apps_list.add(new appStyle("First India News", R.drawable.first_india_news, "https://play.google.com/store/apps/details?id=com.firstindiya"));
        news_apps_list.add(new appStyle("Hindi News - All Hindi News India UP Bihar Delhi", R.drawable.hindi_news, "https://play.google.com/store/apps/details?id=com.cosmic.sonus.news.india.hindi"));
        news_apps_list.add(new appStyle("IndiaTV News", R.drawable.india_tv_news, "https://play.google.com/store/apps/details?id=com.indiatv.livetv"));
        news_apps_list.add(new appStyle("Latest English News & Free Live TV by India Today", R.drawable.latest_english_news, "https://play.google.com/store/apps/details?id=com.indiatoday"));
        news_apps_list.add(new appStyle("NDTV India Hindi News", R.drawable.ndtv_india_hindi_news, "https://play.google.com/store/apps/details?id=com.ndtv.india"));
        news_apps_list.add(new appStyle("Patrika Hindi News App: Latest Hindi News & ePaper", R.drawable.patrika_hindi_news, "https://play.google.com/store/apps/details?id=com.vserv.rajasthanpatrika"));
        news_apps_list.add(new appStyle("The Lallantop-latest viral news & videos in Hindi", R.drawable.the_lallantop, "https://play.google.com/store/apps/details?id=com.thelallantop"));
        news_apps_list.add(new appStyle("The New Indian Express Epaper", R.drawable.the_new_indian_express, "https://play.google.com/store/apps/details?id=com.readwhere.whitelabel.newindianexpress"));
        news_apps_list.add(new appStyle("Zee News - Latest India News, Hindi News Live TV", R.drawable.zee_news, "https://play.google.com/store/apps/details?id=com.zeenews.hindinews"));

        ListView aap = (ListView) findViewById(R.id.newsAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = news_apps_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(newsApps.this, R.layout.list_view_layout, news_apps_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = news_apps_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
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
1)Kohima Nagaland - News and Videos
	https://play.google.com/store/apps/details?id=com.buzzato.kohima

2)nCOVID-19 Nagaland - Visitors App
	https://play.google.com/store/apps/details?id=com.tattvafoundation.ncovid

3)Nagaland GK MCQs
	https://play.google.com/store/apps/details?id=com.nagalandgk.nagalandgkmcqs

4)Nagaland Local Plants
	https://play.google.com/store/apps/details?id=in.gov.nagaland.agri

5)Nagaland Lottery Results
	https://play.google.com/store/apps/details?id=com.autofillwand.nagalandlotteryresults

6)Nagaland News - Nagaland Selected Newspapers
	https://play.google.com/store/apps/details?id=com.Nagaland.newspaper

7)NagalandPost
	https://play.google.com/store/apps/details?id=com.nagalandpost4c7

8)Nagaland PSC (NPSC) App: Online Mock Tests
	https://play.google.com/store/apps/details?id=com.edugorilla.nagalandpsc

 */


public class nagalandApps extends AppCompatActivity {

    private List<appStyle> nagaland_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nagaland_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        nagaland_app_list.add(new appStyle("Kohima Nagaland - News and Videos", R.drawable.kohima_naga, "https://play.google.com/store/apps/details?id=com.buzzato.kohima"));
        nagaland_app_list.add(new appStyle("nCOVID-19 Nagaland - Visitors App", R.drawable.naga_covid_app, "https://play.google.com/store/apps/details?id=com.tattvafoundation.ncovid"));
        nagaland_app_list.add(new appStyle("Nagaland GK MCQs", R.drawable.naga_gk, "https://play.google.com/store/apps/details?id=com.nagalandgk.nagalandgkmcqs"));
        nagaland_app_list.add(new appStyle("Nagaland Local Plants", R.drawable.naga_local_plants, "https://play.google.com/store/apps/details?id=in.gov.nagaland.agri"));
        nagaland_app_list.add(new appStyle("Nagaland Lottery Results", R.drawable.naga_lottery, "https://play.google.com/store/apps/details?id=com.autofillwand.nagalandlotteryresults"));
        nagaland_app_list.add(new appStyle("Nagaland News - Nagaland Selected Newspapers", R.drawable.naga_news, "https://play.google.com/store/apps/details?id=com.Nagaland.newspaper"));
        nagaland_app_list.add(new appStyle("NagalandPost", R.drawable.naga_post, "https://play.google.com/store/apps/details?id=com.nagalandpost4c7"));
        nagaland_app_list.add(new appStyle("Nagaland PSC (NPSC) App: Online Mock Tests", R.drawable.naga_psc, "https://play.google.com/store/apps/details?id=com.edugorilla.nagalandpsc"));


        ListView aap = (ListView) findViewById(R.id.nagalandAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = nagaland_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(nagalandApps.this, R.layout.list_view_layout, nagaland_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = nagaland_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
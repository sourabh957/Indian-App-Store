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
1)Government Schemes in Manipur
	https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinmanipur

2)Loucha Pathap - ROR APP
	https://play.google.com/store/apps/details?id=in.nic.louchapathap

3)Manipur Gas News
	https://play.google.com/store/apps/details?id=io.kodular.rabichandra_k.Manipurgas

4)Manipur Job Card
	https://play.google.com/store/apps/details?id=com.rabichandra.ManipurJobCard

5)Manipur Jobs
	https://play.google.com/store/apps/details?id=com.manipur.jobss

6)Manipur News - Daily Manipur Newspaper
	https://play.google.com/store/apps/details?id=com.Daydreamk.manipurnewspaper

7)Manipur Radio
	https://play.google.com/store/apps/details?id=com.kangladevelopers.manipuri_radio

8)Manipur Ration Card
	https://play.google.com/store/apps/details?id=io.kodular.rabichandra_k.ManipurRationCard

 */


public class manipurApps extends AppCompatActivity {

    private List<appStyle> manipur_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manipur_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        manipur_app_list.add(new appStyle("Government Schemes in Manipur", R.drawable.government_schemes_in_manipur, "https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinmanipur"));
        manipur_app_list.add(new appStyle("Loucha Pathap - ROR APP", R.drawable.loucha_pathap, "https://play.google.com/store/apps/details?id=in.nic.louchapathap"));
        manipur_app_list.add(new appStyle("Manipur Gas News", R.drawable.manipur_gas_news, "https://play.google.com/store/apps/details?id=io.kodular.rabichandra_k.Manipurgas"));
        manipur_app_list.add(new appStyle("Manipur Job Card", R.drawable.manipur_job_card, "https://play.google.com/store/apps/details?id=com.rabichandra.ManipurJobCard"));
        manipur_app_list.add(new appStyle("Manipur Jobs", R.drawable.manipur_jobs, "https://play.google.com/store/apps/details?id=com.manipur.jobss"));
        manipur_app_list.add(new appStyle("Manipur News - Daily Manipur Newspaper", R.drawable.manipur_news, "https://play.google.com/store/apps/details?id=com.Daydreamk.manipurnewspaper"));
        manipur_app_list.add(new appStyle("Manipur Radio", R.drawable.manipur_radio, "https://play.google.com/store/apps/details?id=com.kangladevelopers.manipuri_radio"));
        manipur_app_list.add(new appStyle("Manipur Ration Card", R.drawable.manipur_ration_card, "https://play.google.com/store/apps/details?id=io.kodular.rabichandra_k.ManipurRationCard"));


        ListView aap = (ListView) findViewById(R.id.manipurAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = manipur_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(manipurApps.this, R.layout.list_view_layout, manipur_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = manipur_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
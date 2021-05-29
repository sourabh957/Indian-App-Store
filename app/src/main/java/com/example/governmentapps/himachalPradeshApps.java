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
1)eChallan Online Govt. Receipts
	https://play.google.com/store/apps/details?id=nic.hp.echallan

2)Himachal ePapers
	https://play.google.com/store/apps/details?id=io.cordova.himachalepapers

3)ePension HP Govt Pensioners
	https://play.google.com/store/apps/details?id=nic.hp.epension

4)eSalary HP Govt Employees
	https://play.google.com/store/apps/details?id=nic.hp.esalary

5)eServicesHP
	https://play.google.com/store/apps/details?id=nichp.in.eserviceshp

6)Himachal GK
	https://play.google.com/store/apps/details?id=com.erdeepak_hp.Himachal_GK

7)Government Schemes in Himachal Pradesh
	https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinhimachalpradesh

8)Himachal Pradesh Irrigation and Public Health
	https://play.google.com/store/apps/details?id=amit.kanojia.hpiph

9)Himachal Pradesh Govt. Jobs
	https://play.google.com/store/apps/details?id=com.appedusoft.hpgovtjobs

10)mHimBhoomi Mobile Land Record of Himachal Pradesh
	https://play.google.com/store/apps/details?id=nic.hp.landrecords

11)Himachal Live
	https://play.google.com/store/apps/details?id=himachal.live

12)HPPSC / HPAS
	https://play.google.com/store/apps/details?id=com.sanaedutech.hppsc

 */

public class himachalPradeshApps extends AppCompatActivity {

    private List<appStyle> himachalPradesh_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_himachal_pradesh_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        himachalPradesh_app_list.add(new appStyle("eChallan Online Govt. Receipts", R.drawable.hp_e_challan, "https://play.google.com/store/apps/details?id=nic.hp.echallan"));
        himachalPradesh_app_list.add(new appStyle("Himachal ePapers", R.drawable.hp_e_papers, "https://play.google.com/store/apps/details?id=io.cordova.himachalepapers"));
        himachalPradesh_app_list.add(new appStyle("ePension HP Govt Pensioners", R.drawable.hp_e_pensions, "https://play.google.com/store/apps/details?id=nic.hp.epension"));
        himachalPradesh_app_list.add(new appStyle("eSalary HP Govt Employees", R.drawable.hp_e_salary, "https://play.google.com/store/apps/details?id=nic.hp.esalary"));
        himachalPradesh_app_list.add(new appStyle("eServicesHP", R.drawable.hp_e_services, "https://play.google.com/store/apps/details?id=nichp.in.eserviceshp"));
        himachalPradesh_app_list.add(new appStyle("Himachal GK", R.drawable.hp_gk, "https://play.google.com/store/apps/details?id=com.erdeepak_hp.Himachal_GK"));
        himachalPradesh_app_list.add(new appStyle("Government Schemes in Himachal Pradesh", R.drawable.hp_government_schemes, "https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinhimachalpradesh"));
        himachalPradesh_app_list.add(new appStyle("Himachal Pradesh Irrigation and Public Health", R.drawable.hp_irrigation_public_health, "https://play.google.com/store/apps/details?id=amit.kanojia.hpiph"));
        himachalPradesh_app_list.add(new appStyle("Himachal Pradesh Govt. Jobs", R.drawable.hp_jobs, "https://play.google.com/store/apps/details?id=com.appedusoft.hpgovtjobs"));
        himachalPradesh_app_list.add(new appStyle("mHimBhoomi Mobile Land Record of Himachal Pradesh", R.drawable.hp_land_record, "https://play.google.com/store/apps/details?id=nic.hp.landrecords"));
        himachalPradesh_app_list.add(new appStyle("Himachal Live", R.drawable.hp_news_live, "https://play.google.com/store/apps/details?id=himachal.live"));
        himachalPradesh_app_list.add(new appStyle("HPPSC / HPAS", R.drawable.hppsc_hpas, "https://play.google.com/store/apps/details?id=com.sanaedutech.hppsc"));

        ListView aap = (ListView) findViewById(R.id.himachalPradeshAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = himachalPradesh_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(himachalPradeshApps.this, R.layout.list_view_layout, himachalPradesh_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = himachalPradesh_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
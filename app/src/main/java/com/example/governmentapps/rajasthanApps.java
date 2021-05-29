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
1)ePDS Rajasthan
	https://play.google.com/store/apps/details?id=com.PDSRaj.acer.pdsfoodrajnic

2)ग्राम पंचायत ऑनलाइन
	https://play.google.com/store/apps/details?id=com.grampanchayatonlinesewa

3)Rajasthan Board Books
	https://play.google.com/store/apps/details?id=rajasthan.board.textbooks

4)RajCop Citizen
	https://play.google.com/store/apps/details?id=com.datainfosys.rajasthanpolice.publicapp

5)Rajasthan Government Jobs GK & GS
	https://play.google.com/store/apps/details?id=com.expertschoice.rajasthangk

6)Rajasthan Jobs
	https://play.google.com/store/apps/details?id=com.rajasthan.jobss

7)राजस्थान भूलेख : Rajasthan Land Records Apna Khata
	https://play.google.com/store/apps/details?id=com.ds.rajasthanland

8)RajMail
	https://play.google.com/store/apps/details?id=com.gov.rajmail

9)Raj Panchayat
	https://play.google.com/store/apps/details?id=com.ePanchayat

10)Rajasthan RationCard, NEWS, भामाशाह, jan adhar,BPL
	https://play.google.com/store/apps/details?id=com.whiteman7866.rasion

11)Rajasthan Rojgar Samachar in Hindi
	https://play.google.com/store/apps/details?id=com.mithila_tech.rajasthan_rojgar_samachar

12)Rajasthan Tourism
	https://play.google.com/store/apps/details?id=com.rajasthantourism.rtdc

 */


public class rajasthanApps extends AppCompatActivity {

    private List<appStyle> rajasthan_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rajasthan_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        rajasthan_app_list.add(new appStyle("ePDS Rajasthan", R.drawable.e_pds_rajasthan, "https://play.google.com/store/apps/details?id=com.PDSRaj.acer.pdsfoodrajnic"));
        rajasthan_app_list.add(new appStyle("ग्राम पंचायत ऑनलाइन", R.drawable.gram_panchayat_online, "https://play.google.com/store/apps/details?id=com.grampanchayatonlinesewa"));
        rajasthan_app_list.add(new appStyle("Rajasthan Board Books", R.drawable.rj_board_books, "https://play.google.com/store/apps/details?id=rajasthan.board.textbooks"));
        rajasthan_app_list.add(new appStyle("Andhra Pradesh Rice Card Status | AP Biyyam Card", R.drawable.andhra_pradesh_rice_card_status, "https://play.google.com/store/apps/details?id=com.apschemes2020.AP_Rice_Card"));
        rajasthan_app_list.add(new appStyle("RajCop Citizen", R.drawable.rj_cop_citizen, "https://play.google.com/store/apps/details?id=com.datainfosys.rajasthanpolice.publicapp"));
        rajasthan_app_list.add(new appStyle("Rajasthan Government Jobs GK & GS", R.drawable.rj_government_jobs_gk_gs, "https://play.google.com/store/apps/details?id=com.expertschoice.rajasthangk"));
        rajasthan_app_list.add(new appStyle("Rajasthan Jobs", R.drawable.rj_jobs, "https://play.google.com/store/apps/details?id=com.rajasthan.jobss"));
        rajasthan_app_list.add(new appStyle("राजस्थान भूलेख : Rajasthan Land Records Apna Khata", R.drawable.rj_land_record, "https://play.google.com/store/apps/details?id=com.ds.rajasthanland"));
        rajasthan_app_list.add(new appStyle("RajMail", R.drawable.rj_mail, "https://play.google.com/store/apps/details?id=com.gov.rajmail"));
        rajasthan_app_list.add(new appStyle("Raj Panchayat", R.drawable.rj_panchayat, "https://play.google.com/store/apps/details?id=com.ePanchayat"));
        rajasthan_app_list.add(new appStyle("Rajasthan RationCard, NEWS, भामाशाह, jan adhar,BPL", R.drawable.rj_ratio_card_news, "https://play.google.com/store/apps/details?id=com.whiteman7866.rasion"));
        rajasthan_app_list.add(new appStyle("Rajasthan Rojgar Samachar in Hindi", R.drawable.rj_rojgar_samachar, "https://play.google.com/store/apps/details?id=com.mithila_tech.rajasthan_rojgar_samachar"));
        rajasthan_app_list.add(new appStyle("Rajasthan Tourism", R.drawable.rj_tourism, "https://play.google.com/store/apps/details?id=com.rajasthantourism.rtdc"));

        ListView aap = (ListView) findViewById(R.id.rajasthanAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = rajasthan_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(rajasthanApps.this, R.layout.list_view_layout, rajasthan_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = rajasthan_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
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
1)Bhuiyan
	https://play.google.com/store/apps/details?id=com.nic.nicsi.bhuiyangu

2)CG Covid-19 ePass
	https://play.google.com/store/apps/details?id=com.allsoft.corona

3)Government Schemes in Chhattisgarh
	https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinchhattisgarh

4)High Court Of Chhattisgarh
	https://play.google.com/store/apps/details?id=com.cg.mytest.cghc

5)Chhattisgarh Jobs
	https://play.google.com/store/apps/details?id=com.chhattisgarh.jobss

6)Chhattisgarh Job Alert
	https://play.google.com/store/apps/details?id=com.jbapp.chhattisgarhrojgarsamachar

7)C.G.Khadya – Janbhagidari
	https://play.google.com/store/apps/details?id=nic.pds.janbhagidaari

8)C.G.Khadya – Rationcard Navinikaran
	https://play.google.com/store/apps/details?id=com.nic.rationcardpv

9)CG School App
	https://play.google.com/store/apps/details?id=cg.school

10)Chhattisgarh State Board Books
	https://play.google.com/store/apps/details?id=chhattisgarh.board.textbook

11)UDS-CG App
	https://play.google.com/store/apps/details?id=nic.cgeducation.shalakosh

 */

public class chattisgarhApps extends AppCompatActivity {

    private List<appStyle> chattisgarh_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chattisgarh_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        chattisgarh_app_list.add(new appStyle("Bhuiyan", R.drawable.bhuiyan, "https://play.google.com/store/apps/details?id=com.nic.nicsi.bhuiyangu"));
        chattisgarh_app_list.add(new appStyle("CG Covid-19 ePass", R.drawable.cg_covid_19_, "https://play.google.com/store/apps/details?id=com.allsoft.corona"));
        chattisgarh_app_list.add(new appStyle("Government Schemes in Chhattisgarh", R.drawable.cg_govenrment_schemes, "https://play.google.com/store/apps/details?id=governmentschemes.sarkariyojna.bharatiyesarkariyojnaye.govschemesinchhattisgarh"));
        chattisgarh_app_list.add(new appStyle("High Court Of Chhattisgarh", R.drawable.cg_highcourt, "https://play.google.com/store/apps/details?id=com.cg.mytest.cghc"));
        chattisgarh_app_list.add(new appStyle("Chhattisgarh Jobs", R.drawable.cg_jobs, "https://play.google.com/store/apps/details?id=com.chhattisgarh.jobss"));
        chattisgarh_app_list.add(new appStyle("Chhattisgarh Job Alert", R.drawable.cg_jobs_alert, "https://play.google.com/store/apps/details?id=com.jbapp.chhattisgarhrojgarsamachar"));
        chattisgarh_app_list.add(new appStyle("C.G.Khadya – Janbhagidari", R.drawable.cg_khadya, "https://play.google.com/store/apps/details?id=nic.pds.janbhagidaari"));
        chattisgarh_app_list.add(new appStyle("C.G.Khadya – Rationcard Navinikaran", R.drawable.cg_ration_record, "https://play.google.com/store/apps/details?id=com.nic.rationcardpv"));
        chattisgarh_app_list.add(new appStyle("CG School App", R.drawable.cg_school_apps, "https://play.google.com/store/apps/details?id=cg.school"));
        chattisgarh_app_list.add(new appStyle("Chhattisgarh State Board Books", R.drawable.cg_state_board_books, "https://play.google.com/store/apps/details?id=chhattisgarh.board.textbook"));
        chattisgarh_app_list.add(new appStyle("UDS-CG App", R.drawable.cg_uds, "https://play.google.com/store/apps/details?id=nic.cgeducation.shalakosh"));



        ListView aap = (ListView) findViewById(R.id.chattisgarhAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = chattisgarh_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(chattisgarhApps.this, R.layout.list_view_layout, chattisgarh_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = chattisgarh_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
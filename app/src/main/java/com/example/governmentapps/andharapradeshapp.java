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

public class andharapradeshapp extends AppCompatActivity {

    private List<appStyle> andhara_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_andharapradeshapp);

        ArrayAdapter<appStyle> adapter = new customAdapter();
        andhara_app_list.add(new appStyle("Andhra Pradesh Board Books", R.drawable.andhra_board_books, "https://play.google.com/store/apps/details?id=andhrapradesh.board.textbook"));
        andhara_app_list.add(new appStyle("Andhra Pradesh Chief Ministers Governors Districts", R.drawable.andhra_pradesh_chief_ministers_districts, "https://play.google.com/store/apps/details?id=com.andromo.dev751789.app997198"));
        andhara_app_list.add(new appStyle("Jobs In Andhra Pradesh", R.drawable.andhra_pradesh_jobs, "https://play.google.com/store/apps/details?id=com.jobs.in.andhra.pradesh"));
        andhara_app_list.add(new appStyle("Andhra Pradesh Rice Card Status | AP Biyyam Card", R.drawable.andhra_pradesh_rice_card_status, "https://play.google.com/store/apps/details?id=com.apschemes2020.AP_Rice_Card"));
        andhara_app_list.add(new appStyle("AP eChallan", R.drawable.ap_echallan, "https://play.google.com/store/apps/details?id=com.echallan.userapp"));
        andhara_app_list.add(new appStyle("AP GOVT SCHEMES - MEE BHOOMI", R.drawable.ap_govt_schemes, "https://play.google.com/store/apps/details?id=com.ap.govtservices"));
        andhara_app_list.add(new appStyle("AP Andhra Pradesh News - Vaarthalu", R.drawable.ap_news, "https://play.google.com/store/apps/details?id=com.andhrapradesh.news.vaarthalu"));
        andhara_app_list.add(new appStyle("AP SAND", R.drawable.ap_sand, "https://play.google.com/store/apps/details?id=com.ap.sand"));
        andhara_app_list.add(new appStyle("AP Vehicle Owner Details", R.drawable.ap_vehicle_owner_details, "https://play.google.com/store/apps/details?id=com.binakapps.apvehicleownerdetails"));
        andhara_app_list.add(new appStyle("AP Volunteer", R.drawable.ap_volunteer, "https://play.google.com/store/apps/details?id=in.apcfss.sw.navasakam.volunteer"));
        andhara_app_list.add(new appStyle("AP Yojana", R.drawable.ap_yojana, "https://play.google.com/store/apps/details?id=com.ask.apyojana"));
        andhara_app_list.add(new appStyle("APPSC Telugu", R.drawable.appsc_telugu, "https://play.google.com/store/apps/details?id=com.sanaedutech.aspsc_telugu"));
        andhara_app_list.add(new appStyle("Disha SOS", R.drawable.disha_sos, "https://play.google.com/store/apps/details?id=com.likhatech.disha"));
        andhara_app_list.add(new appStyle("MeeBhoomi Andhra-pradesh", R.drawable.mee_bhoomi_andhra_pradesh, "https://play.google.com/store/apps/details?id=mee.bhoomiandhrapradesh.app"));
        andhara_app_list.add(new appStyle("Pension Kanuka Andhra Pradesh Online Info", R.drawable.pension_kanuka_andhra_pradesh, "https://play.google.com/store/apps/details?id=com.apschemes2020.YSR_Pension_Kanuka"));
        andhara_app_list.add(new appStyle("RTO Exam in Telugu(Andhra Pradesh & Telangana)", R.drawable.rto_exams_in_telugu, "https://play.google.com/store/apps/details?id=nirguru.rtoexamintelugu"));
        andhara_app_list.add(new appStyle("Southern Power", R.drawable.southern_power, "https://play.google.com/store/apps/details?id=com.apspdcl.consumerapp"));
        andhara_app_list.add(new appStyle("Voter List AP", R.drawable.voter_list_ap, "https://play.google.com/store/apps/details?id=com.votersearch"));


        ListView aap = (ListView) findViewById(R.id.AndharaAppListID);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = andhara_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(andharapradeshapp.this, R.layout.list_view_layout, andhara_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = andhara_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
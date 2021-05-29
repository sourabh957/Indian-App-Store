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

public class centralApps extends AppCompatActivity {

    private List<appStyle> central_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_central_apps);
        central_app_list.add(new appStyle("All Government Job 2020 - Sarkari naukri Alerts", R.drawable.all_government_jobs, "https://play.google.com/store/apps/details?id=com.josh.jagran.android.activity.snaukri"));
        central_app_list.add(new appStyle("Aaykar setu", R.drawable.aaykarsetuapp, "https://play.google.com/store/apps/details?id=com.taxmann.aayakarsetu"));
        central_app_list.add(new appStyle("Aarogya setu", R.drawable.arogyasetuapp, "https://play.google.com/store/apps/details?id=nic.goi.aarogyasetu&hl=en"));
        central_app_list.add(new appStyle("Bharat Ke Veer", R.drawable.bharatkeveerapp, "https://play.google.com/store/apps/details?id=appthemartyrs.in.nic.bih.onlineapp.appthemartyrs"));
        central_app_list.add(new appStyle("Bhim", R.drawable.bhimapp, "https://play.google.com/store/apps/details?id=in.org.npci.upiapp&hl=en"));
        central_app_list.add(new appStyle("ePathshala", R.drawable.epaathshala, "https://play.google.com/store/apps/details?id=in.gov.epathshala"));
        central_app_list.add(new appStyle("GST rate finder", R.drawable.gstratefinderapp, "https://play.google.com/store/apps/details?id=in.gov.cbec.gsttaxratemanual"));
        central_app_list.add(new appStyle("Indian police", R.drawable.indianpoliceapp, "https://play.google.com/store/apps/details?id=in.nic.bih.thanalocator"));
        central_app_list.add(new appStyle("IRCTC rail connect", R.drawable.irctcapp, "https://play.google.com/store/apps/details?id=cris.org.in.prs.ima"));
        central_app_list.add(new appStyle("Khelo india", R.drawable.kheloindiaapp, "https://play.google.com/store/apps/details?id=com.kheloindia.mobile.app"));
        central_app_list.add(new appStyle("Khelo india (school version)", R.drawable.kheloindiaschoolapp, "https://play.google.com/store/apps/details?id=kheloindia.com.assessment"));
        central_app_list.add(new appStyle("mAadhaar", R.drawable.madhaarapp, "https://play.google.com/store/apps/details?id=in.gov.uidai.mAadhaarPlus&hl=en"));
        central_app_list.add(new appStyle("Ministry of external affairs", R.drawable.meaindiaapp, "https://play.google.com/store/apps/details?id=com.mea&hl=en"));
        central_app_list.add(new appStyle("mParivahan", R.drawable.mparivahan, "https://play.google.com/store/apps/details?id=com.nic.mparivahan"));
        central_app_list.add(new appStyle("MyGov", R.drawable.mygovapp, "https://play.google.com/store/apps/details?id=in.mygov.mobile&hl=en"));
        central_app_list.add(new appStyle("mPassportSeva", R.drawable.mypassportsevaapp, "https://play.google.com/store/apps/details?id=gov.mea.psp&hl=en"));
        central_app_list.add(new appStyle("Narendra modi", R.drawable.narendramodiapp, "https://play.google.com/store/apps/details?id=com.narendramodiapp&hl=en"));
        central_app_list.add(new appStyle("OnlineRTI - File RTI Online", R.drawable.onlinertiapp, "https://play.google.com/store/apps/details?id=com.onlinerti.android&hl=en"));
        central_app_list.add(new appStyle("PMKISAN", R.drawable.pmkisanapp, "https://play.google.com/store/apps/details?id=com.nic.project.pmkisan&hl=en"));
        central_app_list.add(new appStyle("PostInfo", R.drawable.postinfoapp, "https://play.google.com/store/apps/details?id=info.indiapost&hl=en"));
        central_app_list.add(new appStyle("Sarkari Naukri - Govt Job alerts (Government jobs)", R.drawable.sarkari_naukari, "https://play.google.com/store/apps/details?id=com.josh.jagran.android.activity.snaukri"));
        central_app_list.add(new appStyle("Startup India Hub", R.drawable.startupindiaapp, "https://play.google.com/store/apps/details?id=com.startupindia.startupindiahub"));
        central_app_list.add(new appStyle("UMANG", R.drawable.umangapp, "https://play.google.com/store/apps/details?id=in.gov.umang.negd.g2c"));
        central_app_list.add(new appStyle("Vehicle information - find vehicle owner details", R.drawable.vehicleinformationapp, "https://play.google.com/store/apps/details?id=com.trendingapps.rtovehicleinformationapp.vehicleregistrationdetails&hl=en"));

        ArrayAdapter<appStyle> adapter = new customAdapter();

        ListView cal = (ListView) (findViewById(R.id.centralListId));
        cal.setAdapter(adapter);

        cal.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aps = central_app_list.get(position);
                Uri uri = Uri.parse(aps.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(centralApps.this, R.layout.list_view_layout, central_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = central_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }
    }
}
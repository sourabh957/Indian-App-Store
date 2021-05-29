package com.example.governmentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class govApps extends AppCompatActivity {
    Button stateApps , centreApps;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gov_apps);
        getWindow().setBackgroundDrawableResource(R.drawable.indian_flag2);
        stateApps = (Button)findViewById(R.id.stateGov);
        centreApps = (Button)findViewById(R.id.centralGov);

        centreApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openCenterApps();
            }
        });

        stateApps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openStateApps();
            }
        });
    }
    public void openCenterApps() {
        Intent intent = new Intent(this , centralApps.class);
        startActivity(intent);
    }
    public void openStateApps() {
        Intent intent  = new Intent(this, stateApps.class);
        startActivity(intent);
    }
}
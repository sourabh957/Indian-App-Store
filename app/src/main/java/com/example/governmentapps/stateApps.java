package com.example.governmentapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class stateApps extends AppCompatActivity {

    Button AndharaButton, ArunachalButton, assamButton, biharButton, chattisgarhButton, goaButton, gujaratButton, haryanaButton, himachalPradeshButton;
    Button jharkhandButton, karnatakaButton, kerelaButton, madhyaPradeshButton, maharashtraButton, manipurButton, meghalayaButton, mizoramButton;
    Button nagalandButton, odishaButton, punjabButton, rajasthanButton, sikkimButton, tamilNaduButton, telanganaButton;
    Button tripuraButton, uttarakhandButton, uttarPradeshButton, westBengalButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state_apps);
        getWindow().setBackgroundDrawableResource(R.drawable.indian_flag2);

        mizoramButton = (Button) findViewById(R.id.mizoram_app_button);
        mizoramButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_mizoram_apps();
            }
        });

        westBengalButton = (Button)findViewById(R.id.west_bengal_app_button);
        westBengalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_west_bengal_apps();
            }
        });

        uttarPradeshButton = (Button) findViewById(R.id.uttar_pradesh_app_button);
        uttarPradeshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_uttar_pradesh_apps();
            }
        });

        uttarakhandButton = (Button) findViewById(R.id.uttarakhand_app_button);
        uttarakhandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_uttarakhand_apps();
            }
        });

        tripuraButton = (Button) findViewById(R.id.tripura_app_button);
        tripuraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_tripura_apps();
            }
        });

        telanganaButton = (Button) findViewById(R.id.telangana_app_button);
        telanganaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_telangana_apps();
            }
        });

        tamilNaduButton = (Button)findViewById(R.id.tamil_nadu_app_button);
        tamilNaduButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_tamil_nadu_apps();
            }
        });

        sikkimButton = (Button) findViewById(R.id.sikkim_app_button);
        sikkimButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_sikkim_apps();
            }
        });

        rajasthanButton = (Button) findViewById(R.id.rajasthan_app_button);
        rajasthanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_rajasthan_apps();
            }
        });

        punjabButton = (Button) findViewById(R.id.punjab_app_button);
        punjabButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_punjab_apps();
            }
        });

        odishaButton = (Button) findViewById(R.id.odisha_app_button);
        odishaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_odisha_apps();
            }
        });

        nagalandButton = (Button) findViewById(R.id.nagaland_app_button);
        nagalandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_nagaland_apps();
            }
        });

        meghalayaButton = (Button) findViewById(R.id.meghalaya_app_button);
        meghalayaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_meghalaya_apps();
            }
        });

        manipurButton = (Button) findViewById(R.id.manipur_app_button);
        manipurButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_manipur_apps();
            }
        });

        maharashtraButton = (Button) findViewById(R.id.maharashtra_app_button);
        maharashtraButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_maharashtra_apps();
            }
        });

        madhyaPradeshButton = (Button) findViewById(R.id.madhya_pradesh_app_button);
        madhyaPradeshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_madhyaPradesh_apps();
            }
        });

        kerelaButton = (Button) findViewById(R.id.kerela_app_button);
        kerelaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_kerela_apps();
            }
        });

        karnatakaButton = (Button) findViewById(R.id.karnataka_app_button);
        karnatakaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_karnataka_apps();
            }
        });

        jharkhandButton = (Button) findViewById(R.id.jharkhand_app_button);
        jharkhandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_jharkhand_apps();
            }
        });

        himachalPradeshButton = (Button) findViewById(R.id.himachal_pradesh_app_button);
        himachalPradeshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_himachalPradesh_apps();
            }
        });

        haryanaButton = (Button) findViewById(R.id.haryana_app_button);
        haryanaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_haryana_apps();
            }
        });

        AndharaButton = (Button) findViewById(R.id.andharaPradesh);
        AndharaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAPapps();
            }
        });

        ArunachalButton = (Button) findViewById(R.id.arunachal_pradesh);
        ArunachalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openArunachal_pradesh_apps();
            }
        });

        assamButton = (Button) findViewById(R.id.assam_app_button);
        assamButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_assam_apps();
            }
        });

        biharButton = (Button) findViewById(R.id.bihar_app_button);
        biharButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_bihar_apps();
            }
        });

        chattisgarhButton = (Button) findViewById(R.id.chattisgarh_app_button);
        chattisgarhButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_chattisgarh_apps();
            }
        });

        goaButton = (Button) findViewById(R.id.goa_app_button);
        goaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_goa_apps();
            }
        });

        gujaratButton = (Button) findViewById(R.id.gujarat_app_button);
        gujaratButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open_gujarat_apps();
            }
        });

    }

    private void open_mizoram_apps() {
        Intent intent = new Intent(this, mizoramApps.class);
        startActivity(intent);
    }

    private void open_west_bengal_apps() {
        Intent intent = new Intent(this, westBengalApps.class);
        startActivity(intent);
    }

    private void open_uttar_pradesh_apps() {
        Intent intent = new Intent(this, uttarPradeshApps.class);
        startActivity(intent);
    }

    private void open_uttarakhand_apps() {
        Intent intent = new Intent(this, uttarakhandApps.class);
        startActivity(intent);
    }

    private void open_tripura_apps() {
        Intent intent = new Intent(this, tripuraApps.class);
        startActivity(intent);
    }

    private void open_telangana_apps() {
        Intent intent = new Intent(this, telanganaApps.class);
        startActivity(intent);
    }

    private void open_tamil_nadu_apps() {
        Intent intent = new Intent(this, tamilNaduApps.class);
        startActivity(intent);
    }

    private void open_sikkim_apps() {
        Intent intent = new Intent(this, sikkimApps.class);
        startActivity(intent);
    }

    private void open_rajasthan_apps() {
        Intent intent = new Intent(this, rajasthanApps.class);
        startActivity(intent);
    }

    private void open_punjab_apps() {
        Intent intent = new Intent(this, punjabApps.class);
        startActivity(intent);
    }

    private void open_odisha_apps() {
        Intent intent = new Intent(this, odishaApps.class);
        startActivity(intent);
    }

    private void open_nagaland_apps() {
        Intent intent = new Intent(this, nagalandApps.class);
        startActivity(intent);
    }

    private void open_meghalaya_apps() {
        Intent intent = new Intent(this, meghalayaApps.class);
        startActivity(intent);
    }

    private void open_manipur_apps() {
        Intent intent = new Intent(this, manipurApps.class);
        startActivity(intent);
    }

    private void open_maharashtra_apps() {
        Intent intent = new Intent(this, maharashtraApps.class);
        startActivity(intent);
    }

    private void open_madhyaPradesh_apps() {
        Intent intent = new Intent(this, madhyaPradeshApps.class);
        startActivity(intent);
    }

    private void open_kerela_apps() {
        Intent intent = new Intent(this, kerelaApps.class);
        startActivity(intent);
    }

    private void open_karnataka_apps() {
        Intent intent = new Intent(this, karnatakaApps.class);
        startActivity(intent);
    }

    private void open_jharkhand_apps() {
        Intent intent = new Intent(this, jharkhandApps.class);
        startActivity(intent);
    }

    private void open_himachalPradesh_apps() {
        Intent intent = new Intent(this, himachalPradeshApps.class);
        startActivity(intent);
    }

    private void open_haryana_apps() {
        Intent intent = new Intent(this, haryanaApps.class);
        startActivity(intent);
    }

    private void open_gujarat_apps() {
        Intent intent = new Intent(this, gujaratApps.class);
        startActivity(intent);
    }

    private void open_goa_apps() {
        Intent intent = new Intent(this, goaApps.class);
        startActivity(intent);
    }

    private void open_chattisgarh_apps() {
        Intent intent = new Intent(this, chattisgarhApps.class);
        startActivity(intent);
    }

    private void open_bihar_apps() {
        Intent intent = new Intent(this, biharApps.class);
        startActivity(intent);
    }

    private void open_assam_apps() {
        Intent intent = new Intent(this, assamApps.class);
        startActivity(intent);
    }

    private void openAPapps() {
        Intent intent = new Intent(this, andharapradeshapp.class);
        startActivity(intent);
    }

    private void openArunachal_pradesh_apps() {
        Intent intent = new Intent(this, arunachal_pradesh_apps.class);
        startActivity(intent);
    }

}
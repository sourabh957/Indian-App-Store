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
1)All UPSC Papers Prelims & Mains
	https://play.google.com/store/apps/details?id=com.Lastyear.upscpapers

2)BYJU'S – The Learning App
	https://play.google.com/store/apps/details?id=com.byjus.thelearningapp

3)CBSE Class 1 to 8 Books & Solutions
	https://play.google.com/store/apps/details?id=com.kopykitab.cbse.class1to8

4)18 Years JEE Main Solved Papers
	https://play.google.com/store/apps/details?id=com.Lastyear.jeemainsolvedpapers

5)General Knowledge Quiz : World GK Quiz App
	https://play.google.com/store/apps/details?id=nithra.quiz

6)Improve English: Vocabulary, Grammar, Word Games
	https://play.google.com/store/apps/details?id=com.knudge.me

7)India GK
	https://play.google.com/store/apps/details?id=com.csurender.dune.indiagk

8)JEE Mains & JEE Advance 2020 Exam Preparation
	https://play.google.com/store/apps/details?id=jee.iit.latest

9)MathsApp - Vedic Math Tricks
	https://play.google.com/store/apps/details?id=com.meritshine.mathfun

10)Mental Math Practice
	https://play.google.com/store/apps/details?id=com.magoosh.gre.flashcards.mental_math

11)Meritnation: CBSE, ICSE & more (Free Live Classes)
	https://play.google.com/store/apps/details?id=com.meritnation.school

12)NCERT Books
	https://play.google.com/store/apps/details?id=com.ncert

13)NCERT Solutions of NCERT Books
	https://play.google.com/store/apps/details?id=com.meritnation.ncert

14)NEET Preparation 2020
	https://play.google.com/store/apps/details?id=neet.ug.latest

15)Study IQ
	https://play.google.com/store/apps/details?id=com.studyiq.android

16)Teno – School app for ICSE, CBSE & more
	https://play.google.com/store/apps/details?id=com.pebstone.teno

17)13 Years Jee Advanced Solved Papers Offline
	https://play.google.com/store/apps/details?id=com.Lastyear.jeeadvancesolvedpapers

18)Unacademy Learning App
	https://play.google.com/store/apps/details?id=com.unacademyapp

19)Vocabulary Builder
	https://play.google.com/store/apps/details?id=com.rishabhk.vocabbuilder

 */
public class educationalApps extends AppCompatActivity {

    public List<appStyle> educational_app_list = new ArrayList<appStyle>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_educational_apps);

        ArrayAdapter<appStyle> adapter = new customAdapter();

        educational_app_list.add(new appStyle("All UPSC Papers Prelims & Mains", R.drawable.all_upsc_papers_prelims, "https://play.google.com/store/apps/details?id=com.Lastyear.upscpapers"));
        educational_app_list.add(new appStyle("BYJU'S – The Learning App", R.drawable.byjus_the_learning_app, "https://play.google.com/store/apps/details?id=com.byjus.thelearningapp"));
        educational_app_list.add(new appStyle("CBSE Class 1 to 8 Books & Solutions", R.drawable.cbse_class_one_to_eight, "https://play.google.com/store/apps/details?id=com.kopykitab.cbse.class1to8"));
        educational_app_list.add(new appStyle("18 Years JEE Main Solved Papers", R.drawable.eighteen_years_jee_mains, "https://play.google.com/store/apps/details?id=com.Lastyear.jeemainsolvedpapers"));
        educational_app_list.add(new appStyle("General Knowledge Quiz : World GK Quiz App", R.drawable.general_knowledge, "https://play.google.com/store/apps/details?id=nithra.quiz"));
        educational_app_list.add(new appStyle("Improve English: Vocabulary, Grammar, Word Games", R.drawable.improve_english_vocab, "https://play.google.com/store/apps/details?id=com.knudge.me"));
        educational_app_list.add(new appStyle("India GK", R.drawable.india_gk, "https://play.google.com/store/apps/details?id=com.csurender.dune.indiagk"));
        educational_app_list.add(new appStyle("JEE Mains & JEE Advance 2020 Exam Preparation", R.drawable.jee_main_advanced, "https://play.google.com/store/apps/details?id=jee.iit.latest"));
        educational_app_list.add(new appStyle("MathsApp - Vedic Math Tricks", R.drawable.maths_vedic_math_tricks, "https://play.google.com/store/apps/details?id=com.meritshine.mathfun"));
        educational_app_list.add(new appStyle("Mental Math Practice", R.drawable.mental_math_practise, "https://play.google.com/store/apps/details?id=com.magoosh.gre.flashcards.mental_math"));
        educational_app_list.add(new appStyle("Meritnation: CBSE, ICSE & more (Free Live Classes)", R.drawable.meritnation_cbse_icse, "https://play.google.com/store/apps/details?id=com.meritnation.school"));
        educational_app_list.add(new appStyle("NCERT Books", R.drawable.ncert_books, "https://play.google.com/store/apps/details?id=com.ncert"));
        educational_app_list.add(new appStyle("NCERT Solutions of NCERT Books", R.drawable.ncert_solutions, "https://play.google.com/store/apps/details?id=com.meritnation.ncert"));
        educational_app_list.add(new appStyle("NEET Preparation 2020", R.drawable.neet_preparation, "https://play.google.com/store/apps/details?id=neet.ug.latest"));
        educational_app_list.add(new appStyle("Study IQ", R.drawable.stydy_iq, "https://play.google.com/store/apps/details?id=com.studyiq.android"));
        educational_app_list.add(new appStyle("Teno – School app for ICSE, CBSE & moreK", R.drawable.teno_school_apps, "https://play.google.com/store/apps/details?id=com.pebstone.teno"));
        educational_app_list.add(new appStyle("13 Years Jee Advanced Solved Papers Offline", R.drawable.thirteen_years_jee_advanced, "https://play.google.com/store/apps/details?id=com.Lastyear.jeeadvancesolvedpapers"));
        educational_app_list.add(new appStyle("Unacademy Learning App", R.drawable.unacademy_learning_app, "https://play.google.com/store/apps/details?id=com.unacademyapp"));
        educational_app_list.add(new appStyle("Vocabulary Builder", R.drawable.vocab_builder, "https://play.google.com/store/apps/details?id=com.rishabhk.vocabbuilder"));



        ListView aap = (ListView) findViewById(R.id.educationalAppListId);
        aap.setAdapter(adapter);

        aap.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                appStyle aap = educational_app_list.get(position);
                Uri uri = Uri.parse(aap.getAppUrl());
                startActivity(new Intent(Intent.ACTION_VIEW, uri));
            }
        });

    }

    private class customAdapter extends ArrayAdapter<appStyle> {
        public customAdapter() {
            super(educationalApps.this, R.layout.list_view_layout, educational_app_list);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            if(convertView == null) {
                convertView = getLayoutInflater().inflate(R.layout.list_view_layout, parent, false);
            }

            appStyle aps = educational_app_list.get(position);

            ImageView myImg = (ImageView) convertView.findViewById(R.id.appIcon);
            TextView name = (TextView) convertView.findViewById(R.id.name);

            myImg.setImageResource(aps.getImageID());
            name.setText(aps.getAppName());

            return convertView;
        }

    }

}
package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.Locale;

public class T100TuVugCapToc extends AppCompatActivity {

    final String DATABASE_NAME = "t100tuvung.sqlite";
    SQLiteDatabase database;

    GridView gvDanhsach;
    ArrayList<T100TuVung> tuVung;
    TuVungAdapter tuVungAdapter;
    TextToSpeech tts;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t100_tu_vug_cap_toc);
        this.setTitle("100 Từ Vựng Cấp Tốc");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       /* MobileAds.initialize(this,"ca-app-pub-7631747760063382~6510532916");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);*/

        addControls();
        readData();
        addEvent();

    }
    private void addEvent() {
        gvDanhsach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (id==position){
                    //final String st=tvtanh.getText().toString();
                    final String st = tuVung.get(position).getTiengTrung();
                    tts=new TextToSpeech(T100TuVugCapToc.this, new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int status) {
                            if (status!=TextToSpeech.ERROR){
                                tts.setLanguage(Locale.CHINESE);
                                tts.speak(st,TextToSpeech.QUEUE_FLUSH,null);
                            }
                        }
                    });
                }}
        });
    }


    private void readData() {
        database = Database.initDatabase(this, DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM T100TUVUNG",null);
        //list.clear();
        for (int i=0; i<cursor.getCount(); i++){
            cursor.moveToPosition(i);

            String id=cursor.getString(0);
            String title=cursor.getString(1);
            String phienAm=cursor.getString(2);
            String nghia = cursor.getString(3);

            tuVung.add(new T100TuVung(id,title,phienAm,nghia));
        }
        tuVungAdapter.notifyDataSetChanged();
    }
    private void addControls() {
        gvDanhsach= (GridView) findViewById(R.id.gridView_tuVung);
        tuVung=new ArrayList<>();
        tuVungAdapter=new TuVungAdapter(this,R.layout.item_gridview,tuVung);
        gvDanhsach.setAdapter(tuVungAdapter);
    }
}

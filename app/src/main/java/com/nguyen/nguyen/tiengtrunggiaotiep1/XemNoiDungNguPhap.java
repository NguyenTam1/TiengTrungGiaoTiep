package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.android.gms.ads.AdView;

public class XemNoiDungNguPhap extends AppCompatActivity {
    final String DATABASE_NAME = "nguphaptt.sqlite";
    SQLiteDatabase database;
    private AdView mAdView;
    TextView txtvXem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xem_noi_dung_ngu_phap);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       /* MobileAds.initialize(this,
                "ca-app-pub-7631747760063382~6510532916");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);*/

        txtvXem = findViewById(R.id.txtvXem_Ngu_Phap);

        Intent mh_show=getIntent();
        String nd = mh_show.getStringExtra("a");
        Integer iND = Integer.valueOf(nd);
        database = Database.initDatabase(this, DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM NGUPHAP",null);
        //list.clear();

        cursor.moveToPosition(iND);

        String id1=cursor.getString(0);
        String title=cursor.getString(1);
        String noiDung=cursor.getString(2);
        String xem = cursor.getString(3);

         this.setTitle(noiDung);
        txtvXem.setText(xem);
    }



}

package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.Locale;

public class T100ThanhNguThongDung extends AppCompatActivity implements AdapterThanhNgu.LongClick, AdapterThanhNgu.OnCallBack {
    final String DATABASE_NAME = "thanhngutiengtrung.sqlite";
    SQLiteDatabase database;

    RecyclerView recyclerView;
    ArrayList<ThanhNguThongDung> thanhNguThongDungs;
    AdapterThanhNgu adapterThanhNgu;
    int id = -1;

    TextToSpeech tts;
    private AdView mAdView;
    private static String speed="Normal";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t100_thanh_ngu_thong_dung);
        this.setTitle("101 Từ Vựng Thông Dụng");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

       /* MobileAds.initialize(this,"ca-app-pub-7631747760063382~6510532916");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);*/

        addControls();
        readData();
        //setSpeed();

    }
    private void addControls() {
        recyclerView = findViewById(R.id.recyclview_100ThanhNguThongDung);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        thanhNguThongDungs = new ArrayList<>();
        adapterThanhNgu = new AdapterThanhNgu(thanhNguThongDungs,this,this);
        recyclerView.setAdapter(adapterThanhNgu);
    }
    private void readData() {
        database = Database.initDatabase(this, DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM THANHNGUTT",null);
        //list.clear();
        thanhNguThongDungs.clear();
        for (int i=0; i<cursor.getCount(); i++){
            cursor.moveToPosition(i);
            String id=cursor.getString(0);
            String tiengTrung=cursor.getString(1);
            String phienAm=cursor.getString(2);
            String tiengViet = cursor.getString(3);

            thanhNguThongDungs.add(new ThanhNguThongDung(id,tiengTrung,phienAm,tiengViet));
        }
        adapterThanhNgu.notifyDataSetChanged();
    }

    @Override
    public void onLongClick(int position) {

    }

    @Override
    public void onItemClick(int position) {
        String id = thanhNguThongDungs.get(position).getId();
        Integer iid = Integer.valueOf(id);
        final String tiengTrung = thanhNguThongDungs.get(iid).getTiengTrung();
        tts=new TextToSpeech(T100ThanhNguThongDung.this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status!=TextToSpeech.ERROR){
                    tts.setLanguage(Locale.CHINESE);
                    tts.setSpeechRate(0.7f);
                    tts.speak(tiengTrung,TextToSpeech.QUEUE_FLUSH,null);
                }
            }
        });
    }
}

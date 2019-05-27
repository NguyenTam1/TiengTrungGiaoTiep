package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.CountDownTimer;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Locale;

public class AcHoiThoai extends AppCompatActivity implements AdapterHoiThoai.LongClick, AdapterHoiThoai.OnCallBack{
    final String DATABASE_NAME = "testhoithoai.sqlite";
    SQLiteDatabase database;

    RecyclerView recyclerView;
    ArrayList<HoiThoai> hoiThoais;
    AdapterHoiThoai adapterHoiThoai;

    TextToSpeech tts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac_hoi_thoai);

        addControls();
        readData();
        readData1();
    }
    private void addControls() {
        recyclerView = findViewById(R.id.recycler_hoiThoai);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());

        hoiThoais = new ArrayList<>();
        adapterHoiThoai = new AdapterHoiThoai(hoiThoais,this,this);
        recyclerView.setAdapter(adapterHoiThoai);
    }
    private void readData() {
        database = Database.initDatabase(this, DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM THT",null);
        //list.clear();
        hoiThoais.clear();
        for (int i=0; i<cursor.getCount(); i++){
            cursor.moveToPosition(i);
            String a=cursor.getString(1);
            final String ndA=cursor.getString(2);
            String B=cursor.getString(3);
            final String ndB = cursor.getString(4);
            hoiThoais.add(new HoiThoai(a,ndA,B,ndB));
        }
        adapterHoiThoai.notifyDataSetChanged();

    }

    @Override
    public void onLongClick(int position) {

    }

    @Override
    public void onItemClick(int position) {

    }
    private void readData1() {
        database = Database.initDatabase(this, DATABASE_NAME);
        final Cursor cursor = database.rawQuery("SELECT * FROM THT",null);
        //list.clear();
        for (int i=0; i<cursor.getCount(); i++){
            cursor.moveToPosition(i);
            CountDownTimer countDownTimer = new CountDownTimer(1000,200) {
                @Override
                public void onTick(long millisUntilFinished) {

                }

                @Override
                public void onFinish() {
                    String a=cursor.getString(1);
                    final String ndA=cursor.getString(2);
                    tts=new TextToSpeech(AcHoiThoai.this, new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int status) {
                            if (status!=TextToSpeech.ERROR){
                                tts.setLanguage(Locale.US);
                                tts.speak(ndA,TextToSpeech.QUEUE_FLUSH,null);
                            }
                        }
                    });
                }
            }.start();
////
            CountDownTimer countDownTimer1 = new CountDownTimer(1000,200) {
                @Override
                public void onTick(long millisUntilFinished) {

                }

                @Override
                public void onFinish() {
                    String B=cursor.getString(3);
                    final String ndB = cursor.getString(4);
                    tts=new TextToSpeech(AcHoiThoai.this, new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int status) {
                            if (status!=TextToSpeech.ERROR){
                                tts.setLanguage(Locale.US);
                                tts.speak(ndB,TextToSpeech.QUEUE_FLUSH,null);
                            }
                        }
                    });
                }
            }.start();

        }

    }
}

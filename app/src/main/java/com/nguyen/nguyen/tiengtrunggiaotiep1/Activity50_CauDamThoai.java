package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ListView;

import com.google.android.gms.ads.AdView;

import java.util.ArrayList;
import java.util.Locale;

public class Activity50_CauDamThoai extends AppCompatActivity  {
    final String DATABASE_NAME = "d50thongdung.sqlite";
    SQLiteDatabase database;

    // ListView lvdanhsach1;
    ArrayList<DamThoai50> damThoai50s;
    Adapter50DamThoai adapter50DamThoai;

    TextToSpeech tts;

    ListView lvdanhsach;

    Animation nhanBt;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity50__cau_dam_thoai);
        this.setTitle("Những câu đầm thoại thông dụng");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

      /*  MobileAds.initialize(this,"ca-app-pub-7631747760063382~6510532916");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);*/

        lvdanhsach= (ListView) findViewById(R.id.lv_50CauDamThoai);
        addControls();
        readData();
        addEvent();

        nhanBt = AnimationUtils.loadAnimation(Activity50_CauDamThoai.this,R.anim.nhanbutton);
    }
    private void addEvent() {
        lvdanhsach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, final int position, final long id) {
                if (id==position){
                    //final String st=tvtanh.getText().toString();
                    final String st = damThoai50s.get(position).getTt();
                    tts=new TextToSpeech(Activity50_CauDamThoai.this, new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int status) {
                            if (status!=TextToSpeech.ERROR){
                                tts.setLanguage(Locale.CHINA);
                                tts.speak(st,TextToSpeech.QUEUE_FLUSH,null);
                            }
                        }
                    });
                }
            }
        });
    }

   /* private void readData() {
        database = Database.initDatabase(this, DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM NGUPHAP",null);
        //list.clear();
        for (int i=0; i<cursor.getCount(); i++){
            cursor.moveToPosition(i);

            String id=cursor.getString(0);
            String title=cursor.getString(1);
            String noiDung=cursor.getString(2);

            nguPhaps.add(new NguPhap(id,title,noiDung));
        }
        adepterNguPhap.notifyDataSetChanged();
    }*/
  /*  private void addControls() {

        nguPhaps=new ArrayList<>();
        adepterNguPhap=new AdepterNguPhap(this,R.layout.item_ngu_phap_coban,nguPhaps);
        lvdanhsach.setAdapter(adepterNguPhap);
    }*/
   /* private void addEvent() {
        lvdanhsach1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Activity50_CauDamThoai.this,""+position,Toast.LENGTH_LONG).show();
                if (id==position){
                    //final String st=tvtanh.getText().toString();
                    final String st = damThoai50s.get(position).getTt();
                    tts=new TextToSpeech(Activity50_CauDamThoai.this, new TextToSpeech.OnInitListener() {
                        @Override
                        public void onInit(int status) {
                            if (status!=TextToSpeech.ERROR){
                                tts.setLanguage(Locale.CHINESE);
                                tts.speak(st,TextToSpeech.QUEUE_FLUSH,null);
                            }
                        }
                    });
                }
            }
        });
    }*/

    private void readData() {
        database = Database.initDatabase(this, DATABASE_NAME);
        Cursor cursor = database.rawQuery("SELECT * FROM D50",null);
        //list.clear();
        for (int i=0; i<cursor.getCount(); i++){
            cursor.moveToPosition(i);

            String id=cursor.getString(0);
            String tv=cursor.getString(1);
            String tt=cursor.getString(2);
            String pa=cursor.getString(3);

            damThoai50s.add(new DamThoai50(id,tv,tt,pa));
        }
        adapter50DamThoai.notifyDataSetChanged();
    }
    private void addControls() {
        damThoai50s=new ArrayList<>();
        adapter50DamThoai=new Adapter50DamThoai(this,R.layout.itemdamthoaicoban,damThoai50s);
        lvdanhsach.setAdapter(adapter50DamThoai);
    }

}

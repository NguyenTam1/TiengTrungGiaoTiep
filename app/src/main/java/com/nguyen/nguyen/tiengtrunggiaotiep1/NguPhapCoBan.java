package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class NguPhapCoBan extends AppCompatActivity {
    final String DATABASE_NAME = "nguphaptt.sqlite";
    SQLiteDatabase database;

    ListView lvdanhsach;
    ArrayList<NguPhap> nguPhaps;
    AdepterNguPhap adepterNguPhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ngu_phap_co_ban);
        this.setTitle("29 Ngữ Pháp Cơ Bản");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        addControls();
        readData();
        addEvent();
    }

    private void addEvent() {
        lvdanhsach.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(NguPhapCoBan.this,XemNoiDungNguPhap.class);
                String sposition = String.valueOf(position);
                intent.putExtra("a",sposition);
                startActivity(intent);
            }
        });
    }

    private void readData() {
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
    }
    private void addControls() {
        lvdanhsach= (ListView) findViewById(R.id.lv_nguPhapCoBan);
        nguPhaps=new ArrayList<>();
        adepterNguPhap=new AdepterNguPhap(this,R.layout.item_ngu_phap_coban,nguPhaps);
        lvdanhsach.setAdapter(adepterNguPhap);
    }
}

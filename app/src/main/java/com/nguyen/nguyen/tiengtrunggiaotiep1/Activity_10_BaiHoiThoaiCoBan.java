package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Activity_10_BaiHoiThoaiCoBan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10__bai_hoi_thoai_co_ban);
        this.setTitle("10 Bài đàm thoại cấp 1");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

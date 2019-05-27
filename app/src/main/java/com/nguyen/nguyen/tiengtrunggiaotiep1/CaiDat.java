package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class CaiDat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cai_dat);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}

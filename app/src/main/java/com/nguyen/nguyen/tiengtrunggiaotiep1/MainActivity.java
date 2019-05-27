package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout layoutNguPhapCoBan, layout100ThanhNgu, layout100TuVungCapToc,
            layoutCaidat, layout50DamThoai, layoutMoreApp,imgPhienAm;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* MobileAds.initialize(this,
                "ca-app-pub-7631747760063382~6510532916");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);*/
            //
        layoutNguPhapCoBan = findViewById(R.id.l_nguPhapCoBan);
        layout100ThanhNgu = findViewById(R.id.l_100ThanhNgu);
        layout100TuVungCapToc = findViewById(R.id.l_100TuVungCapToc);
        layoutCaidat = findViewById(R.id.l_caidat);
        layoutMoreApp = findViewById(R.id.l_moreApp);

        imgPhienAm = findViewById(R.id.img_phienAm);
        layout50DamThoai =  findViewById(R.id.l_50CauDamThoai);

        layoutNguPhapCoBan.setOnClickListener(this);
        layout100ThanhNgu.setOnClickListener(this);
        layout100TuVungCapToc.setOnClickListener(this);
        layoutCaidat.setOnClickListener(this);
        imgPhienAm.setOnClickListener(this);
        layout50DamThoai.setOnClickListener(this);
        layoutMoreApp.setOnClickListener(this);



    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.l_nguPhapCoBan:
                Intent intent = new Intent(MainActivity.this,NguPhapCoBan.class);
                startActivity(intent);
                break;
            case R.id.l_100ThanhNgu:
                Intent intent1 = new Intent(MainActivity.this,T100ThanhNguThongDung.class);
                startActivity(intent1);
                break;
            case R.id.l_100TuVungCapToc:
                Intent intent2 = new Intent(MainActivity.this,T100TuVugCapToc.class);
                startActivity(intent2);
                break;
            case R.id.l_caidat:
                Toast.makeText(MainActivity.this,"Chờ phiên bản cập nhật !!",Toast.LENGTH_LONG).show();
                /*Intent intent3 = new Intent(MainActivity.this,Activity_10_BaiHoiThoaiCoBan.class);
                startActivity(intent3);*/
                break;
            case R.id.img_phienAm:
                Intent intent4 = new Intent(MainActivity.this,PhienAmActivity.class);
                startActivity(intent4);
                break;
            case R.id.l_50CauDamThoai:
                Intent intent5 = new Intent(MainActivity.this,Activity50_CauDamThoai.class);
                startActivity(intent5);
                break;
            case R.id.l_moreApp:
                Uri uri2 = Uri.parse("https://play.google.com/store/apps/developer?id=TT+Group");
                Intent goToMarket2 = new Intent(Intent.ACTION_VIEW, uri2);
                try {
                    startActivity(goToMarket2);
                } catch (ActivityNotFoundException e) {

                    startActivity(new Intent(
                            Intent.ACTION_VIEW,
                            Uri.parse("https://play.google.com/store/apps/developer?id=TT+Group")));
                }
                break;
        }
    }
}

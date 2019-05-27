package com.nguyen.nguyen.tiengtrunggiaotiep1;

import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.google.android.gms.ads.AdView;

import java.util.Locale;

public class PhienAmActivity extends AppCompatActivity implements View.OnClickListener {

    TextView b,p,m,f,d,t,n,l,g,k,h,j,q,x,zh,ch,shh,r,z,s,i,an,en,er,wu,yu,ai,ei,ao,au;
    ImageButton B,P,M,F,D,T,N,L,G,K,H,J,Q,X,ZH,CH,SH,RR,Z,S,I,AN,EN,ER,WU,YU,AI,EI,AO,AU;
    TextToSpeech tts;
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phien_am);
        this.setTitle("Phiên âm tiếng trung");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        anhXa();
       /* MobileAds.initialize(this,"ca-app-pub-7631747760063382~6510532916");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);*/

        B.setOnClickListener(this);
        P.setOnClickListener(this);
        M.setOnClickListener(this);
        F.setOnClickListener(this);
        D.setOnClickListener(this);
        T. setOnClickListener(this);
        N. setOnClickListener(this);
        L. setOnClickListener(this);
        G. setOnClickListener(this);
        K. setOnClickListener(this);
        H. setOnClickListener(this);
        J. setOnClickListener(this);
        Q. setOnClickListener(this);
        X. setOnClickListener(this);
        ZH. setOnClickListener(this);
        CH. setOnClickListener(this);
        SH. setOnClickListener(this);
        RR. setOnClickListener(this);
        Z. setOnClickListener(this);
        S. setOnClickListener(this);
        I. setOnClickListener(this);
        AN. setOnClickListener(this);
        EN. setOnClickListener(this);
        ER. setOnClickListener(this);
        WU. setOnClickListener(this);
        YU. setOnClickListener(this);
        AI. setOnClickListener(this);
        EI. setOnClickListener(this);
        AO. setOnClickListener(this);
        AU. setOnClickListener(this);
    }

    private void anhXa() {
        b = findViewById(R.id.txtv_b);
        B = findViewById(R.id.img_b);

        m = findViewById(R.id.txtv_m);
        M = findViewById(R.id.img_m);

        p = findViewById(R.id.txtv_p);
        P = findViewById(R.id.img_p);

        d = findViewById(R.id.txtv_d);
        D = findViewById(R.id.img_d);

        f = findViewById(R.id.txtv_f);
        F = findViewById(R.id.img_f);

        t = findViewById(R.id.txtv_t);
        T = findViewById(R.id.img_t);

        n = findViewById(R.id.txtv_n);
        N = findViewById(R.id.img_n);

        l = findViewById(R.id.txtv_l);
        L = findViewById(R.id.img_l);

        g = findViewById(R.id.txtv_g);
        G = findViewById(R.id.img_g);

        k = findViewById(R.id.txtv_k);
        K = findViewById(R.id.img_k);

        h = findViewById(R.id.txtv_h);
        H = findViewById(R.id.img_h);

        j = findViewById(R.id.txtv_j);
        J = findViewById(R.id.img_j);

        q = findViewById(R.id.txtv_q);
        Q = findViewById(R.id.img_q);

        x = findViewById(R.id.txtv_x);
        X = findViewById(R.id.img_x);

        zh = findViewById(R.id.txtv_zh);
        ZH = findViewById(R.id.img_zh);

        ch = findViewById(R.id.txtv_ch);
        CH = findViewById(R.id.img_ch);

        shh = findViewById(R.id.txtv_sh);
        SH = findViewById(R.id.img_sh);

        r = findViewById(R.id.txtv_r);
        RR = findViewById(R.id.img_r);

        z = findViewById(R.id.txtv_z);
        Z = findViewById(R.id.img_z);

        s = findViewById(R.id.txtv_s);
        S = findViewById(R.id.img_s);

        i = findViewById(R.id.txtv_i);
        I = findViewById(R.id.img_i);

        an = findViewById(R.id.txtv_an);
        AN = findViewById(R.id.img_an);

        en = findViewById(R.id.txtv_en);
        EN = findViewById(R.id.img_en);

        er = findViewById(R.id.txtv_er);
        ER = findViewById(R.id.img_er);

        wu = findViewById(R.id.txtv_wu);
        WU = findViewById(R.id.img_wu);

        yu = findViewById(R.id.txtv_yu);
        YU = findViewById(R.id.img_yu);

        ai = findViewById(R.id.txtv_ai);
        AI = findViewById(R.id.img_ai);

        ei = findViewById(R.id.txtv_ei);
        EI = findViewById(R.id.img_ei);

        ao = findViewById(R.id.txtv_ao);
        AO = findViewById(R.id.img_ao);

        au = findViewById(R.id.txtv_ou);
        AU = findViewById(R.id.img_ou);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.img_b:
                final String sb = b.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sb,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_p:
               final String sp = p.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sp,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_m:
               final String sm = m.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sm,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_f:
               final String sf = f.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sf,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_d:
              final String sd =  d.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sd,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_t:
               final String st =  t.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(st,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_n:
                final String sn =  n.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sn,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_l:
                final String sl =  l.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sl,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_g:
                final String sg =  g.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sg,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_k:
                final String sk =  k.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sk,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_h:
                final String sh =  h.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sh,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_j:
                final String sj =  j.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sj,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_q:
                final String sq =  q.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sq,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_x:
                final String sx =  x.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sx,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_zh:
                final String szh =  zh.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(szh,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_ch:
                final String sch =  ch.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sch,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_sh:
                final String ssh = shh.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(ssh,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_r:
                final String sr =  r.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sr,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_z:
                final String sz =  z.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sz,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_s:
                final String ss =  s.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(ss,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_i:
                final String si =  i.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(si,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_an:
                final String san =  an.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(san,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_en:
                final String sen =  en.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sen,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_er:
                final String ser =  er.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(ser,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_wu:
                final String swu =  wu.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(swu,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_yu:
                final String syu =  yu.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(syu,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_ai:
                final String sai =  ai.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sai,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_ei:
                final String sei =  ei.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sei,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_ao:
                final String sao =  ao.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sao,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;
            case R.id.img_ou:
                final String sou =  au.getText().toString();
                tts=new TextToSpeech(PhienAmActivity.this, new TextToSpeech.OnInitListener() {
                    @Override
                    public void onInit(int status) {
                        if (status!=TextToSpeech.ERROR){
                            tts.setLanguage(Locale.CHINESE);
                            tts.setSpeechRate(0.7f);
                            tts.speak(sou,TextToSpeech.QUEUE_FLUSH,null);
                        }
                    }
                });
                break;


        }
    }
}

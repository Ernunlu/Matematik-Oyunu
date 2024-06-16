package com.example.erennl.matematikgelistirme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;

public class seceneklericin extends AppCompatActivity {
    InterstitialAd InterstitalAds;
    Button karısik;
    Button toplama;
    Button cikarma;
    Button carpma;
    Button bolme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seceneklericin);

        InterstitalAds = new InterstitialAd(this);
        InterstitalAds.setAdUnitId("ca-app-pub-3940256099942544/1033173712");
        reklamiYukle();

        InterstitalAds.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                super.onAdClosed();
            }
            @Override
            public void onAdLoaded() {
                super.onAdLoaded();
                InterstitalAds.show();
            }
        });






        Button krsk = (Button)findViewById(R.id.karısik);
        Button bol = (Button)findViewById(R.id.bolme);
        Button carp = (Button)findViewById(R.id.carpma);
        Button toplama1 = (Button)findViewById(R.id.toplama);
        Button cikar = (Button)findViewById(R.id.cikarma);
        krsk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent karısıkoyungecis=new Intent(seceneklericin.this, oyunsayfa.class);
                startActivity(karısıkoyungecis);
            }
        });
        toplama1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent karısıkoyungecisrr=new Intent(seceneklericin.this, toplama.class);
                startActivity(karısıkoyungecisrr);
            }
        });
         cikar.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 Intent karısıkoyungecisrr=new Intent(seceneklericin.this, cikarma.class);
                 startActivity(karısıkoyungecisrr);
             }
         });

        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent karısıkoyungecisrr=new Intent(seceneklericin.this, carpma.class);
                startActivity(karısıkoyungecisrr);
            }
        });
        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent karısıkoyungecisrr=new Intent(seceneklericin.this, bolmea.class);
                startActivity(karısıkoyungecisrr);
            }
        });


    }
    private void reklamiYukle() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
                .build();
        InterstitalAds.loadAd(adRequest);
    }
}

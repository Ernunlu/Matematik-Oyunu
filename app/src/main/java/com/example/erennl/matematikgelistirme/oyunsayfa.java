package com.example.erennl.matematikgelistirme;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;
import android.widget.TextView;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;


public class oyunsayfa extends Activity {


  TextView oyun_soru;
    Button cevap1,cevap2,cevap3,cevap4,cevap5;
    Button button2;
    Button newsoru;
   TextView lvlekranı;
   TextView saniye;
    boolean a,b,c,d,e = false;
     int sorulvl = 1;
     int cevap = 0;
    int sıradaki = 0;
    long saaniye = 0;
     int sayac=20;

    public void onCreate(Bundle savedInstanceState) {


        SharedPreferences ayarlar = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        sorulvl = ayarlar.getInt("benihatirla",1);
        SharedPreferences.Editor editor = ayarlar.edit();
        editor.putInt("benihatirla",sorulvl);
        editor.putString("kullaniciadi","şerif");                     /* veri eklemeyi aldıgımız site  https://serifgungor.com/blogs/153-android-sharedpreference-kullanimi*/
        editor.commit();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.oyunsayfa);
        final TextView soruekran = (TextView)findViewById(R.id.soru_ekran);
        Button cevapA = (Button)findViewById(R.id.cevap1);
        Button cevapB = (Button)findViewById(R.id.cevap2);
        Button cevapC = (Button)findViewById(R.id.cevap3);
        Button cevapD = (Button)findViewById(R.id.cevap4);
        Button cevapE = (Button)findViewById(R.id.cevap5);
        final TextView saniye = (TextView)findViewById(R.id.textView33);
        final Button yenisor = (Button)findViewById(R.id.newsoru);
         TextView lvle = (TextView) findViewById(R.id.lvlekranı);
        lvle.setText("LVL : " +Integer.toString(sorulvl));

        final Handler handler = new Handler();
        Timer timer;


        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {

                handler.post(new Runnable() {
                    @Override
                    public void run() {

                        sayac--;
                        saniye.setText("Kalan zaman = "+Integer.toString(sayac));

                        if(sayac== 0) {
                            yenisoru(sorulvl);

                        }
                        if(sayac >= 6)
                            saniye.setTextColor(Color.parseColor("#ffffff"));
                        if(sayac <= 5)
                        {
                            saniye.setTextColor(Color.parseColor("#ee2c2c"));
                        }
                    }
                });
            }
        };

        timer = new Timer();

        timer.schedule(timerTask,1000,1000);







        yenisoru(sorulvl);
        yenisor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    yenisoru(sorulvl);


            }
        });




        cevapA.setOnClickListener(new View.OnClickListener() {
            @Override


            public void onClick(View v) {

                if (a == true) {
                    Context context = getApplicationContext();
                    int lvltext = sorulvl;
                    lvltext++;
                    CharSequence text = "Doğru lvl:" + lvltext ;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    sorulvl++;
                    yenisoru(sorulvl);
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Yanlış Cevap == " + cevap;


                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    yenisoru(sorulvl);
                }

            }
        });

        cevapB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b == true) {
                    Context context = getApplicationContext();
                    int lvltext = sorulvl;
                    lvltext++;
                    CharSequence text = "Doğru lvl:" + lvltext;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    sorulvl++;
                    yenisoru(sorulvl);

                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Yanlış Cevap == " + cevap;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    yenisoru(sorulvl);
                }
            }
        });

        cevapC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c == true) {
                    Context context = getApplicationContext();
                    int lvltext = sorulvl;
                    lvltext++;
                    CharSequence text = "Doğru lvl:" + lvltext;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    sorulvl++;
                    yenisoru(sorulvl);
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Yanlış Cevap == " + cevap;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    yenisoru(sorulvl);
                }


            }
        });

        cevapD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (d == true) {
                    Context context = getApplicationContext();
                    int lvltext = sorulvl;
                    lvltext++;
                    CharSequence text = "Doğru lvl:" + lvltext;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    sorulvl++;
                    yenisoru(sorulvl);

                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Yanlış Cevap == " + cevap;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    yenisoru(sorulvl);
                }
            }
        });

        cevapE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e == true) {
                    Context context = getApplicationContext();
                    int lvltext = sorulvl;
                    lvltext++;
                    CharSequence text = "Doğru lvl:" + lvltext;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    sorulvl++;
                    yenisoru(sorulvl);
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Yanlış Cevap == " + cevap;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    yenisoru(sorulvl);
                }
            }
        });


        final Button gerigit = (Button) findViewById(R.id.button2);
        gerigit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent Anasayfadonus = new Intent(oyunsayfa.this, Anasayfa.class);
                startActivity(Anasayfadonus);


            }



        });






    }

    public void zaman()
    {

    }

public  void yenisoru(final int lvl) {



    Random islem = new Random();
    int dortislem = islem.nextInt(4)+1;
            sıradaki = 0;
    final TextView soruekran = (TextView)findViewById(R.id.soru_ekran);
    TextView lvle = (TextView) findViewById(R.id.lvlekranı);
    lvle.setText("LVL : " +Integer.toString(sorulvl));
    SharedPreferences ayarlar = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
    SharedPreferences.Editor editor = ayarlar.edit();
    editor.putInt("benihatirla",sorulvl);
    editor.putString("kullaniciadi","şerif");
    editor.commit();
    if (sorulvl <= 10 && sorulvl >= 0) {

        sayac = 40;

                // lvl 1-10 toplama
                if(dortislem == 1)
                {
                int sayibir = islem.nextInt(50)+1;
                    int sayiiki = islem.nextInt(50)+1;
                    cevap = (sayibir + sayiiki);
                    soruekran.setText(Integer.toString(sayibir)+"  +  " + Integer.toString(sayiiki)+ " = ?");

                }
                //lvl 1-10 çarpma
                 if(dortislem == 2)
                {
                    int sayibir = islem.nextInt(10)+1;
                    int sayiiki = islem.nextInt(10)+1;
                    cevap = (sayibir * sayiiki);
                    soruekran.setText(Integer.toString(sayibir)+"  X  " + Integer.toString(sayiiki)+ " = ?");

                }
                // lvl 1-10 bölme
                if(dortislem == 3)
                {
                    double kontrol = 0.1;
                    int deneme =0;
                    int i;
                    int o = 0;
                    int sayibir=1;
                    int sayiiki =1;
                    for (i = 1; o == 0;i++) {
                        sayibir = islem.nextInt(100) + 1;
                        sayiiki = islem.nextInt(20) + 1;

                        kontrol = ((double)sayibir / (double)sayiiki);
                        deneme = (int)kontrol;
                        if(kontrol-deneme==0)
                        {

                            o = 2;
                        }

                    }
                    soruekran.setText(Integer.toString(sayibir)+"  /  " + Integer.toString(sayiiki)+ " = ?");
                    cevap = deneme;

                }
                //lvl 1-10 çıkarma
                if(dortislem == 4)
                {
                    int sayibir = islem.nextInt(50)+1;
                    int sayiiki = islem.nextInt(50)+1;
                    cevap = (sayibir - sayiiki);
                    soruekran.setText(Integer.toString(sayibir)+"  -  " + Integer.toString(sayiiki)+ " = ?");

                }
            }
    if (sorulvl <= 20 && sorulvl >= 11) {

        sayac = 30;

        // lvl 1-10 toplama
        if(dortislem == 1)
        {
            int sayibir = islem.nextInt(50)+1;
            int sayiiki = islem.nextInt(50)+1;
            cevap = (sayibir + sayiiki);
            soruekran.setText(Integer.toString(sayibir)+"  +  " + Integer.toString(sayiiki)+ " = ?");

        }
        //lvl 1-10 çarpma
        if(dortislem == 2)
        {
            int sayibir = islem.nextInt(20)+1;
            int sayiiki = islem.nextInt(20)+1;
            cevap = (sayibir * sayiiki);
            soruekran.setText(Integer.toString(sayibir)+"  X  " + Integer.toString(sayiiki)+ " = ?");

        }
        // lvl 1-10 bölme
        if(dortislem == 3)
        {
            double kontrol = 0.1;
            int deneme =0;
            int i;
            int o = 0;
            int sayibir=1;
            int sayiiki =1;
            for (i = 1; o == 0;i++) {
                sayibir = islem.nextInt(100) + 1;
                sayiiki = islem.nextInt(20) + 1;

                kontrol = ((double)sayibir / (double)sayiiki);
                deneme = (int)kontrol;
                if(kontrol-deneme==0)
                {

                    o = 2;
                }

            }
            soruekran.setText(Integer.toString(sayibir)+"  /  " + Integer.toString(sayiiki)+ " = ?");
            cevap = deneme;

        }
        //lvl 1-10 çıkarma
        if(dortislem == 4)
        {
            int sayibir = islem.nextInt(50)+1;
            int sayiiki = islem.nextInt(50)+1;
            cevap = (sayibir - sayiiki);
            soruekran.setText(Integer.toString(sayibir)+"  -  " + Integer.toString(sayiiki)+ " = ?");

        }
    }
    if (sorulvl <= 500 && sorulvl >= 21) {
        sayac = 20;

        // lvl 1-10 toplama
        if (dortislem == 1) {
            int sayibir = islem.nextInt(100) + 1;
            int sayiiki = islem.nextInt(100) + 1;
            cevap = (sayibir + sayiiki);
            soruekran.setText(Integer.toString(sayibir) + "  +  " + Integer.toString(sayiiki) + " = ?");

        }
        //lvl 1-10 çarpma
        if (dortislem == 2) {
            int sayibir = islem.nextInt(20) + 1;
            int sayiiki = islem.nextInt(20) + 1;
            cevap = (sayibir * sayiiki);
            soruekran.setText(Integer.toString(sayibir) + "  X  " + Integer.toString(sayiiki) + " = ?");

        }
        // lvl 1-10 bölme
        if (dortislem == 3) {
            int sayibir = islem.nextInt(100) + 1;
            int sayiiki = islem.nextInt(100) + 1;
            cevap = (sayibir / sayiiki);

            soruekran.setText(Integer.toString(sayibir) + "  /  " + Integer.toString(sayiiki) + " = ?");

        }
        //lvl 1-10 çıkarma
        if (dortislem == 4) {
            int sayibir = islem.nextInt(100) + 1;
            int sayiiki = islem.nextInt(100) + 1;
            cevap = (sayibir - sayiiki);
            soruekran.setText(Integer.toString(sayibir) + "  -  " + Integer.toString(sayiiki) + " = ?");

        }
    }
        if (sorulvl <= 1000 && sorulvl >= 501) {

            sayac = 15;

            // lvl 1-10 toplama
            if(dortislem == 1)
            {
                int sayibir = islem.nextInt(250)+1;
                int sayiiki = islem.nextInt(250)+1;
                cevap = (sayibir + sayiiki);
                soruekran.setText(Integer.toString(sayibir)+"  +  " + Integer.toString(sayiiki)+ " = ?");

            }
            //lvl 1-10 çarpma
            if(dortislem == 2)
            {
                int sayibir = islem.nextInt(50)+1;
                int sayiiki = islem.nextInt(20)+1;
                cevap = (sayibir * sayiiki);
                soruekran.setText(Integer.toString(sayibir)+"  X  " + Integer.toString(sayiiki)+ " = ?");

            }
            // lvl 1-10 bölme
            if(dortislem == 3)
            {
                int sayibir = islem.nextInt(500)+1;
                int sayiiki = islem.nextInt(100)+1;
                cevap = (sayibir / sayiiki);

                soruekran.setText(Integer.toString(sayibir)+"  /  " + Integer.toString(sayiiki)+ " = ?");

            }
            //lvl 1-10 çıkarma
            if(dortislem == 4)
            {
                int sayibir = islem.nextInt(400)+1;
                int sayiiki = islem.nextInt(400)+1;
                cevap = (sayibir - sayiiki);
                soruekran.setText(Integer.toString(sayibir)+"  -  " + Integer.toString(sayiiki)+ " = ?");

            }

    }
        if (sorulvl <= 1500 && sorulvl >= 1001) {

            sayac = 10;
            // lvl 1-10 toplama
            if (dortislem == 1) {
                int sayibir = islem.nextInt(1000) + 1;
                int sayiiki = islem.nextInt(1000) + 1;
                cevap = (sayibir + sayiiki);
                soruekran.setText(Integer.toString(sayibir) + "  +  " + Integer.toString(sayiiki) + " = ?");

            }
            //lvl 1-10 çarpma
            if (dortislem == 2) {
                int sayibir = islem.nextInt(100) + 1;
                int sayiiki = islem.nextInt(50) + 1;
                cevap = (sayibir * sayiiki);
                soruekran.setText(Integer.toString(sayibir) + "  X  " + Integer.toString(sayiiki) + " = ?");

            }
            // lvl 1-10 bölme
            if (dortislem == 3) {
                int sayibir = islem.nextInt(1000) + 1;
                int sayiiki = islem.nextInt(500) + 1;
                cevap = (sayibir / sayiiki);

                soruekran.setText(Integer.toString(sayibir) + "  /  " + Integer.toString(sayiiki) + " = ?");

            }
            //lvl 1-10 çıkarma
            if (dortislem == 4) {
                int sayibir = islem.nextInt(1000) + 1;
                int sayiiki = islem.nextInt(1000) + 1;
                cevap = (sayibir - sayiiki);
                soruekran.setText(Integer.toString(sayibir) + "  -  " + Integer.toString(sayiiki) + " = ?");

            }

        }
    if (sorulvl <= 9999 && sorulvl >= 1501) {

        sayac = 10;
        // lvl 1-10 toplama
        if (dortislem == 1) {
            int sayibir = islem.nextInt(10000) + 1;
            int sayiiki = islem.nextInt(10000) + 1;
            cevap = (sayibir + sayiiki);
            soruekran.setText(Integer.toString(sayibir) + "  +  " + Integer.toString(sayiiki) + " = ?");

        }
        //lvl 1-10 çarpma
        if (dortislem == 2) {
            int sayibir = islem.nextInt(150) + 1;
            int sayiiki = islem.nextInt(100) + 1;
            cevap = (sayibir * sayiiki);
            soruekran.setText(Integer.toString(sayibir) + "  X  " + Integer.toString(sayiiki) + " = ?");

        }
        // lvl 1-10 bölme
        if (dortislem == 3) {
            int sayibir = islem.nextInt(10000) + 1;
            int sayiiki = islem.nextInt(5000) + 1;
            cevap = (sayibir / sayiiki);

            soruekran.setText(Integer.toString(sayibir) + "  /  " + Integer.toString(sayiiki) + " = ?");

        }
        //lvl 1-10 çıkarma
        if (dortislem == 4) {
            int sayibir = islem.nextInt(10000) + 1;
            int sayiiki = islem.nextInt(10000) + 1;
            cevap = (sayibir - sayiiki);
            soruekran.setText(Integer.toString(sayibir) + "  -  " + Integer.toString(sayiiki) + " = ?");

        }

    }




            // en son soru bulunur çözülür butonlara işlenir
            siklariyenile(cevap);




}


public void siklariyenile (int sayi){
    Random dogru =new Random();
    int seccenek = dogru.nextInt(5)+1;
    int onay =1;
    sıradaki = 0;
    // dogru sıkkı yerlestirme
    Button cevapA = (Button)findViewById(R.id.cevap1);
    Button cevapB = (Button)findViewById(R.id.cevap2);
    Button cevapC = (Button)findViewById(R.id.cevap3);
    Button cevapD = (Button)findViewById(R.id.cevap4);
    Button cevapE = (Button)findViewById(R.id.cevap5);

    if (seccenek != 1 ){
        int bir = dogru.nextInt(10)+1;
        int secc = dogru.nextInt(2)+1;
        if(secc==1)
            cevapA.setText(Integer.toString(cevap-bir));
        if(secc==2)
            cevapA.setText(Integer.toString(cevap+bir));
        a = false;
    }
    if (seccenek != 2 ){
        int iki = dogru.nextInt(10)+1;
        int secc = dogru.nextInt(2)+1;
        if(secc==1)
            cevapB.setText(Integer.toString(cevap+iki));
        if(secc==2)
            cevapB.setText(Integer.toString(cevap-iki));
        b = false;
    }
    if (seccenek != 3 ){
        int uc = dogru.nextInt(20)+1;
        int secc = dogru.nextInt(2)+1;
        if(secc==1)
            cevapC.setText(Integer.toString(cevap-uc));
        if(secc==2)
            cevapC.setText(Integer.toString(cevap+uc));
        c = false;
    }
    if (seccenek != 4 ){
        int dort = dogru.nextInt(20)+1;
        int secc = dogru.nextInt(2)+1;
        if(secc==1)
            cevapD.setText(Integer.toString(cevap+dort));
        if(secc==2)
            cevapD.setText(Integer.toString(cevap-dort));
        d = false;
    }
    if (seccenek != 5 ){
        int bes = dogru.nextInt(25)+1;
        int secc = dogru.nextInt(2)+1;
        if(secc==1)
            cevapE.setText(Integer.toString(cevap+bes));
        if(secc==2)
            cevapE.setText(Integer.toString(cevap-bes));
        e = false;
    }
    if (seccenek == 1 ){

        cevapA.setText(Integer.toString(cevap));
        a = true;
    }
    if (seccenek == 2 ){
        cevapB.setText(Integer.toString(cevap));
        b = true;
    }
    if (seccenek == 3 ){
        cevapC.setText(Integer.toString(cevap));
        c = true;
    }
    if (seccenek == 4 ){
        cevapD.setText(Integer.toString(cevap));
        d = true;
    }
    if (seccenek == 5 ){
        cevapE.setText(Integer.toString(cevap));
        e = true;
    }


}
}










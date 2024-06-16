
package com.example.erennl.matematikgelistirme;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import java.util.Random;

public class toplama extends AppCompatActivity {

    TextView tekran;
    TextView Dye;
    Button tcevap1,tcevap2,tcevap3,tcevap4,tcevap5;
    Button tnewsoru;
    boolean a,b,c,d,e = false;
    int sorulvl = 1;
    int cevap = 0;
    int sıradaki = 0;
    int dogru,yanlis = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        SharedPreferences tdogru = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        dogru = tdogru.getInt("benihatirladogrutoplam",0);
        SharedPreferences.Editor tdeditor = tdogru.edit();
        tdeditor.putInt("benihatirladogrutoplam",dogru);
        tdeditor.putString("kullaniciadi","şerif");
        tdeditor.commit();

        SharedPreferences tyanlis = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        yanlis = tyanlis.getInt("benihatirlayanlistoplam",0);
        SharedPreferences.Editor tyeditor = tyanlis.edit();
        tyeditor.putInt("benihatirlayanlistoplam",yanlis);
        tyeditor.putString("kullaniciadi","şerif");
        tyeditor.commit();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toplama);

       TextView dye = (TextView) findViewById(R.id.textView16);





        TextView tekran1 = (TextView) findViewById(R.id.tekran);
        Button tcevapA = (Button) findViewById(R.id.tcevap1);
        Button tcevapB = (Button) findViewById(R.id.tcevap2);
        Button tcevapC = (Button) findViewById(R.id.tcevap3);
        Button tcevapD = (Button) findViewById(R.id.tcevap4);
        Button tcevapE = (Button) findViewById(R.id.tcevap5);
        Button tyenisoru = (Button) findViewById(R.id.tnewsoru);
        Button tgeri = (Button) findViewById(R.id.tgeri);
        dye.setText("Doğru : " +Integer.toString(dogru)  + " Yanlış : " + Integer.toString(yanlis) );
        tyenisoru();

        tcevapA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (a == true) {
                    Context context = getApplicationContext();
                    CharSequence text = "Doğru" ;
                    dogru++;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    tyenisoru();
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Yanlış Cevap == " + cevap;
                    yanlis++;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    tyenisoru();
                }

            }
        });
        tcevapB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b == true) {
                    Context context = getApplicationContext();
                    CharSequence text = "Doğru" ;
                    int duration = Toast.LENGTH_SHORT;
                    dogru++;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    tyenisoru();
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Yanlış Cevap == " + cevap;
                    yanlis++;

                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    tyenisoru();
                }

            }
        });
        tcevapC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (c == true) {
                    Context context = getApplicationContext();
                    CharSequence text = "Doğru" ;
                    int duration = Toast.LENGTH_SHORT;
                     dogru++;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    tyenisoru();
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Yanlış Cevap == " + cevap;

                    yanlis++;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    tyenisoru();
                }

            }
        });
        tcevapD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (d == true) {
                    Context context = getApplicationContext();
                    CharSequence text = "Doğru" ;
                    int duration = Toast.LENGTH_SHORT;
                    dogru++;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    tyenisoru();
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Yanlış Cevap == " + cevap;

                  yanlis++;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    tyenisoru();
                }

            }
        });
        tcevapE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (e == true) {
                    Context context = getApplicationContext();
                    CharSequence text = "Doğru" ;
                    int duration = Toast.LENGTH_SHORT;
                             dogru++;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                    tyenisoru();
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "Yanlış Cevap == " + cevap;

                     yanlis++;
                    int duration = Toast.LENGTH_SHORT;

                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                    tyenisoru();
                }

            }
        });
        tgeri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ucsayfaw=new Intent(toplama.this, Anasayfa.class);
                startActivity(ucsayfaw);
            }
        });
        tyenisoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tyenisoru();
            }
        });




    }



        public void tyenisoru()
    {






        TextView tekran1 = (TextView) findViewById(R.id.tekran);
        SharedPreferences tdogru = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor tdeditor = tdogru.edit();
        tdeditor.putInt("benihatirladogrutoplam",dogru);
        tdeditor.putString("kullaniciadi","şerif");
        tdeditor.commit();
        SharedPreferences ydogru = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor tyeditor = tdogru.edit();
        tyeditor.putInt("benihatirlayanlistoplam",yanlis);
        tyeditor.putString("kullaniciadi","şerif");
        tyeditor.commit();
        Random islem = new Random();
        int dortislem = islem.nextInt(4)+1;
        sıradaki = 0;
        TextView dye = (TextView) findViewById(R.id.textView16);
        dye.setText("Doğru : " +Integer.toString(dogru)  + " Yanlış : " + Integer.toString(yanlis) );


        int sayibir = islem.nextInt(50)+1;
        int sayiiki = islem.nextInt(50)+1;
        cevap = (sayibir + sayiiki);
        tekran1.setText(Integer.toString(sayibir)+"  +  " + Integer.toString(sayiiki)+ " = ?");



        Random dogru =new Random();
        int seccenek = dogru.nextInt(5)+1;
        int onay =1;
        sıradaki = 0;

        // dogru sıkkı yerlestirme
        Button tcevapA = (Button)findViewById(R.id.tcevap1);
        Button tcevapB = (Button)findViewById(R.id.tcevap2);
        Button tcevapC = (Button)findViewById(R.id.tcevap3);
        Button tcevapD = (Button)findViewById(R.id.tcevap4);
        Button tcevapE = (Button)findViewById(R.id.tcevap5);

        if (seccenek != 1 ){
            int bir = dogru.nextInt(10)+1;
            int secc = dogru.nextInt(2)+1;
            if(secc==1) {
                tcevapA.setText(Integer.toString(cevap - bir));
            }
            if(secc==2) {
                tcevapA.setText(Integer.toString(cevap + bir));
            }
            a = false;
        }
        if (seccenek != 2 ){
            int iki = dogru.nextInt(10)+1;
            int secc = dogru.nextInt(2)+1;
            if(secc==1) {
                tcevapB.setText(Integer.toString(cevap + iki));
            }
            if(secc==2) {
                tcevapB.setText(Integer.toString(cevap - iki));
            }
            b = false;
        }
        if (seccenek != 3 ){
            int uc = dogru.nextInt(20)+1;
            int secc = dogru.nextInt(2)+1;
            if(secc==1) {
                tcevapC.setText(Integer.toString(cevap - uc));
            }
            if(secc==2) {
                tcevapC.setText(Integer.toString(cevap + uc));
            }
            c = false;
        }
        if (seccenek != 4 ){
            int dort = dogru.nextInt(20)+1;
            int secc = dogru.nextInt(2)+1;
            if(secc==1) {
                tcevapD.setText(Integer.toString(cevap + dort));
            }
            if(secc==2) {
                tcevapD.setText(Integer.toString(cevap - dort));
            }
            d = false;
        }
        if (seccenek != 5 ){
            int bes = dogru.nextInt(25)+1;
            int secc = dogru.nextInt(2)+1;
            if(secc==1) {
                tcevapE.setText(Integer.toString(cevap + bes));
            }
            if(secc==2) {
                tcevapE.setText(Integer.toString(cevap - bes));
            }
            e = false;
        }
        if (seccenek == 1 ){

            tcevapA.setText(Integer.toString(cevap));
            a = true;
        }
        if (seccenek == 2 ){
            tcevapB.setText(Integer.toString(cevap));
            b = true;
        }
        if (seccenek == 3 ){
            tcevapC.setText(Integer.toString(cevap));
            c = true;
        }
        if (seccenek == 4 ){
            tcevapD.setText(Integer.toString(cevap));
            d = true;
        }
        if (seccenek == 5 ){
            tcevapE.setText(Integer.toString(cevap));
            e = true;
        }

    }
    }



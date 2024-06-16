package com.example.erennl.matematikgelistirme;

import android.animation.IntArrayEvaluator;
import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class istatislik extends AppCompatActivity {
    int toplamadogru,toplamayanlis = 0;
    int cikarmadogru,cikarmayanlis = 0;
    int carpmadogru,carpmayanlis= 0 ;
    int bolmedogur,bolmeyanlis= 0 ;
    int toplamdogru,toplamyanlis = 0;
    TextView toplamaekran;
    TextView Cikarmaekran;
    TextView Carpmaekran;
    TextView bolmekeran;
    TextView dogruekran;
    TextView Yanlisekran;
    Button sıfırlama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_istatislik);


        SharedPreferences tdogru = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        toplamadogru = tdogru.getInt("benihatirladogrutoplam",0);
        SharedPreferences.Editor tdeditor = tdogru.edit();
        tdeditor.putInt("benihatirladogrutoplam",toplamadogru);
        tdeditor.putString("kullaniciadi","şerif");
        tdeditor.commit();

        SharedPreferences tyanlis = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        toplamayanlis = tyanlis.getInt("benihatirlayanlistoplam",0);
        SharedPreferences.Editor tyeditor = tyanlis.edit();
        tyeditor.putInt("benihatirlayanlistoplam",toplamayanlis);
        tyeditor.putString("kullaniciadi","şerif");
        tyeditor.commit();
        SharedPreferences cidogru = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        cikarmadogru = cidogru.getInt("benihatirladogrucıkarma",0);
        SharedPreferences.Editor cideditor = cidogru.edit();
        cideditor.putInt("benihatirladogrucıkarma",cikarmadogru);
        cideditor.putString("kullaniciadi","şerif");
        cideditor.commit();

        SharedPreferences ciyanlis = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        cikarmayanlis = ciyanlis.getInt("benihatirlayanliscikarma",0);
        SharedPreferences.Editor ciydeditor = ciyanlis.edit();
        ciydeditor.putInt("benihatirlayanliscikarma",cikarmayanlis);
        ciydeditor.putString("kullaniciadi","şerif");
        ciydeditor.commit();

        SharedPreferences cdogru = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        carpmadogru = cdogru.getInt("benihatirladogrucarpma",0);
        SharedPreferences.Editor cdeditor = cdogru.edit();
        cdeditor.putInt("benihatirladogrucarpma",carpmadogru);
        cdeditor.putString("kullaniciadi","şerif");
        cdeditor.commit();

        SharedPreferences cyanlis = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        carpmayanlis = cyanlis.getInt("benihatirlayanliscarpma",0);
        SharedPreferences.Editor cyeditor = cyanlis.edit();
        cyeditor.putInt("benihatirlayanliscarpma",carpmayanlis);
        cyeditor.putString("kullaniciadi","şerif");
        cyeditor.commit();

        SharedPreferences tbdogru = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        bolmedogur = tbdogru.getInt("benihatirladogrubolme",0);
        SharedPreferences.Editor tbdeditor = tbdogru.edit();
        tbdeditor.putInt("benihatirladogrubolme",bolmedogur);
        tbdeditor.putString("kullaniciadi","şerif");
        tbdeditor.commit();

        SharedPreferences tbyanlis = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        bolmeyanlis = tbyanlis.getInt("benihatirlayanlisbolme",0);
        SharedPreferences.Editor tbyeditor = tbyanlis.edit();
        tbyeditor.putInt("benihatirlayanlisbolme",bolmeyanlis);
        tbyeditor.putString("kullaniciadi","şerif");
        tbyeditor.commit();

        TextView toplamaekran = (TextView) findViewById(R.id.textView28);
        TextView Cikarmaekran = (TextView) findViewById(R.id.textView18);
        TextView Carpmaekran = (TextView) findViewById(R.id.textView17);
        TextView bolmekeran = (TextView) findViewById(R.id.textView23) ;

        toplamaekran.setText("TOPLAMA = Doğru : " + Integer.toString(toplamadogru) + " Yanlış :" + Integer.toString(toplamayanlis));
        Cikarmaekran.setText("ÇIKARMA = Doğru : " + Integer.toString(cikarmadogru) + " Yanlış : " + Integer.toString(cikarmayanlis));
        Carpmaekran.setText("ÇARPMA = Doğru : " + Integer.toString(carpmadogru) + " Yanlış : " + Integer.toString(carpmayanlis));
        bolmekeran.setText("BÖLME = Doğru : " + Integer.toString(bolmedogur) + " Yanlış : "  + Integer.toString(bolmeyanlis));

        toplamdogru = toplamadogru + cikarmadogru + carpmadogru + bolmedogur;
        toplamyanlis = toplamayanlis + cikarmayanlis + carpmayanlis +bolmeyanlis;

        TextView dogruekran = (TextView) findViewById(R.id.textView5);
        TextView Yanlisekran = (TextView) findViewById(R.id.textView15);

        dogruekran.setText(Integer.toString(toplamdogru));
        Yanlisekran.setText(Integer.toString(toplamyanlis));

        Button sıfırlama = (Button) findViewById(R.id.temizle);
        sıfırlama.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences tdogru = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor tdeditor = tdogru.edit();
                tdeditor.putInt("benihatirladogrutoplam",0);
                tdeditor.putString("kullaniciadi","şerif");
                tdeditor.commit();
                SharedPreferences ydogru = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor tyeditor = tdogru.edit();
                tyeditor.putInt("benihatirlayanlistoplam",0);
                tyeditor.putString("kullaniciadi","şerif");
                tyeditor.commit();

                SharedPreferences tbdogru = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor tbdeditor = tbdogru.edit();
                tbdeditor.putInt("benihatirladogrubolme",0);
                tbdeditor.putString("kullaniciadi","şerif");
                tbdeditor.commit();
                SharedPreferences tbyanlis = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor tbyeditor = tbyanlis.edit();
                tbyeditor.putInt("benihatirlayanlisbolme",0);
                tbyeditor.putString("kullaniciadi","şerif");
                tbyeditor.commit();

                SharedPreferences cdogru = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor cdeditor = cdogru.edit();
                cdeditor.putInt("benihatirladogrucarpma",0);
                cdeditor.putString("kullaniciadi","şerif");
                cdeditor.commit();
                SharedPreferences cyanlis = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor cyeditor = cyanlis.edit();
                cyeditor.putInt("benihatirlayanliscarpma",0);
                cyeditor.putString("kullaniciadi","şerif");
                cyeditor.commit();

                SharedPreferences cidogru = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor cideditor = cidogru.edit();
                cideditor.putInt("benihatirladogrucıkarma",0);
                cideditor.putString("kullaniciadi","şerif");
                cideditor.commit();
                SharedPreferences ciyanlis = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor ciydeditor = ciyanlis.edit();
                ciydeditor.putInt("benihatirlayanliscikarma",0);
                ciydeditor.putString("kullaniciadi","şerif");
                ciydeditor.commit();

                Context context = getApplicationContext();
                CharSequence text = "Sıfırlama başarılı  :)";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });



    }
}

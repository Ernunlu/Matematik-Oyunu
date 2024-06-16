package com.example.erennl.matematikgelistirme;

import android.animation.IntArrayEvaluator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.content.SharedPreferences;

import org.w3c.dom.Text;

import java.util.Random;
import java.util.logging.XMLFormatter;



public class ayarlar extends Activity {
Button lvlo;
Button lvlguncelle;
EditText guncelletext1;
Button ageri1;
int glvl=0;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ayarlar);
        Button sıfırla = (Button)findViewById(R.id.lvlo);
        Button guncelle = (Button)findViewById(R.id.lvlguncelle);
        Button ageri1 = (Button)findViewById(R.id.ageri);
        sıfırla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences ayarlar = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                SharedPreferences.Editor editor = ayarlar.edit();
                editor.putInt("benihatirla",1);
                editor.putString("kullaniciadi","şerif");
                editor.commit();
                Context context = getApplicationContext();
                CharSequence text = "Sıfırlama başarılı  :)";
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        guncelle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText guncelletext1 = (EditText)findViewById(R.id.guncelletext);
                glvl = Integer.parseInt(guncelletext1.getText().toString());
                if(glvl <= 9999 && glvl >= 0 ) {
                    SharedPreferences ayarlar = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
                    SharedPreferences.Editor editor = ayarlar.edit();
                    editor.putInt("benihatirla", glvl);
                    editor.putString("kullaniciadi", "şerif");
                    editor.commit();
                    Context context = getApplicationContext();
                    CharSequence text = "Güncelleme başarılı  :)";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();
                }
                else
                {
                    Context context = getApplicationContext();
                    CharSequence text = "0 ile 9999 arasında bir değer giriniz  :(";
                    int duration = Toast.LENGTH_LONG;
                    Toast toast = Toast.makeText(context, text, duration);
                    toast.show();

                }
            }
        });
        ageri1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent karısıkoyungecisrr=new Intent(ayarlar.this, Anasayfa.class);
                startActivity(karısıkoyungecisrr);
            }
        });

    }
}











package com.example.erennl.matematikgelistirme;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;




public class Anasayfa extends AppCompatActivity {

    Button button1,ayar;
    Button istatislikk;


    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anasayfa);
            Button ayarlar = (Button)findViewById(R.id.ayar);
          Button istatislik = (Button)findViewById(R.id.istatislikk);
        final Button oyunabasla=(Button)findViewById(R.id.baslab);
        oyunabasla.setOnClickListener (new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ikincisayfagecis=new Intent(Anasayfa.this, seceneklericin.class);
                startActivity(ikincisayfagecis);
            }



        });

        ayarlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent ucsayfa=new Intent(Anasayfa.this, ayarlar.class);
                startActivity(ucsayfa);
            }
        });

        istatislik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent istatisliksayfa=new Intent(Anasayfa.this, istatislik.class);
                startActivity(istatisliksayfa);

            }
        });


    }

}
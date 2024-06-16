package com.example.erennl.matematikgelistirme;
import android.os.CountDownTimer;

import java.util.Timer;
import java.util.TimerTask;

public class zaman extends CountDownTimer {

        public zaman(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long millisUntilFinished) {

            int progress = (int) (millisUntilFinished/1000);


        }

        @Override
        public void onFinish() {

        }
    }




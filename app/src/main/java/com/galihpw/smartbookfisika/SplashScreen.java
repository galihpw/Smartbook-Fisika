package com.galihpw.smartbookfisika;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    private static int SPLASH_TIME_OUT = 2000;
    ImageView logo_holder;
    TextView text_holder;
    Animation anim_logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        logo_holder = (ImageView) findViewById(R.id.fjudul);
        text_holder = (TextView) findViewById(R.id.textView10);
        text_holder.setVisibility(View.INVISIBLE);
        logo_holder.setVisibility(View.INVISIBLE);
        anim_logo = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.anim_pop_out);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                /*Intent i = new Intent(SplashScreen.this, LoginActivity.class);*/
                Intent i = new Intent(SplashScreen.this, MainActivity.class);
                startActivity(i);
                finish();
                overridePendingTransition(R.anim.fade_in_activity,R.anim.fade_out_activity);
            }
        }, SPLASH_TIME_OUT);
    }
    protected void onStart(){
        super.onStart();

    }


    protected void onPause() {
        super.onPause();
        logo_holder.setVisibility(View.INVISIBLE);
    }

    protected void onResume() {
        super.onResume();
        logo_holder.startAnimation(anim_logo);
        text_holder.startAnimation(anim_logo);

        Handler handler = new Handler();
        Runnable startMain = new Runnable() {

            @Override
            public void run() {
                if (!isFinishing()){

                }
            }
        };

        handler.postDelayed(startMain, 3000);
    }
}


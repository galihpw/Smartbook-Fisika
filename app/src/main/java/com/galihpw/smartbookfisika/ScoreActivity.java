package com.galihpw.smartbookfisika;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.galihpw.smartbookfisika.LatihanPG.Hasil;

import java.util.Timer;
import java.util.TimerTask;

public class ScoreActivity extends AppCompatActivity {

    int i = 0;
    TextView tScore, tBenar, tSalah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        tBenar = (TextView) findViewById(R.id.tBenar);
        tSalah = (TextView) findViewById(R.id.tSalah);
        tScore = (TextView) findViewById(R.id.tScore);

        final Timer T=new Timer();
        T.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable()
                {
                    @Override
                    public void run()
                    {
                        tScore.setText(""+i);

                        if(i == Hasil.score){
                            tBenar.setText(tBenar.getText() + "\n" + (Hasil.score/10));
                            tSalah.setText(tSalah.getText() + "\n" + (10 - (Hasil.score/10)));
                            T.cancel();
                        }

                        i++;
                    }
                });
            }
        }, 0, 20);

        Button bBack = (Button) findViewById(R.id.bBack);

        bBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Hasil.isi = 0;
                Hasil.score = 0;
                Intent intent = new Intent(ScoreActivity.this,MenuLatihan.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

package com.galihpw.smartbookfisika.MateriListrik;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.galihpw.smartbookfisika.Config.Config;
import com.galihpw.smartbookfisika.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Materi1 extends AppCompatActivity {

    @BindView(R.id.video1)
    ImageView video1;

    @BindView(R.id.play_video1)
    ImageView play_video1;

    @BindView(R.id.video2)
    ImageView video2;

    @BindView(R.id.play_video2)
    ImageView play_video2;

    @BindView(R.id.video3)
    ImageView video3;

    @BindView(R.id.play_video3)
    ImageView play_video3;

    @BindView(R.id.judul)
    TextView judul;

    @BindView(R.id.img1)
    ImageView img1;

    @BindView(R.id.img2)
    ImageView img2;

    @BindView(R.id.img3)
    ImageView img3;

    @BindView(R.id.img4)
    ImageView img4;

    @BindView(R.id.img5)
    ImageView img5;

    @BindView(R.id.pembatas1)
    ImageView pembatas1;

    @BindView(R.id.pembatas2)
    ImageView pembatas2;

    @BindView(R.id.pembatas3)
    ImageView pembatas3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi1);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ButterKnife.bind(this);
        Glide.with(this).load("http://img.youtube.com/vi/VZJblLwL1SI/0.jpg").into(video1);
        Glide.with(this).load("http://img.youtube.com/vi/ey88EdZo9hU/0.jpg").into(video2);
        Glide.with(this).load("http://img.youtube.com/vi/ViZNgU-Yt-Y/0.jpg").into(video3);
        Glide.with(this).load(R.drawable.pembatas).into(pembatas1);
        Glide.with(this).load(R.drawable.pembatas).into(pembatas2);
        Glide.with(this).load(R.drawable.pembatas).into(pembatas3);
        Glide.with(this).load(R.drawable.car_color).into(img1);
        Glide.with(this).load(R.drawable.muatan_listrik).into(img2);
        Glide.with(this).load(R.drawable.benfranklin).into(img3);
        Glide.with(this).load(R.drawable.operasi_endoskopi).into(img4);
        Glide.with(this).load(R.drawable.jaritangan).into(img5);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Neat_Chalk.ttf");
        judul.setTypeface(custom_font);

        play_video1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Materi1.this, YoutubeActivity.class);
                Config.VIDEO_ID = "VZJblLwL1SI";
                startActivity(intent);
            }
        });

        play_video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Materi1.this, YoutubeActivity.class);
                Config.VIDEO_ID = "ey88EdZo9hU";
                startActivity(intent);
            }
        });

        play_video3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Materi1.this, YoutubeActivity.class);
                Config.VIDEO_ID = "ViZNgU-Yt-Y";
                startActivity(intent);
            }
        });
    }
}

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
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

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

    @BindView(R.id.video4)
    ImageView video4;

    @BindView(R.id.play_video4)
    ImageView play_video4;

    @BindView(R.id.video5)
    ImageView video5;

    @BindView(R.id.play_video5)
    ImageView play_video5;

    @BindView(R.id.video6)
    ImageView video6;

    @BindView(R.id.play_video6)
    ImageView play_video6;

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

    @BindView(R.id.img6)
    ImageView img6;

    @BindView(R.id.img7)
    ImageView img7;

    @BindView(R.id.img8)
    ImageView img8;

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
        Glide.with(this).load("http://img.youtube.com/vi/Qov5sMTshZs/0.jpg").into(video4);
        Glide.with(this).load("http://img.youtube.com/vi/B3s23PBAUO8/0.jpg").into(video5);
        Glide.with(this).load("http://img.youtube.com/vi/ELuYLs0BgJ8/0.jpg").into(video6);
        Glide.with(this).load(R.drawable.pembatas).into(pembatas1);
        Glide.with(this).load(R.drawable.pembatas).into(pembatas2);
        Glide.with(this).load(R.drawable.pembatas).into(pembatas3);
        Glide.with(this).load(R.drawable.car_color).into(img1);
        Glide.with(this).load(R.drawable.muatan_listrik).into(img2);
        Glide.with(this).load(R.drawable.benfranklin).into(img3);
        Glide.with(this).load(R.drawable.operasi_endoskopi).into(img4);
        Glide.with(this).load(R.drawable.jaritangan).into(img5);
        Glide.with(this).load(R.drawable.electroscope5).into(img6);
        Glide.with(this).load(R.drawable.pengecatan_elektrostatik).into(img7);
        Glide.with(this).load(R.drawable.imgcs1).into(img8);

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

        final GifImageView gif1 = (GifImageView)findViewById(R.id.gifml1);
        gif1.setImageResource(R.drawable.img1);
        final GifDrawable gifDrawable1 = (GifDrawable) gif1.getDrawable();
        gifDrawable1.start();

        final GifImageView gif2 = (GifImageView)findViewById(R.id.gifml2);
        gif2.setImageResource(R.drawable.img2);
        final GifDrawable gifDrawable2 = (GifDrawable) gif2.getDrawable();
        gifDrawable2.start();

        final GifImageView gif3 = (GifImageView)findViewById(R.id.gifml3);
        gif3.setImageResource(R.drawable.img3);
        final GifDrawable gifDrawable3 = (GifDrawable) gif3.getDrawable();
        gifDrawable3.start();

        play_video4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Materi1.this, YoutubeActivity.class);
                Config.VIDEO_ID = "Qov5sMTshZs";
                startActivity(intent);
            }
        });

        play_video5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Materi1.this, YoutubeActivity.class);
                Config.VIDEO_ID = "B3s23PBAUO8";
                startActivity(intent);
            }
        });

        play_video6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Materi1.this, YoutubeActivity.class);
                Config.VIDEO_ID = "ELuYLs0BgJ8";
                startActivity(intent);
            }
        });
    }
}

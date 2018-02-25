package com.galihpw.smartbookfisika.HukumColoumb;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.galihpw.smartbookfisika.Config.Config;
import com.galihpw.smartbookfisika.MateriListrik.Materi1;
import com.galihpw.smartbookfisika.MateriListrik.YoutubeActivity;
import com.galihpw.smartbookfisika.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class HukumColoumb extends AppCompatActivity {

    @BindView(R.id.tekshc1)
    TextView tekshc1;

    @BindView(R.id.imghc1)
    ImageView imghc1;

    @BindView(R.id.imghc2)
    ImageView imghc2;

    @BindView(R.id.imghc3)
    ImageView imghc3;

    @BindView(R.id.imghc4)
    ImageView imghc4;

    @BindView(R.id.imghc6)
    ImageView imghc6;

    @BindView(R.id.imghc7)
    ImageView imghc7;

    @BindView(R.id.imghc8)
    ImageView imghc8;

    @BindView(R.id.imghc9)
    ImageView imghc9;

    @BindView(R.id.imghc10)
    ImageView imghc10;

    @BindView(R.id.imghc11)
    ImageView imghc11;

    @BindView(R.id.imghc12)
    ImageView imghc12;

    @BindView(R.id.imgrmhc1)
    ImageView imgrmhc1;

    @BindView(R.id.imgrmhc2)
    ImageView imgrmhc2;

    @BindView(R.id.imgrmhc3)
    ImageView imgrmhc3;

    @BindView(R.id.imgrmhc4)
    ImageView imgrmhc4;

    @BindView(R.id.imgrmhc5)
    ImageView imgrmhc5;

    @BindView(R.id.imgrmhc6)
    ImageView imgrmhc6;

    @BindView(R.id.imgrmhc7)
    ImageView imgrmhc7;

    @BindView(R.id.imgrmhc8)
    ImageView imgrmhc8;

    @BindView(R.id.imgrmhc9)
    ImageView imgrmhc9;

    @BindView(R.id.imgrmhc10)
    ImageView imgrmhc10;

    @BindView(R.id.imgsoalhc1)
    ImageView imgsoalhc1;

    @BindView(R.id.imgsoalhc2)
    ImageView imgsoalhc2;

    @BindView(R.id.videohc1)
    ImageView videohc1;

    @BindView(R.id.play_videohc1)
    ImageView play_videohc1;

    @BindView(R.id.videohc2)
    ImageView videohc2;

    @BindView(R.id.play_videohc2)
    ImageView play_videohc2;

    @BindView(R.id.videohc3)
    ImageView videohc3;

    @BindView(R.id.play_videohc3)
    ImageView play_videohc3;

    @BindView(R.id.videohc4)
    ImageView videohc4;

    @BindView(R.id.play_videohc4)
    ImageView play_videohc4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hukum_coloumb);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ButterKnife.bind(this);
        Glide.with(this).load("http://img.youtube.com/vi/1QyscUHRAss/0.jpg").into(videohc1);
        Glide.with(this).load("http://img.youtube.com/vi/3Ptu07enIsY/0.jpg").into(videohc2);
        Glide.with(this).load("http://img.youtube.com/vi/1kO3A2CRghM/0.jpg").into(videohc3);
        Glide.with(this).load("http://img.youtube.com/vi/JryhC73-MRA/0.jpg").into(videohc4);
        Glide.with(this).load(R.drawable.imghc1).into(imghc1);
        Glide.with(this).load(R.drawable.imghc2).into(imghc2);
        Glide.with(this).load(R.drawable.imghc3).into(imghc3);
        Glide.with(this).load(R.drawable.imghc4).into(imghc4);
        //Glide.with(this).load(R.drawable.imghc5).into(imghc5);
        Glide.with(this).load(R.drawable.imghc6).into(imghc6);
        Glide.with(this).load(R.drawable.imghc7).into(imghc7);
        Glide.with(this).load(R.drawable.imghc8).into(imghc8);
        Glide.with(this).load(R.drawable.imghc9).into(imghc9);
        Glide.with(this).load(R.drawable.imghc10).into(imghc10);
        Glide.with(this).load(R.drawable.imghc11).into(imghc11);
        Glide.with(this).load(R.drawable.imghc12).into(imghc12);
        Glide.with(this).load(R.drawable.imgrmhc1).into(imgrmhc1);
        Glide.with(this).load(R.drawable.imgrmhc2).into(imgrmhc2);
        Glide.with(this).load(R.drawable.imgrmhc3).into(imgrmhc3);
        Glide.with(this).load(R.drawable.imgrmhc4).into(imgrmhc4);
        Glide.with(this).load(R.drawable.imgrmhc5).into(imgrmhc5);
        Glide.with(this).load(R.drawable.imgrmhc6).into(imgrmhc6);
        Glide.with(this).load(R.drawable.imgrmhc7).into(imgrmhc7);
        Glide.with(this).load(R.drawable.imgrmhc8).into(imgrmhc8);
        Glide.with(this).load(R.drawable.imgrmhc9).into(imgrmhc9);
        Glide.with(this).load(R.drawable.imgrmhc10).into(imgrmhc10);
        Glide.with(this).load(R.drawable.imgsoalhc1).into(imgsoalhc1);
        Glide.with(this).load(R.drawable.imgsoalhc2).into(imgsoalhc2);

        final GifImageView gif1 = (GifImageView)findViewById(R.id.gifhc1);
        gif1.setImageResource(R.drawable.gifhc1);
        final GifDrawable gifDrawable1 = (GifDrawable) gif1.getDrawable();
        gifDrawable1.start();

        final GifImageView gif2 = (GifImageView)findViewById(R.id.gifhc2);
        gif2.setImageResource(R.drawable.gifhc2);
        final GifDrawable gifDrawable2 = (GifDrawable) gif2.getDrawable();
        gifDrawable2.start();

        final GifImageView gif3 = (GifImageView)findViewById(R.id.gifhc3);
        gif3.setImageResource(R.drawable.gifhc3);
        final GifDrawable gifDrawable3 = (GifDrawable) gif3.getDrawable();
        gifDrawable3.start();

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Neat_Chalk.ttf");
        tekshc1.setTypeface(custom_font);

        play_videohc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HukumColoumb.this, Yhukumcoloumb.class);
                Config.VIDEO_ID = "1QyscUHRAss";
                startActivity(intent);
            }
        });

        play_videohc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HukumColoumb.this, Yhukumcoloumb.class);
                Config.VIDEO_ID = "3Ptu07enIsY";
                startActivity(intent);
            }
        });

        play_videohc3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HukumColoumb.this, Yhukumcoloumb.class);
                Config.VIDEO_ID = "1kO3A2CRghM";
                startActivity(intent);
            }
        });

        play_videohc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HukumColoumb.this, Yhukumcoloumb.class);
                Config.VIDEO_ID = "JryhC73-MRA";
                startActivity(intent);
            }
        });

    }
}

package com.galihpw.smartbookfisika.Kapasitor;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.galihpw.smartbookfisika.Config.Config;
import com.galihpw.smartbookfisika.EnergiPotensial.EnergiPotensial;
import com.galihpw.smartbookfisika.MateriListrik.YoutubeActivity;
import com.galihpw.smartbookfisika.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Kapasitor extends AppCompatActivity {

    @BindView(R.id.tekska1)
    TextView tekska1;

    @BindView(R.id.imgka1)
    ImageView imgka1;
    @BindView(R.id.imgka2)
    ImageView imgka2;
    @BindView(R.id.imgka3)
    ImageView imgka3;
    @BindView(R.id.imgka5)
    ImageView imgka5;
    @BindView(R.id.imgka9)
    ImageView imgka9;
    @BindView(R.id.imgka10)
    ImageView imgka10;
    @BindView(R.id.imgka12)
    ImageView imgka12;
    @BindView(R.id.imgka14)
    ImageView imgka14;
    @BindView(R.id.imgka25)
    ImageView imgka25;
    @BindView(R.id.imgka30)
    ImageView imgka30;
    @BindView(R.id.imgka41)
    ImageView imgka41;
    @BindView(R.id.imgka42)
    ImageView imgka42;
    @BindView(R.id.imgka48)
    ImageView imgka48;
    @BindView(R.id.imgka56)
    ImageView imgka56;
    @BindView(R.id.imgka57)
    ImageView imgka57;
    @BindView(R.id.imgka58)
    ImageView imgka58;
    @BindView(R.id.imgka59)
    ImageView imgka59;
    @BindView(R.id.imgka63)
    ImageView imgka63;
    @BindView(R.id.imgka65)
    ImageView imgka65;
    @BindView(R.id.imgka67)
    ImageView imgka67;
    @BindView(R.id.imgka68)
    ImageView imgka68;
    @BindView(R.id.imgka69)
    ImageView imgka69;
    @BindView(R.id.imgka73)
    ImageView imgka73;
    @BindView(R.id.playvideobab5)
    ImageView playvideobab5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kapasitor);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ButterKnife.bind(this);
        Glide.with(this).load(R.drawable.imgka1).into(imgka1);
        Glide.with(this).load(R.drawable.imgka2).into(imgka2);
        Glide.with(this).load(R.drawable.imgka3).into(imgka3);
        Glide.with(this).load(R.drawable.imgka5).into(imgka5);
        Glide.with(this).load(R.drawable.imgka9).into(imgka9);
        Glide.with(this).load(R.drawable.imgka10).into(imgka10);
        Glide.with(this).load(R.drawable.imgka12).into(imgka12);
        Glide.with(this).load(R.drawable.imgka14).into(imgka14);
        Glide.with(this).load(R.drawable.imgka25).into(imgka25);
        Glide.with(this).load(R.drawable.imgka30).into(imgka30);
        Glide.with(this).load(R.drawable.imgka41).into(imgka41);
        Glide.with(this).load(R.drawable.imgka42).into(imgka42);
        Glide.with(this).load(R.drawable.imgka48).into(imgka48);
        Glide.with(this).load(R.drawable.imgka56).into(imgka56);
        Glide.with(this).load(R.drawable.imgka57).into(imgka57);
        Glide.with(this).load(R.drawable.imgka58).into(imgka58);
        Glide.with(this).load(R.drawable.imgka59).into(imgka59);
        Glide.with(this).load(R.drawable.imgka63).into(imgka63);
        Glide.with(this).load(R.drawable.imgka65).into(imgka65);
        Glide.with(this).load(R.drawable.imgka67).into(imgka67);
        Glide.with(this).load(R.drawable.imgka68).into(imgka68);
        Glide.with(this).load(R.drawable.imgka69).into(imgka69);
        Glide.with(this).load(R.drawable.imgka73).into(imgka73);

        Glide.with(this).load("http://img.youtube.com/vi/vsSfUisVD9k/0.jpg").into(playvideobab5);

        playvideobab5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Kapasitor.this, YoutubeActivity.class);
                Config.VIDEO_ID = "vsSfUisVD9k";
                startActivity(intent);
            }
        });
        TextView tekska26 = (TextView)findViewById(R.id.tekska26);
        TextView tekska32 = (TextView)findViewById(R.id.tekska32);
        TextView tekska53 = (TextView)findViewById(R.id.tekska53);
        TextView tekska64 = (TextView)findViewById(R.id.tekska64);
        TextView tekska69 = (TextView)findViewById(R.id.tekska69);
        TextView tekska71 = (TextView)findViewById(R.id.tekska71);
        TextView tekska72 = (TextView)findViewById(R.id.tekska72);
        TextView tekska76 = (TextView)findViewById(R.id.tekska76);
        TextView tekska77 = (TextView)findViewById(R.id.tekska77);
        TextView tekska93 = (TextView)findViewById(R.id.tekska93);
        TextView tekska94 = (TextView)findViewById(R.id.tekska94);
        TextView tekska97 = (TextView)findViewById(R.id.tekska97);
        TextView tekska102 = (TextView)findViewById(R.id.tekska102);
        TextView tekska103 = (TextView)findViewById(R.id.tekska103);
        TextView tekska104 = (TextView)findViewById(R.id.tekska104);
        TextView tekska130 = (TextView)findViewById(R.id.tekska130);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            tekska26.setText(Html.fromHtml(getString(R.string.tekska26), Html.FROM_HTML_MODE_COMPACT));
            tekska32.setText(Html.fromHtml(getString(R.string.tekska32), Html.FROM_HTML_MODE_COMPACT));
            tekska53.setText(Html.fromHtml(getString(R.string.tekska53), Html.FROM_HTML_MODE_COMPACT));
            tekska64.setText(Html.fromHtml(getString(R.string.tekska64), Html.FROM_HTML_MODE_COMPACT));
            tekska69.setText(Html.fromHtml(getString(R.string.tekska69), Html.FROM_HTML_MODE_COMPACT));
            tekska71.setText(Html.fromHtml(getString(R.string.tekska71), Html.FROM_HTML_MODE_COMPACT));
            tekska72.setText(Html.fromHtml(getString(R.string.tekska72), Html.FROM_HTML_MODE_COMPACT));
            tekska76.setText(Html.fromHtml(getString(R.string.tekska76), Html.FROM_HTML_MODE_COMPACT));
            tekska77.setText(Html.fromHtml(getString(R.string.tekska77), Html.FROM_HTML_MODE_COMPACT));
            tekska93.setText(Html.fromHtml(getString(R.string.tekska93), Html.FROM_HTML_MODE_COMPACT));
            tekska94.setText(Html.fromHtml(getString(R.string.tekska94), Html.FROM_HTML_MODE_COMPACT));
            tekska97.setText(Html.fromHtml(getString(R.string.tekska97), Html.FROM_HTML_MODE_COMPACT));
            tekska102.setText(Html.fromHtml(getString(R.string.tekska102), Html.FROM_HTML_MODE_COMPACT));
            tekska103.setText(Html.fromHtml(getString(R.string.tekska103), Html.FROM_HTML_MODE_COMPACT));
            tekska104.setText(Html.fromHtml(getString(R.string.tekska104), Html.FROM_HTML_MODE_COMPACT));
            tekska130.setText(Html.fromHtml(getString(R.string.tekska130), Html.FROM_HTML_MODE_COMPACT));
        }else {
            tekska26.setText(Html.fromHtml(getString(R.string.tekska26)));
            tekska32.setText(Html.fromHtml(getString(R.string.tekska32)));
            tekska53.setText(Html.fromHtml(getString(R.string.tekska53)));
            tekska53.setText(Html.fromHtml(getString(R.string.tekska53)));
            tekska64.setText(Html.fromHtml(getString(R.string.tekska64)));
            tekska69.setText(Html.fromHtml(getString(R.string.tekska69)));
            tekska71.setText(Html.fromHtml(getString(R.string.tekska71)));
            tekska72.setText(Html.fromHtml(getString(R.string.tekska72)));
            tekska76.setText(Html.fromHtml(getString(R.string.tekska76)));
            tekska77.setText(Html.fromHtml(getString(R.string.tekska77)));
            tekska93.setText(Html.fromHtml(getString(R.string.tekska93)));
            tekska94.setText(Html.fromHtml(getString(R.string.tekska94)));
            tekska97.setText(Html.fromHtml(getString(R.string.tekska97)));
            tekska102.setText(Html.fromHtml(getString(R.string.tekska102)));
            tekska103.setText(Html.fromHtml(getString(R.string.tekska103)));
            tekska104.setText(Html.fromHtml(getString(R.string.tekska104)));
            tekska130.setText(Html.fromHtml(getString(R.string.tekska130)));
        }

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Neat_Chalk.ttf");
        tekska1.setTypeface(custom_font);
    }
}

package com.galihpw.smartbookfisika.EnergiPotensial;

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
import com.galihpw.smartbookfisika.MateriListrik.Materi1;
import com.galihpw.smartbookfisika.MateriListrik.YoutubeActivity;
import com.galihpw.smartbookfisika.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EnergiPotensial extends AppCompatActivity {

    @BindView(R.id.teksep1)
    TextView teksep1;
    @BindView(R.id.teksep79)
    TextView teksep79;

    @BindView(R.id.image1ep)
    ImageView image1ep;
    @BindView(R.id.image2ep)
    ImageView image2ep;
    @BindView(R.id.image7ep)
    ImageView image7ep;
    @BindView(R.id.image8ep)
    ImageView image8ep;
    @BindView(R.id.image12ep)
    ImageView image12ep;
    @BindView(R.id.image13ep)
    ImageView image13ep;
    @BindView(R.id.image15ep)
    ImageView image15ep;
    @BindView(R.id.image21ep)
    ImageView image21ep;
    @BindView(R.id.image24ep)
    ImageView image24ep;
    @BindView(R.id.image27ep)
    ImageView image27ep;
    @BindView(R.id.image31ep)
    ImageView image31ep;
    @BindView(R.id.image35ep)
    ImageView image35ep;
    @BindView(R.id.image38ep)
    ImageView image38ep;
    @BindView(R.id.image40ep)
    ImageView image40ep;
    @BindView(R.id.image44ep)
    ImageView image44ep;
    @BindView(R.id.image47ep)
    ImageView image47ep;
    @BindView(R.id.image52ep)
    ImageView image52ep;
    @BindView(R.id.image57ep)
    ImageView image57ep;
    @BindView(R.id.image58ep)
    ImageView image58ep;
    @BindView(R.id.image60ep)
    ImageView image60ep;
    @BindView(R.id.image61ep)
    ImageView image61ep;
    @BindView(R.id.image62ep)
    ImageView image62ep;
    @BindView(R.id.image63ep)
    ImageView image63ep;
    @BindView(R.id.image67ep)
    ImageView image67ep;
    @BindView(R.id.image72ep)
    ImageView image72ep;

    @BindView(R.id.playvideobab4)
    ImageView playvideobab4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energi_potensial);
        TextView teksep6 = (TextView)findViewById(R.id.teksep6);
        TextView teksep7 = (TextView)findViewById(R.id.teksep7);
        TextView teksep9 = (TextView)findViewById(R.id.teksep9);
        TextView teksep12 = (TextView)findViewById(R.id.teksep12);
        TextView teksep16 = (TextView)findViewById(R.id.teksep16);
        TextView teksep17 = (TextView)findViewById(R.id.teksep17);
        TextView teksep21 = (TextView)findViewById(R.id.teksep21);
        TextView teksep24 = (TextView)findViewById(R.id.teksep24);
        TextView teksep28 = (TextView)findViewById(R.id.teksep28);
        TextView teksep39 = (TextView)findViewById(R.id.teksep39);
        TextView teksep44 = (TextView)findViewById(R.id.teksep44);
        TextView teksep53 = (TextView)findViewById(R.id.teksep53);
        TextView teksep54 = (TextView)findViewById(R.id.teksep54);
        TextView teksep55 = (TextView)findViewById(R.id.teksep55);
        TextView teksep57 = (TextView)findViewById(R.id.teksep57);
        TextView teksep58 = (TextView)findViewById(R.id.teksep58);
        TextView teksep59 = (TextView)findViewById(R.id.teksep59);
        TextView teksep61 = (TextView)findViewById(R.id.teksep61);
        TextView teksep62 = (TextView)findViewById(R.id.teksep62);
        TextView teksep65 = (TextView)findViewById(R.id.teksep65);
        TextView teksep66 = (TextView)findViewById(R.id.teksep66);
        TextView teksep72 = (TextView)findViewById(R.id.teksep72);
        TextView teksep76 = (TextView)findViewById(R.id.teksep76);
        TextView teksep81 = (TextView)findViewById(R.id.teksep81);
        TextView teksep90 = (TextView)findViewById(R.id.teksep90);
        TextView teksep100 = (TextView)findViewById(R.id.teksep100);

        ButterKnife.bind(this);
        Glide.with(this).load(R.drawable.image1ep).into(image1ep);
        Glide.with(this).load(R.drawable.image2ep).into(image2ep);
        Glide.with(this).load(R.drawable.image7ep).into(image7ep);
        Glide.with(this).load(R.drawable.image8ep).into(image8ep);
        Glide.with(this).load(R.drawable.imageep12).into(image12ep);
        Glide.with(this).load(R.drawable.imageep13).into(image13ep);
        Glide.with(this).load(R.drawable.imageep15).into(image15ep);
        Glide.with(this).load(R.drawable.imageep21).into(image21ep);
        Glide.with(this).load(R.drawable.imageep242).into(image24ep);
        Glide.with(this).load(R.drawable.imageep27).into(image27ep);
        Glide.with(this).load(R.drawable.imageep31).into(image31ep);
        Glide.with(this).load(R.drawable.imageep35).into(image35ep);
        Glide.with(this).load(R.drawable.imageep38).into(image38ep);
        Glide.with(this).load(R.drawable.imageep40).into(image40ep);
        Glide.with(this).load(R.drawable.imageep44).into(image44ep);
        Glide.with(this).load(R.drawable.imageep47).into(image47ep);
        Glide.with(this).load(R.drawable.imageep52).into(image52ep);
        Glide.with(this).load(R.drawable.imageep57).into(image57ep);
        Glide.with(this).load(R.drawable.imageep58).into(image58ep);
        Glide.with(this).load(R.drawable.imageep60).into(image60ep);
        Glide.with(this).load(R.drawable.imageep61).into(image61ep);
        Glide.with(this).load(R.drawable.imageep62).into(image62ep);
        Glide.with(this).load(R.drawable.imageep63).into(image63ep);
        Glide.with(this).load(R.drawable.imageep67).into(image67ep);
        Glide.with(this).load(R.drawable.imageep72).into(image72ep);
        Glide.with(this).load("http://img.youtube.com/vi/cjpnAERAB0o/0.jpg").into(playvideobab4);

        playvideobab4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(EnergiPotensial.this, YoutubeActivity.class);
                Config.VIDEO_ID = "cjpnAERAB0o";
                startActivity(intent);
            }
        });
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            teksep6.setText(Html.fromHtml(getString(R.string.teksep6), Html.FROM_HTML_MODE_COMPACT));
            teksep7.setText(Html.fromHtml(getString(R.string.teksep7), Html.FROM_HTML_MODE_COMPACT));
            teksep9.setText(Html.fromHtml(getString(R.string.teksep9), Html.FROM_HTML_MODE_COMPACT));
            teksep12.setText(Html.fromHtml(getString(R.string.teksep12), Html.FROM_HTML_MODE_COMPACT));
            teksep16.setText(Html.fromHtml(getString(R.string.teksep16), Html.FROM_HTML_MODE_COMPACT));
            teksep17.setText(Html.fromHtml(getString(R.string.teksep17), Html.FROM_HTML_MODE_COMPACT));
            teksep21.setText(Html.fromHtml(getString(R.string.teksep21), Html.FROM_HTML_MODE_COMPACT));
            teksep24.setText(Html.fromHtml(getString(R.string.teksep24), Html.FROM_HTML_MODE_COMPACT));
            teksep28.setText(Html.fromHtml(getString(R.string.teksep28), Html.FROM_HTML_MODE_COMPACT));
            teksep39.setText(Html.fromHtml(getString(R.string.teksep39), Html.FROM_HTML_MODE_COMPACT));
            teksep44.setText(Html.fromHtml(getString(R.string.teksep44), Html.FROM_HTML_MODE_COMPACT));
            teksep53.setText(Html.fromHtml(getString(R.string.teksep53), Html.FROM_HTML_MODE_COMPACT));
            teksep54.setText(Html.fromHtml(getString(R.string.teksep54), Html.FROM_HTML_MODE_COMPACT));
            teksep55.setText(Html.fromHtml(getString(R.string.teksep55), Html.FROM_HTML_MODE_COMPACT));
            teksep57.setText(Html.fromHtml(getString(R.string.teksep57), Html.FROM_HTML_MODE_COMPACT));
            teksep58.setText(Html.fromHtml(getString(R.string.teksep58), Html.FROM_HTML_MODE_COMPACT));
            teksep59.setText(Html.fromHtml(getString(R.string.teksep59), Html.FROM_HTML_MODE_COMPACT));
            teksep61.setText(Html.fromHtml(getString(R.string.teksep61), Html.FROM_HTML_MODE_COMPACT));
            teksep62.setText(Html.fromHtml(getString(R.string.teksep62), Html.FROM_HTML_MODE_COMPACT));
            teksep65.setText(Html.fromHtml(getString(R.string.teksep65), Html.FROM_HTML_MODE_COMPACT));
            teksep66.setText(Html.fromHtml(getString(R.string.teksep66), Html.FROM_HTML_MODE_COMPACT));
            teksep72.setText(Html.fromHtml(getString(R.string.teksep72), Html.FROM_HTML_MODE_COMPACT));
            teksep76.setText(Html.fromHtml(getString(R.string.teksep76), Html.FROM_HTML_MODE_COMPACT));
            teksep81.setText(Html.fromHtml(getString(R.string.teksep81), Html.FROM_HTML_MODE_COMPACT));
            teksep90.setText(Html.fromHtml(getString(R.string.teksep90), Html.FROM_HTML_MODE_COMPACT));
            teksep100.setText(Html.fromHtml(getString(R.string.teksep100), Html.FROM_HTML_MODE_COMPACT));
        }else {
            teksep6.setText(Html.fromHtml(getString(R.string.teksep6)));
            teksep7.setText(Html.fromHtml(getString(R.string.teksep7)));
            teksep9.setText(Html.fromHtml(getString(R.string.teksep9)));
            teksep12.setText(Html.fromHtml(getString(R.string.teksep12)));
            teksep16.setText(Html.fromHtml(getString(R.string.teksep16)));
            teksep17.setText(Html.fromHtml(getString(R.string.teksep17)));
            teksep21.setText(Html.fromHtml(getString(R.string.teksep21)));
            teksep24.setText(Html.fromHtml(getString(R.string.teksep24)));
            teksep28.setText(Html.fromHtml(getString(R.string.teksep28)));
            teksep39.setText(Html.fromHtml(getString(R.string.teksep39)));
            teksep44.setText(Html.fromHtml(getString(R.string.teksep44)));
            teksep53.setText(Html.fromHtml(getString(R.string.teksep53)));
            teksep54.setText(Html.fromHtml(getString(R.string.teksep54)));
            teksep55.setText(Html.fromHtml(getString(R.string.teksep55)));
            teksep57.setText(Html.fromHtml(getString(R.string.teksep57)));
            teksep58.setText(Html.fromHtml(getString(R.string.teksep58)));
            teksep59.setText(Html.fromHtml(getString(R.string.teksep59)));
            teksep61.setText(Html.fromHtml(getString(R.string.teksep61)));
            teksep62.setText(Html.fromHtml(getString(R.string.teksep62)));
            teksep65.setText(Html.fromHtml(getString(R.string.teksep65)));
            teksep66.setText(Html.fromHtml(getString(R.string.teksep66)));
            teksep72.setText(Html.fromHtml(getString(R.string.teksep72)));
            teksep76.setText(Html.fromHtml(getString(R.string.teksep76)));
            teksep81.setText(Html.fromHtml(getString(R.string.teksep81)));
            teksep90.setText(Html.fromHtml(getString(R.string.teksep90)));
            teksep100.setText(Html.fromHtml(getString(R.string.teksep100)));
        }
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Neat_Chalk.ttf");
        teksep1.setTypeface(custom_font);
        Typeface custom_font2 = Typeface.createFromAsset(getAssets(),  "fonts/Neat_Chalk.ttf");
        teksep79.setTypeface(custom_font2);
    }
}

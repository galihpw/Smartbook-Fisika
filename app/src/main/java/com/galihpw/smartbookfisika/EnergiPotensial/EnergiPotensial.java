package com.galihpw.smartbookfisika.EnergiPotensial;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.galihpw.smartbookfisika.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EnergiPotensial extends AppCompatActivity {
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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energi_potensial);
        TextView teksep6 = (TextView)findViewById(R.id.teksep6);
        TextView teksep9 = (TextView)findViewById(R.id.teksep9);
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

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            teksep6.setText(Html.fromHtml(getString(R.string.teksep6), Html.FROM_HTML_MODE_COMPACT));
            teksep9.setText(Html.fromHtml(getString(R.string.teksep9), Html.FROM_HTML_MODE_COMPACT));
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
        }else {
            teksep6.setText(Html.fromHtml(getString(R.string.teksep6)));
            teksep9.setText(Html.fromHtml(getString(R.string.teksep9)));
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
        }
    }
}

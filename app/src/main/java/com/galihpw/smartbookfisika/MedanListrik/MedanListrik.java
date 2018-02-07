package com.galihpw.smartbookfisika.MedanListrik;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

import com.galihpw.smartbookfisika.R;

import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class MedanListrik extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medan_listrik);
        TextView teksmd7 = (TextView)findViewById(R.id.teksmd7);
        TextView teksmd9 = (TextView)findViewById(R.id.teksmd9);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            teksmd7.setText(Html.fromHtml(getString(R.string.teks7md), Html.FROM_HTML_MODE_COMPACT));
            teksmd9.setText(Html.fromHtml(getString(R.string.teks9md), Html.FROM_HTML_MODE_COMPACT));
        }else{
            teksmd7.setText(Html.fromHtml(getString(R.string.teks7md)));
            teksmd9.setText(Html.fromHtml(getString(R.string.teks9md)));
        }
        final GifImageView gif = (GifImageView)findViewById(R.id.mdgif1);
        gif.setImageResource(R.drawable.img1);
        final GifDrawable gifDrawable = (GifDrawable) gif.getDrawable();
        gifDrawable.start();

    }
}

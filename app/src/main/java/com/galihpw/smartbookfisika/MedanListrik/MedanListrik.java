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
        TextView teksmd36 = (TextView)findViewById(R.id.teksmd36);
        TextView teksmd38 = (TextView)findViewById(R.id.teksmd38);
        TextView teksmd45 = (TextView)findViewById(R.id.teksmd45);
        TextView teksmd50 = (TextView)findViewById(R.id.teksmd50);
        TextView teksmd56 = (TextView)findViewById(R.id.teksmd56);
        TextView teksmd58 = (TextView)findViewById(R.id.teksmd58);
        TextView teksmd79 = (TextView)findViewById(R.id.teksmd79);
        TextView teksmd84 = (TextView)findViewById(R.id.teksmd84);
        TextView teksmd86 = (TextView)findViewById(R.id.teksmd86);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            teksmd7.setText(Html.fromHtml(getString(R.string.teks7md), Html.FROM_HTML_MODE_COMPACT));
            teksmd9.setText(Html.fromHtml(getString(R.string.teks9md), Html.FROM_HTML_MODE_COMPACT));
            teksmd36.setText(Html.fromHtml(getString(R.string.teks36md), Html.FROM_HTML_MODE_COMPACT));
            teksmd38.setText(Html.fromHtml(getString(R.string.teks38md), Html.FROM_HTML_MODE_COMPACT));
            teksmd45.setText(Html.fromHtml(getString(R.string.teks45md), Html.FROM_HTML_MODE_COMPACT));
            teksmd50.setText(Html.fromHtml(getString(R.string.teks50md), Html.FROM_HTML_MODE_COMPACT));
            teksmd56.setText(Html.fromHtml(getString(R.string.teks56md), Html.FROM_HTML_MODE_COMPACT));
            teksmd58.setText(Html.fromHtml(getString(R.string.teks58md), Html.FROM_HTML_MODE_COMPACT));
            teksmd79.setText(Html.fromHtml(getString(R.string.teks79md), Html.FROM_HTML_MODE_COMPACT));
            teksmd84.setText(Html.fromHtml(getString(R.string.teks84md), Html.FROM_HTML_MODE_COMPACT));
            teksmd86.setText(Html.fromHtml(getString(R.string.teks86md), Html.FROM_HTML_MODE_COMPACT));
        }else{
            teksmd7.setText(Html.fromHtml(getString(R.string.teks7md)));
            teksmd9.setText(Html.fromHtml(getString(R.string.teks9md)));
            teksmd36.setText(Html.fromHtml(getString(R.string.teks36md)));
            teksmd38.setText(Html.fromHtml(getString(R.string.teks38md)));
            teksmd45.setText(Html.fromHtml(getString(R.string.teks45md)));
            teksmd50.setText(Html.fromHtml(getString(R.string.teks50md)));
            teksmd56.setText(Html.fromHtml(getString(R.string.teks56md)));
            teksmd58.setText(Html.fromHtml(getString(R.string.teks58md)));
            teksmd79.setText(Html.fromHtml(getString(R.string.teks79md)));
            teksmd84.setText(Html.fromHtml(getString(R.string.teks84md)));
            teksmd86.setText(Html.fromHtml(getString(R.string.teks86md)));
        }
        final GifImageView gif = (GifImageView)findViewById(R.id.mdgif1);
        gif.setImageResource(R.drawable.img1);
        final GifDrawable gifDrawable = (GifDrawable) gif.getDrawable();
        gifDrawable.start();

    }
}

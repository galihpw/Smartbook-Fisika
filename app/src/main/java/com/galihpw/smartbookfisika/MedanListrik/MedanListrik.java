package com.galihpw.smartbookfisika.MedanListrik;

import android.content.Intent;
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
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class MedanListrik extends AppCompatActivity {
    @BindView(R.id.video1)
    ImageView videomd;

    @BindView(R.id.play_video1)
    ImageView play_videomd;
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
        TextView teksmd93 = (TextView)findViewById(R.id.teksmd93);
        TextView teksmd100 = (TextView)findViewById(R.id.teksmd100);
        TextView teksmd106 = (TextView)findViewById(R.id.teksmd106);
        TextView teksmd108 = (TextView)findViewById(R.id.teksmd108);
        TextView teksmd109 = (TextView)findViewById(R.id.teksmd109);
        TextView teksmd111 = (TextView)findViewById(R.id.teksmd111);
        TextView teksmd112 = (TextView)findViewById(R.id.teksmd112);
        TextView teksmd114 = (TextView)findViewById(R.id.teksmd114);
        TextView teksmd120 = (TextView)findViewById(R.id.teksmd120);
        TextView teksmd131 = (TextView)findViewById(R.id.teksmd131);
        TextView teksmd140 = (TextView)findViewById(R.id.teksmd140);

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
            teksmd93.setText(Html.fromHtml(getString(R.string.teks92md), Html.FROM_HTML_MODE_COMPACT));
            teksmd100.setText(Html.fromHtml(getString(R.string.teks100md), Html.FROM_HTML_MODE_COMPACT));
            teksmd100.setText(Html.fromHtml(getString(R.string.teks100md), Html.FROM_HTML_MODE_COMPACT));
            teksmd106.setText(Html.fromHtml(getString(R.string.teks106md), Html.FROM_HTML_MODE_COMPACT));
            teksmd108.setText(Html.fromHtml(getString(R.string.teks108md), Html.FROM_HTML_MODE_COMPACT));
            teksmd109.setText(Html.fromHtml(getString(R.string.teks109md), Html.FROM_HTML_MODE_COMPACT));
            teksmd111.setText(Html.fromHtml(getString(R.string.teks111md), Html.FROM_HTML_MODE_COMPACT));
            teksmd112.setText(Html.fromHtml(getString(R.string.teks112md), Html.FROM_HTML_MODE_COMPACT));
            teksmd114.setText(Html.fromHtml(getString(R.string.teks114md), Html.FROM_HTML_MODE_COMPACT));
            teksmd120.setText(Html.fromHtml(getString(R.string.teks120md), Html.FROM_HTML_MODE_COMPACT));
            teksmd131.setText(Html.fromHtml(getString(R.string.teks131md), Html.FROM_HTML_MODE_COMPACT));
            teksmd140.setText(Html.fromHtml(getString(R.string.teks140md), Html.FROM_HTML_MODE_COMPACT));
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
            teksmd93.setText(Html.fromHtml(getString(R.string.teks92md)));
            teksmd100.setText(Html.fromHtml(getString(R.string.teks100md)));
            teksmd106.setText(Html.fromHtml(getString(R.string.teks106md)));
            teksmd108.setText(Html.fromHtml(getString(R.string.teks108md)));
            teksmd109.setText(Html.fromHtml(getString(R.string.teks109md)));
            teksmd111.setText(Html.fromHtml(getString(R.string.teks111md)));
            teksmd112.setText(Html.fromHtml(getString(R.string.teks112md)));
            teksmd114.setText(Html.fromHtml(getString(R.string.teks114md)));
            teksmd120.setText(Html.fromHtml(getString(R.string.teks120md)));
            teksmd131.setText(Html.fromHtml(getString(R.string.teks131md)));
            teksmd140.setText(Html.fromHtml(getString(R.string.teks140md)));
        }
        final GifImageView gif = (GifImageView)findViewById(R.id.mdgif1);
        gif.setImageResource(R.drawable.img1);
        final GifDrawable gifDrawable = (GifDrawable) gif.getDrawable();
        gifDrawable.start();
        /*ButterKnife.bind(this);
        Glide.with(this).load("http://img.youtube.com/vi/6BgcrRjqnKE/0.jpg").into(videomd);
        play_videomd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MedanListrik.this, YoutubeActivity.class);
                Config.VIDEO_ID = "6BgcrRjqnKE";
                startActivity(intent);
            }
        });*/

    }
}

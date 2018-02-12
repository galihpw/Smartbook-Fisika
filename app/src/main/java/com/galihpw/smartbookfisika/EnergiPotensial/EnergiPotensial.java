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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_energi_potensial);
        TextView teksep6 = (TextView)findViewById(R.id.teksep6);
        TextView teksep9 = (TextView)findViewById(R.id.teksep9);
        ButterKnife.bind(this);
        Glide.with(this).load(R.drawable.image1ep).into(image1ep);
        Glide.with(this).load(R.drawable.image2ep).into(image2ep);
        Glide.with(this).load(R.drawable.image7ep).into(image7ep);
        Glide.with(this).load(R.drawable.image8ep).into(image8ep);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            teksep6.setText(Html.fromHtml(getString(R.string.teksep6), Html.FROM_HTML_MODE_COMPACT));
            teksep9.setText(Html.fromHtml(getString(R.string.teksep9), Html.FROM_HTML_MODE_COMPACT));
        }else {
            teksep6.setText(Html.fromHtml(getString(R.string.teksep6)));
            teksep9.setText(Html.fromHtml(getString(R.string.teksep9)));
        }
    }
}

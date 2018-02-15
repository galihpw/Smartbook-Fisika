package com.galihpw.smartbookfisika.HukumColoumb;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.galihpw.smartbookfisika.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HukumColoumb extends AppCompatActivity {

    @BindView(R.id.tekshc1)
    TextView tekshc1;

    @BindView(R.id.imghc1)
    ImageView imghc1;

    @BindView(R.id.imghc10)
    ImageView imghc10;

    @BindView(R.id.imghc11)
    ImageView imghc11;

    @BindView(R.id.imghc12)
    ImageView imghc12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hukum_coloumb);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ButterKnife.bind(this);
        Glide.with(this).load(R.drawable.imghc1).into(imghc1);
        Glide.with(this).load(R.drawable.imghc10).into(imghc10);
        Glide.with(this).load(R.drawable.imghc11).into(imghc11);
        Glide.with(this).load(R.drawable.imghc12).into(imghc12);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/Neat_Chalk.ttf");
        tekshc1.setTypeface(custom_font);
    }
}

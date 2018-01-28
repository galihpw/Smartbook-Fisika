package com.galihpw.smartbookfisika;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by GalihPW on 28/01/2018.
 */

public class MenuLatihan extends AppCompatActivity {
    @BindView(R.id.latihanPGImage)
    ImageView imageLatihanPG;

    @BindView(R.id.latihanPG)
    RelativeLayout latihanPG;

    @BindView(R.id.latihanFotoImage)
    ImageView imageLatihanFoto;

    @BindView(R.id.latihanFoto)
    RelativeLayout latihanFoto;

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.latihan);
        actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ButterKnife.bind(this);

        Glide.with(this).load(R.drawable.latihan_soal).into(imageLatihanPG);
        Glide.with(this).load(R.drawable.latihan_soal).into(imageLatihanFoto);

        latihanPG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuLatihan.this,LatihanPGActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        latihanFoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuLatihan.this, LatihanFotoActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
}

package com.galihpw.smartbookfisika;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.galihpw.smartbookfisika.EnergiPotensial.EnergiPotensial;
import com.galihpw.smartbookfisika.HukumColoumb.HukumColoumb;
import com.galihpw.smartbookfisika.Kapasitor.Kapasitor;
import com.galihpw.smartbookfisika.MateriListrik.Materi1;
import com.galihpw.smartbookfisika.MedanListrik.MedanListrik;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MenuMateri extends AppCompatActivity {
    @BindView(R.id.materi1Image)
    ImageView imageMateri1;

    @BindView(R.id.materi1)
    RelativeLayout materi1;

    @BindView(R.id.materi2Image)
    ImageView imageMateri2;

    @BindView(R.id.materi2)
    RelativeLayout materi2;

    @BindView(R.id.materi3Image)
    ImageView imageMateri3;

    @BindView(R.id.materi3)
    RelativeLayout materi3;

    @BindView(R.id.materi4Image)
    ImageView imageMateri4;

    @BindView(R.id.materi4)
    RelativeLayout materi4;

    @BindView(R.id.materi5Image)
    ImageView imageMateri5;

    @BindView(R.id.materi5)
    RelativeLayout materi5;

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_materi);
        //actionBar = getSupportActionBar();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ButterKnife.bind(this);
        Glide.with(this).load(R.drawable.bgmateri1).into(imageMateri1);
        Glide.with(this).load(R.drawable.bgmateri2).into(imageMateri2);
        Glide.with(this).load(R.drawable.bgmateri3).into(imageMateri3);
        Glide.with(this).load(R.drawable.bgmateri4).into(imageMateri4);
        Glide.with(this).load(R.drawable.bgmateri5).into(imageMateri5);

        materi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuMateri.this,Materi1.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
        materi2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuMateri.this,HukumColoumb.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
        materi3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuMateri.this,MedanListrik.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
        materi4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuMateri.this,EnergiPotensial.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
        materi5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuMateri.this,Kapasitor.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });
    }
   @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_righ);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}

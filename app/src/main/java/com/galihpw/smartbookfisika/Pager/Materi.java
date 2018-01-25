package com.galihpw.smartbookfisika.Pager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.galihpw.smartbookfisika.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by GalihPW on 25/01/2018.
 */
public class Materi extends Fragment {

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.kompetensiDasarImage)
    ImageView imageDasar;

    @BindView(R.id.kompetensiDasar)
    RelativeLayout kompetensiDasar;

    @BindView(R.id.petaKonsepImage)
    ImageView imageKonsep;

    @BindView(R.id.petaKonsep)
    RelativeLayout petaKonsep;

    @BindView(R.id.materiListrikStatisImage)
    ImageView imageMateri;

    @BindView(R.id.materiListrikStatis)
    RelativeLayout materiListrikStatis;

    @BindView(R.id.latihanSoalImage)
    ImageView imageSoal;

    @BindView(R.id.latihanSoal)
    RelativeLayout latihanSoal;

    @BindView(R.id.tentangImage)
    ImageView imageTentang;

    @BindView(R.id.tentang)
    RelativeLayout tentang;

    public View v;

    @Override
    public void onResume(){
        super.onResume();
    }

    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.materi, container, false);

        ButterKnife.bind(getActivity());

        Glide.with(this).load(R.drawable.latihan_soal).into(imageDasar);
        Glide.with(this).load(R.drawable.latihan_soal).into(imageKonsep);
        Glide.with(this).load(R.drawable.latihan_soal).into(imageMateri);
        Glide.with(this).load(R.drawable.latihan_soal).into(imageSoal);
        Glide.with(this).load(R.drawable.latihan_soal).into(imageTentang);

        /*latihanSoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,LatihanPGActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });*/

        materiListrikStatis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getActivity(),SubMenuMateri.class);
                //startActivity(intent);
                //overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        return v;
        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
//        return inflater.inflate(R.layout.Home, container, false);
    }

}

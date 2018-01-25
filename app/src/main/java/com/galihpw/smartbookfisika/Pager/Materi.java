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

    public View v;

    @Override
    public void onResume(){
        super.onResume();
    }

    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.materi, container, false);

        ButterKnife.bind(this, v);

        Glide.with(getActivity()).load(R.drawable.latihan_soal).into(imageMateri1);
        Glide.with(getActivity()).load(R.drawable.latihan_soal).into(imageMateri2);
        Glide.with(getActivity()).load(R.drawable.latihan_soal).into(imageMateri3);
        Glide.with(getActivity()).load(R.drawable.latihan_soal).into(imageMateri4);

        /*latihanSoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,LatihanPGActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });*/

       /* materiListrikStatis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Intent intent = new Intent(getActivity(),SubMenuMateri.class);
                //startActivity(intent);
                //overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });*/

        return v;
        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
//        return inflater.inflate(R.layout.Home, container, false);
    }

}

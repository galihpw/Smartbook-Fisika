package com.galihpw.smartbookfisika.Pager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import com.bumptech.glide.Glide;
import com.galihpw.smartbookfisika.LatihanPGActivity;
import com.galihpw.smartbookfisika.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by GalihPW on 25/01/2018.
 */

public class Latihan extends Fragment {

    @BindView(R.id.latihanPGImage)
    ImageView imageLatihanPG;

    @BindView(R.id.latihanPG)
    RelativeLayout latihanPG;

    @BindView(R.id.latihanFotoImage)
    ImageView imageLatihanFoto;

    @BindView(R.id.latihanFoto)
    RelativeLayout latihanFoto;

    public View v;

    @Override
    public void onResume(){
        super.onResume();
    }

    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.latihan, container, false);

        ButterKnife.bind(this, v);

        Glide.with(getActivity()).load(R.drawable.latihan_soal).into(imageLatihanPG);
        Glide.with(getActivity()).load(R.drawable.latihan_soal).into(imageLatihanFoto);

        latihanPG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),LatihanPGActivity.class);
                startActivity(intent);
                getActivity().overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

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

package com.galihpw.smartbookfisika.LatihanFoto2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.bumptech.glide.Glide;
import com.galihpw.smartbookfisika.Config.Config;
import com.galihpw.smartbookfisika.MateriListrik.YoutubeActivity;
import com.galihpw.smartbookfisika.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by GalihPW on 24/04/2017.
 */

public class Foto2ContohSoal extends Fragment {

    private RadioGroup rG;
    private RadioButton rB;
    private Button bSelesai;
    int status = 0;

    @BindView(R.id.jawab2contohsoal1)
    ImageView jawab2contohsoal1;

    @BindView(R.id.jawab2contohsoal2)
    ImageView jawab2contohsoal2;

    @BindView(R.id.jawab2contohsoal3)
    ImageView jawab2contohsoal3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.foto2_contohsoal, container, false);

        bSelesai = (Button) getActivity().findViewById(R.id.bSelesai);

        ButterKnife.bind(this,rootView);
        Glide.with(this).load(R.drawable.jawab2cs1).into(jawab2contohsoal1);
        Glide.with(this).load(R.drawable.jawab2cs2).into(jawab2contohsoal2);
        Glide.with(this).load(R.drawable.jawab2cs3).into(jawab2contohsoal3);

        return rootView;
    }
}

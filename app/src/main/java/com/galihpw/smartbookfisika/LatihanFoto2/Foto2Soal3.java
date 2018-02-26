package com.galihpw.smartbookfisika.LatihanFoto2;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.galihpw.smartbookfisika.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by GalihPW on 24/04/2017.
 */

public class Foto2Soal3 extends Fragment {

    private RadioGroup rG;
    private RadioButton rB;
    private Button bSelesai;
    int status = 0;

    @BindView(R.id.jawab2soal31)
    ImageView jawab2soal31;

    @BindView(R.id.jawab2soal32)
    ImageView jawab2soal32;

    @BindView(R.id.jawab2soal33)
    ImageView jawab2soal33;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.foto2_soal3, container, false);

        bSelesai = (Button) getActivity().findViewById(R.id.bSelesai);

        ButterKnife.bind(this,rootView);
        //Glide.with(this).load(R.drawable.jawab2cs1).into(jawab2contohsoal1);
        //Glide.with(this).load(R.drawable.jawab2cs2).into(jawab2contohsoal2);
        //Glide.with(this).load(R.drawable.jawab2cs3).into(jawab2contohsoal3);

        return rootView;
    }
}

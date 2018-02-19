package com.galihpw.smartbookfisika.LatihanPG;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.galihpw.smartbookfisika.Config.Config;
import com.galihpw.smartbookfisika.EnergiPotensial.EnergiPotensial;
import com.galihpw.smartbookfisika.MateriListrik.YoutubeActivity;
import com.galihpw.smartbookfisika.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by GalihPW on 24/04/2017.
 */

public class TabSoal21 extends Fragment {

    @BindView(R.id.hintButton)
    FloatingActionButton hintButton;

    private RadioGroup rG;
    private RadioButton rB;
    private Button bSelesai;
    int countHint = 0;
    @BindView(R.id.playvideosoal)
    ImageView playvideosoal21;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab_soal21, container, false);

        ButterKnife.bind(this,rootView);
        Glide.with(this).load("http://img.youtube.com/vi/NsxhbgCrrSQ&t=21s/0.jpg").into(playvideosoal21);
        bSelesai = (Button) getActivity().findViewById(R.id.bSelesai);
        playvideosoal21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), YoutubeActivity.class);
                Config.VIDEO_ID = "NsxhbgCrrSQ&t=21s";
                startActivity(intent);
            }
        });
        rG = (RadioGroup) rootView.findViewById(R.id.rG);

        rG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                //pilih radio button yang ada di radio button group
                int selectedId = rG.getCheckedRadioButtonId();

                // mencari radio button
                rB = (RadioButton) rootView.findViewById(selectedId);

                if(rB.getText().equals("1600 N/C")){
                    Toast.makeText(getActivity(), "Benar", Toast.LENGTH_SHORT).show();
                }else{
                    countHint++;
                    Toast.makeText(getActivity(), "Salah", Toast.LENGTH_SHORT).show();
                    if(countHint <= 3) {
                        hintButton.setVisibility(View.VISIBLE);
                    }
                }
            }
        });

        hintButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog alertDialog = new AlertDialog.Builder(getActivity()).create();
                alertDialog.setTitle("Hint");

                if(countHint == 1) {
                    alertDialog.setMessage("Lihat kembali video tribo electric effect pada bab 1, mengenai sifat kaca ketika digosokkan dengan bulu/sutera.");
                }else if(countHint==2){
                    alertDialog.setMessage("Ketika batang kaca digosok dengan bulu, maka elektron pada batang kaca pindah ke bulu dan batang kaca menjadi bermuatan positif.");
                }else if(countHint==3){
                    alertDialog.setMessage("Ketika batang kaca bermuatan disentuhkan pada hiasan foil yang netral, elektron pada foil pindah ke batang kaca, sehingga foil menjadi bermuatan positif dan akhirnya menolak batang kaca.");
                }
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                hintButton.setVisibility(View.INVISIBLE);
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
        });
        return rootView;
    }
}

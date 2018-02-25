package com.galihpw.smartbookfisika.LatihanFoto;

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

public class FotoContohSoal extends Fragment {

    private RadioGroup rG;
    private RadioButton rB;
    private Button bSelesai;
    int status = 0;

    @BindView(R.id.videocontohsoal)
    ImageView videocontohsoal;

    @BindView(R.id.play_videocontohsoal)
    ImageView play_videocontohsoal;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.foto_contohsoal, container, false);

        bSelesai = (Button) getActivity().findViewById(R.id.bSelesai);

        ButterKnife.bind(this,rootView);
        Glide.with(this).load("http://img.youtube.com/vi/ey88EdZo9hU/0.jpg").into(videocontohsoal);

        play_videocontohsoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), YoutubeActivity.class);
                Config.VIDEO_ID = "ey88EdZo9hU";
                startActivity(intent);
            }
        });

        //rG = (RadioGroup) rootView.findViewById(R.id.rG);

        /*rG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                //pilih radio button yang ada di radio button group
                int selectedId = rG.getCheckedRadioButtonId();

                // mencari radio button
                rB = (RadioButton) rootView.findViewById(selectedId);

                if(rB.getText().equals("a. ya")){
                    Toast.makeText(getActivity(), "Benar", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getActivity(), "Salah", Toast.LENGTH_SHORT).show();
                }
            }
        });*/

        return rootView;
    }
}

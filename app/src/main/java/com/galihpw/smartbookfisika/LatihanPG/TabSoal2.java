package com.galihpw.smartbookfisika.LatihanPG;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.galihpw.smartbookfisika.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Sutrisna Aji on 19/02/2018.
 */

public class TabSoal2 extends Fragment {
    @BindView(R.id.hintButton)
    FloatingActionButton hintButton;

    private RadioGroup rG;
    private RadioButton rB;
    private Button bSelesai;
    int countHint = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab_soal2, container, false);

        ButterKnife.bind(this,rootView);
        bSelesai = (Button) getActivity().findViewById(R.id.bSelesai);
        rG = (RadioGroup) rootView.findViewById(R.id.rG);
        rG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                //pilih radio button yang ada di radio button group
                int selectedId = rG.getCheckedRadioButtonId();

                // mencari radio button
                rB = (RadioButton) rootView.findViewById(selectedId);

                if(rB.getText().equals("Gaya interaksi (F) berbanding terbalik dengan kuadrat jaraknya (r^2).")){
                    Toast.makeText(getActivity(), "Benar", Toast.LENGTH_SHORT).show();
                }else{
                    countHint++;
                    Toast.makeText(getActivity(), "Salah", Toast.LENGTH_SHORT).show();
                    if(countHint <= 1) {
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
                    alertDialog.setMessage("tLihat kembali materi bab 2 Hukum Coulomb");
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
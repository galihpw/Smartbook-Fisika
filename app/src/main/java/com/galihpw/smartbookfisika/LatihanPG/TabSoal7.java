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
 * Created by GalihPW on 24/04/2017.
 */

public class TabSoal7 extends Fragment {

    @BindView(R.id.hintButton)
    FloatingActionButton hintButton;

    private RadioGroup rG;
    private RadioButton rB;
    private Button bSelesai;
    int countHint = 0;
    int status = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.tab_soal7, container, false);

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

                // menandai bila telah diisi
                status += 1;
                if(status == 1){
                    Hasil.isi += 1;
                }

                // mengaktifkan tombol selesai
                if(Hasil.isi == 12){
                    bSelesai.setEnabled(true);
                }

                if(rB.getText().equals("Batang kaca berkurang elektronnya, karena pada saat penggosokan dengan bulu, elektron dari batang kaca berpindah ke bulu.")){
                    Toast.makeText(getActivity(), "Benar", Toast.LENGTH_SHORT).show();
                    Hasil.jwb[0] = 'c';
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
                    alertDialog.setMessage("Lihat kembali video tribo electric effect pada bab 1, mengenai sifat kaca ketika digosokkan dengan bulu/sutera");
                }else if(countHint == 2){
                    alertDialog.setMessage("Elemen dalam atom benda yang mudah berpindah adalah elektron");
                }else{
                    alertDialog.setMessage("Kaca ketika digososokkan dengan bulu, akan bermuatan positif. Sedangkan bulu akan bermuatan negatif");
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

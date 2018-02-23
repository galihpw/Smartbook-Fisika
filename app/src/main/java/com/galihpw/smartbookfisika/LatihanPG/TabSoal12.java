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
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.galihpw.smartbookfisika.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by GalihPW on 24/04/2017.
 */

public class TabSoal12 extends Fragment {

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
        final View rootView = inflater.inflate(R.layout.tab_soal12, container, false);

        ButterKnife.bind(this,rootView);

        bSelesai = (Button) getActivity().findViewById(R.id.bSelesai);

        rG = (RadioGroup) rootView.findViewById(R.id.rG);

        status += 1;
        if(status == 1){
            Hasil.isi += 1;
        }

        // mengaktifkan tombol selesai
        if(Hasil.isi == 12){
            bSelesai.setEnabled(true);
        }

        rG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, @IdRes int i) {
                //pilih radio button yang ada di radio button group
                int selectedId = rG.getCheckedRadioButtonId();

                // mencari radio button
                rB = (RadioButton) rootView.findViewById(selectedId);

                if(rB.getText().equals("C0")){
                    Toast.makeText(getActivity(), "Benar", Toast.LENGTH_SHORT).show();
                    Hasil.jwb[0] = 'c';
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
                final AlertDialog.Builder alertadd = new AlertDialog.Builder(getActivity());
                LayoutInflater factory = LayoutInflater.from(getActivity());
                alertadd.setTitle("Hint");
                view = factory.inflate(R.layout.hintgambar, null);
                alertadd.setView(view);
                ImageView image = (ImageView) view.findViewById(R.id.dialog_imageview);
                if(countHint == 1) {
                    image.setImageResource(R.drawable.soalhint291);
                }
                alertadd.setNeutralButton("Ok", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dlg, int sumthin) {
                        hintButton.setVisibility(View.INVISIBLE);
                        dlg.dismiss();
                    }
                });
                alertadd.show();
            }
        });

        return rootView;
    }
}

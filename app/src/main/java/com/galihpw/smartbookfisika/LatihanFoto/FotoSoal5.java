package com.galihpw.smartbookfisika.LatihanFoto;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.galihpw.smartbookfisika.R;

/**
 * Created by GalihPW on 24/04/2017.
 */

public class FotoSoal5 extends Fragment {

    private RadioGroup rG;
    private RadioButton rB;
    private Button bSelesai;
    int status = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View rootView = inflater.inflate(R.layout.foto_soal5, container, false);

        bSelesai = (Button) getActivity().findViewById(R.id.bSelesai);

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

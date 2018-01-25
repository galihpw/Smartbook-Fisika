package com.galihpw.smartbookfisika.Pager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.galihpw.smartbookfisika.R;

/**
 * Created by GalihPW on 25/01/2018.
 */
public class Materi extends Fragment {

    public View v;

    @Override
    public void onResume(){
        super.onResume();
    }

    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.materi, container, false);


        return v;
        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
//        return inflater.inflate(R.layout.Home, container, false);
    }

}

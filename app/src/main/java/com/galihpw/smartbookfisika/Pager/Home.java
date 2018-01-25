package com.galihpw.smartbookfisika.Pager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.galihpw.smartbookfisika.R;
import com.galihpw.smartbookfisika.slider.FragmentSlider;
import com.galihpw.smartbookfisika.slider.SliderIndicator;
import com.galihpw.smartbookfisika.slider.SliderPagerAdapter;
import com.galihpw.smartbookfisika.slider.SliderView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by GalihPW on 25/01/2018.
 */

public class Home extends Fragment {

    public View v;

    private SliderView sliderView;
    private LinearLayout mLinearLayout;

    @Override
    public void onResume(){
        super.onResume();
    }

    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.home, container, false);

        sliderView = v.findViewById(R.id.sliderView);
        mLinearLayout = v.findViewById(R.id.pagesContainer);
        setupSlider();

        //Intent inte = new Intent(getActivity(), BuatBiodata.class);
        //getActivity().startActivity(inte);

        return v;
        //Returning the layout file after inflating
        //Change R.layout.tab1 in you classes
//        return inflater.inflate(R.layout.Home, container, false);
    }

    private void setupSlider() {
        sliderView.setDurationScroll(800);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(FragmentSlider.newInstance("https://image.tmdb.org/t/p/w250_and_h141_bestv2/zYFQM9G5j9cRsMNMuZAX64nmUMf.jpg"));
        fragments.add(FragmentSlider.newInstance("https://image.tmdb.org/t/p/w250_and_h141_bestv2/rXBB8F6XpHAwci2dihBCcixIHrK.jpg"));
        fragments.add(FragmentSlider.newInstance("https://image.tmdb.org/t/p/w250_and_h141_bestv2/biN2sqExViEh8IYSJrXlNKjpjxx.jpg"));
        fragments.add(FragmentSlider.newInstance("https://image.tmdb.org/t/p/w250_and_h141_bestv2/o9OKe3M06QMLOzTl3l6GStYtnE9.jpg"));

        SliderPagerAdapter mAdapter = new SliderPagerAdapter(getActivity().getSupportFragmentManager(), fragments);
        sliderView.setAdapter(mAdapter);
        SliderIndicator mIndicator = new SliderIndicator(getActivity(), mLinearLayout, sliderView, R.drawable.indicator_circle);
        mIndicator.setPageCount(fragments.size());
        mIndicator.show();
    }


}

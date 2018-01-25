package com.galihpw.smartbookfisika.Pager;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.galihpw.smartbookfisika.Adapter.GridAdapter;
import com.galihpw.smartbookfisika.R;
import com.galihpw.smartbookfisika.Adapter.ViewPagerAdapter;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by GalihPW on 25/01/2018.
 */

public class Home extends Fragment implements View.OnClickListener {
    ViewPager viewPager;
    LinearLayout sliderDotspanel;
    private int dotscount;
    private ImageView[] dots;
    public View v;
    private LinearLayout mLinearLayout;
    RecyclerView mRecyclerView;
    RecyclerView.LayoutManager mLayoutManager;
    RecyclerView.Adapter mAdapter;

    @Override
    public void onResume(){
        super.onResume();
    }

    //Overriden method onCreateView
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        v = inflater.inflate(R.layout.home, container, false);
        viewPager = (ViewPager) v.findViewById(R.id.viewPager);

        mRecyclerView = (RecyclerView) v.findViewById(R.id.recyclerView);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager  = new GridLayoutManager(getActivity(),2);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new GridAdapter();
        mRecyclerView.setAdapter(mAdapter);

        sliderDotspanel = (LinearLayout) v.findViewById(R.id.SliderDots);

        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(v.getContext());

        viewPager.setAdapter(viewPagerAdapter);

        dotscount = viewPagerAdapter.getCount();
        dots = new ImageView[dotscount];

        for(int i = 0; i < dotscount; i++){

            dots[i] = new ImageView(getActivity());
            dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.nonactive_dot));

            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);

            params.setMargins(8, 0, 8, 0);

            sliderDotspanel.addView(dots[i], params);

        }

        dots[0].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.active_dot));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {

                for(int i = 0; i< dotscount; i++){
                    dots[i].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.nonactive_dot));
                }

                dots[position].setImageDrawable(ContextCompat.getDrawable(getActivity().getApplicationContext(), R.drawable.active_dot));

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimerTask(), 2000, 4000);
        return v;
    }

    @Override
    public void onClick(View view) {

    }

    public class MyTimerTask extends TimerTask {

        @Override
        public void run() {

            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {

                    if(viewPager.getCurrentItem() == 0){
                        viewPager.setCurrentItem(1);
                    } else if(viewPager.getCurrentItem() == 1){
                        viewPager.setCurrentItem(2);
                    } else if(viewPager.getCurrentItem()==2){
                        viewPager.setCurrentItem(3);
                    }
                    else if(viewPager.getCurrentItem()==3){
                        viewPager.setCurrentItem(4);
                    }
                    else if(viewPager.getCurrentItem()==4){
                        viewPager.setCurrentItem(5);
                    }
                    else if(viewPager.getCurrentItem()==5){
                        viewPager.setCurrentItem(6);
                    }
                    else if(viewPager.getCurrentItem()==6){
                        viewPager.setCurrentItem(0);
                    }


                }
            });
        }
    }
}

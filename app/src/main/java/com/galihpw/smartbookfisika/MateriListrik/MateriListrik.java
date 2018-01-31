package com.galihpw.smartbookfisika.MateriListrik;

import android.support.v4.app.NavUtils;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;


import com.galihpw.smartbookfisika.R;


public class MateriListrik extends AppCompatActivity implements ViewPager.OnPageChangeListener {

    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 20;

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    ActionBar actionBar;
    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PageAdapterML mPagerAdapter;
    ViewPager mPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_listrik);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Instantiate a ViewPager and a PagerAdapter.
        mPager = (ViewPager) findViewById(R.id.vertical_viewPager);
        mPagerAdapter = new PageAdapterML(getSupportFragmentManager(), NUM_PAGES);
        mPager.setAdapter(mPagerAdapter);
        mPager.addOnPageChangeListener(this);

    }

    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

    }

    @Override
    public void onPageSelected(int position) {

    }

    @Override
    public void onPageScrollStateChanged(int state) {

    }

}

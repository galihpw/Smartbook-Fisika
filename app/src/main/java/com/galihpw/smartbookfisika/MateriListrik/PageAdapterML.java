package com.galihpw.smartbookfisika.MateriListrik;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.galihpw.smartbookfisika.MateriListrik.ML1;
import com.galihpw.smartbookfisika.MateriListrik.ML2;

/**
 * Created by Sutrisna Aji on 30/01/2018.
 */

public class PageAdapterML extends FragmentPagerAdapter {
    int NUM_PAGES;

    public PageAdapterML(FragmentManager fm, int NUM_PAGES) {
        super(fm);
        this.NUM_PAGES=NUM_PAGES;

    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new ML1();
            case 1:
                return new ML2();
            case 2:
                return new ML3();
            case 3:
                return new ML4();
            case 4:
                return new ML5();
            default:
                return new ML1();
        }
    }

    @Override
    public int getCount() {
        return NUM_PAGES;
    }
}

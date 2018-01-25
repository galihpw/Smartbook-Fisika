package com.galihpw.smartbookfisika.Pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by GalihPW on 25/01/2018.
 */

public class Pager extends FragmentStatePagerAdapter {

    //integer to count number of tabs
    int tabCount;

    //Constructor to the class
    public Pager(FragmentManager fm, int tabCount) {
        super(fm);
        //Initializing tab count
        this.tabCount= tabCount;
    }

    //Overriding method getItem
    @Override
    public Fragment getItem(int position) {
        //Returning the current tabs
        switch (position) {
            case 0:
                Home home1 = new Home();
                return home1;
            case 1:
                Materi materi1 = new Materi();
                return materi1;
            case 2:
                Latihan latihan1 = new Latihan();
                return latihan1;
            case 3:
                Tentang tentang1 = new Tentang();
                return tentang1;
            default:
                return null;
        }
    }

    //Overriden method getCount to get the number of tabs
    @Override
    public int getCount() {
        return tabCount;
    }
}
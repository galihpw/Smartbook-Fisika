package com.galihpw.smartbookfisika;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.galihpw.smartbookfisika.LatihanPG.TabSoal1;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal10;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal11;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal12;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal13;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal14;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal15;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal16;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal17;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal18;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal19;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal2;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal20;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal21;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal22;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal23;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal24;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal25;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal26;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal27;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal28;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal29;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal3;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal30;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal4;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal5;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal6;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal7;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal8;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal9;

import butterknife.BindView;
import butterknife.ButterKnife;

public class LatihanPGActivity extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan_pg);

        ButterKnife.bind(this);

        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_righ);
            }
        });

        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_latihan_pg, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            //Returning the current tabs
            switch (position){
                case 0:
                    TabSoal1 soal1 = new TabSoal1();
                    return soal1;
                case 1:
                    TabSoal2 soal2 = new TabSoal2();
                    return soal2;
                case 2:
                    TabSoal3 soal3 = new TabSoal3();
                    return soal3;
                case 3:
                    TabSoal4 soal4 = new TabSoal4();
                    return soal4;
                case 4:
                    TabSoal5 soal5 = new TabSoal5();
                    return soal5;
                case 5:
                    TabSoal6 soal6 = new TabSoal6();
                    return soal6;
                case 6:
                    TabSoal7 soal7 = new TabSoal7();
                    return soal7;
                case 7:
                    TabSoal8 soal8 = new TabSoal8();
                    return soal8;
                case 8:
                    TabSoal9 soal9 = new TabSoal9();
                    return soal9;
                case 9:
                    TabSoal10 soal10 = new TabSoal10();
                    return soal10;
                case 10:
                    TabSoal11 soal11 = new TabSoal11();
                    return soal11;
                case 11:
                    TabSoal12 soal12 = new TabSoal12();
                    return soal12;
                case 12:
                    TabSoal13 soal13 = new TabSoal13();
                    return soal13;
                case 13:
                    TabSoal14 soal14 = new TabSoal14();
                    return soal14;
                case 14:
                    TabSoal15 soal15 = new TabSoal15();
                    return soal15;
                case 15:
                    TabSoal16 soal16 = new TabSoal16();
                    return soal16;
                case 16:
                    TabSoal17 soal17 = new TabSoal17();
                    return soal17;
                case 17:
                    TabSoal18 soal18 = new TabSoal18();
                    return soal18;
                case 18:
                    TabSoal19 soal19 = new TabSoal19();
                    return soal19;
                case 19:
                    TabSoal20 soal20 = new TabSoal20();
                    return soal20;
                case 20:
                    TabSoal21 soal21 = new TabSoal21();
                    return soal21;
                case 21:
                    TabSoal22 soal22 = new TabSoal22();
                    return soal22;
                case 22:
                    TabSoal23 soal23 = new TabSoal23();
                    return soal23;
                case 23:
                    TabSoal24 soal24 = new TabSoal24();
                    return soal24;
                case 24:
                    TabSoal25 soal25 = new TabSoal25();
                    return soal25;
                case 25:
                    TabSoal26 soal26 = new TabSoal26();
                    return soal26;
                case 26:
                    TabSoal27 soal27 = new TabSoal27();
                    return soal27;
                case 27:
                    TabSoal28 soal28 = new TabSoal28();
                    return soal28;
                case 28:
                    TabSoal29 soal29 = new TabSoal29();
                    return soal29;
                case 29:
                    TabSoal30 soal30 = new TabSoal30();
                    return soal30;
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 1;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
            }
            return null;
        }
    }
}

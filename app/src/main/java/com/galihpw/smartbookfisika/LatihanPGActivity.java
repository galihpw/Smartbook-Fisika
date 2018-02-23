package com.galihpw.smartbookfisika;

import android.content.Intent;
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
import android.widget.Button;

import com.galihpw.smartbookfisika.LatihanPG.Hasil;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal1;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal10;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal11;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal3;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal4;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal5;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal7;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal8;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal2;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal9;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal12;
import com.galihpw.smartbookfisika.LatihanPG.TabSoal6;

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

        Button bSelesai = (Button) findViewById(R.id.bSelesai);

        bSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                for(int i = 0; i< Hasil.kunjaw.length; i++){
                    if(Hasil.jwb[i] == Hasil.kunjaw[i]){
                        Hasil.score += 10;
                    }
                }
                Intent intent = new Intent(LatihanPGActivity.this,ScoreActivity.class);
                startActivity(intent);
                finish();
            }
        });

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
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 12;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
                case 3:
                    return "SECTION 4";
                case 4:
                    return "SECTION 5";
                case 5:
                    return "SECTION 6";
                case 6:
                    return "SECTION 7";
                case 7:
                    return "SECTION 8";
                case 8:
                    return "SECTION 9";
                case 9:
                    return "SECTION 10";
                case 10:
                    return "SECTION 11";
                case 11:
                    return "SECTION 12";
                default:
                    return null;
            }
        }
    }
}

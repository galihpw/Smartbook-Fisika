package com.galihpw.smartbookfisika.MateriListrik;

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.galihpw.smartbookfisika.Adapter.VerticalViewPager;
import com.galihpw.smartbookfisika.Config.Config;
import com.galihpw.smartbookfisika.R;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

import butterknife.BindView;
import butterknife.ButterKnife;
import pl.droidsonroids.gif.GifDrawable;
import pl.droidsonroids.gif.GifImageView;

public class MateriListrik extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 5;

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    ActionBar actionBar;
    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private PagerAdapter mPagerAdapter;
    ViewPager mPager;

    @BindView(R.id.imgML1)
    ImageView imgML1;

    @BindView(R.id.imgML2)
    ImageView imgML2;

    @BindView(R.id.imgML3)
    ImageView imgML3;

    @BindView(R.id.imgML4)
    ImageView imgML4;

    @BindView(R.id.imgML5)
    ImageView imgML5;

    @BindView(R.id.imgML6)
    ImageView imgML6;

    @BindView(R.id.imgML7)
    ImageView imgML7;

    @BindView(R.id.mlgif1)
    GifImageView gif1;

    @BindView(R.id.mlgif2)
    GifImageView gif2;

    @BindView(R.id.mlgif3)
    GifImageView gif3;

    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubeView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_materi_listrik);
        //actionBar = getSupportActionBar();

        ButterKnife.bind(this);
        Glide.with(this).load(R.drawable.car_color).into(imgML1);
        Glide.with(this).load(R.drawable.slide7).into(imgML2);
        Glide.with(this).load(R.drawable.benfranklin).into(imgML3);
        Glide.with(this).load(R.drawable.operasi_endoskopi).into(imgML4);
        Glide.with(this).load(R.drawable.jaritangan).into(imgML5);
        Glide.with(this).load(R.drawable.electroscope5).into(imgML6);
        Glide.with(this).load(R.drawable.pengecatan_elektrostatik).into(imgML7);
        // TODO: Masukin video yang lainnya, id videonya ini
        // vid1: VZJblLwL1SI (udah bisa)
        // vid2: ey88EdZo9hU
        // vid3: ViZNgU-Yt-Y
        // vid4: Qov5sMTshZs
        // vid5: B3s23PBAUO8
        // vid6: ELuYLs0BgJ8
        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view1);
        youTubeView.initialize(Config.YOUTUBE_API_KEY, this);

        gif1.setImageResource(R.drawable.img1);
        final GifDrawable gifDrawable1 = (GifDrawable) gif1.getDrawable();
        gifDrawable1.start();

        gif2.setImageResource(R.drawable.img2);
        final GifDrawable gifDrawable2 = (GifDrawable) gif2.getDrawable();
        gifDrawable2.start();

        gif3.setImageResource(R.drawable.img3);
        final GifDrawable gifDrawable3 = (GifDrawable) gif3.getDrawable();
        gifDrawable3.start();

        // Instantiate a ViewPager and a PagerAdapter.
        /*mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new ScreenSlidePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mPager.setPageTransformer(true, new VerticalViewPager(getApplicationContext()));*/
    }

    /*@Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }*/

    @Override
    public void onInitializationSuccess(Provider provider, YouTubePlayer player, boolean wasRestored) {
        if (!wasRestored) {
            player.cueVideo("VZJblLwL1SI"); // Plays https://www.youtube.com/watch?v=fhWaJi1Hsfo
        }
    }

    @Override
    public void onInitializationFailure(Provider provider, YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
        } else {
            String error = String.format(getString(R.string.player_error), errorReason.toString());
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RECOVERY_REQUEST) {
            // Retry initialization if user performed a recovery action
            getYouTubePlayerProvider().initialize(Config.YOUTUBE_API_KEY, this);
        }
    }

    protected Provider getYouTubePlayerProvider() {
        return youTubeView;
    }

    /**
     * A simple pager adapter that represents 5 ScreenSlidePageFragment objects, in
     * sequence.
     */
    /*private class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {
        public ScreenSlidePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return new ML1();
                case 1:
                    return new ML1();
                default:
                    return new ML1();
            }
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }*/

}

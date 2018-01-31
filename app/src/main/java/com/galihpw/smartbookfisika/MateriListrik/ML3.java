package com.galihpw.smartbookfisika.MateriListrik;

/**
 * Created by Sutrisna Aji on 30/01/2018.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.galihpw.smartbookfisika.R;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerFragment;
import com.google.android.youtube.player.YouTubePlayerSupportFragment;
import com.google.android.youtube.player.YouTubePlayerView;


public class ML3 extends Fragment{

    public static final String DEVELOPER_KEY = "AIzaSyA03c1Ld22nq6gAuVAVmmzUayckGrptKvU";
    YouTubePlayerFragment myYouTubePlayerFragment;
    FragmentActivity mContext;
    private YouTubePlayer YPlayer;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.ml3, container, false);
        YouTubePlayerSupportFragment youTubePlayerFragment = YouTubePlayerSupportFragment.newInstance();
        FragmentTransaction transaction =getChildFragmentManager().beginTransaction();
        transaction.add(R.id.youtube_fragment2, youTubePlayerFragment).commit();
        youTubePlayerFragment.initialize(DEVELOPER_KEY, new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                if (!b) {
                    YPlayer = youTubePlayer;
                    YPlayer.loadVideo("ey88EdZo9hU");
                    Bundle bundle=getActivity().getIntent().getExtras();
                    YPlayer.cueVideo("ey88EdZo9hU");
                    /*YPlayer.play();*/
                }
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        });
        return rootView;
    }
    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mContext = getActivity();
    }

}
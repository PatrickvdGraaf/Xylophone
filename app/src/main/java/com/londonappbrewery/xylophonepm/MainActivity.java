package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.annotation.RawRes;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final static int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final static float LEFT_VOLUME = 1.0f;
    private final static float RIGHT_VOLUME = 1.0f;
    private final static int NO_LOOP = 0;
    private final static int PRIORITY = 0;
    private final static float NORMAL_PLAY_RATE = 1.0f;

    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(NR_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c, PRIORITY);
        mDSoundId = mSoundPool.load(getApplicationContext(), R.raw.note2_d, PRIORITY);
        mESoundId = mSoundPool.load(getApplicationContext(), R.raw.note3_e, PRIORITY);
        mFSoundId = mSoundPool.load(getApplicationContext(), R.raw.note4_f, PRIORITY);
        mGSoundId = mSoundPool.load(getApplicationContext(), R.raw.note5_g, PRIORITY);
        mASoundId = mSoundPool.load(getApplicationContext(), R.raw.note6_a, PRIORITY);
        mBSoundId = mSoundPool.load(getApplicationContext(), R.raw.note7_b, PRIORITY);
    }

    public void playC(View view) {
        playSound(mCSoundId);
    }

    public void playD(View view) {
        playSound(mDSoundId);
    }

    public void playE(View view) {
        playSound(mESoundId);
    }

    public void playF(View view) {
        playSound(mFSoundId);
    }

    public void playG(View view) {
        playSound(mGSoundId);
    }

    public void playA(View view) {
        playSound(mASoundId);
    }

    public void playB(View view) {
        playSound(mBSoundId);
    }

    private void playSound(@RawRes int sound){
        mSoundPool.play(sound, LEFT_VOLUME, RIGHT_VOLUME, PRIORITY, NO_LOOP, NORMAL_PLAY_RATE);
    }

}

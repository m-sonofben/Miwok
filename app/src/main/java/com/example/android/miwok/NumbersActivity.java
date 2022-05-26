package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;


import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    MediaPlayer mMediaPlayer;

    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> numberWords = new ArrayList<Word>();


        numberWords.add(new Word("One", "lutti", R.drawable.number_one, R.raw.number_one));
        numberWords.add(new Word("Two", "otikko", R.drawable.number_two, R.raw.number_two));
        numberWords.add(new Word("Three", "tolookosu", R.drawable.number_three, R.raw.number_three));
        numberWords.add(new Word("Four", "oyyisa", R.drawable.number_four, R.raw.number_four));
        numberWords.add(new Word("Five", "massokka", R.drawable.number_five, R.raw.number_five));
        numberWords.add(new Word("Six", "temmokka", R.drawable.number_six, R.raw.number_six));
        numberWords.add(new Word("Seven", "kenekaku", R.drawable.number_seven, R.raw.number_seven));
        numberWords.add(new Word("Eight", "kainta", R.drawable.number_eight, R.raw.number_eight));
        numberWords.add(new Word("Nine", "wo'e", R.drawable.number_nine, R.raw.number_nine));
        numberWords.add(new Word("Ten", "na'aacha", R.drawable.number_ten, R.raw.number_ten));


        WordAdapter adapter = new WordAdapter(this, numberWords, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word = numberWords.get(position);
                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(NumbersActivity.this, word.getmAudioResourceId());
                mMediaPlayer.start();

                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }

    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
}


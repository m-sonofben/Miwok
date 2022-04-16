package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;


import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Word> numberWords = new ArrayList<Word>();


        numberWords.add(new Word("One", "lutti"));
        numberWords.add(new Word("Two", "otikko"));
        numberWords.add(new Word("Three", "tolookosu"));
        numberWords.add(new Word("Four", "oyyisa"));
        numberWords.add(new Word("Five", "massokka"));
        numberWords.add(new Word("Six", "temmokka"));
        numberWords.add(new Word("Seven", "kenekaku"));
        numberWords.add(new Word("Eight", "kainta"));
        numberWords.add(new Word("Nine", "wo'e"));
        numberWords.add(new Word("Ten", "na'aacha"));


        WordAdapter adapter = new WordAdapter(this, numberWords);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
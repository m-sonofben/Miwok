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


        numberWords.add(new Word("One", "lutti", R.drawable.number_one));
        numberWords.add(new Word("Two", "otikko", R.drawable.number_two));
        numberWords.add(new Word("Three", "tolookosu", R.drawable.number_three));
        numberWords.add(new Word("Four", "oyyisa", R.drawable.number_four));
        numberWords.add(new Word("Five", "massokka", R.drawable.number_five));
        numberWords.add(new Word("Six", "temmokka", R.drawable.number_six));
        numberWords.add(new Word("Seven", "kenekaku", R.drawable.number_seven));
        numberWords.add(new Word("Eight", "kainta", R.drawable.number_eight));
        numberWords.add(new Word("Nine", "wo'e", R.drawable.number_nine));
        numberWords.add(new Word("Ten", "na'aacha", R.drawable.number_ten));


        WordAdapter adapter = new WordAdapter(this, numberWords, R.color.category_numbers);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);


    }
}
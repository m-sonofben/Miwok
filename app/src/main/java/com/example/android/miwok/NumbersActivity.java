package com.example.android.miwok;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);


        String[] english_Numbers = new String[10];

        english_Numbers[0] = "One";
        english_Numbers[1] = "Two";
        english_Numbers[2] = "Three";
        english_Numbers[3] = "Four";
        english_Numbers[4] = "Five";
        english_Numbers[5] = "Six";
        english_Numbers[6] = "Seven";
        english_Numbers[7] = "Eight";
        english_Numbers[8] = "Nine";
        english_Numbers[9] = "Ten";

        Log.v("NumbersActivity", "Word at index 0: " + english_Numbers[0]);
        Log.v("NumbersActivity", "Word at index 1: " + english_Numbers[1]);
        Log.v("NumbersActivity", "Word at index 2: " + english_Numbers[2]);
        Log.v("NumbersActivity", "Word at index 3: " + english_Numbers[3]);
        Log.v("NumbersActivity", "Word at index 4: " + english_Numbers[4]);
        Log.v("NumbersActivity", "Word at index 5: " + english_Numbers[5]);
        Log.v("NumbersActivity", "Word at index 6: " + english_Numbers[6]);
        Log.v("NumbersActivity", "Word at index 7: " + english_Numbers[7]);
        Log.v("NumbersActivity", "Word at index 8: " + english_Numbers[8]);
        Log.v("NumbersActivity", "Word at index 9: " + english_Numbers[9]);
    }
}
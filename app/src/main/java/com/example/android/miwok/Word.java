package com.example.android.miwok;

//@link word represents a vocabulary word that the user wants to learn.
//it contains an english translation and a Miwok translation for that word.

public class Word {

    private String mEnglishTranslation;

    private String mMiwokTranslation;

    public Word(String englishTranslation, String miwokTranslation) {
        mEnglishTranslation = englishTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public String getEnglishTranslation() {
        return mEnglishTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}

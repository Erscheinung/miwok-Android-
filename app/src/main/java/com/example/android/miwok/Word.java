package com.example.android.miwok;

public class Word {

    private String mDefaultTranslation;

    private String mMiwokTranslation;

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        mDefaultTranslation = mDefaultTranslation;
        mMiwokTranslation = mMiwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation () {
        return mMiwokTranslation;
    }
}

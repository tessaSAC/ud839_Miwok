package com.example.android.miwok;

/**
 * Created by me on 8/24/17.
 */

public class Word {

    // Default translation
    private String mDefaultTranslation;
    // Miwok translation
    private String mMiwokTranslation;

    public Word (String defaultTranslation, String MiwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }

    // Return default translation
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    // Return Miwok translation
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}

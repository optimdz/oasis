package com.touggourti.oasis;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by seddik on 17/12/2016.
 */

public class oaApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        String _font = getApplicationFont();
        if (_font == null) {
            CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                    .setDefaultFontPath(_font)
                    .setFontAttrId(R.attr.fontPath)
                    .build()
            );
        }
    }

    public String getApplicationFont() {
        return null;
    }
}


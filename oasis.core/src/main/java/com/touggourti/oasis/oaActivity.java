package com.touggourti.oasis;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

/**
 * Created by seddik on 15/12/2016.
 */

public abstract class oaActivity extends AppCompatActivity {
    public <T> T find(int id) {
        return (T) findViewById(id);
    }

    public void getStringDialog(String defaultValue, String hint, String hexColor, int image, Tools.oaCallBack callback) {
        Tools.getStringDialog(this, defaultValue, hint, hexColor, image, callback);
    }

    @Override
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(context));
    }
}

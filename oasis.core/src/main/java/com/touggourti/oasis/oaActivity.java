package com.touggourti.oasis;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by seddik on 15/12/2016.
 */

public abstract class oaActivity extends AppCompatActivity {
    public <T> T find(int id)
    {
        return (T) findViewById(id);
    }
}

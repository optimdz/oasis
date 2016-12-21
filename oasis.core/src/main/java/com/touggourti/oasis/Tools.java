package com.touggourti.oasis;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by seddik on 14/12/2016.
 */

public class Tools {


    public static void getStringDialog(Activity activity, String defaultValue, String hint, String hexColor
            , int image, final oaCallBack callback) {

        oaDialog dialog = new oaDialog(activity, callback);

        dialog.setImageTitleBar(image);
        dialog.setBackgroundTitleBar(Color.parseColor(hexColor));
        dialog.setHint(hint);
        dialog.setDefaultValue(defaultValue);
        dialog.show();


    }

    public static void setCursorEnd(EditText editText) {
        try {
            editText.setSelection(editText.getText().length());
        }
        catch(Exception ex){

        }
    }


    public interface oaCallBack {
        void returnString(String str);
    }

}

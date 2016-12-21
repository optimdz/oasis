package com.touggourti.oasis;

import android.app.Dialog;
import android.content.Context;
import android.support.design.widget.TextInputLayout;
import android.support.v7.widget.LinearLayoutCompat;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/**
 * Created by geek on 12/20/16.
 */

public class oaDialog extends Dialog {
    private ImageView imageTitle;
    private EditText text;
    private TextInputLayout inputlayout;
    private RelativeLayout relativeLayout;

    public oaDialog(Context context, final oaCallBack callBack) {
        super(context);
        super.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.setContentView(R.layout.custom_dialog);
        DisplayMetrics metrics = context.getResources().getDisplayMetrics();
        int width = metrics.widthPixels;
        super.getWindow().setLayout(width - 10, LinearLayoutCompat.LayoutParams.WRAP_CONTENT);

        relativeLayout = find(R.id.layout_actionbar);
        imageTitle = find(R.id.imagetitle);
        text = find(R.id.contenttext);
        inputlayout = find(R.id.textinputlayout);
        ((Button) find(R.id.button_ok)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                callBack.returnString(text.getText().toString());
                oaDialog.super.dismiss();
            }
        });

    }

    public void setBackgroundTitleBar(int color) {
        relativeLayout.setBackgroundColor(color);
    }

    public void setImageTitleBar(int image) {
        imageTitle.setImageResource(image);
    }

    public void setHint(String hint) {
        inputlayout.setHint(hint);
    }


    public <T> T find(int id) {
        return (T) findViewById(id);
    }

    public interface oaCallBack {
        void returnString(String result);
    }
}
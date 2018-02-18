package com.example.android.orionshoppingmall;

import android.app.Activity;
import android.drm.DrmStore;
import android.os.Bundle;
import android.util.DisplayMetrics;

/**
 * Created by Cansu on 17.02.2018.
 */

public class Pop6 extends Activity {
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popwindow6);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .8), (int) (height * .5));

    }

}

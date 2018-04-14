package com.sharukhhasan.snapsolve;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceView;
import android.widget.Button;
import android.widget.TextView;

import com.sharukhhasan.snapsolve.utils.OrientationUtils;

/**
 * Created by Sharukh Hasan on 4/14/18.
 * Copyright © 2018 Sharukh Hasan. All rights reserved.
 */
public class TextCaptureActivity extends AppCompatActivity {
    private static final String TAG = "TextCaptureActivity";

    // Camera surface view
    private SurfaceView mCameraView;

    // TextView holding captured text
    private TextView mCapturedText;

    // Button confirming use of captured text
    private Button mUseTextBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        OrientationUtils.lockOrientationPortrait(this);
        setContentView(R.layout.activity_text_capture);


    }
}

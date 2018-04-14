package com.sharukhhasan.snapsolve.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sharukhhasan.snapsolve.BuildConfig;
import com.sharukhhasan.snapsolve.R;

/**
 * Created by Sharukh Hasan on 4/14/18.
 * Copyright © 2018 Sharukh Hasan. All rights reserved.
 */
public class ResultsActivity extends AppCompatActivity {
    private static final String TAG = "ResultsActivity";

    private final String api_key = BuildConfig.ApiKey;
    private final String cx = BuildConfig.SearchEngineID;

    private final String URL = "https://www.googleapis.com/customsearch/v1?key=" + api_key + "&cx=" + cx + "&q=";

    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        mRecyclerView = (RecyclerView) findViewById(R.id.rvSearchResults);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void querySearch(String query) {

    }
}

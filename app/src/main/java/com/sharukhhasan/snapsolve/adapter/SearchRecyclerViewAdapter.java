package com.sharukhhasan.snapsolve.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sharukhhasan.snapsolve.R;

/**
 * Created by Sharukh Hasan on 4/14/18.
 * Copyright © 2018 Sharukh Hasan. All rights reserved.
 */
public class SearchRecyclerViewAdapter extends RecyclerView.Adapter<SearchRecyclerViewAdapter.ViewHolder> {



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public final TextView webpageTitle;
        public final TextView webpageUrl;
        public final View view;

        public ViewHolder(View v) {
            super(v);

            view = v;
            webpageTitle = v.findViewById(R.id.webpage_title);
            webpageUrl = v.findViewById(R.id.webpage_url);
        }
    }
}

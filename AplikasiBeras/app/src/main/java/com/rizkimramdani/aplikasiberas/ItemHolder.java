package com.rizkimramdani.aplikasiberas;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ItemHolder extends RecyclerView.ViewHolder {

        public ImageView imgView;
        public ItemHolder(View view) {
            super(view);

            imgView = (ImageView) view.findViewById(R.id.imgView);
        }
    }


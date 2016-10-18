package com.malviya.recycleviewdemo.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.malviya.recycleviewdemo.R;

/**
 * Created by Prafulla on 10/17/2016.
 */

public class MyHolder extends RecyclerView.ViewHolder {
    TextView nametxt;
    ImageView img;

    public MyHolder(View itemView) {
        super(itemView);
        this.nametxt= (TextView)itemView.findViewById(R.id.txt_title);
        this.img =(ImageView)itemView.findViewById(R.id.imageIcon);
    }
}

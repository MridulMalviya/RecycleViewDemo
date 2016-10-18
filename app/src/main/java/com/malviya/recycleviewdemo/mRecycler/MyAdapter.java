package com.malviya.recycleviewdemo.mRecycler;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.malviya.recycleviewdemo.R;
import com.malviya.recycleviewdemo.mDataObject.TVShow;

import java.util.ArrayList;

/**
 * Created by Prafulla on 10/17/2016.
 */

public class MyAdapter extends RecyclerView.Adapter<MyHolder> {

   private  ArrayList<TVShow> tvShows;

    public MyAdapter(ArrayList<TVShow> tvShows) {
        this.tvShows = tvShows;
    }


    @Override
    public MyHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.data_row,parent,false);
        MyHolder holder= new MyHolder(v);
     //   Log.d("Check_CreateViewHolder","");
        return holder;
    }

    @Override
    public void onBindViewHolder(MyHolder holder, int position) {
        holder.nametxt.setText(tvShows.get(position).getName());
        holder.img.setImageResource(tvShows.get(position).getImg());
        Log.d("CHECK_onBindViewHolder",""+position);
    }

    @Override
    public int getItemCount() {
        return tvShows.size();
    }
    //Dismiss
    public void dismissTVShow(int position)
    {
        tvShows.remove(position);
        this.notifyItemRemoved(position);
    }
}

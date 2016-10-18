package com.malviya.recycleviewdemo.mSwiper;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.malviya.recycleviewdemo.mRecycler.MyAdapter;

/**
 * Created by Prafulla on 10/17/2016.
 */

public class SwipeHelper extends ItemTouchHelper.SimpleCallback {
    MyAdapter myAdapter;

    public SwipeHelper(MyAdapter adapter) {
        super(ItemTouchHelper.UP|ItemTouchHelper.DOWN,ItemTouchHelper.LEFT|ItemTouchHelper.RIGHT);
        this.myAdapter = adapter;
    }

    @Override
    public boolean onMove(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder target) {
        return false;
    }

    @Override
    public void onSwiped(RecyclerView.ViewHolder viewHolder, int direction) {
        myAdapter.dismissTVShow(viewHolder.getAdapterPosition());

    }
}

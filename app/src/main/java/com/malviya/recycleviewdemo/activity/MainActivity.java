package com.malviya.recycleviewdemo.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.helper.ItemTouchHelper;

import com.malviya.recycleviewdemo.R;
import com.malviya.recycleviewdemo.mDataObject.TVShow;
import com.malviya.recycleviewdemo.mDataObject.TVShowsCollections;
import com.malviya.recycleviewdemo.mRecycler.MyAdapter;
import com.malviya.recycleviewdemo.mSwiper.SwipeHelper;

import java.util.ArrayList;

/**
 * Created by Prafulla on 10/17/2016.
 */

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter mMyadpter;
    ArrayList<TVShow> mTVShow;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler_view_adpter);
        //Recycler
        recyclerView= (RecyclerView)findViewById(R.id.recycler_container);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        //Data
        mTVShow= TVShowsCollections.getTVShow();
        //Adapter
        mMyadpter=new MyAdapter(mTVShow);
        recyclerView.setAdapter(mMyadpter);
        ItemTouchHelper.Callback callback=new SwipeHelper(mMyadpter);
        ItemTouchHelper helper = new ItemTouchHelper(callback);
        helper.attachToRecyclerView(recyclerView);

    }
}

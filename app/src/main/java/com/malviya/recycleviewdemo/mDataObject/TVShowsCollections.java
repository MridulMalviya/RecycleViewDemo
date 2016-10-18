package com.malviya.recycleviewdemo.mDataObject;

import com.malviya.recycleviewdemo.R;

import java.util.ArrayList;

/**
 * Created by Prafulla on 10/17/2016.
 */

public class TVShowsCollections {

    public static ArrayList<TVShow> getTVShow()
    {
        ArrayList<TVShow> tvShows = new ArrayList<>();
        TVShow tv =new TVShow("Test1", R.mipmap.ic_launcher);
        tvShows.add(tv);
        tv=new TVShow("test2",R.mipmap.ic_launcher);
        tvShows.add(tv);
        tv=new TVShow("test3",R.mipmap.ic_launcher);
        tvShows.add(tv);
        tv=new TVShow("test4",R.mipmap.ic_launcher);
        tvShows.add(tv);
        tv=new TVShow("test52",R.mipmap.ic_launcher);
        tvShows.add(tv);
        tv=new TVShow("test6",R.mipmap.ic_launcher);
        tvShows.add(tv);
        tv=new TVShow("test7",R.mipmap.ic_launcher);
        tvShows.add(tv);
        tv=new TVShow("test8",R.mipmap.ic_launcher);
        tvShows.add(tv);
        tv=new TVShow("test9",R.mipmap.ic_launcher);
        tvShows.add(tv);
        tv=new TVShow("test10",R.mipmap.ic_launcher);
        tvShows.add(tv);

        return tvShows;
    }


}

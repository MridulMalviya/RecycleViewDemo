package com.malviya.recycleviewdemo.mDataObject;

/**
 * Created by Prafulla on 10/17/2016.
 */

public class TVShow {
    private String name;
   private int img;

    TVShow(String name, int img) {
        this.name = name;
        this.img = img;
    }

    public String getName() {
        return name;
    }
    public int getImg() {
        return img;
    }


}

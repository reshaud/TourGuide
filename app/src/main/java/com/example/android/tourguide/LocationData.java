package com.example.android.tourguide;

/**
 * Created by Reshaud Ally on 1/22/2017.
 */

public class LocationData {
    private int img;
    private int title;
    private int descrip;

    public LocationData(){
        img = 0;
        title = 0;
        descrip = 0;
    }

    public LocationData(int img, int title, int descrip) {
        this.img = img;
        this.title = title;
        this.descrip = descrip;
    }

    public int getImg() {
        return img;
    }

    public int getDescrip() {
        return descrip;
    }

    public int getTitle() {
        return title;
    }
}

package com.example.android.tourguide;

/**
 * Created by Reshaud Ally on 1/22/2017.
 */

public class LocationData {
    private int img;
    private String title;
    private String descrip;

    public LocationData(){
        img = 0;
        title = "";
        descrip = "";
    }

    public LocationData(int img, String title, String descrip){
        this.img = img;
        this.title = title;
        this.descrip = descrip;
    }

    public int getImg() {
        return img;
    }

    public String getDescrip() {
        return descrip;
    }

    public String getTitle() {
        return title;
    }
}

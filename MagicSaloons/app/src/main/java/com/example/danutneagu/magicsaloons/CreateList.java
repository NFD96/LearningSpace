package com.example.danutneagu.magicsaloons;

import android.os.Environment;

import java.io.File;

/**
 * Created by Danut Neagu on 10/6/2017.
 */

public class CreateList {

    private String image_title;
    private Integer image_id;
    private String image_Location;


    public String getImage_title() {
        return image_title;
    }

    public void setImage_title(String android_version_name) {
        this.image_title = android_version_name;
    }

    public Integer getImage_id() {
        return image_id;
    }

    public void setImage_id(Integer android_image_url) {
        this.image_id = android_image_url;
    }


    public void setImage_Location(String image_Location) {
        this.image_Location = image_Location;
    }

    public String getImage_Location() {
        return image_Location;
    }


}

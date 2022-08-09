package com.umutakpinar.landmarkbook;

import java.io.Serializable;

public class Landmark implements Serializable {

    public String name;
    public String country;
    public int image;

    public Landmark(String _name, String _country,int _image){
        this.name = _name;
        this.country = _country;
        this.image = _image;
    }
}

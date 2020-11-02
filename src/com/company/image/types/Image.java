package com.company.image.types;

import com.company.Media;

public abstract class Image extends Media {

    public Image(int bytes, String name){
        super(bytes, name);
    }
    public abstract void getInfo();
}

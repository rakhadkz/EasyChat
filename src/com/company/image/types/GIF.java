package com.company.image.types;

public class GIF extends Image{

    public GIF(int bytes, String name) {
        super(bytes, name);
    }

    @Override
    public void getInfo(){
        System.out.println("The image: " + super.getName() + ".gif");
    }
}

package com.company.image.types;

public class Vector extends Image{
    public Vector(int bytes, String name) {
        super(bytes, name);
    }

    @Override
    public void getInfo(){
        System.out.println("The image: " + super.getName() + ".svg");
    }
}

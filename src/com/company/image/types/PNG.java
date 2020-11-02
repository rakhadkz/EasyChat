package com.company.image.types;

public class PNG extends Image {
    public PNG(int bytes, String name) {
        super(bytes, name);
    }

    @Override
    public void getInfo(){
        System.out.println("The image: " + super.getName() + ".png");
    }
}

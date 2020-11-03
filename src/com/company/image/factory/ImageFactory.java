package com.company.image.factory;

import com.company.image.types.*;

public class ImageFactory implements IImage{
    //TODO Factory Method
    @Override
    public Image selectImage(int bytes, String imageName, String imageEx){
        switch (imageEx){
            case "gif":
                return new GIF(bytes, imageName);
            case "jpeg":
                return new JPEG(bytes, imageName);
            case "png":
                return new PNG(bytes,imageName);
            case "svg":
                return new Vector(bytes, imageName);
            default:
                throw new IllegalArgumentException("Error extension. Please choose from: gif, jpeg, png, svg");
        }
    }
}

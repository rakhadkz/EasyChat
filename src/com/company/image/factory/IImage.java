package com.company.image.factory;

import com.company.image.types.Image;

public interface IImage {
    Image selectImage(int bytes, String imageName, String imageEx);
}

package com.eversis.spaceagency.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.awt.*;

@AllArgsConstructor
@Getter
public enum ImageryType {   // TODO nie da się lepszego enuma stworzyć?

    PANCHROMATIC(1),
    MULTISPECTRAL(2),
    HYPERSPECTRAL(3);

    Integer imgType;

    public static ImageryType getImageryType(Integer imgType) {
        for (ImageryType imageryType : ImageryType.values()) {
            if(imageryType.imgType.equals(imgType))
                return imageryType;
        }
        return null;
    }
}
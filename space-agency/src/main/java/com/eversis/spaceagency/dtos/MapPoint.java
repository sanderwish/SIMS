package com.eversis.spaceagency.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MapPoint {
    private Point2D.Double point2D;
    private double latitude;
    private double longitude;

//    MapPoint(double latitude, double longitude) {
//        this.latitude = latitude;
//        this.longitude = longitude;
//        this.point2D = new Point2D.Double(latitude, longitude);
//    }


}

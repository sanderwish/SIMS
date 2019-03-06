package com.eversis.spaceagency.converters;

import com.eversis.spaceagency.dtos.MapPoint;
import com.eversis.spaceagency.dtos.ProductDto;
import com.eversis.spaceagency.entities.Footprint;
import com.eversis.spaceagency.entities.Product;
import com.eversis.spaceagency.repositories.MissionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Component
public class ProductConverter {

    private final MissionRepository missionRepository;

    public Product create(final ProductDto productDto) {
        return Product.builder()
                .mission(missionRepository.findByName(productDto.getMission()))
                .date(productDto.getDate())
                .footprints(productDto.getFootprint())
                .price(productDto.getPrice())
                .build();
    }
    public ProductDto create(final Product product) {
        return ProductDto.builder()
                .mission(product.getMission().getName())
                .date(product.getDate())
                .footprint(product.getFootprints())
                .price(product.getPrice())
                .build();
    }



//        int numberOfPoints = 4;
//        double[] xArray = new double[numberOfPoints];
//        double[] yArray = new double[numberOfPoints];
//        for (int i = 0; i<=xArray.length; i++) {
//            xArray[i] = points.get(i).getLatitude();
//            yArray[i] = points.get(i).getLongitude();
//        }
//        return new Path2D.Double(xArray, yArray, numberOfPoints);
//    }

    // TODO to się może przydać, lepiej zostaw :D
//    public List<MapPoint> toFootprint(Path2D path) {
//        List<MapPoint> mapPoints = new ArrayList<>();
//        Point2D p = path.getCurrentPoint();
//                // Polygon miałby metodę getVertices() ... może jednak Poly?
//    }

}

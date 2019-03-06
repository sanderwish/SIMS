package com.eversis.spaceagency.services;

import com.eversis.spaceagency.converters.ProductConverter;
import com.eversis.spaceagency.dtos.MapPoint;
import com.eversis.spaceagency.dtos.ProductDto;
import com.eversis.spaceagency.entities.Product;
import com.eversis.spaceagency.repositories.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.awt.*;
import java.awt.geom.Path2D;
import java.awt.geom.Point2D;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ProductConverter productConverter;

    public void addProduct(ProductDto productDto) {
        productRepository.save(productConverter.create(productDto));
    }

    public void deleteProduct(Integer id) {
        productRepository.deleteById(id);
    }

    
    
    private Path2D pointsToPath(List<Point2D> points) {
        Path2D path = new Path2D.Double();
        path.moveTo(points.get(0).getX(), points.get(0).getY());
        points.forEach(mp -> path.lineTo(mp.getX(), mp.getY()));
        path.closePath();
        return path;
    }
    private boolean isPointInArea(Path2D path, Point2D point) {
        return path.contains(point);
    }



//    public Optional<Product> findAllContainingPoint(Point2D point) {
//        List<Product> optionalProduct = productRepository.findAll();
//        optionalProduct.stream()
//                .
//
//
//        return new Optional<>();
//    }


//    public Path2D toFootprint(List<Point2D> points) {
//        Path2D path = new Path2D.Double();
//        path.moveTo(points.get(0).getX(), points.get(0).getY());
//        points.forEach(mp -> path.lineTo(mp.getX(), mp.getY()));
//        path.closePath();
//        Point2D p = new Point2D.Double();
//        System.out.println(path.getBounds().x);
//        System.out.println(path.getBounds().y);
//
//        return path;
//    }

}

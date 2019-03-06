package com.eversis.spaceagency.controllers;

import com.eversis.spaceagency.dtos.ProductDto;
import com.eversis.spaceagency.entities.Product;
import com.eversis.spaceagency.services.ProductService;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.geom.Point2D;
import java.util.Optional;

@RequestMapping("/products")
@CrossOrigin
@AllArgsConstructor
@RestController
public class ProductController {

    private final ProductService productService;

    @PostMapping("/add")
    public void addProduct(@RequestBody ProductDto productDto){
        productService.addProduct(productDto);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Integer id) {
        productService.deleteProduct(id);
    }

//    @PostMapping("/search")
//    public Optional<Product> searchAllProductsContainingPoint(@RequestBody Point2D point) {
//        return productService.findAllContainingPoint(point);
//    }

//    private void sdfad(){
//        SecurityContextHolder.
//    }
}

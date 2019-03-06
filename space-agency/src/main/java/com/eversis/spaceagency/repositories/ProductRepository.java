package com.eversis.spaceagency.repositories;

import com.eversis.spaceagency.entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    List<Product> findAllByMission_Name(String name);

    List<Product> findAllByMission_ImgType(String impType);

    List<Product> findAllByDateBefore(Date date);

    List<Product> findAllByDateAfter(Date date);

    List<Product> findAllByDateBetween(Date dateStart, Date dateFinish);

    List<Product> findAll();

}
/*
    Dodac tabelę Orders, w której będą trzymane wszystkie zamówienia.
    Pola Order :
    Integer id;
    Integer userId;
    List<Product> listOfProducts;

 */

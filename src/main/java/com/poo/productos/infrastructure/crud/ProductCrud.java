package com.poo.productos.infrastructure.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.poo.productos.infrastructure.entities.Product;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductCrud extends CrudRepository<Product, Integer> {
    List<Product> findAll();
    Optional<Product> findById(Integer id);
    Product save(Product product);
    void deleteById(Integer id);
}

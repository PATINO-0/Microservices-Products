package com.poo.productos.infrastructure.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.poo.productos.infrastructure.entities.Product;

import java.util.List;

@Repository
public interface ProductCrud extends CrudRepository<Product, Long> {
    List<Product> findAll();
}

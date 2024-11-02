package com.poo.productos.infrastructure.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.poo.productos.infrastructure.entities.Category;

import java.util.List;

@Repository
public interface CategoryCrud extends CrudRepository<Category, Long> {
    List<Category> findAll();
}

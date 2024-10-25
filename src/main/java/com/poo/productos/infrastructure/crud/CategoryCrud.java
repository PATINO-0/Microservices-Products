package com.poo.productos.infrastructure.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.poo.productos.infrastructure.entities.Category;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryCrud extends CrudRepository<Category, Integer> {
    List<Category> findAll();
    Optional<Category> findById(Integer id);
    Category save(Category category);
    void deleteById(Integer id);
}
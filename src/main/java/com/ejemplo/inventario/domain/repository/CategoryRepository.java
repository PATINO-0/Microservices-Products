package com.ejemplo.productos.domain.repository;

import com.ejemplo.productos.domain.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    // Buscar categoría por su ID
    Optional<Category> findByCategoryId(Long categoryId);
    
    // Buscar categoría por nombre
    Optional<Category> findByName(String name);
}

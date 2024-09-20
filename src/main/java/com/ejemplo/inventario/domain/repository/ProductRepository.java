package com.ejemplo.productos.domain.repository;

import com.ejemplo.productos.domain.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // Buscar producto por su ID
    Optional<Product> findByProductId(Long productId);
}

package com.poo.productos.domain.Repositories;

import com.poo.productos.domain.dto.ProductDTO;
import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<ProductDTO> getAll();
    Optional<ProductDTO> getById(Long id);
    ProductDTO save(ProductDTO product);
    void delete(Long id);
}

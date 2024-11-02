package com.poo.productos.domain.Repositories;

import com.poo.productos.domain.dto.CategoryDTO;
import java.util.List;
import java.util.Optional;

public interface CategoryRepository {
    List<CategoryDTO> getAll();
    Optional<CategoryDTO> getById(Long id);
    CategoryDTO save(CategoryDTO category);
    void delete(Long id);
}

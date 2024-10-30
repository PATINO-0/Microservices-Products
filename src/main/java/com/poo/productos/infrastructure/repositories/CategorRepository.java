package com.poo.productos.infrastructure.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.poo.productos.domain.Repositories.CategoryRepository;
import com.poo.productos.domain.dto.CategoryDTO;
import com.poo.productos.infrastructure.crud.CategoryCrud;
import com.poo.productos.infrastructure.entities.Category;
import com.poo.productos.infrastructure.mapper.CategoryMapper;

@Repository
public class CategorRepository implements CategoryRepository {
    @Autowired
    private CategoryCrud crud;

    @Autowired
    private CategoryMapper mapper;

    @Override
    public List<CategoryDTO> getAll() {
        List<Category> categories = (List<Category>) crud.findAll();
        return mapper.toCategoryDTO(categories);
    }

    @Override
    public Optional<CategoryDTO> getById(long idcategory) {
        return crud.findById((int) idcategory) // Convierte el ID a entero para cumplir con la firma del método
                .map(category -> mapper.toCategoryDTO(category)); // Mapea la entidad a DTO si se encuentra
    }

    @Override
    public CategoryDTO save(CategoryDTO categoryDTO) {
        Category category = mapper.toCategory(categoryDTO); // Mapea el DTO a entidad
        return mapper.toCategoryDTO(crud.save(category)); // Guarda la entidad y mapea de nuevo a DTO
    }

    @Override
    public void delete(long idcategory) {
        crud.deleteById((int) idcategory); // Convierte el ID a entero y elimina la categoría
    }
}
package com.poo.productos.infrastructure.repositories;

import com.poo.productos.domain.dto.CategoryDTO;
import com.poo.productos.domain.Repositories.CategoryRepository;
import com.poo.productos.infrastructure.crud.CategoryCrud;
import com.poo.productos.infrastructure.entities.Category;
import com.poo.productos.infrastructure.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

    private final CategoryCrud crud;
    private final CategoryMapper mapper;

    @Autowired
    public CategoryRepositoryImpl(CategoryCrud crud, CategoryMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }

    @Override
    public List<CategoryDTO> getAll() {
        List<Category> categories = crud.findAll();
        return mapper.toCategoryDTOList(categories);
    }

    @Override
    public Optional<CategoryDTO> getById(Long id) {
        return crud.findById(id).map(mapper::toCategoryDTO);
    }

    @Override
    public CategoryDTO save(CategoryDTO categoryDTO) {
        Category category = mapper.toCategory(categoryDTO);
        return mapper.toCategoryDTO(crud.save(category));
    }

    @Override
    public void delete(Long id) {
        crud.deleteById(id);
    }
}

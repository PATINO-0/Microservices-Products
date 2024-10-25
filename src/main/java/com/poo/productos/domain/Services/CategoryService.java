package com.poo.productos.domain.Services;

import com.poo.productos.infrastructure.crud.CategoryCrud;
import com.poo.productos.infrastructure.entities.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryCrud categoryCrud;

    public List<Category> getAll() {
        return (List<Category>) categoryCrud.findAll();
    }

    public Optional<Category> getById(Integer id) {
        return categoryCrud.findById(id);
    }

    public Category save(Category category) {
        return categoryCrud.save(category);
    }

    public Optional<Category> update(Integer id, Category category) {
        return categoryCrud.findById(id).map(existingCategory -> {
            existingCategory.setName(category.getName());
            existingCategory.setDescription(category.getDescription());
            return categoryCrud.save(existingCategory);
        });
    }

    public boolean delete(Integer id) {
        if (categoryCrud.findById(id).isPresent()) {
            categoryCrud.deleteById(id);
            return true;
        }
        return false;
    }
}

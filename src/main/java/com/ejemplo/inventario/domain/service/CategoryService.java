package com.ejemplo.productos.domain.service;

import com.ejemplo.productos.domain.entities.Category;
import com.ejemplo.productos.domain.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepo;

    // Obtener todas las categorías
    public List<Category> getAll() {
        return categoryRepo.findAll();
    }

    // Obtener una categoría por su ID
    public Category getById(Long categoryId) {
        return categoryRepo.findById(categoryId)
                .orElseThrow(() -> new RuntimeException("Categoría no encontrada"));
    }

    // Crear una nueva categoría
    public Category createCategory(Category newCategory) {
        return categoryRepo.save(newCategory);
    }

    // Actualizar una categoría existente
    public Category updateCategory(Long categoryId, Category updatedCategory) {
        Category existingCategory = getById(categoryId);
        existingCategory.setName(updatedCategory.getName());
        existingCategory.setDescription(updatedCategory.getDescription());
        return categoryRepo.save(existingCategory);
    }

    // Eliminar una categoría
    public String deleteCategory(Long categoryId) {
        Category existingCategory = getById(categoryId);
        categoryRepo.delete(existingCategory);
        return "Categoría eliminada";
    }
}

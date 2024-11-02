package com.poo.productos.domain.Services;

import com.poo.productos.domain.dto.CategoryDTO;
import com.poo.productos.domain.Repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryDTO> getAll() {
        return categoryRepository.getAll();
    }

    public CategoryDTO getById(Long id) {
        return categoryRepository.getById(id).orElseThrow(() -> new RuntimeException("Category not found"));
    }

    public CategoryDTO save(CategoryDTO categoryDTO) {
        return categoryRepository.save(categoryDTO);
    }

    public CategoryDTO update(Long id, CategoryDTO categoryDTO) {
        if (categoryRepository.getById(id).isPresent()) {
            categoryDTO.setCategoryId(id);
            return categoryRepository.save(categoryDTO);
        } else {
            throw new RuntimeException("Category not found");
        }
    }

    public void delete(Long id) {
        categoryRepository.delete(id);
    }
}

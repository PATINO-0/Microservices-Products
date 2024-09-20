package com.ejemplo.productos.domain.dto;

public class CategoryDTO {
    private Long categoryId;
    private String name;
    private String description;

    // Constructor vacío
    public CategoryDTO() {
    }

    // Constructor con parámetros
    public CategoryDTO(Long categoryId, String name, String description) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
    }

    // Getters y Setters
    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

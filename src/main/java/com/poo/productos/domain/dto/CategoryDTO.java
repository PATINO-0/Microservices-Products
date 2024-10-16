package com.poo.productos.domain.dto;

import java.util.List;

public class CategoryDTO {
    private Long categoryId;
    private String name;
    private String description;
    private List<ProductDTO> products;  // Lista de productos

    // Constructor vacío
    public CategoryDTO() {}

    // Constructor con parámetros
    public CategoryDTO(Long categoryId, String name, String description, List<ProductDTO> products) {
        this.categoryId = categoryId;
        this.name = name;
        this.description = description;
        this.products = products; // Inicialización de productos
    }

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

    public List<ProductDTO> getProducts() {
        return products;
    }

    public void setProducts(List<ProductDTO> products) {
        this.products = products;
    }
}

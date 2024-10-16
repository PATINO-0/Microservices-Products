package com.poo.productos.domain.dto;

import java.util.List;

public class ProductDTO {
    private Long productId;
    private String name;
    private String description;
    private Double price;
    private CategoryDTO category;
    private List<InventoryDTO> inventories;  // Corregido: usar lista de InventoryDTO

    public ProductDTO() {}

    public ProductDTO(Long productId, String name, Double price, CategoryDTO category, String description, List<InventoryDTO> inventories) {
        this.productId = productId;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        this.inventories = inventories;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public CategoryDTO getCategory() {
        return category;
    }

    public void setCategory(CategoryDTO category) {
        this.category = category;
    }

    public List<InventoryDTO> getInventories() {
        return inventories;
    }

    public void setInventories(List<InventoryDTO> inventories) {
        this.inventories = inventories;
    }
}

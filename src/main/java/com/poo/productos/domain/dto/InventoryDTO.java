package com.poo.productos.domain.dto;

public class InventoryDTO {
    private Long inventoryId;
    private Long productId; // Llave foránea a Product
    private Integer quantity;
    private String location;
    private Integer stock;
    

    // Constructor vacío
    public InventoryDTO() {}

    // Constructor con parámetros
    public InventoryDTO(Long inventoryId, Long productId, Integer quantity, String location, Integer stock) {
        this.inventoryId = inventoryId;
        this.productId = productId;
        this.quantity = quantity;
        this.location = location;
        this.stock = stock;
        
    }
    

    public Long getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Long inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

}

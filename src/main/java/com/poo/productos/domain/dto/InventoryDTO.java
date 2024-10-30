package com.poo.productos.domain.dto;

public class InventoryDTO {
    private Long inventoryId;
    private Long productId; 
    private Integer quantity;
    private String location;
    

    // Constructor vacío
    public InventoryDTO() {}

    // Constructor con parámetros
    public InventoryDTO(Long inventoryId, Long productId, Integer quantity, String location) {
        this.inventoryId = inventoryId;
        this.productId = productId;
        this.quantity = quantity;
        this.location = location;
        
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

}

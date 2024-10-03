package com.poo.productos.infraestructure.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inventoryId")
    private Long inventoryId;

    @Column(name = "productId", nullable = false)
    private Long productId;

    @Column(name = "quantity", nullable = false)
    private Integer quantity;

    @Column(name = "location", nullable = false)
    private Integer location;

    // Constructor vacío
    public Inventory() {
    }

    // Constructor con parámetros
    public Inventory(Long inventoryId, Long productId, Integer quantity, Integer location) {
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

    public Integer getLocation() {
        return location;
    }

    public void setLocation(Integer location) {
        this.location = location;
    }

    

  
}

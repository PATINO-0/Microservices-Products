package com.ejemplo.productos.domain.repository;

import com.ejemplo.productos.domain.entities.Inventory; // Asegúrate de que tienes esta entidad
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    // Buscar inventario por su ID
    Optional<Inventory> findByInventoryId(Long inventoryId);
    
    
}

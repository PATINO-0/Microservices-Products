package com.ejemplo.productos.domain.service;

import com.ejemplo.productos.domain.entities.Inventory; // Asegúrate de que tienes esta entidad
import com.ejemplo.productos.domain.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepo;

    // Obtener todo el inventario
    public List<Inventory> getAll() {
        return inventoryRepo.findAll();
    }

    // Obtener un inventario por su ID
    public Inventory getById(Long inventoryId) {
        return inventoryRepo.findById(inventoryId)
                .orElseThrow(() -> new RuntimeException("Inventario no encontrado"));
    }

    // Crear un nuevo inventario
    public Inventory createInventory(Inventory newInventory) {
        return inventoryRepo.save(newInventory);
    }

    // Actualizar un inventario existente
    public Inventory updateInventory(Long inventoryId, Inventory updatedInventory) {
        Inventory existingInventory = getById(inventoryId);
        // Aquí puedes establecer las propiedades necesarias
        return inventoryRepo.save(existingInventory);
    }

    // Eliminar un inventario
    public String deleteInventory(Long inventoryId) {
        Inventory existingInventory = getById(inventoryId);
        inventoryRepo.delete(existingInventory);
        return "Inventario eliminado";
    }
}

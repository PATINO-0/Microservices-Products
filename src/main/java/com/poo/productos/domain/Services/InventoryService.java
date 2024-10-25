package com.poo.productos.domain.Services;
import com.poo.productos.infrastructure.crud.InventoryCrud;
import com.poo.productos.infrastructure.entities.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {
    @Autowired
    private InventoryCrud inventoryCrud;

    public List<Inventory> getAll() {
        return (List<Inventory>) inventoryCrud.findAll();
    }

    public Optional<Inventory> getById(Integer id) {
        return inventoryCrud.findById(id);
    }

    public Inventory save(Inventory inventory) {
        return inventoryCrud.save(inventory);
    }

    public Optional<Inventory> update(Integer id, Inventory inventory) {
        return inventoryCrud.findById(id).map(existingInventory -> {
            existingInventory.setProduct(inventory.getProduct());
            existingInventory.setQuantity(inventory.getQuantity());
            return inventoryCrud.save(existingInventory);
        });
    }

    public boolean delete(Integer id) {
        if (inventoryCrud.findById(id).isPresent()) {
            inventoryCrud.deleteById(id);
            return true;
        }
        return false;
    }
}
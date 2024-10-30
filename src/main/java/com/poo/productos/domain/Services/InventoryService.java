package com.poo.productos.domain.Services;
import com.poo.productos.domain.Repositories.InventoryRepository;
import com.poo.productos.domain.dto.InventoryDTO;
import com.poo.productos.infrastructure.crud.InventoryCrud;
import com.poo.productos.infrastructure.entities.Inventory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository repo;

    public List<InventoryDTO> getAll() {
        return repo.getAll();
    }

    public Optional<InventoryDTO> getById(Integer id) {
        return repo.getById(id);
    }

    public InventoryDTO save(InventoryDTO inventoryDTO) {
        return repo.save(inventoryDTO);
    }

   /* public Optional<InventoryDTO> update(Integer id, InventoryDTO inventory) {
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

    */
}
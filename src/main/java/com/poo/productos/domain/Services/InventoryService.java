package com.poo.productos.domain.Services;

import com.poo.productos.domain.dto.InventoryDTO;
import com.poo.productos.domain.Repositories.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public List<InventoryDTO> getAll() {
        return inventoryRepository.getAll();
    }

    public InventoryDTO getById(Long id) {
        return inventoryRepository.getById(id).orElseThrow(() -> new RuntimeException("Inventory not found"));
    }

    public InventoryDTO save(InventoryDTO inventoryDTO) {
        return inventoryRepository.save(inventoryDTO);
    }

    public InventoryDTO update(Long id, InventoryDTO inventoryDTO) {
        if (inventoryRepository.getById(id).isPresent()) {
            inventoryDTO.setInventoryId(id);
            return inventoryRepository.save(inventoryDTO);
        } else {
            throw new RuntimeException("Inventory not found");
        }
    }

    public void delete(Long id) {
        inventoryRepository.delete(id);
    }
}

package com.poo.productos.infrastructure.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.poo.productos.infrastructure.crud.InventoryCrud;
import com.poo.productos.infrastructure.mapper.InventoryMapper;
import com.poo.productos.domain.Repositories.InventoryRepository;
import com.poo.productos.domain.dto.InventoryDTO;
import com.poo.productos.infrastructure.entities.Inventory;

public class InventorRepository implements InventoryRepository {
    

    @Autowired
    private InventoryCrud crud;

    @Autowired
    private InventoryMapper mapper;

    @Override
    public List<InventoryDTO> getAll() {
        List<Inventory> inventory=(List<Inventory>)crud.findAll();
        return mapper.toInventoryDTO(inventory);
    }

    @Override
    public Optional<InventoryDTO> getById(long idinventory) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public InventoryDTO save(InventoryDTO inventoryDTO) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void delete(long idinventory) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
}

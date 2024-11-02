package com.poo.productos.infrastructure.repositories;

import com.poo.productos.domain.dto.InventoryDTO;
import com.poo.productos.domain.Repositories.InventoryRepository;
import com.poo.productos.infrastructure.crud.InventoryCrud;
import com.poo.productos.infrastructure.entities.Inventory;
import com.poo.productos.infrastructure.mapper.InventoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class InventoryRepositoryImpl implements InventoryRepository {

    private final InventoryCrud crud;
    private final InventoryMapper mapper;

    @Autowired
    public InventoryRepositoryImpl(InventoryCrud crud, InventoryMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }

    @Override
    public List<InventoryDTO> getAll() {
        List<Inventory> inventories = crud.findAll();
        return mapper.toInventoryDTOList(inventories);
    }

    @Override
    public Optional<InventoryDTO> getById(Long id) {
        return crud.findById(id).map(mapper::toInventoryDTO);
    }

    @Override
    public InventoryDTO save(InventoryDTO inventoryDTO) {
        Inventory inventory = mapper.toInventory(inventoryDTO);
        return mapper.toInventoryDTO(crud.save(inventory));
    }

    @Override
    public void delete(Long id) {
        crud.deleteById(id);
    }
}

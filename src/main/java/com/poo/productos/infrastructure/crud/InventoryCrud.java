package com.poo.productos.infrastructure.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.poo.productos.infrastructure.entities.Inventory;

import java.util.List;

@Repository
public interface InventoryCrud extends CrudRepository<Inventory, Long> {
    List<Inventory> findAll();
}

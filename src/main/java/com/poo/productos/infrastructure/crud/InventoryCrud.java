package com.poo.productos.infrastructure.crud;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.poo.productos.infrastructure.entities.Inventory;

import java.util.List;
import java.util.Optional;

@Repository
public interface InventoryCrud extends CrudRepository<Inventory, Integer> {
    List<Inventory> findAll();
    Optional<Inventory> findById(Integer id);
    Inventory save(Inventory inventory);
    void deleteById(Integer id);
}
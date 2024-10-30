package com.poo.productos.domain.Controllers;

import com.poo.productos.domain.dto.InventoryDTO;
import com.poo.productos.infrastructure.entities.Inventory;
import com.poo.productos.domain.Services.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @GetMapping
    public List<InventoryDTO> getAllInventories() {
        return inventoryService.getAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<InventoryDTO> getInventoryById(@PathVariable("id") Integer id) {
        return inventoryService.getById(id)
                .map(inventory -> new ResponseEntity<>(inventory, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
/*
    @PostMapping
    public ResponseEntity<Inventory> createInventory(@RequestBody InventoryDTO inventory) {
        return new ResponseEntity<>(inventoryService.save(inventory), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<InventoryDTO> updateInventory(@PathVariable("id") Integer id, @RequestBody InventoryDTO inventory) {
        return inventoryService.update(id, inventory)
                .map(updatedInventory -> new ResponseEntity<>(updatedInventory, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteInventory(@PathVariable("id") Integer id) {
        if (inventoryService.delete(id)) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }*/
}
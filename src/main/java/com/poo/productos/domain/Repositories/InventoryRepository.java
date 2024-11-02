package com.poo.productos.domain.Repositories;

import com.poo.productos.domain.dto.InventoryDTO;
import java.util.List;
import java.util.Optional;

public interface InventoryRepository {
    List<InventoryDTO> getAll();
    Optional<InventoryDTO> getById(Long id);
    InventoryDTO save(InventoryDTO inventory);
    void delete(Long id);
}

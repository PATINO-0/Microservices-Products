package com.poo.productos.domain.Repositories;


import com.poo.productos.domain.dto.InventoryDTO;


import java.util.List;
import java.util.Optional;

public interface InventoryRepository {

       List<InventoryDTO> getAll();
       Optional<InventoryDTO> getById(long idinventory);
       InventoryDTO save(InventoryDTO inventoryDTO);
       void delete(long idinventory); 
       
       
       
    
    

}

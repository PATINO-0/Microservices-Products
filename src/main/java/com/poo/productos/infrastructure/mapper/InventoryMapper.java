package com.poo.productos.infrastructure.mapper;

import com.poo.productos.domain.dto.InventoryDTO;
import com.poo.productos.infrastructure.entities.Inventory;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface InventoryMapper {

    @Mapping(source = "products", target = "products")
    InventoryDTO toInventoryDTO(Inventory inventory);

    Inventory toInventory(InventoryDTO inventoryDTO);

    List<InventoryDTO> toInventoryDTOList(List<Inventory> inventories);
}

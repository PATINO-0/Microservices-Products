package com.poo.productos.infrastructure.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;
import com.poo.productos.domain.dto.InventoryDTO;
import com.poo.productos.infrastructure.entities.Inventory;

@Mapper(componentModel = "spring")
public interface InventoryMapper {
    @Mappings({
            @Mapping(source = "inventoryId", target = "inventoryId"),
            @Mapping(source = "productId", target = "productId"),
            @Mapping(source = "quantity", target = "quantity"),
            @Mapping(source = "location", target = "location")

    })
    InventoryDTO tInventoryDTO(Inventory inventory);

    List<InventoryDTO> tInventoryDTO(List<Inventory> inventories);

    @InheritInverseConfiguration
    Inventory tInventory(InventoryDTO inventoryDTO);

    List<Inventory> tInventory(List<InventoryDTO> inventoryes);

}

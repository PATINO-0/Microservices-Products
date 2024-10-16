package com.poo.productos.infrastructure.mapper;

import java.util.List;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.ReportingPolicy;
import com.poo.productos.domain.dto.InventoryDTO;
import com.poo.productos.infrastructure.entities.Inventory;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface InventoryMapper {

    @Mappings({
        @Mapping(source = "inventoryId", target = "inventoryId"),
        @Mapping(source = "product.productId", target = "productId"),  // Mapeo de la llave foránea
        @Mapping(source = "quantity", target = "quantity"),
        @Mapping(source = "location", target = "location")
    })
    InventoryDTO toInventoryDTO(Inventory inventory);

    List<InventoryDTO> toInventoryDTO(List<Inventory> inventories);

    @InheritInverseConfiguration
    Inventory toInventory(InventoryDTO inventoryDTO);

    List<Inventory> toInventory(List<InventoryDTO> inventories);
}

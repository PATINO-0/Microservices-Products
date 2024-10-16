package com.poo.productos.infrastructure.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;
import com.poo.productos.domain.dto.ProductDTO;
import com.poo.productos.infrastructure.entities.Product;

@Mapper(componentModel = "spring", uses = {CategoryMapper.class, InventoryMapper.class})
public interface ProductMapper {

    @Mappings({
        @Mapping(source = "productId", target = "productId"),
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "price", target = "price"),
        @Mapping(source = "category", target = "category"),
        @Mapping(source = "inventories", target = "inventories"),  // Corrección: ahora mapea correctamente la lista de inventarios
        @Mapping(source = "description", target = "description")
    })
    ProductDTO toProductDTO(Product product);

    List<ProductDTO> toProductDTO(List<Product> products);

    @InheritInverseConfiguration
    Product toProduct(ProductDTO productDTO);

    List<Product> toProduct(List<ProductDTO> products);
}

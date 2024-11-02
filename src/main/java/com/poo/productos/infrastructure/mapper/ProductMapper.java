package com.poo.productos.infrastructure.mapper;

import com.poo.productos.domain.dto.ProductDTO;
import com.poo.productos.infrastructure.entities.Product;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    @Mapping(source = "category.categoryId", target = "categoryId")
    @Mapping(source = "inventory.inventoryId", target = "inventoryId")
    ProductDTO toProductDTO(Product product);

    @Mapping(source = "categoryId", target = "category.categoryId")
    @Mapping(source = "inventoryId", target = "inventory.inventoryId")
    Product toProduct(ProductDTO productDTO);

    List<ProductDTO> toProductDTOList(List<Product> products);
}

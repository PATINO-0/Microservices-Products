package com.poo.productos.infraestructure.mapper;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;
import com.poo.productos.domain.dto.ProductDTO;
import com.poo.productos.infraestructure.entities.Product;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "productId", target = "productId"),
            @Mapping(source = "name", target = "name"),
            @Mapping(source = "description", target = "description"),
            @Mapping(source = "price", target = "price"),
            @Mapping(source = "categoryId", target = "categoryId")

    })
    ProductDTO tProductDTO(Product product);

    List<ProductDTO> tProductDTO(List<Product> products);

    @InheritInverseConfiguration
    Product tProduct(ProductDTO productDTO);

    List<Product> tProduct(List<ProductDTO> productos);
}

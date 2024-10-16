package com.poo.productos.infrastructure.mapper;

import java.util.List;

import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import com.poo.productos.domain.dto.CategoryDTO;
import com.poo.productos.infrastructure.entities.Category;

@Mapper(componentModel = "spring", uses = {ProductMapper.class}) // Usar ProductMapper
public interface CategoryMapper {

    @Mappings({
        @Mapping(source = "categoryId", target = "categoryId"),
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "description", target = "description"),
        @Mapping(source = "products", target = "products")  // Mapeo de productos
    })
    CategoryDTO toCategoryDTO(Category category);

    List<CategoryDTO> toCategoryDTO(List<Category> categories);

    @InheritInverseConfiguration
    Category toCategory(CategoryDTO categoryDTO);

    List<Category> toCategory(List<CategoryDTO> categories);
}

package com.poo.productos.infrastructure.mapper;

import com.poo.productos.domain.dto.CategoryDTO;
import com.poo.productos.infrastructure.entities.Category;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import java.util.List;

@Mapper(componentModel = "spring", uses = {ProductMapper.class})
public interface CategoryMapper {

    @Mapping(source = "products", target = "products")
    CategoryDTO toCategoryDTO(Category category);

    Category toCategory(CategoryDTO categoryDTO);

    List<CategoryDTO> toCategoryDTOList(List<Category> categories);
}

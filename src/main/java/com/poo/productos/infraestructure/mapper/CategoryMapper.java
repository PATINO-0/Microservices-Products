package com.poo.productos.infraestructure.mapper;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import java.util.List;
import com.poo.productos.domain.dto.CategoryDTO;
import com.poo.productos.infraestructure.entities.Category;


@Mapper(componentModel = "spring")
public interface CategoryMapper {
    @Mappings({
        @Mapping(source = "categoryId", target = "categoryId"),
        @Mapping(source = "name", target = "name"),
        @Mapping(source = "description", target = "description")

    })
    CategoryDTO tocaCategoryDTO(Category category);
    List<CategoryDTO> tocaCategoryDTO(List <Category> categories);

    @InheritInverseConfiguration
    Category tCategory(CategoryDTO categoryDTO);
    List <Category> tCategory(List <CategoryDTO> categori);



    
}

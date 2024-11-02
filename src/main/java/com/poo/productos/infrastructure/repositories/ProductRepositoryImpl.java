package com.poo.productos.infrastructure.repositories;

import com.poo.productos.domain.dto.ProductDTO;
import com.poo.productos.domain.Repositories.ProductRepository;
import com.poo.productos.infrastructure.crud.ProductCrud;
import com.poo.productos.infrastructure.entities.Product;
import com.poo.productos.infrastructure.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductRepositoryImpl implements ProductRepository {

    private final ProductCrud crud;
    private final ProductMapper mapper;

    @Autowired
    public ProductRepositoryImpl(ProductCrud crud, ProductMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }

    @Override
    public List<ProductDTO> getAll() {
        List<Product> products = crud.findAll();
        return mapper.toProductDTOList(products);
    }

    @Override
    public Optional<ProductDTO> getById(Long id) {
        return crud.findById(id).map(mapper::toProductDTO);
    }

    @Override
    public ProductDTO save(ProductDTO productDTO) {
        Product product = mapper.toProduct(productDTO);
        return mapper.toProductDTO(crud.save(product));
    }

    @Override
    public void delete(Long id) {
        crud.deleteById(id);
    }
}

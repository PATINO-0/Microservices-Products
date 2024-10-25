package com.poo.productos.infrastructure.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.poo.productos.domain.Repositories.ProductRepository;
import com.poo.productos.domain.dto.ProductDTO;
import com.poo.productos.infrastructure.crud.ProductCrud;
import com.poo.productos.infrastructure.entities.Product;
import com.poo.productos.infrastructure.mapper.ProductMapper;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    @Autowired
    private ProductCrud crud;

    @Autowired
    private ProductMapper mapper;

    @Override
    public List<ProductDTO> getAll() {
        List<Product> products = (List<Product>) crud.findAll();
        return mapper.toProductDTO(products);
    }

    @Override
    public Optional<ProductDTO> getById(long idproducto) {
        return crud.findById((int) idproducto) // Convierte el ID a entero para cumplir con la firma del método
                .map(product -> mapper.toProductDTO(product)); // Mapea la entidad a DTO si se encuentra
    }

    @Override
    public ProductDTO save(ProductDTO productDTO) {
        Product product = mapper.toProduct(productDTO); // Mapea el DTO a entidad
        return mapper.toProductDTO(crud.save(product)); // Guarda la entidad y mapea de nuevo a DTO
    }

    @Override
    public void delete(long idproducto) {
        crud.deleteById((int) idproducto); // Convierte el ID a entero y elimina el producto
    }
}
package com.poo.productos.domain.Services;
import com.poo.productos.infrastructure.crud.ProductCrud;
import com.poo.productos.infrastructure.entities.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductCrud productCrud;

    public List<Product> getAll() {
        return (List<Product>) productCrud.findAll();
    }

    public Optional<Product> getById(Integer id) {
        return productCrud.findById(id);
    }

    public Product save(Product product) {
        return productCrud.save(product);
    }

    public Optional<Product> update(Integer id, Product product) {
        return productCrud.findById(id).map(existingProduct -> {
            existingProduct.setName(product.getName());
            existingProduct.setDescription(product.getDescription());
            existingProduct.setPrice(product.getPrice());
            return productCrud.save(existingProduct);
        });
    }

    public boolean delete(Integer id) {
        if (productCrud.findById(id).isPresent()) {
            productCrud.deleteById(id);
            return true;
        }
        return false;
    }
}
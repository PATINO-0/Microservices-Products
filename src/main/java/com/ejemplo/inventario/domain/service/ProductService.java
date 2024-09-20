package com.ejemplo.productos.domain.service;

import com.ejemplo.productos.domain.entities.Product;
import com.ejemplo.productos.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepo;

    // Obtener todos los productos
    public List<Product> getAll() {
        return productRepo.findAll();
    }

    // Obtener un producto por su ID
    public Product getById(Long productId) {
        return productRepo.findById(productId)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado"));
    }

    // Crear un nuevo producto
    public Product createProduct(Product newProduct) {
        return productRepo.save(newProduct);
    }

    // Actualizar un producto existente
    public Product updateProduct(Long productId, Product updatedProduct) {
        Product existingProduct = getById(productId);
        existingProduct.setName(updatedProduct.getName());
        existingProduct.setDescription(updatedProduct.getDescription());
        existingProduct.setPrice(updatedProduct.getPrice());
        existingProduct.setCategoryId(updatedProduct.getCategoryId());
        return productRepo.save(existingProduct);
    }

    // Eliminar un producto
    public String deleteProduct(Long productId) {
        Product existingProduct = getById(productId);
        productRepo.delete(existingProduct);
        return "Producto eliminado";
    }
}

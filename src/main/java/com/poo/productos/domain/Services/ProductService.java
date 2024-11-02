package com.poo.productos.domain.Services;

import com.poo.productos.domain.dto.ProductDTO;
import com.poo.productos.domain.Repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductDTO> getAll() {
        return productRepository.getAll();
    }

    public ProductDTO getById(Long id) {
        return productRepository.getById(id).orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public ProductDTO save(ProductDTO productDTO) {
        return productRepository.save(productDTO);
    }

    public ProductDTO update(Long id, ProductDTO productDTO) {
        if (productRepository.getById(id).isPresent()) {
            productDTO.setProductId(id);
            return productRepository.save(productDTO);
        } else {
            throw new RuntimeException("Product not found");
        }
    }

    public void delete(Long id) {
        productRepository.delete(id);
    }
}

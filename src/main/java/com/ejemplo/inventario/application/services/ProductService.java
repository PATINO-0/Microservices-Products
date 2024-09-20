import com.ejemplo.productos.domain.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepo;

    // Obtener todos los productos, con filtros opcionales (category, priceRange, sortBy)
    public List<Product> getAll(Optional<String> category, Optional<Double[]> priceRange, Optional<String> sortBy) {
        // Aplicar filtros según los parámetros recibidos
        return productRepo.getAllFiltered(category, priceRange, sortBy);
    }

    // Obtener un producto por su ID
    public Optional<Product> getById(long productId) {
        return productRepo.getById(productId);
    }

    // Crear un nuevo producto
    public Product createProduct(Product newProduct) {
        return productRepo.save(newProduct);
    }

    // Actualizar un producto existente
    public Product updateProduct(long productId, Product updatedProduct) {
        if (getById(productId).isPresent()) {
            return productRepo.update(productId, updatedProduct);
        }
        throw new RuntimeException("Producto no encontrado");
    }

    // Eliminar un producto por su ID
    public String deleteProduct(long productId) {
        if (getById(productId).isPresent()) {
            productRepo.delete(productId);
            return "Producto eliminado";
        }
        throw new RuntimeException("Producto no encontrado");
    }
}

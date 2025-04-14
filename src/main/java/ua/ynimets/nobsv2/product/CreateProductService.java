package ua.ynimets.nobsv2.product;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.ynimets.nobsv2.Command;
import ua.ynimets.nobsv2.product.model.Product;
import ua.ynimets.nobsv2.product.model.ProductDTO;
import ua.ynimets.nobsv2.product.services.ProductRepository;

@AllArgsConstructor
@Service
public class CreateProductService implements Command<Product, ProductDTO> {

    private final ProductRepository productRepository;

    @Override
    public ResponseEntity<ProductDTO> execute(Product product) {
        Product savedProduct = productRepository.save(product);
        ProductDTO productDTO = ProductDTO.from(savedProduct);
        return ResponseEntity.status(HttpStatus.CREATED).body(productDTO);
    }
}

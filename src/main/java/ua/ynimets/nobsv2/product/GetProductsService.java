package ua.ynimets.nobsv2.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.ynimets.nobsv2.Query;
import ua.ynimets.nobsv2.product.model.Product;
import ua.ynimets.nobsv2.product.model.ProductDTO;
import ua.ynimets.nobsv2.product.services.ProductRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class GetProductsService implements Query<Void, List<ProductDTO>> {

    private final ProductRepository productRepository;

    @Override
    public ResponseEntity<List<ProductDTO>> execute(Void input) {
        List<Product> products = productRepository.findAll();
        List<ProductDTO> productDTOs = products.stream()
                .map(ProductDTO::from)
                .toList();
        return ResponseEntity.status(HttpStatus.OK).body(productDTOs);
    }
}

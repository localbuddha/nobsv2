package ua.ynimets.nobsv2.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.ynimets.nobsv2.Query;
import ua.ynimets.nobsv2.product.model.Product;
import ua.ynimets.nobsv2.product.services.ProductRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class GetProductService implements Query<Void, List<Product>> {

    private final ProductRepository productRepository;

    @Override
    public ResponseEntity<List<Product>> execute(Void input) {
        List<Product> products = productRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }
}

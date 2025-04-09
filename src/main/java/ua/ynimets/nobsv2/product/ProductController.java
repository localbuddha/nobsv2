package ua.ynimets.nobsv2.product;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.ynimets.nobsv2.product.model.Product;

import java.util.List;

@RestController
public class ProductController {
    private final CreateProductService createProductService;
    private final GetProductService getProductService;
    private final UpdateProductService updateProductService;
    private final DeleteProductService deleteProductService;


    public ProductController(CreateProductService createProductService,
                             GetProductService getProductService,
                             UpdateProductService updateProductService,
                             DeleteProductService deleteProductService) {
        this.createProductService = createProductService;
        this.getProductService = getProductService;
        this.updateProductService = updateProductService;
        this.deleteProductService = deleteProductService;
    }

    @PostMapping
    public ResponseEntity<String> createProduct() {
        return createProductService.execute(null);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProduct() {
        return getProductService.execute(null);
    }

    @PutMapping
    public ResponseEntity<String> updateProduct() {
        return updateProductService.execute(null);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteProduct() {
        return deleteProductService.execute(null);
    }
}

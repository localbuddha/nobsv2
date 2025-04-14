package ua.ynimets.nobsv2.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private Long id;
    private String name;
    private String description;

    public ProductDTO(Product product) {
    }

    public static ProductDTO from(Product product) {
        return new ProductDTO(product.getId(), product.getName(), product.getDescription());
    }
}

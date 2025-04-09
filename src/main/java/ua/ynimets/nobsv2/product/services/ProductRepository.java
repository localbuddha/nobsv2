package ua.ynimets.nobsv2.product.services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.ynimets.nobsv2.product.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}

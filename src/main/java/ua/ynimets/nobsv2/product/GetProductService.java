package ua.ynimets.nobsv2.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import ua.ynimets.nobsv2.Query;

@Service
public class GetProductService implements Query<Void, String> {

    @Override
    public ResponseEntity<String> execute(Void input) {
        return ResponseEntity.status(HttpStatus.OK).body("Product retrieved successfully");
    }
}

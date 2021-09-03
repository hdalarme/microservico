package xyz.helbertt.productcatalog.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import xyz.helbertt.productcatalog.model.Product;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {
}

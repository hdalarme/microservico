package xyz.helbertt.shoppingcart.repository;

import org.springframework.data.repository.CrudRepository;
import xyz.helbertt.shoppingcart.model.Cart;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}

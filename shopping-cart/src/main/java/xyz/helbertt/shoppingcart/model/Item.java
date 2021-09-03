package xyz.helbertt.shoppingcart.model;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("item")
public class Item {

    private Integer product;
    private Integer amount;

    public Integer getProduct() {
        return product;
    }

    public void setProduct(Integer product) {
        this.product = product;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}

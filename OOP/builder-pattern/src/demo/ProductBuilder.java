package demo;

import java.time.LocalDate;

public class ProductBuilder {
    private Product product;

    public ProductBuilder create(){
        product =new Product();
        return this;
    }

    public ProductBuilder addProductId(String productId){
        product.setProductId(productId);
        return this;
    }

    public ProductBuilder addName(String name){
        product.setName(name);
        return this;
    }

    public ProductBuilder addPrice(String price){
        product.setPrice(price);
        return this;
    }
    public ProductBuilder addDescription(String description){
        product.setDescription(description);
        return this;
    }
    public ProductBuilder addLastUpdated(LocalDate lastUpdate){
        product.setLastUpdate(lastUpdate);
        return this;
    }
    public ProductBuilder addQuantity(int quantity){
        product.setQuantity(quantity);
        return this;
    }

    public Product build(){
        return product;
    }
}

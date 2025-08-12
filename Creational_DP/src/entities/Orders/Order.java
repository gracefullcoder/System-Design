package Creational_DP.src.entities.Orders;

import java.util.ArrayList;
import java.util.List;

import Creational_DP.src.entities.Product.Product;

public class Order {
    private List<Product> products;
    private String orderId;

    private Order(OrderBuilder builder){
        this.products = builder.products;
        this.orderId = builder.orderId;
    }

    public static class OrderBuilder {
        private List<Product> products = new ArrayList<>();

        public List<Product> getProducts() {
            return products;
        }
        public void setProducts(List<Product> products) {
            this.products = products;
        }

        public void addProduct(Product p){
            this.products.add(p);
        }

        private String orderId;
        
        public String getOrderId() {
            return orderId;
        }
        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public void build(){
            new Order(this);
        }
    }
}

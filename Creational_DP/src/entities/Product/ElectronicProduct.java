package Creational_DP.src.entities.Product;

public class ElectronicProduct implements Product{
    private int productId;
    private String category;
    private String productName;
    private double price;

    
    public ElectronicProduct(int productId, String category, String productName, double price) {
        this.productId = productId;
        this.category = category;
        this.productName = productName;
        this.price = price;
    }

    public ElectronicProduct() {
        this.category = "Electronic";
    }
    
    @Override
    public int getProductId() {
       return this.productId;
    }
    @Override
    public double getPrice() {
       return this.price;
    }
    @Override
    public String getProductName() {
       return this.productName;
    }

    @Override
    public String getCategory() {
       return this.category;
    }
}

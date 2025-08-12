package Creational_DP.src.entities.Product;

public class ClothingProduct implements Product{
    private int productId;
    private String category;
    private String productName;
    private double price;
    private String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public ClothingProduct(int productId, String category, String productName, double price) {
        this.productId = productId;
        this.category = category;
        this.productName = productName;
        this.price = price;
    }

    public ClothingProduct() {
        this.category = "Clothing";
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

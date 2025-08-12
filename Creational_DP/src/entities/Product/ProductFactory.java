package Creational_DP.src.entities.Product;

//factory creation pattern 
public class ProductFactory {
    
    public Product createProduct(String category){
        Product newProduct = null;
        if(category.toLowerCase().equals("clothing")) newProduct = new ClothingProduct();
        else if(category.toLowerCase().equals("electronics")) newProduct = new ElectronicProduct();
        else if(category.toLowerCase().equals("groceries")) newProduct = new GroceriesProduct();

        return newProduct;
    }
}

import java.util.ArrayList;
import java.util.List;

public class InventoryManager {
    private List<Product> inventory;
    private int productIdCounter;

    public InventoryManager() {
        this.inventory = new ArrayList<>();
        this.productIdCounter = 1;
    }

    public void addProduct(String name, double price, int quantity) {
        Product product = new Product(productIdCounter++, name, price, quantity);
        inventory.add(product);
        System.out.println("Product added successfully.");
    }

    public void viewProductDetails(int productId) {
        for (Product product : inventory) {
            if (product.getId() == productId) {
                System.out.println("Product ID: " + product.getId());
                System.out.println("Name: " + product.getName());
                System.out.println("Price: $" + product.getPrice());
                System.out.println("Quantity: " + product.getQuantity());
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void updateProductPrice(int productId, double newPrice) {
        for (Product product : inventory) {
            if (product.getId() == productId) {
                product.setPrice(newPrice);
                System.out.println("Product price updated successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    public void updateProductQuantity(int productId, int newQuantity) {
        for (Product product : inventory) {
            if (product.getId() == productId) {
                product.setQuantity(newQuantity);
                System.out.println("Product quantity updated successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }
}
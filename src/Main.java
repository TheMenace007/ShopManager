import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InventoryManager inventoryManager = new InventoryManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Store Inventory Management ===");
            System.out.println("1. Add Product");
            System.out.println("2. View Product Details");
            System.out.println("3. Update Product Price");
            System.out.println("4. Update Product Quantity");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter product quantity: ");
                    int quantity = scanner.nextInt();
                    inventoryManager.addProduct(name, price, quantity);
                    break;
                case 2:
                    System.out.print("Enter product ID: ");

                    int productId = scanner.nextInt();
                    inventoryManager.viewProductDetails(productId);
                    break;
                case 3:
                    System.out.print("Enter product ID: ");
                    productId = scanner.nextInt();
                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();
                    inventoryManager.updateProductPrice(productId, newPrice);
                    break;
                case 4:
                    System.out.print("Enter product ID: ");
                    productId = scanner.nextInt();
                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();
                    inventoryManager.updateProductQuantity(productId, newQuantity);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }
    }
}
// File: InventoryTest.java
public class InventoryTest {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager();

        // Adding products
        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        Product product2 = new Product("P002", "Smartphone", 20, 499.99);
        manager.addProduct(product1);
        manager.addProduct(product2);

        // Displaying products
        manager.displayProducts();

        // Updating a product
        product1.setQuantity(15);
        manager.updateProduct(product1);

        // Displaying products after update
        manager.displayProducts();

        // Deleting a product
        manager.deleteProduct("P002");

        // Displaying products after deletion
        manager.displayProducts();
    }
}

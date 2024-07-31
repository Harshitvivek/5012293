import java.util.Arrays;
import java.util.List;

public class SearchTest {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Tablet", "Electronics"),
            new Product("P004", "Headphones", "Accessories"),
            new Product("P005", "Keyboard", "Accessories")
        );

        // Linear searc
        Product result = SearchAlgorithms.linearSearch(products, "Smartphone");
        if (result != null) {
            System.out.println("Linear Search: Found product - " + result.getProductName());
        } else {
            System.out.println("Linear Search: Product not found.");
        }

        // Binary search (requires sorted list)
        products.sort((p1, p2) -> p1.getProductName().compareToIgnoreCase(p2.getProductName()));
        result = BSearchAlgorithms.binarySearch(products, "Smartphone");
        if (result != null) {
            System.out.println("Binary Search: Found product - " + result.getProductName());
        } else {
            System.out.println("Binary Search: Product not found.");
        }
    }
}


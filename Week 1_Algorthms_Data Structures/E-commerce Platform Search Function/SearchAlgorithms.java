import java.util.List;

public class SearchAlgorithms {
    // Linear search algorithm
    public static Product linearSearch(List<Product> products, String productName) {
        for (Product product : products) {
            if (product.getProductName().equalsIgnoreCase(productName)) {
                return product;
            }
        }
        return null;
    }
}


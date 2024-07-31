import java.util.Arrays;
import java.util.List;

public class SortingTest {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
            new Order("O001", "Alice", 200.00),
            new Order("O002", "Bob", 150.00),
            new Order("O003", "Charlie", 300.00),
            new Order("O004", "David", 100.00),
            new Order("O005", "Eve", 250.00)
        );

        // Bubble Sort
        System.out.println("Before Bubble Sort:");
        printOrders(orders);
        SortingAlgorithms.bubbleSort(orders);
        System.out.println("After Bubble Sort:");
        printOrders(orders);

        // Quick Sort
        orders = Arrays.asList(
            new Order("O001", "Alice", 200.00),
            new Order("O002", "Bob", 150.00),
            new Order("O003", "Charlie", 300.00),
            new Order("O004", "David", 100.00),
            new Order("O005", "Eve", 250.00)
        );

        System.out.println("Before Quick Sort:");
        printOrders(orders);
        SortingAlgorithms.quickSort(orders, 0, orders.size() - 1);
        System.out.println("After Quick Sort:");
        printOrders(orders);
    }

    private static void printOrders(List<Order> orders) {
        for (Order order : orders) {
            System.out.println("Order ID: " + order.getOrderId() +
                               ", Customer Name: " + order.getCustomerName() +
                               ", Total Price: $" + order.getTotalPrice());
        }
    }
}


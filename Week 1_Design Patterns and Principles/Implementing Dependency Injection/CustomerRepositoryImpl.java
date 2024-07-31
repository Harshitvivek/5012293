public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public Customer findCustomerById(String id) {
        // For simplicity, returning a mock customer
        return new Customer(id, "John Doe", "john.doe@example.com");
    }
}
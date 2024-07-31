// File: EmployeeManagementTest.java
public class EmployeeManagementTest {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        // Adding employees
        ems.addEmployee(new Employee("E001", "Alice", "Manager", 75000));
        ems.addEmployee(new Employee("E002", "Bob", "Developer", 60000));
        ems.addEmployee(new Employee("E003", "Charlie", "Designer", 55000));
        ems.addEmployee(new Employee("E004", "David", "Developer", 62000));
        ems.addEmployee(new Employee("E005", "Eve", "Manager", 80000));

        // Traversing employees
        System.out.println("All Employees:");
        ems.traverseEmployees();

        // Searching for an employee
        System.out.println("\nSearching for Employee E003:");
        Employee emp = ems.searchEmployee("E003");
        if (emp != null) {
            System.out.println("Found: " + emp);
        } else {
            System.out.println("Employee not found.");
        }

        // Deleting an employee
        System.out.println("\nDeleting Employee E002:");
        ems.deleteEmployee("E002");

        // Traversing employees after deletion
        System.out.println("All Employees After Deletion:");
        ems.traverseEmployees();
    }
}


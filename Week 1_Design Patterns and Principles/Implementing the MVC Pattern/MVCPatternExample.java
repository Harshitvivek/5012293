public class MVCPatternExample {
    public static void main(String[] args) {
        // Fetch student record based on the student ID from the database (simulated)
        Student model = retrieveStudentFromDatabase();

        // Create a view : to write student details on console
        StudentView view = new StudentView();

        // Create a controller
        StudentController controller = new StudentController(model, view);

        // Display initial student details
        controller.updateView();

        // Update student details
        controller.setStudentName("John Doe");
        controller.setStudentGrade("A");

        // Display updated student details
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        // This is a mock method simulating data retrieval
        return new Student("Jane Doe", "12345", "B");
    }
}

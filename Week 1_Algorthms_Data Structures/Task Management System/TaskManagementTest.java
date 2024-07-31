public class TaskManagementTest {
    public static void main(String[] args) {
        SinglyLinkedList taskList = new SinglyLinkedList();

        // Adding tasks
        taskList.addTask(new Task("T001", "Design Database", "In Progress"));
        taskList.addTask(new Task("T002", "Implement API", "Not Started"));
        taskList.addTask(new Task("T003", "Write Documentation", "Completed"));

        // Traversing tasks
        System.out.println("All Tasks:");
        taskList.traverseTasks();

        // Searching for a task
        System.out.println("\nSearching for Task T002:");
        Task task = taskList.searchTask("T002");
        if (task != null) {
            System.out.println("Found: " + task);
        } else {
            System.out.println("Task not found.");
        }

        // Deleting a task
        System.out.println("\nDeleting Task T001:");
        taskList.deleteTask("T001");

        // Traversing tasks after deletion
        System.out.println("All Tasks After Deletion:");
        taskList.traverseTasks();
    }
}

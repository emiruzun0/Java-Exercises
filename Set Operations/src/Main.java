public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        Employee emp1 = new Employee(101, "John Smith", "Manager", 60000);
        Employee emp2 = new Employee(102, "Alice Johnson", "Engineer", 55000);
        Employee emp3 = new Employee(103, "Bob Wilson", "Designer", 50000);

        system.addEmployee(emp1);
        system.addEmployee(emp2);
        system.addEmployee(emp3);

        System.out.println("List of all employees:");
        system.listAllEmployees();

        int searchEmployeeId = 102;
        Employee foundEmployee = system.findEmployeeById(searchEmployeeId);
        if (foundEmployee != null) {
            System.out.println("Found Employee by ID " + searchEmployeeId + ":\n" + foundEmployee);
        } else {
            System.out.println("Employee with ID " + searchEmployeeId + " not found.");
        }

        int employeeToRemoveId = 101;
        system.removeEmployee(employeeToRemoveId);

        System.out.println("List of all employees after removal:");
        system.listAllEmployees();
    }
}

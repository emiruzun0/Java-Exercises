import java.util.HashSet;
import java.util.Set;

class EmployeeManagementSystem {
    private Set<Employee> employees;

    public EmployeeManagementSystem() {
        this.employees = new HashSet<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    public void removeEmployee(int employeeId) {
        Employee employeeToRemove = findEmployeeById(employeeId);
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
            System.out.println("Employee with ID " + employeeId + " has been removed.");
        } else {
            System.out.println("Employee with ID " + employeeId + " not found.");
        }
    }

    public void listAllEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public Set<Employee> findCommonEmployees(Set<Employee> otherEmployees) {
        Set<Employee> commonEmployees = new HashSet<>(employees);
        commonEmployees.retainAll(otherEmployees);
        return commonEmployees;
    }
}
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Management System Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Get Student Info");
            System.out.println("5. Display All Students");
            System.out.println("6. Calculate Average GPA");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter First Name: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Enter Last Name: ");
                    String lastName = scanner.nextLine();
                    System.out.print("Enter GPA: ");
                    double gpa = scanner.nextDouble();
                    sms.addStudent(new Student(id, firstName, lastName, gpa));
                    break;
                case 2:
                    System.out.print("Enter Student ID to Update: ");
                    int updateID = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter New First Name: ");
                    String newFirstName = scanner.nextLine();
                    System.out.print("Enter New Last Name: ");
                    String newLastName = scanner.nextLine();
                    System.out.print("Enter New GPA: ");
                    double newGPA = scanner.nextDouble();
                    sms.updateStudent(updateID, new Student(updateID, newFirstName, newLastName, newGPA));
                    break;
                case 3:
                    System.out.print("Enter Student ID to Delete: ");
                    int deleteID = scanner.nextInt();
                    sms.deleteStudent(deleteID);
                    break;
                case 4:
                    System.out.print("Enter Student ID to Get Info: ");
                    int getInfoID = scanner.nextInt();
                    sms.getStudent(getInfoID);
                    break;
                case 5:
                    sms.getAllStudents();
                    break;
                case 6:
                    sms.getAverageGPA();
                    break;
                case 7:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

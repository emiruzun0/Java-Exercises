import java.util.*;

public class StudentGradebook {
    public static void main(String[] args) {
        GradebookManager manager = new GradebookManager();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Student Gradebook Menu:");
            System.out.println("1. Add Student");
            System.out.println("2. Display Student Information");
            System.out.println("3. Calculate Average Grade");
            System.out.println("4. List All Students");
            System.out.println("5. Add Grade");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = scanner.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Number of Courses: ");
                    int numCourses = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline

                    List<String> courses = new ArrayList<>();
                    for (int i = 0; i < numCourses; i++) {
                        System.out.print("Enter Course Name #" + (i + 1) + ": ");
                        String course = scanner.nextLine();
                        courses.add(course);
                    }

                    manager.addStudent(id, name, courses);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.print("Enter Student ID: ");
                    String displayId = scanner.nextLine();
                    manager.displayStudentInformation(displayId);
                    break;
                case 3:
                    System.out.print("Enter Student ID: ");
                    String calculateId = scanner.nextLine();
                    manager.calculateAverageGrade(calculateId);
                    break;
                case 4:
                    manager.listAllStudents();
                    break;
                case 5:
                    System.out.print("Enter Student ID: ");
                    String addGradeId = scanner.nextLine();
                    Map<String, List<Integer>> grades = new HashMap<>();
                    for (String course : manager.getStudentCourses(addGradeId)) {
                        List<Integer> courseGrades = new ArrayList<>();
                        System.out.print("Enter Grade for " + course + ": ");
                        int grade = scanner.nextInt();
                        scanner.nextLine(); // Consume the newline
                        courseGrades.add(grade);
                        grades.put(course, courseGrades);
                    }
                    manager.addGrades(addGradeId, grades);
                    break;
                case 6:
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
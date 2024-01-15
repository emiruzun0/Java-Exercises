import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    private List<Student> studentList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student added successfully.");
    }

    public void updateStudent(int studentID, Student updatedStudent) {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getStudentID() == studentID) {
                studentList.set(i, updatedStudent);
                System.out.println("Student updated successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void deleteStudent(int studentID) {
        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);
            if (student.getStudentID() == studentID) {
                studentList.remove(i);
                System.out.println("Student deleted successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void getStudent(int studentID) {
        for (Student student : studentList) {
            if (student.getStudentID() == studentID) {
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student not found.");
    }

    public void getAllStudents() {
        for (Student student : studentList) {
            System.out.println(student);
        }
    }

    public void getAverageGPA() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the list.");
            return;
        }

        double totalGPA = 0;
        for (Student student : studentList) {
            totalGPA += student.getGpa();
        }
        double averageGPA = totalGPA / studentList.size();
        System.out.println("Average GPA: " + averageGPA);
    }


}

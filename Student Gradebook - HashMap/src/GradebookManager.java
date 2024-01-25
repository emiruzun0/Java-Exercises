import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class GradebookManager {
    private Map<String, StudentRecord> gradebook;

    public GradebookManager() {
        this.gradebook = new HashMap<>();
    }

    public void addStudent(String id, String name, List<String> courses) {
        if (!gradebook.containsKey(id)) {
            StudentRecord student = new StudentRecord(name, courses);
            gradebook.put(id, student);
        } else {
            System.out.println("Student with ID " + id + " already exists.");
        }
    }

    public void displayStudentInformation(String id) {
        if (gradebook.containsKey(id)) {
            StudentRecord student = gradebook.get(id);
            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + student.getName());
            System.out.println("Courses: " + String.join(", ", student.getCourses()));
            System.out.println("Grades: " + student.getCourseGrades());
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void calculateAverageGrade(String id) {
        if (gradebook.containsKey(id)) {
            StudentRecord student = gradebook.get(id);
            double averageGrade = student.getOverallAverageGrade();
            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + student.getName());
            System.out.println("Average Grade: " + averageGrade);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void listAllStudents() {
        System.out.println("List of All Students:");
        for (Map.Entry<String, StudentRecord> entry : gradebook.entrySet()) {
            String id = entry.getKey();
            StudentRecord student = entry.getValue();
            System.out.println("Student ID: " + id);
            System.out.println("Student Name: " + student.getName());
            System.out.println("Courses: " + String.join(", ", student.getCourses()));
            System.out.println("Grades: " + student.getCourseGrades());
            System.out.println();
        }
    }

    public void addGrades(String id, Map<String, List<Integer>> grades) {
        if (gradebook.containsKey(id)) {
            StudentRecord student = gradebook.get(id);
            for (Map.Entry<String, List<Integer>> entry : grades.entrySet()) {
                String course = entry.getKey();
                List<Integer> courseGrades = entry.getValue();
                for (int grade : courseGrades) {
                    student.addGrade(course, grade);
                }
            }
            System.out.println("Grades added successfully for Student ID " + id);
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public List<String> getStudentCourses(String id) {
        if (gradebook.containsKey(id)) {
            StudentRecord student = gradebook.get(id);
            return student.getCourses();
        } else {
            System.out.println("Student with ID " + id + " not found.");
            return Collections.emptyList();
        }
    }
}
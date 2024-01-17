import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class StudentList {
    private List<String> studentList; // ArrayList to store student names

    // Constructor to initialize the studentList
    public StudentList() {
        studentList = new ArrayList<>();
    }

    // Method to add a new student to the list
    public void addStudent(String name) {
        studentList.add(name);
    }

    // Method to remove a student from the list
    public void removeStudent(String name) {
        studentList.remove(name);
    }

    // Method to print all student names in both forward and backward directions
    public void printStudents() {
        System.out.println("Forward traversal:");
        ListIterator<String> iteratorForward = studentList.listIterator();
        while (iteratorForward.hasNext()) {
            System.out.println(iteratorForward.next());
        }

        System.out.println("\nBackward traversal:");
        ListIterator<String> iteratorBackward = studentList.listIterator(studentList.size());
        while (iteratorBackward.hasPrevious()) {
            System.out.println(iteratorBackward.previous());
        }
    }

    // Method to replace a student with a new name
    public void replaceStudent(String oldName, String newName) {
        ListIterator<String> iterator = studentList.listIterator();
        while (iterator.hasNext()) {
            if (iterator.next().equals(oldName)) {
                iterator.set(newName);
            }
        }
    }
}
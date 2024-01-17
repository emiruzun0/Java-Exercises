public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();

        // Test the addStudent method
        studentList.addStudent("Emir");
        studentList.addStudent("Clarice");
        studentList.addStudent("Bob");
        studentList.addStudent("Charlie");

        // Test the removeStudent method
        studentList.removeStudent("Bob");

        // Test the printStudents method
        studentList.printStudents();

        // Test the replaceStudent method
        studentList.replaceStudent("Emir", "Eve");
    }
}
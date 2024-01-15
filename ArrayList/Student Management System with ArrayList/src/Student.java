public class Student {

    private int studentID;
    private String firstName;
    private String lastName;
    private double gpa;

    public Student(int studentID, String firstName, String lastName, double gpa) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID +
                ", Name: " + firstName + " " + lastName +
                ", GPA: " + gpa;
    }
}

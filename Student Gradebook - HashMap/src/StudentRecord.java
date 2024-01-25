import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StudentRecord {
    private String name;
    private List<String> courses;
    private Map<String, List<Integer>> courseGrades; // Map of course name to list of grades

    public StudentRecord(String name, List<String> courses) {
        this.name = name;
        this.courses = courses;
        this.courseGrades = new HashMap<>();
        // Initialize grade lists for each course
        for (String course : courses) {
            courseGrades.put(course, new ArrayList<>());
        }
    }

    // Add a grade to a specific course
    public void addGrade(String course, int grade) {
        if (courseGrades.containsKey(course)) {
            courseGrades.get(course).add(grade);
        } else {
            System.out.println("Course not found for the student.");
        }
    }

    // Get the student's name
    public String getName() {
        return name;
    }

    // Get the list of courses the student is enrolled in
    public List<String> getCourses() {
        return courses;
    }

    // Get the map of course names to lists of grades
    public Map<String, List<Integer>> getCourseGrades() {
        return courseGrades;
    }

    // Calculate and return the average grade for a specific course
    public double getAverageGrade(String course) {
        if (courseGrades.containsKey(course)) {
            List<Integer> grades = courseGrades.get(course);
            if (!grades.isEmpty()) {
                double sum = 0;
                for (int grade : grades) {
                    sum += grade;
                }
                return sum / grades.size();
            }
        }
        return 0; // Return 0 if the course or grades are not found
    }

    // Calculate and return the overall average grade for all courses
    public double getOverallAverageGrade() {
        if (!courses.isEmpty()) {
            double sum = 0;
            int totalGrades = 0;
            for (String course : courses) {
                List<Integer> grades = courseGrades.get(course);
                if (!grades.isEmpty()) {
                    for (int grade : grades) {
                        sum += grade;
                        totalGrades++;
                    }
                }
            }
            if (totalGrades > 0) {
                return sum / totalGrades;
            }
        }
        return 0; // Return 0 if no courses or grades are found
    }

}

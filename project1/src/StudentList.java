import java.util.*;

public class StudentList {
    private String name;
    private String address;
    private ArrayList<String> courses;
    private ArrayList<Integer> grades;

    /*
     * Constructor for the Student Class
     * Validation of input data
     */

    public StudentList(String name, String address) {
        // Validation for input name
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name must not be null or blank.");
        }
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address must not be null or blank.");
        }
        this.name = name;
        this.address = address;
        this.courses = new ArrayList<>();
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.isBlank()) {
            throw new IllegalArgumentException("Address must not be null or blank.");
        }
        this.address = address;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("%s(%s)", name, address);
    }

    /*
     * Add a new course and grade
     * 
     * @param course The course name
     * 
     * @param grade The grade (0-100).
     */

    public void addCourseGrade(String course, int grade) {
        if (course == null || course.isBlank()) {
            System.out.println("Error: Course's name cannot be blank.");
            return;
        }
        if (grade < 0 || grade > 100) {
            System.out.println("Error: Grade must be between 0 and 100.");
            return;
        }
        if (courses.size() >= 30) {
            System.out.println("Cannot add more than 30 courses.");
        }
        this.courses.add(course);
        this.grades.add(grade);
    }

    public void printGrades() {
        System.out.print(this.name + ": ");
        for (int i = 0; i < courses.size(); i++) {
            System.out.print(courses.get(i) + ":" + grades.get(i));
            if (i < courses.size() - 1)
                System.out.print(", ");
        }
        System.out.println();

    }

    public double getAverageGrade() {
        if (courses.isEmpty())
            return 0.0;
        double sum = 0.0;
        for (int _grades : grades) {
            sum += _grades;
        }
        return sum / courses.size();
    }
}

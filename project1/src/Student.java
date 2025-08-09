public class Student {
    private String name;
    private String address;
    private int numCourses = 0;
    private String[] courses = new String[30];
    private int[] grades = new int[30];

    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getName() + "(" + getAddress() + ")";
    }

    public void addCourseGrade(String course, int grade) {
        if (numCourses < 30) {
            courses[numCourses] = course;
            grades[numCourses] = grade;
            numCourses++;
        } else {
            System.out.println("Can't add more than 30 courses.");
        }
    }

    public void printGrades() {
        System.out.print(name + " ");
        for (int i = 0; i < numCourses; i++) {
            System.out.print(courses[i] + ":" + grades[i]);
            if (i < numCourses - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public double getAverageGrade() {
        if (numCourses == 0) {
            return 0.0;
        }
        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < numCourses; i++) {
            sum += grades[i];
            count++;
        }
        return sum / count;
    }

}

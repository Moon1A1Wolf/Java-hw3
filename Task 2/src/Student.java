import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public boolean hasDebts() {
        return courses.stream().anyMatch(course -> !course.isPassed());
    }

    public double calculateAverageGrade() {
        return courses.stream()
                .filter(Course::isPassed)
                .mapToInt(Course::getFinalGrade)
                .average()
                .orElse(0.0);
    }

    public List<Course> getCoursesBySemester(int semester) {
        List<Course> result = new ArrayList<>();
        for (Course course : courses) {
            if (course.getSemester() == semester) {
                result.add(course);
            }
        }
        return result;
    }

    public void display() {
        System.out.println("Студент: " + name);
        courses.forEach(Course::display);
    }
}

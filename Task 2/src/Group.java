import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Group {
    private String groupName;
    private List<Student> students;

    public Group(String groupName) {
        this.groupName = groupName;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getFailingStudents() {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (student.hasDebts()) {
                result.add(student);
            }
        }
        return result;
    }

    public List<Student> getDebtFreeStudents() {
        List<Student> result = new ArrayList<>();
        for (Student student : students) {
            if (!student.hasDebts()) {
                result.add(student);
            }
        }
        return result;
    }

    public String getMostFailedCourse() {
    return students.stream()
            .flatMap(student -> student.getCourses().stream())
            .filter(course -> !course.isPassed())
            .collect(Collectors.groupingBy(Course::getCourseName, Collectors.counting()))
            .entrySet().stream()
            .max(Map.Entry.comparingByValue())
            .map(Map.Entry::getKey)
            .orElse("None");
}


    public void displayAverageGrades() {
        for (Student student : students) {
            System.out.println(student.getName() + ": " + student.calculateAverageGrade());
        }
    }

    public void displayStudents() {
        System.out.println("Група: " + groupName);
        for (Student student : students) {
            student.display();
            System.out.println();
        }
    }
}

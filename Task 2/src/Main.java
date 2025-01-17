import java.util.List;

public class Main {
    public static void main(String[] args) {
        Group group = new Group("Програмісти");

        Student student1 = new Student("Олександр");
        student1.addCourse(new Course("Математика", 1, 80));
        student1.addCourse(new Course("Фізика", 1, -1));
        student1.addCourse(new Course("Програмування", 2, 90));
        group.addStudent(student1);

        Student student2 = new Student("Марія");
        student2.addCourse(new Course("Математика", 1, 100));
        student2.addCourse(new Course("Фізика", 1, 70));
        student2.addCourse(new Course("Програмування", 2, 85));
        group.addStudent(student2);

        Student student3 = new Student("Іван");
        student3.addCourse(new Course("Математика", 1, 40));
        student3.addCourse(new Course("Фізика", 1, 50));
        student3.addCourse(new Course("Програмування", 2, 60));
        group.addStudent(student3);

        group.displayStudents();

        System.out.println("\nСтуденти з боргами:");
        List<Student> failingStudents = group.getFailingStudents();
        failingStudents.forEach(Student::display);

        System.out.println("\nСтуденти без боргів:");
        List<Student> debtFreeStudents = group.getDebtFreeStudents();
        debtFreeStudents.forEach(Student::display);

        System.out.println("\nКурс з найбільшою кількістю незданих:");
        System.out.println(group.getMostFailedCourse());

        System.out.println("\nРейтинг студентів:");
        group.displayAverageGrades();

        System.out.println("\nКурси студента Олександр за 1 семестр:");
        student1.getCoursesBySemester(1).forEach(Course::display);
    }
}

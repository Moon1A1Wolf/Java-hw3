public class Course {
    private String courseName;
    private int semester;
    private int finalGrade;

    public Course(String courseName, int semester, int finalGrade) {
        this.courseName = courseName;
        this.semester = semester;
        this.finalGrade = finalGrade;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getSemester() {
        return semester;
    }

    public int getFinalGrade() {
        return finalGrade;
    }

    public boolean isPassed() {
        return finalGrade >= 60;
    }

    public void display() {
        System.out.println("Курс: " + courseName + ", Семестр: " + semester + ", Оцінка: " + (finalGrade == -1 ? "Не здано" : finalGrade));
    }
}
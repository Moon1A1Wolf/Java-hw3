public class Builder extends Human {
    private String specialization;

    public Builder(String name, int age, int childrenCount, String specialization) {
        super(name, age, childrenCount);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Спеціалізація: " + specialization);
    }
}

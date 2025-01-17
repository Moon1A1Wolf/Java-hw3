public class Human {
    private String name;
    private int age;
    private int childrenCount;

    public Human(String name, int age, int childrenCount) {
        this.name = name;
        this.age = age;
        this.childrenCount = childrenCount;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getChildrenCount() {
        return childrenCount;
    }

    public void display() {
        System.out.println("Ім'я: " + name);
        System.out.println("Вік: " + age);
        System.out.println("Кількість дітей: " + childrenCount);
    }
}

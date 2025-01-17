public class Rabbit extends Animal {
    public Rabbit(String name) {
        super(name, false);
    }

    @Override
    public String makeSound() {
        return "Пі-пі-пі!";
    }
}
public class Kangaroo extends Animal {
    public Kangaroo(String name) {
        super(name, false);
    }

    @Override
    public String makeSound() {
        return "Тук-тук!";
    }
}
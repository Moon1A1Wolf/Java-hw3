public class Wolf extends Animal {
    public Wolf(String name) {
        super(name, true);
    }

    @Override
    public String makeSound() {
        return "Вууу!";
    }
}
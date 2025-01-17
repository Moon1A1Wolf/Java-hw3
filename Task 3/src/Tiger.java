public class Tiger extends Animal {
    public Tiger(String name) {
        super(name, true);
    }

    @Override
    public String makeSound() {
        return "Рррр!";
    }
}
public abstract class Animal {
    private String name;
    private boolean isPredator;

    public Animal(String name, boolean isPredator) {
        this.name = name;
        this.isPredator = isPredator;
    }

    public String getName() {
        return name;
    }

    public boolean isPredator() {
        return isPredator;
    }

    public abstract String makeSound();
}
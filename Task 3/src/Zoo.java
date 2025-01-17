import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public int countPredators() {
        return (int) animals.stream().filter(Animal::isPredator).count();
    }

    public int calculateFoodRequirement() {
        int predatorFood = countPredators() * 5;
        int herbivoreFood = (animals.size() - countPredators()) * 3;
        return predatorFood + herbivoreFood;
    }

    public void displayZooInfo() {
        System.out.println("У зоопарку є наступні тварини:");
        animals.forEach(animal -> {
            System.out.println("- " + animal.getName() + ": " + animal.makeSound());
        });
        System.out.println("Кількість хижаків: " + countPredators());
        System.out.println("Загальна потреба в кормі: " + calculateFoodRequirement() + " кг");
    }
}
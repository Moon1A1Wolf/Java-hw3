public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        zoo.addAnimal(new Tiger("Тигр Амур"));
        zoo.addAnimal(new Rabbit("Кролик Боб"));
        zoo.addAnimal(new Wolf("Вовк Сірко"));
        zoo.addAnimal(new Kangaroo("Кенгуру Джек"));

        zoo.displayZooInfo();
    }
}

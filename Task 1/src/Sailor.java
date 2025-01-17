public class Sailor extends Human {
    private String shipName;

    public Sailor(String name, int age, int childrenCount, String shipName) {
        super(name, age, childrenCount);
        this.shipName = shipName;
    }

    public String getShipName() {
        return shipName;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Назва корабля: " + shipName);
    }
}

public class Pilot extends Human {
    private String aircraftModel;

    public Pilot(String name, int age, int childrenCount, String aircraftModel) {
        super(name, age, childrenCount);
        this.aircraftModel = aircraftModel;
    }

    public String getAircraftModel() {
        return aircraftModel;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Модель літака: " + aircraftModel);
    }
}

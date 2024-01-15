public class Car extends Vehicle{

    private int numDoors;

    public Car(String make, int year, int numDoors) {
        super(make, year);
        this.numDoors = numDoors;
    }

    @Override
    public void start() {
        System.out.println(numDoors + " doors car engine started.");
    }

    @Override
    public void stop() {
        System.out.println(numDoors + " doors car engine stopped.");
    }
}

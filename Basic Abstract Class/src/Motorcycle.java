public class Motorcycle extends Vehicle{
    private String type;

    public Motorcycle(String make, int year, String type) {
        super(make, year);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public void start() {
        System.out.println(type + " type motorcycle engine started.");
    }

    @Override
    public void stop() {
        System.out.println(type + " type motorcycle engine stopped.");
    }
}

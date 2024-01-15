public abstract class Vehicle {
    private String make;
    private int year;

    public Vehicle(String make, int year) {
        this.make = make;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public abstract void start();
    public abstract void stop();

    public void displayInfo(){
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Make : '" + make + '\'' +
                ", Year=" + year ;
    }
}

public class Main {

    public static void main(String[] args) {
        Vehicle v1 = new Car("Audi",2023,2);
        Vehicle v2 = new Motorcycle("BMW",2022,"Sport");

        v1.displayInfo();
        v2.displayInfo();
        v1.start();
        v2.start();
        v1.stop();
        v2.stop();

    }
}

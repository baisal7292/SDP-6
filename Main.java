public class Main {
    public static void main(String[] args) {
        Car sedan = new Car("Sedan", new EcoDriveStrategy());
        Car sportsCar = new Car("Sports Car", new SportDriveStrategy());

        sedan.drive();
        sportsCar.drive();

        sedan.setDriveStrategy(new OffroadDriveStrategy());
        sedan.drive();
    }
}

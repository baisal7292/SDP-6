public class Car {
    private String name;
    private DriveStrategy driveStrategy;

    public Car(String name, DriveStrategy driveStrategy) {
        this.name = name;
        this.driveStrategy = driveStrategy;
    }

    public void setDriveStrategy(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive() {
        System.out.print(name + ": ");
        driveStrategy.drive();
    }
}

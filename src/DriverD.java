public class DriverD extends Driver {
    public DriverD(String name, boolean driverLicense, int experiens) {
        super(name, driverLicense, experiens);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D " + getName() + " начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории D " + getName() + " заканчивает движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории D " + getName() + " заправляет автомобиль");
    }
}

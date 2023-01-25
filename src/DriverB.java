public class DriverB extends Driver {
    public DriverB(String name, boolean driverLicense, int experiens) {
        super(name, driverLicense, experiens);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории В " + getName() + " начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории В " + getName() + " заканчивает движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории В " + getName() + " заправляет автомобиль");
    }
}

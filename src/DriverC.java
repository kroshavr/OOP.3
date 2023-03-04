public class DriverC extends Driver {
    public DriverC(String name, boolean driverLicense, int experiens) {
        super(name, driverLicense, experiens);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории С " + getName() + " начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Водитель категории С " + getName() + " заканчивает движение");
    }

    @Override
    public void refuel() {
        System.out.println("Водитель категории С " + getName() + " заправляет автомобиль");
    }
}

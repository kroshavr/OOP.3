public class Truck extends Transport <DriverC> {

    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовая машина " + getBrand() + " начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Грузовая машина " + getBrand() + " заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для грузовой машины " + getBrand());
    }

    @Override
    public void bestLapTime() {
        int i = (int) ((Math.random() * ((100 - 60) + 1)) + 60);
        System.out.println("Лучшее время круга для грузовой машины " + getBrand() + " " + i + " мин");
    }

    @Override
    public void maxSpeed() {
        int i = (int) ((Math.random() * ((160 - 120) + 1)) +120);
        System.out.println("Максимальная скорость для грузовой машины " + getBrand() + " " + + i + " км/ч");
    }
}
public class Bus extends Transport <DriverD> {
    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Автобус " + getBrand() + " заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для автобуса " + getBrand());
    }

    @Override
    public void bestLapTime() {
        int i = (int) ((Math.random() * ((100 - 60) + 1)) + 60);
        System.out.println("Лучшее время круга для автобуса " + getBrand() + " " + i + " мин");
    }

    @Override
    public void maxSpeed() {
        int i = (int) ((Math.random() * ((160 - 120) + 1)) +120);
        System.out.println("Максимальная скорость для автобуса " + getBrand() + " " + + i + " км/ч");
    }
}
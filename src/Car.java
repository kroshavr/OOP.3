public class Car extends Transport <DriverB> {

    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println("Легковая машина " + getBrand() + " начинает движение");
    }

    @Override
    public void stopMoving() {
        System.out.println("Легковая машина " + getBrand() + " заканчивает движение");
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп для легковой машины " + getBrand());
    }

    @Override
    public void bestLapTime() {
        int i = (int) ((Math.random() * ((60 - 30) + 1)) + 30);
        System.out.println("Лучшее время круга для легковой машины " + getBrand() + " " + i + " мин");
    }

    @Override
    public void maxSpeed() {
        int i = (int) ((Math.random() * ((250 - 160) + 1)) +160);
        System.out.println("Максимальная скорость для легковой машины " + getBrand() + " " + + i + " км/ч");
    }
}
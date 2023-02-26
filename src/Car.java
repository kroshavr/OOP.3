public class Car extends Transport <DriverB> {
    private CarBody carBody;
    public enum CarBody {
        SEDAN ("Седан"),
        HATCH ("Хэтчбек"),
        KUPE ("Купе"),
        UNI ("Универсал"),
        ALLROAD ("Внедорожник"),
        KROSS ("Кроссовер"),
        PIKAP ("Пикап"),
        FURA ("Фургон"),
        MINI ("Минивен");

        private String name;

        CarBody(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Тип кузова: " + name;
        }
    }
    public Car(String brand, String model, double engineVolume, DriverB driver, Mechanics mechanics, CarBody carBody) {
        super(brand, model, engineVolume, driver, mechanics);
        this.carBody=carBody;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
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

    @Override
    public String toString() {
        return super.toString() + getDriver();
    }

    @Override
    public void printType() {
        if (carBody == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        }
        else {
            System.out.println(carBody);
        }
    }

    @Override
    public void diagnostic() {
        System.out.println("Диагностика автомобиля пройдена");
    }
}
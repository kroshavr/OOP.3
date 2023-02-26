public class Truck extends Transport <DriverC> {
    private TruckBody truckBody;
    public enum TruckBody {
        N1 (2),
        N2 (6),
        N3 (14);

        private float weight;
        TruckBody (double weight) {
            this.weight = (float) weight;
        }
        @Override
        public String toString() {
            if (weight <= 3.5) {
                return "Грузоподъемность: до 3,5 тонн";}
            else if (weight > 3.5 && weight <= 12) {
                return "Грузоподъемность: от 3,5 до 12 тонн";
            }
            else {
                return "Грузоподъемность: от 12 тонн";
            }
        }
    }

    public Truck(String brand, String model, double engineVolume, DriverC driver, Mechanics mechanics, TruckBody truckBody) {
        super(brand, model, engineVolume, driver, mechanics);
        this.truckBody = truckBody;
    }

    public TruckBody getTruckBody() {
        return truckBody;
    }

    public void setTruckBody(TruckBody truckBody) {
        this.truckBody = truckBody;
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

    @Override
    public String toString() {
        return super.toString();
    }
    public void printType() {
        if (truckBody == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(truckBody);
        }
    }

    @Override
    public void diagnostic() {
        System.out.println("Диагностика грузовика пройдена");
    }
}
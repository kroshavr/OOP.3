public class Main {
    public static void main(String[] args) {

          for (int i = 1; i <= 4; i++) {
                DriverB driverB = new DriverB("Водитель легкового автомобиля № " + i, true, 8 + i);
                Car car = new Car("марки " + i, "модель " + i, 2, driverB);

                DriverC driverC = new DriverC("Водитель грузового автомобиля № " + i, true, 11 + i);
                Truck truck = new Truck("марки " + i, "модель " + i, 12, driverC);

                DriverD driverD = new DriverD("Водитель автобуса № " + i, true, 15 + i);
                Bus bus = new Bus("марки " + i, "модель " + i, 8, driverD);

                info(car);
                info(truck);
                info(bus);
          }
    }
    public static void info(Transport<?> transport) {
          System.out.println(transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
    }
}
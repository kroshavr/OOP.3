public class Main {
    public static void main(String[] args) throws TransportTypeException {

//          for (int i = 1; i <= 4; i++) {
//                DriverB driverB = new DriverB("Водитель легкового автомобиля № " + i, true, 8 + i);
//                Car car = new Car("марки " + i, "модель " + i, 2, driverB, Car.CarBody.HATCH);
//
//                DriverC driverC = new DriverC("Водитель грузового автомобиля № " + i, true, 11 + i);
//                Truck truck = new Truck("марки " + i, "модель " + i, 12, driverC);
//
//                DriverD driverD = new DriverD("Водитель автобуса № " + i, true, 15 + i);
//                Bus bus = new Bus("марки " + i, "модель " + i, 8, driverD);
//
//                info(car);
//                info(truck);
//                info(bus);
//          }
        DriverB driverB = new DriverB("Driver", true, 8);
        Car car = new Car("Audi", "TT", 2.5, driverB, Car.CarBody.HATCH);
//        System.out.println(car);

        DriverC driverC = new DriverC("DriverC", true,7);
        Truck truck = new Truck("Truck", "model", 10, driverC, Truck.TruckBody.N1);
//        System.out.println(truck);

        DriverD driverD = new DriverD("d", true, 10);
        Bus bus = new Bus("Bus", "22N", 8, driverD, Bus.BusPlaces.VERYBIG);
//        System.out.println(bus);
//
//        car.printType();
//        truck.printType();
//        bus.printType();

        car.diagnostic();
        truck.diagnostic();
        bus.diagnostic();
    }
    public static void info(Transport<?> transport) {
          System.out.println(transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
    }
}
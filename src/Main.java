public class Main {
    public static void main(String[] args) {

        DriverB driverB = new DriverB("Driver", true, 8);
        Car car = new Car("Audi", "TT", 2.5, driverB, Car.CarBody.HATCH);

        DriverC driverC = new DriverC("DriverC", true,7);
        Truck truck = new Truck("Truck", "model", 10, driverC, Truck.TruckBody.N1);

        DriverD driverD = new DriverD("d", true, 10);
        Bus bus = new Bus("Bus", "22N", 8, driverD, Bus.BusPlaces.VERYBIG);

        car.diagnostic();
        truck.diagnostic();
        try {
            bus.diagnostic();
        } catch (TransportTypeException e) {
            throw new RuntimeException(e);
        }
    }
    public static void info(Transport<?> transport) {
          System.out.println(transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
    }
}
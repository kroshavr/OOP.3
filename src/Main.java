import java.util.*;
public class Main {
    public static void main(String[] args) {

        Mechanics mechanics1 = new Mechanics("Max Wok", "Gloria");
        Mechanics mechanics2 = new Mechanics("Kit Kat", "Nestle");
        Mechanics mechanics3 = new Mechanics("Кто Я", "BBK");
        Mechanics mechanics4 = new Mechanics("Brock Lesnar", "WWE");
        DriverB driverB1 = new DriverB("B1", true, 8);
        Car car1 = new Car("Audi", "TT", 2.5, driverB1, mechanics4, Car.CarBody.HATCH);
        DriverB driverB2 = new DriverB("B2", true, 6);
        Car car2 = new Car("BMW", "M3", 2.2, driverB2, mechanics1, Car.CarBody.SEDAN);

        DriverC driverC1 = new DriverC("C1", true,7);
        Truck truck1 = new Truck("Truck1", "model1", 10, driverC1, mechanics1, Truck.TruckBody.N1);
        DriverC driverC2 = new DriverC("C2", true, 18);
        Truck truck2 = new Truck("Truck2", "model2", 5, driverC2, mechanics2, Truck.TruckBody.N3);

        DriverD driverD1 = new DriverD("D1", true, 10);
        Bus bus1 = new Bus("Bus1", "22N", 8, driverD1, mechanics3, Bus.BusPlaces.VERYBIG);
        DriverD driverD2 = new DriverD("D2", true, 13);
        Bus bus2 = new Bus("Bus2", "CC", 4.2, driverD2, mechanics3, Bus.BusPlaces.SMALL);

        List<Transport> transportList= new ArrayList<>();
        transportList.add(car1);
        transportList.add(car2);
        transportList.add(truck1);
        transportList.add(truck2);
        transportList.add(bus1);
        transportList.add(bus2);

        List<Mechanics> mechanicsList = new ArrayList<>();
        mechanicsList.add(mechanics1);
        mechanicsList.add(mechanics2);
        mechanicsList.add(mechanics3);
        mechanicsList.add(mechanics4);

        info(car1);
        info(car2);
        info(truck1);
        info(truck2);
        info(bus1);
        info(bus2);

        Queue<Transport> infoAuto = new LinkedList<>();
        infoAuto.add(car1);
        infoAuto.add(car2);
        infoAuto.add(truck1);
        infoAuto.add(truck2);
        infoAuto.add(bus1);
        infoAuto.add(bus2);



//        car1.diagnostic();
//        truck1.diagnostic();
//        try {
//            bus1.diagnostic();
//        } catch (TransportTypeException e) {
//            throw new RuntimeException(e);
//        }
    }
    public static void info(Transport<?> transport) {
          System.out.println(transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + ". Обслуживает автомобиль " + transport.getMechanics());
    }
}
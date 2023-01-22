public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("", "Granta", 1.7, "желтый", 2015,"Россия", "Автомат", "седан", "ОИ458К", 5, "летняя");
        Car car2 = new Car("Audi", "A8 50 L TDI quattro", 3.0, "черный", 2020, "Германия", "", "купе", "150", 3, "зимняя");
        Car car3 = new Car("BMW", "Z8", 3.0, "черный", 2021, "Германия","автомат", "купе", "150", 3,"летняя");
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "","купе", "150", 3, "летняя");
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея","механика", "купе", "150", 3, "зимняя");
        Car.Key key1 = car1.new Key(false,false);
        Car.Key key2 = car2.new Key(true,true);
        Car.Key key3 = car3.new Key(true,true);
        Car.Key key4 = car4.new Key(true,true);
        Car.Key key5 = car5.new Key(true,true);
        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3.toString());
        System.out.println(car4.toString());
        System.out.println(car5.toString());
        car1.choiceOfTires(12);
        System.out.println(car1);
        System.out.println(key1);
    }
}
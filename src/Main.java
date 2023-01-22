public class Main {
    public static void main(String[] args) {
          Car car1 = new Car("Lada","Granta",2017, "Россия","серый",220,1.7,"механика", "седан", "220", 5, "летняя");
          Car car2 = new Car("Audi", "A8 50 L TDI quattro", 2020,"Германия", "черный", 280, 3, "автомат", "купе", "150", 3, "зимняя");
          Car car3 = new Car("BMW", "Z8", 2021, "Германия", "черный", 300,3, "автомат", "купе", "154",3,"летняя");
          Car car4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 180, 2.4,"механика","купе", "150", 3, "летняя");
          Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 200,1.6,"механика", "купе", "150", 3, "зимняя");
    //    Car.Key key1 = car1.new Key(false,false);
//        Car.Key key2 = car2.new Key(true,true);
//        Car.Key key3 = car3.new Key(true,true);
//        Car.Key key4 = car4.new Key(true,true);
//        Car.Key key5 = car5.new Key(true,true);
          System.out.println(car1.toString());
          System.out.println(car2.toString());
          System.out.println(car3.toString());
          System.out.println(car4.toString());
          System.out.println(car5.toString());
//        car1.choiceOfTires(12);
//        System.out.println(car1);
//        System.out.println(key1);
          Bus bus1 = new Bus("MAN", "Lion City L", 2010, "Германия", "синий", 180);
          Bus bus2 = new Bus("ЛиАЗ", "4292", 2016, "Россия", "серый", 160);
          Bus bus3 = new Bus("Scania", "A80", 2011, "Швеция", "белый", 170);
          System.out.println(bus1.toString());
          System.out.println(bus2.toString());
          System.out.println(bus3.toString());
    }
}
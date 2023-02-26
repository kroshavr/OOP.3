public class Bus extends Transport <DriverD> {
    private BusPlaces busPlaces;
    public enum BusPlaces {
        VERYSMALL (9),
        SMALL (19),
        AVERAGE (35),
        BIG (79),
        VERYBIG (102);

        private Integer places;

        BusPlaces (Integer places) {
            this.places = places;
        }
        @Override
        public String toString() {
            if (places <= 10) {
                return "Вместимость: до 10 мест";
            }
            else if (places > 10 && places <=25) {
                return "Вместимость: до 25 мест";
            }
            else if (places > 25 && places <=50) {
                return "Вместимость: от 25 до 50 мест";
            }
            else if (places > 50 && places <=80) {
                return "Вместимость: от 50 до 80 мест";
            }
            else  {
                return "Вместимость: от 120 мест";
            }
        }
    }
    public Bus(String brand, String model, double engineVolume, DriverD driver, Mechanics mechanics, BusPlaces busPlaces) {
        super(brand, model, engineVolume, driver, mechanics);
        this.busPlaces = busPlaces;
    }

    public BusPlaces getBusPlaces() {
        return busPlaces;
    }

    public void setBusPlaces(BusPlaces busPlaces) {
        this.busPlaces = busPlaces;
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

    @Override
    public String toString() {
        return super.toString();
    }

    public void printType() {
        if (busPlaces == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(busPlaces);
        }
    }

    @Override
    public void diagnostic() throws TransportTypeException {
        throw new TransportTypeException("Автобусы диагностику проходить не должны!");
    }
}

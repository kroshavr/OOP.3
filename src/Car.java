public class Car extends Transport {
    private double engineVolume;
    private String transmission;
    private final String carBody;
    private String numberOfTheCar;
    private final int numberOfSeats;
    private String tires;

    class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key (boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        @Override
        public String toString() {
            return "Удаленный запуск двигателя - " + (remoteEngineStart ? "есть" : "нет") +
                    ", бесключевой доступ - " + (keylessAccess ? "есть" : "нет");
        }
    }

    public Car(String brand, String model, int year, String country, String color, int maxSpeed, double engineVolume, String transmission,
               String carBody, String numberOfTheCar, int numberOfSeats, String tires) {
        super(brand, model, year, country, color, maxSpeed);
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.transmission = transmission == null || transmission.isBlank() || transmission.isEmpty() ? "механический" : transmission;
        this.carBody = carBody == null || carBody.isBlank() || carBody.isEmpty() ? "седан" : carBody;
        this.numberOfTheCar = numberOfTheCar == null || numberOfTheCar.isBlank() || numberOfTheCar.isEmpty() ? "Default" : numberOfTheCar;
        this.numberOfSeats = numberOfSeats <= 0 ? 5 : numberOfSeats;
        this.tires = tires == null || tires.isBlank() || tires.isEmpty() ? "летняя" : tires;
    }

    public void choiceOfTires (int month) {
        if (month >= 4 && month < 10) {
            setTires("летняя");
        }
        else setTires("зимняя");
    }
    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getCarBody() {
        return carBody;
    }

    public String getNumberOfTheCar() {
        return numberOfTheCar;
    }

    public void setNumberOfTheCar(String numberOfTheCar) {
        this.numberOfTheCar = numberOfTheCar;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getTires() {
        return tires;
    }

    public void setTires(String tires) {
        this.tires = tires;
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", carBody='" + carBody + '\'' +
                ", numberOfTheCar='" + numberOfTheCar + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", tires='" + tires + '\'';
        }
}

public class Car {
    private final  String brand;
    private final String model;
    private double engineVolume;
    private String color;
    private final int year;
    private final String country;
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

    public Car(String brand, String model, double engineVolume, String color, int year, String country, String transmission,
               String carBody, String numberOfTheCar, int numberOfSeats, String tires) {
        this.brand = brand == null || brand.isBlank() || brand.isEmpty() ? "Default" : brand;
        this.model = model == null || model.isBlank() || model.isEmpty() ? "Default" : model;
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        this.color = color == null || color.isBlank() || color.isEmpty() ? "белый" : color;
        this.year = year <= 0 ? 2000 : year;
        this.country = country == null || country.isBlank() || country.isEmpty() ? "Default" : country;
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
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
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
        return getBrand() + " " + getModel() + ", объем двигателя - " +
                getEngineVolume() + "л., цвет кузова - " + getColor() +
                ", год выпуска - " + getYear() + ", страна-производитель - " + getCountry() +
                ", коробка передач - " + getTransmission() + ", тип кузова - " + getCarBody() +
                ", номер мащины - " + getNumberOfTheCar() + ", количество мест - " + getNumberOfSeats() + ", резина -" + getTires();
    }
}

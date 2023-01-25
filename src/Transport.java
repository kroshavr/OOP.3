public abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private final double engineVolume;
    public T driver;
    public Transport(String brand, String model, double engineVolume, T driver) {
        this.brand = brand == null || brand.isBlank() || brand.isEmpty() ? "Default" : brand;
        this.model = model == null || model.isBlank() || model.isEmpty() ? "Default" : model;
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        setDriver(driver);
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

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public abstract void startMoving();
    public abstract void stopMoving();

    @Override
    public String toString() {
        return  "Марка" + brand + '\'' +
                ", модель " + model + '\'' +
                ", объем двигателя " + engineVolume;
    }
}
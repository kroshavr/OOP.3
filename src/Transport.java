import java.util.ArrayList;
import java.util.List;
public abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private final double engineVolume;
    public T driver;
    public Mechanics mechanics;
    public Transport(String brand, String model, double engineVolume, T driver, Mechanics mechanics) {
        this.brand = brand == null || brand.isBlank() || brand.isEmpty() ? "Default" : brand;
        this.model = model == null || model.isBlank() || model.isEmpty() ? "Default" : model;
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        setDriver(driver);
        setMechanics(mechanics);
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

    public Mechanics getMechanics() {
        return mechanics;
    }

    public void setMechanics(Mechanics mechanics) {
        this.mechanics = mechanics;
    }

    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void printType();
    public void diagnostic() throws TransportTypeException {
    }

    @Override
    public String toString() {
        return "Марка " + brand  +
                ", модель " + model  +
                ", объем двигателя " + engineVolume;
    }
}
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Transport <T extends Driver> implements Competing {
    private final String brand;
    private final String model;
    private final double engineVolume;
    public T driver;

    private List<Mechanics> mechanicsList;


    public Transport(String brand, String model, double engineVolume, T driver, List<Mechanics> mechanicsList) {
        this.brand = brand == null || brand.isBlank() || brand.isEmpty() ? "Default" : brand;
        this.model = model == null || model.isBlank() || model.isEmpty() ? "Default" : model;
        this.engineVolume = engineVolume <= 0 ? 1.5 : engineVolume;
        setDriver(driver);
        this.mechanicsList = new ArrayList<>(mechanicsList);
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

    public List<Mechanics> getMechanicsList() {
        return mechanicsList;
    }

    public void setMechanicsList(List<Mechanics> mechanicsList) {
        this.mechanicsList = mechanicsList;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void printType();
    public void diagnostic() throws TransportTypeException {
    }
    public boolean needService() {
        try {
            diagnostic();
        } catch (TransportTypeException e) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Марка " + brand  +
                ", модель " + model  +
                ", объем двигателя " + engineVolume;
    }
}
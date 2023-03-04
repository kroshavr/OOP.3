public abstract class Driver {
    private final String name;
    private final boolean driverLicense;
    private final int experiens;

    public Driver(String name, boolean driverLicense, int experiens) {
        this.name = name;
        this.driverLicense = driverLicense;
        this.experiens = experiens;
    }

    public String getName() {
        return name;
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public int getExperiens() {
        return experiens;
    }

    public abstract void startMoving();
    public abstract void stopMoving();
    public abstract void refuel();

}

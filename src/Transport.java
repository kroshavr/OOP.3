public class Transport {
    private final String brand;
    private final String model;
    private final int year;
    private final String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        this.brand = brand == null || brand.isBlank() || brand.isEmpty() ? "Default" : brand;
        this.model = model == null || model.isBlank() || model.isEmpty() ? "Default" : model;
        this.year = year <= 0 ? 2000 : year;
        this.country = country == null || country.isBlank() || country.isEmpty() ? "Default" : country;
        this.color = color == null || color.isBlank() || color.isEmpty() ? "белый" : color;
        this.maxSpeed = maxSpeed <= 100 || maxSpeed >= 350 ? 180 : maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return  "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed;
    }
}
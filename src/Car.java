public class Car {
    private String name;
    private int yearGraduation;
    private double price;
    private String color;
    private double engineCapacity;

    public Car(String name, int yearGraduation, double price, String color, double engineCapacity) {
        this.name = name;
        this.yearGraduation = yearGraduation;
        this.price = price;
        this.color = color;
        this.engineCapacity = engineCapacity;
    }

    public Car() {
    }

    public String getName() {
        return name;
    }

    public int getYearGraduation() {
        return yearGraduation;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }
}

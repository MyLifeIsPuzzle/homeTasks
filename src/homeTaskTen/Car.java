package homeTaskTen;

import java.util.Objects;

public abstract class Car {

    private String mark;
    private String model;
    private String color;
    private int yearOfRelease;
    private double engineCapacity;

    public Car(String mark, String model, String color, int yearOfRelease, double engineCapacity) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.yearOfRelease = yearOfRelease;
        this.engineCapacity = engineCapacity;
    }

    public Car(String mark, String model, int yearOfRelease, double engineCapacity) {
        this.mark = mark;
        this.model = model;
        this.yearOfRelease = yearOfRelease;
        this.engineCapacity = engineCapacity;
        color = "none";
    }

    public Car() {
        mark = "none";
        model = "none";
        color = "none";
        yearOfRelease = 0;
        engineCapacity = 0.0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfRelease=" + yearOfRelease +
                ", engineCapacity=" + engineCapacity +
                ", ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return yearOfRelease == car.yearOfRelease &&
                Double.compare(car.engineCapacity, engineCapacity) == 0 &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model) &&
                Objects.equals(color, car.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model, color, yearOfRelease, engineCapacity);
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

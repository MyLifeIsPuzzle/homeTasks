package homeTaskTen;

import java.util.Objects;

public class MercedesS500 extends Car {

    private int amountOfCylinders;

    public MercedesS500() {
        super("Mercedes", "S500", "Black", 2018, 4.7);
        amountOfCylinders = 8;
    }

    public MercedesS500(int amountOfCylinders) {
        super("Mercedes", "S500", "Black", 2018, 4.7);
        this.amountOfCylinders = amountOfCylinders;
    }

    public MercedesS500(String color) {
        super("Mercedes", "S500", 2018, 4.7);
        amountOfCylinders = 8;
        this.setColor(color);
    }

    public MercedesS500(int amountOfCylinders, String color) {
        super("Mercedes", "S500", 2018, 4.7);
        this.amountOfCylinders = amountOfCylinders;
        this.setColor(color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MercedesS500 that = (MercedesS500) o;
        return amountOfCylinders == that.amountOfCylinders;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), amountOfCylinders);
    }

    @Override
    public String toString() {
        return super.toString() +
                "amountOfCylinders=" + amountOfCylinders +
                "}";
    }

    public int getAmountOfCylinders() {
        return amountOfCylinders;
    }
}

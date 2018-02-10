package homeTaskTen;

import java.util.Objects;

public class LexusLX570 extends Car {

    private int amountOfSeats;

    public LexusLX570() {
        super("Lexus", "LX570", "Grey", 2018, 5.7);
        amountOfSeats = 5;
    }

    public LexusLX570(int amountOfSeats) {
        super("Lexus", "LX570", "Grey", 2018, 5.7);
        this.amountOfSeats = amountOfSeats;
    }

    public LexusLX570(String color) {
        super("Lexus", "LX570", 2018, 5.7);
        amountOfSeats = 5;
        this.setColor(color);
    }

    public LexusLX570(int amountOfSeats, String color) {
        super("Lexus", "LX570", 2018, 5.7);
        this.amountOfSeats = amountOfSeats;
        this.setColor(color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        LexusLX570 that = (LexusLX570) o;
        return amountOfSeats == that.amountOfSeats;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), amountOfSeats);
    }

    @Override
    public String toString() {
        return super.toString() +
                "amountOfSeats=" + amountOfSeats +
                "}";
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }
}

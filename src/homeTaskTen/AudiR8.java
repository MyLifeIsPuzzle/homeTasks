package homeTaskTen;

import java.util.Objects;

public class AudiR8 extends Car {

    private int amountOfDoors;

    public AudiR8() {
        super("Audi", "R8", "Yellow", 2018, 5.2);
        amountOfDoors = 2;
    }

    public AudiR8(String color) {
        super("Audi", "R8", 2018, 5.2);
        amountOfDoors = 2;
        this.setColor(color);
    }

    public AudiR8(int amountOfDoors) {
        super("Audi", "R8", "Yellow", 2018, 5.2);
        this.amountOfDoors = amountOfDoors;

    }

    public AudiR8(int amountOfDoors, String color) {
        super("Audi", "R8", 2018, 5.2);
        this.amountOfDoors = amountOfDoors;
        this.setColor(color);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        AudiR8 audiR8 = (AudiR8) o;
        return amountOfDoors == audiR8.amountOfDoors;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), amountOfDoors);
    }

    @Override
    public String toString() {
        return super.toString() +
                "amountOfDoors=" + amountOfDoors +
                '}';
    }

    public int getAmountOfDoors() {
        return amountOfDoors;
    }
}

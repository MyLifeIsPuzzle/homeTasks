package homeTaskTen;

import java.util.Objects;

public class ChevroletCorvetteGrandSport extends Car {

    private Boolean removableRoof;

    public ChevroletCorvetteGrandSport() {
        super("Chevrolet", "CorvetteGrandSport", "Metallic", 2017, 6.2);
        removableRoof = true;
    }

    public ChevroletCorvetteGrandSport(String color) {
        super("Chevrolet", "CorvetteGrandSport", 2017, 6.2);
        removableRoof = true;
        this.setColor(color);
    }

    public ChevroletCorvetteGrandSport(Boolean removableRoof) {
        super("Chevrolet", "CorvetteGrandSport", "Metallic", 2017, 6.2);
        this.removableRoof = removableRoof;
    }

    public ChevroletCorvetteGrandSport(Boolean removableRoof, String color) {
        super("Chevrolet", "CorvetteGrandSport", 2017, 6.2);
        this.removableRoof = removableRoof;
        this.setColor(color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ChevroletCorvetteGrandSport that = (ChevroletCorvetteGrandSport) o;
        return Objects.equals(removableRoof, that.removableRoof);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), removableRoof);
    }

    @Override
    public String toString() {
        return super.toString() +
                "removableRoof=" + removableRoof +
                "}";
    }

    public Boolean getRemovableRoof() {
        return removableRoof;
    }
}

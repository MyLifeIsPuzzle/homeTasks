package homeTaskTwelve;

public enum Details {

    HEAD("Head"),
    TORSO("Torso"),
    LEFT_HAND("Left hand"),
    RIGHT_HAND("Right hand"),
    LEFT_LEG("Left leg"),
    RIGHT_LEG("Right leg"),
    CPU("CPU"),
    RAM("RAM"),
    HDD("HDD");

    private String name;

    Details(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
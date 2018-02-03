package homeTaskSeven;

public abstract class ShapeUnits {

    public static boolean isRectangle(Figure figure) {
        return figure instanceof Rectangle;
    }

    public static boolean isTriangle(Figure figure) {
        return figure instanceof Triangle;
    }

    public static boolean isCircle(Figure figure) {
        return figure instanceof Circle;
    }
}

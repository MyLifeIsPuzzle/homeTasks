package homeTaskSeven;

public class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double countDistance(Point point) {
        return Math.sqrt(Math.pow(x - point.getX(), 2) + Math.pow(y - point.getY(), 2));
    }

    public void showDistanceBetweenPoints(Point point) {
        System.out.printf("First point coordinates {%.2f|%.2f}\n", x, y);
        System.out.printf("Second point coordinates {%.2f|%.2f}\n", point.getX(), point.getY());
        System.out.printf("Distance between them = %.2f\n", countDistance(point));
    }

    @Override
    public String toString() {
        return "Point{" +
                "x = " + x +
                ", y = " + y +
                '}';
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}

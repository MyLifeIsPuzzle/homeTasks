package homeTaskSeven;

public class Circle extends Figure {

    private Point pointCenter;
    private Point pointOnCircle;
    private double area;
    private double radius;
    private double perimeter;

    public Circle(Point pointCenter, Point pointOnCircle) {
        if ((pointCenter.getY() == pointOnCircle.getY() && pointCenter.getX() == pointOnCircle.getX())) {
            System.out.println("Circle from this points doesn't exist");
            System.exit(1);
        } else {
            this.pointCenter = pointCenter;
            this.pointOnCircle = pointOnCircle;
            radius = countRadius();
            perimeter = countPerimeter();
            area = countArea();
        }
    }

    public double countRadius() {
        return pointCenter.countDistance(pointOnCircle);
    }

    @Override
    public double countArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double countPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle{\n" +
                "Center point = " + pointCenter +
                ",\nPoint on the circle = " + pointOnCircle +
                ",\nArea = " + area +
                ",\nRadius = " + radius +
                ",\nPerimeter = " + perimeter +
                "}\n";
    }
}

package homeTaskSeven;

public class Rectangle extends Figure implements RectanglesDiagonal {

    private Point pointLeft;
    private Point pointRight;
    private double width;
    private double height;
    private double area;
    private double diagonal;
    private double perimeter;

    public Rectangle(Point pointLeft, Point pointRight) {
        if ((pointLeft.getY() == pointRight.getY() || pointLeft.getX() == pointRight.getX())) {
            System.out.println("Rectangle from this points doesn't exist");
            System.exit(1);
        } else {
            this.pointLeft = pointLeft;
            this.pointRight = pointRight;
            width = Math.abs(pointLeft.getX() - pointRight.getX());
            height = Math.abs(pointLeft.getY() - pointRight.getY());
            area = countArea();
            diagonal = countDiagonal();
            perimeter = countPerimeter();
        }
    }

    public double countDiagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    @Override
    public double countArea() {
        return width * height;
    }

    @Override
    public double countPerimeter() {
        return width * 2 + height * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{\n" +
                "PointLeft = " + pointLeft +
                ",\nPointRight = " + pointRight +
                ",\nWidth = " + width +
                ",\nHeight = " + height +
                ",\nArea = " + area +
                ",\nDiagonal = " + diagonal +
                ",\nPerimeter = " + perimeter +
                "}\n";
    }
}

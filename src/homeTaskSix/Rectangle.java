package homeTaskSix;

public class Rectangle {

    private Point pointLeft;
    private Point pointRight;
    private double xDifference;
    private double yDifference;
    private double area;
    private double diagonal;

    public Rectangle(Point pointLeft, Point pointRight) {
        if ((pointLeft.getY() == pointRight.getY() || pointLeft.getX() == pointRight.getX())) {
            System.out.println("Coordinates can't be the same");
            System.exit(1);
        } else {
            this.pointLeft = pointLeft;
            this.pointRight = pointRight;
            xDifference = pointLeft.getX() - pointRight.getX();
            yDifference = pointLeft.getY() - pointRight.getY();
            area = countArea();
            diagonal = countDiagonal();
        }
    }

    public double countArea() {
        return Math.abs(xDifference * yDifference);
    }

    public double countDiagonal() {
        return Math.sqrt(Math.pow(xDifference, 2) + Math.pow(yDifference, 2));
    }

    public void showInfo() {
        System.out.printf("Rectangle's info:\nArea = %.2f\nDiagonal = %.2f", area, diagonal);
    }

    public Point getPointLeft() {
        return pointLeft;
    }

    public Point getPointRight() {
        return pointRight;
    }
}

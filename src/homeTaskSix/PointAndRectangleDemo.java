package homeTaskSix;

public class PointAndRectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(8, 6), new Point(1, 10));

        rectangle.getPointLeft().showDistanceBetweenPoints(rectangle.getPointRight());
        rectangle.showInfo();
    }
}

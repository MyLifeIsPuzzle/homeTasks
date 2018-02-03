package homeTaskSeven;

public class PointAndRectangleDemo {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new Point(10, 6), new Point(1, 10));
        EquilateralTriangle triangleOne = new EquilateralTriangle(5,5,5);
        RightTriangle triangleTwo = new RightTriangle(3,4,5);
        Circle circle = new Circle(new Point(0,0), new Point(5,0));

        System.out.println(rectangle.toString());
        System.out.println(triangleOne.toString());
        System.out.println(triangleTwo.toString());
        System.out.println(circle.toString());
        System.out.println(ShapeUnits.isTriangle(triangleOne));
        System.out.println(ShapeUnits.isRectangle(rectangle));
        System.out.println(ShapeUnits.isCircle(circle));
        rectangle.compareAreas(triangleOne );
    }
}

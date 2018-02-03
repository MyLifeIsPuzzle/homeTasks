package homeTaskSeven;

public class EquilateralTriangle extends Triangle {

    public EquilateralTriangle(double sideOne, double sideTwo, double sideThree) {
        super(sideOne, sideTwo, sideThree);
        if (!((sideOne == sideTwo) && (sideThree == sideThree))) {
            System.out.println("This isn't an equilateral triangle");
            System.exit(1);
        }
    }

    @Override
    public double countArea() {
        return getSideOne() * countTriangleHeight() / 2;
    }

    @Override
    public double countPerimeter() {
        return getSideOne() * 3;
    }

    @Override
    public double countTriangleHeight() {
        return Math.sqrt(3) * getSideOne() / 2;
    }
}

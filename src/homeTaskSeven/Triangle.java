package homeTaskSeven;

public class Triangle extends Figure implements TriangleHeight, ExistenceOfTriangle {

    private double sideOne;
    private double sideTwo;
    private double sideThree;
    private double halfPerimeter;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
        halfPerimeter = (sideOne + sideTwo + sideThree) / 2;
        if (!checkAnExistenceOfTheTriangle()) {
            System.out.println("Triangle with this sides doesn't exist");
            System.exit(1);
        }
    }

    @Override
    public double countArea() {
        return (sideOne * countTriangleHeight()) / 2;
    }

    @Override
    public double countPerimeter() {
        return sideOne + sideTwo + sideThree;
    }

    @Override
    public double countTriangleHeight() {
        return 2 / sideOne * Math.sqrt(halfPerimeter * Math.abs(halfPerimeter - sideOne)
                                                     * Math.abs(halfPerimeter - sideTwo)
                                                     * Math.abs(halfPerimeter - sideThree));
    }

    @Override
    public String toString() {
        return "Triangle{\n" +
                "1-st side = " + sideOne +
                ",\n2-nd side = " + sideTwo +
                ",\n3-rd side = " + sideThree +
                ",\nArea = " + countArea() +
                ",\nPerimeter = " + countPerimeter() +
                ",\nHeight = " + countTriangleHeight() +
                "}\n";
    }

    @Override
    public boolean checkAnExistenceOfTheTriangle() {
        return (((sideOne + sideTwo) > sideThree) &&
                ((sideOne + sideThree) > sideTwo) &&
                ((sideTwo + sideThree) > sideOne));
    }

    public double getSideOne() {
        return sideOne;
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public double getSideThree() {
        return sideThree;
    }
}

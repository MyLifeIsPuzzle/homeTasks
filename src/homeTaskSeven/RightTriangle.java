package homeTaskSeven;

public class RightTriangle extends Triangle {

    private double cathetusOne;
    private double cathetusTwo;
    private double hypotenuse;

    public RightTriangle(double sideOne, double sideTwo, double sideThree) {
        super(sideOne, sideTwo, sideThree);
        if ((sideOne * sideOne + sideTwo * sideTwo != sideThree * sideThree)
                && (sideThree * sideThree + sideTwo * sideTwo != sideOne * sideOne)
                && (sideOne * sideOne + sideThree * sideThree != sideTwo * sideTwo)) {
            System.out.println("This isn't a right triangle");
            System.exit(1);
        }
        findHypotenuse();
    }

    @Override
    public double countTriangleHeight() {
        return cathetusOne * cathetusTwo / hypotenuse;
    }

    @Override
    public double countArea() {
        return cathetusOne * cathetusTwo / 2;
    }

    public void findHypotenuse() {
        if (getSideOne() > getSideTwo() && getSideOne() > getSideThree()) {
            hypotenuse = getSideOne();
            cathetusOne = getSideTwo();
            cathetusTwo = getSideThree();
        } else if (getSideTwo() > getSideOne() && getSideTwo() > getSideThree()) {
            hypotenuse = getSideTwo();
            cathetusOne = getSideOne();
            cathetusTwo = getSideThree();
        } else {
            hypotenuse = getSideThree();
            cathetusOne = getSideOne();
            cathetusTwo = getSideTwo();
        }
    }

    @Override
    public String toString() {
        return "Triangle{\n" +
                "1-st cathetus = " + cathetusOne +
                ",\n2-nd cathetus = " + cathetusTwo +
                ",\nHypotenuse = " + hypotenuse +
                ",\nArea = " + countArea() +
                ",\nPerimeter = " + countPerimeter() +
                ",\nHeight = " + countTriangleHeight() +
                "}\n";
    }
}

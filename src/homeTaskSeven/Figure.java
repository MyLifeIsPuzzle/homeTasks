package homeTaskSeven;

public abstract class Figure {

    public abstract double countArea();

    public abstract double countPerimeter();

    public int compareAreas(Figure figure) {
        if (this.countArea() > figure.countArea()) {
            System.out.println("Area of the current figure is bigger");
            return 1;
        } else if (this.countArea() < figure.countArea()) {
            System.out.println("Area of the current figure is less");
            return -1;
        } else {
            System.out.println("Areas are the same");
            return 0;
        }
    }
}

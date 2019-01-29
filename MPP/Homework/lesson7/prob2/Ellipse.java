package lab7.prob2;

public class Ellipse implements ClosedCurve {
    private double a, E;

    public Ellipse(double a, double E) {
        this.a = a;
        this.E = E;
    }

    @Override
    public double computePerimeter() {
        return 4 * a * E;
    }
}

package lab7.prob2;

public interface Polygon extends ClosedCurve {

    default double computePerimeter() {
        double sum = 0L;
        for (double lengthSide : getSides()) {
            sum += lengthSide;
        }
        return sum;
    }

    double[] getSides();
}

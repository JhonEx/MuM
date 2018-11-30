package prog4;

public final class Triangle {
	private double base;
	private double height;

	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}

	public double computeArea() {
		return 1 / 2 * base * height;
	}
}

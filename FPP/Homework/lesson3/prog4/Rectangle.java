package prog4;

public final class Rectangle {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double computeArea() {
		return width * height;
	}
}

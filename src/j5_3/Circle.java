package j5_3;

public class Circle {
	protected double radius;
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	public double getRadius() {
		return radius;
	}
}

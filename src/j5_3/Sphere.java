package j5_3;

public class Sphere extends Circle {
	public Sphere(double radius) {
		super(radius);
	}
	
	public double getVol() {
		return (4/3)*Math.PI*Math.pow(radius, 3);
	}

}

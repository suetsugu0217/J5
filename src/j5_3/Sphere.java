package j5_3;

public class Sphere extends Circle {
	public Sphere(double radius) {
		super(radius);
	}
	
	public double getVol() {
		//4/3は1になってしまうため注意
		return (4.0/3.0)*Math.PI*Math.pow(radius, 3);
	}

}

package j5_3;

public class Cone extends Circle {
	double height;
	public Cone(double radius, double height){
		super(radius);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getVol() {
		return (super.getArea()*height)/3;
	}

}

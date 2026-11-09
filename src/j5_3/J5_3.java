package j5_3;

public class J5_3 {

	public static void main(String[] args) {
	
		Circle cir = new Circle(2);
		Sphere sph = new Sphere(2);
		Cylinder cyl = new Cylinder(2, 3);
		Cone con = new Cone(2, 3);
		
		System.out.println("円");
		System.out.print("半径：");
		System.out.println(cir.getRadius());
		System.out.print("面積：");
		System.out.println(cir.getArea());
		System.out.println("球");
		System.out.print("半径：");
		System.out.println(sph.getRadius());
		System.out.print("体積：");
		System.out.println(sph.getVol());
		System.out.println("円柱");
		System.out.print("半径：");
		System.out.println(cyl.getRadius());
		System.out.print("高さ：");
		System.out.println(cyl.getHeight());
		System.out.print("体積：");
		System.out.println(cyl.getVol());
		System.out.println("円錐");
		System.out.print("半径：");
		System.out.println(con.getRadius());
		System.out.print("高さ：");
		System.out.println(con.getHeight());
		System.out.print("体積：");
		System.out.println(con.getVol());

	}

}

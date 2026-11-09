package j5_2;

abstract class Light {
	String str;
	public Light(String str){
		this.str = str;
	}
	//print()を必ず実装しなければならない
	abstract void print();
}

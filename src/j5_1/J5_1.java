package j5_1;

public class J5_1 {

	public static void main(String[] args) {
		//親クラスは子クラスのインスタンスを生成できる
		ClassA a = new ClassC();
		a.print();
		a = new ClassB();
		a.print();
		a = new ClassA();
		a.print();
	}

}

package j5_4;

public class J5_4 {

	public static void main(String[] args) {
		//それぞれの駒を置くインスタンス
		Computer c1 = new Computer('①');
		Computer c2 = new Computer('②');
		Computer c3 = new Computer('③');
		
		Board.clear();
		
		//3回繰り返し盤面を埋める
		for(int i=0; i<3; i++) {
			c1.put();
			Board.print();
			c2.put();
			Board.print();
			c3.put();
			Board.print();
		}
		
	}

}

package j5_4;

public class J5_4 {

	public static void main(String[] args) {
		Computer c1 = new Computer('①');
		Computer c2 = new Computer('②');
		Computer c3 = new Computer('③');
		
		Board.clear();
		
		c1.put();
		Board.print();
		c2.put();
		Board.print();
		c3.put();
		Board.print();
		c1.put();
		Board.print();
		c2.put();
		Board.print();
		c3.put();
		Board.print();
		c1.put();
		Board.print();
		c2.put();
		Board.print();
		c3.put();
		Board.print();
	}

}

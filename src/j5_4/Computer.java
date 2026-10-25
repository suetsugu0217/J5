package j5_4;

public class Computer extends Board {

	char piece;
	
	public Computer(char piece) {
		this.piece = piece;
	}

	public void put() {

		int x; int y;
		
		do {
			x = (int)(Math.random()*3);
			y = (int)(Math.random()*3);
		}
		while(board[y][x] != '〇');
		
		board[y][x] = piece;
		
	}

}

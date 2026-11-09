package j5_4;

public class Computer extends Board {

	char piece;
	
	public Computer(char piece) {
		this.piece = piece;
	}

	public void put() {
		
		//置く座標を保存する変数
		int x; int y;
		
		do {
			x = (int)(Math.random()*3);
			y = (int)(Math.random()*3);
		}
		while(board[y][x] != '〇'); //空きを見つけるまで探す
		
		board[y][x] = piece;
		
	}

}

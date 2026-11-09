package j5_4;

abstract class Board {

	static char board [][] = new char[3][3];
	
	abstract void put();
	
	//盤面を〇で埋める
	static void clear() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				board[i][j] = '〇';
			}
		}
	}
	
	//盤面を表示する
	static void print() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(board[i][j]);
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}

}

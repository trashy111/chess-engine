package main.evaluation;

public class Evaluation {
	public boolean idk;
	public Evaluation(){
		idk=true;
	}

	public static int evaluateBoard(int[][] board){ // t=white, f=black

		int score=0; // might change to a double eventually, that or just bump the size of everything WAY up.

		/*
		Pawn: 1
		Knight: 3
		Bishop: 3
		Rook: 5
		Queen: 9

		Friendly King 200
		Enemy King 200
		 */

		// Count up material value
		int multiplier = (board[8][0]==1)?1:-1;
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				score+= multiplier * valueOfPiece(board[i][j]);
			}
		}

		return score;
	}

	public static int valueOfPiece(int type){
		/*
		Pawn: 1
		Knight: 3
		Bishop: 3
		Rook: 5
		Queen: 9

		Friendly King 200
		Enemy King 200
		 */
		switch(type){
			case 0:
				return 0;
			case -1:
				return 20000;
			case 1:
				return 40000;
			case -2:
			case 2:
				return 300;
			case -3:
			case 3:
				return 300;
			case -4:
			case 4:
				return 500;
			case -5:
			case 5:
				return 900;
			case -6:
			case 6:
				return 100;
		}

		return 0;
	}
}

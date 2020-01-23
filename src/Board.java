
public class Board {
	Piece[][] board;
	
	Board(int squareLength) {
		board = new Piece[squareLength][squareLength];
	}
	public void insertChessPiece(Piece c, int x, int y) {
		board[x][y] = c;
	}
	public int numberOfPiecesOnBoard() {
		int numberOfPieces = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != null) {
					numberOfPieces++;
				}
			}
		}
		return numberOfPieces;
	}
	public int numberOfPiecesOnBoard(Colour c) {
		int numberOfPieces = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] != null && board[i][j].colour == c) {
					numberOfPieces++;
				}
			}
		}
		return numberOfPieces;
	}
}

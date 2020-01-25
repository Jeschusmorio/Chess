
public class Board {
	Piece[][] board;
	Colour w = Colour.WHITE;
	Colour b = Colour.BLACK;
	
	Board(int squareLength) {
		board = new Piece[squareLength][squareLength];
	}
	public void insertChessPiece(Piece c, int x, int y) {
		try {
			if (testForPiece(x, y)) {
				System.out.println("Auf dem Feld ["+x+"] ["+y+"] liegt schon eine Speilfigur!\n");
				return;
			}
			board[x][y] = c;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Dieses Feld existiert nicht!\n");
			return;
		}
		
	}
	public void removeChessPiece(Piece c) {
		int[] coordinates = getCoordinatesOfPiece(c);
		int x = coordinates[0];
		int y = coordinates[1];
		if (x < 0 || y < 0) {
			System.out.println("Die Spielfigur ist nicht auf dem Brett!");
			return;
		}
		board[x][y] = null;
	}
	private boolean testForPiece(int x, int y) {
		if (board[x][y] == null) {
			return false;	//this is a free field
		}
		else {
			return true;	//a piece is already on this field
		}
	}
	private int[] getCoordinatesOfPiece(Piece c) { //coordinates[0] = x; coordinates[1] = y
		int[] coordinates = {-1, -1};	//negative values for error-detection if piece isn't on the board
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == c) { 		
					coordinates[0] = i;
					coordinates[1] = j;
					return coordinates;
				}
			}
		}
		return coordinates;
	}
	public int numberOfPiecesOnBoard() {
		int numberOfPieces = numberOfPiecesOnBoard(w) + numberOfPiecesOnBoard(b);
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
	public void showBoard() {
		//display the header of the board
		System.out.println();
		System.out.print("   ");
		for (int i = 0; i < board.length; i++) {
			System.out.print(i+" ");
		}
		System.out.println("");
		
		//display the content of the board
		for (int i = 0; i < board.length; i++) {
			System.out.print(i+" |");
			for (int j = 0; j < board.length; j++) {
				try {
					System.out.print(board[j][i].type + "|");
				} catch (NullPointerException e) {
					System.out.print(" |");
				}
			}
			System.out.println();
		}
	}
}

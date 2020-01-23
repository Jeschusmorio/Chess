
public class ChessMain {
	final static int BOARDLENGTH = 8;
	final static int NUMBEROFKINGS = 2;
	final static int NUMBEROFQUEENS = 2;
	final static int NUMBEROFROOKS = 4;
	final static int NUMBEROFBISHOPS = 4;
	final static int NUMBEROFKNIGHTS = 4;
	final static int NUMBEROFPAWNS = 16;
	final static int NUMBEROFPIECES = NUMBEROFKINGS + NUMBEROFQUEENS + 
			NUMBEROFROOKS + NUMBEROFBISHOPS + NUMBEROFKNIGHTS + NUMBEROFPAWNS;

	public static void main(String[] args) {
		ChessPieceType king = ChessPieceType.KING;
		ChessPieceType queen = ChessPieceType.QUEEN;
		ChessPieceType rook = ChessPieceType.ROOK;
		ChessPieceType bishop = ChessPieceType.BISHOP;
		ChessPieceType knight = ChessPieceType.KNIGHT;
		ChessPieceType pawn = ChessPieceType.PAWN;
		
		Board b1 = new Board(BOARDLENGTH);
		
		Piece[] kings = new Piece[NUMBEROFKINGS];
		createPiece(kings, king);
		Piece[] queens = new Piece[NUMBEROFQUEENS];
		createPiece(queens, queen);
		Piece[] rooks = new Piece[NUMBEROFROOKS];
		createPiece(rooks, rook);
		Piece[] bishops = new Piece[NUMBEROFBISHOPS];
		createPiece(bishops, bishop);
		Piece[] knights = new Piece[NUMBEROFKNIGHTS];
		createPiece(knights, knight);
		Piece[] pawns = new Piece[NUMBEROFPAWNS];
		createPiece(pawns, pawn);
		
		
	}
	private static void createPiece(Piece[] p, ChessPieceType t) {
		Colour w = Colour.WHITE;
		Colour b = Colour.BLACK;
		for (int i = 0; i < p.length; i++) {
			if (i < (p.length/2)) {
				p[i] = new Piece(w, t);
			}
			else {
				p[i] = new Piece(b, t);
			}
		}
	}

}

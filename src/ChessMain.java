import java.util.Random;

public class ChessMain {
	final static int BOARDLENGTH = 8;

	public static void main(String[] args) {
		Random r = new Random();
		ChessPieceType king = ChessPieceType.KING;
		ChessPieceType queen = ChessPieceType.QUEEN;
		ChessPieceType rook = ChessPieceType.ROOK;
		ChessPieceType bishop = ChessPieceType.BISHOP;
		ChessPieceType knight = ChessPieceType.KNIGHT;
		ChessPieceType pawn = ChessPieceType.PAWN;
		
		Colour w = Colour.WHITE;
		Colour b = Colour.BLACK;
		
		Board b1 = new Board(BOARDLENGTH);
		
		Piece pawn1 = new Piece(w, pawn);
		Piece pawn2 = new Piece(b, pawn);
		Piece king1 = new Piece(b, king);
		Piece queen1 = new Piece(w, queen);
		Piece rook1 = new Piece(b, rook);
		Piece knight1 = new Piece(w, knight);
		Piece bishop1 = new Piece(w, bishop);
		
		b1.insertChessPiece(pawn1, 0, 0);
		//b1.insertChessPiece(pawn2, 2, 2);
		b1.removeChessPiece(pawn2);
		b1.insertChessPiece(pawn2, 0, 0);
		b1.insertChessPiece(king1, 2, 2);
		b1.insertChessPiece(queen1, r.nextInt(BOARDLENGTH), r.nextInt(BOARDLENGTH));
		b1.insertChessPiece(rook1, r.nextInt(BOARDLENGTH), r.nextInt(BOARDLENGTH));
		b1.insertChessPiece(knight1, r.nextInt(BOARDLENGTH), r.nextInt(BOARDLENGTH));
		b1.insertChessPiece(bishop1, r.nextInt(BOARDLENGTH), r.nextInt(BOARDLENGTH));
		
		System.out.println(b1.numberOfPiecesOnBoard(w));
		System.out.println(b1.numberOfPiecesOnBoard(b));
		System.out.println(b1.numberOfPiecesOnBoard());
	}

}

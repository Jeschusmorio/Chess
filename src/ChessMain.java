import java.util.Random;

public class ChessMain {
	final static int BOARDLENGTH = 8;

	public static void main(String[] args) {
		Random r = new Random();
		ChessPieceType king = ChessPieceType.K;
		ChessPieceType queen = ChessPieceType.Q;
		ChessPieceType rook = ChessPieceType.R;
		ChessPieceType bishop = ChessPieceType.B;
		ChessPieceType knight = ChessPieceType.N;
		ChessPieceType pawn = ChessPieceType.P;
		
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
		
		System.out.println("Weiﬂe Figuren auf dem Brett: " + b1.numberOfPiecesOnBoard(w));
		System.out.println("Schwarze Figuren auf dem Brett: " + b1.numberOfPiecesOnBoard(b));
		System.out.println("Anzahl aller Figuren auf dem Brett: " + b1.numberOfPiecesOnBoard());
		
		b1.showBoard();
	}

}

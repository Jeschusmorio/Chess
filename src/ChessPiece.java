
public abstract class ChessPiece {
	Colour colour;
	ChessPieceType type;
	
	ChessPiece(Colour colour, ChessPieceType type) {
		this.colour = colour;
		this.type = type;
	}
}

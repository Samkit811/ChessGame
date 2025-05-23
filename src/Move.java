public class Move {
    private Piece piece;
    private Colour colour;
    private Integer desRow;
    private Integer desColumn;

    public Move(Colour colour, Piece piece, Integer desRow, Integer desColumn){
        this.colour = colour;
        this.desColumn = desColumn;
        this.desRow = desRow;
        this.piece = piece;
    }

    public Integer getDesColumn() {
        return this.desColumn;
    }

    public Integer getDesRow() {
        return this.desRow;
    }

    public Piece getPiece() {
        return piece;
    }
}

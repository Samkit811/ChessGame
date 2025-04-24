import java.awt.*;

public class Pawn extends Piece{

    public Pawn(Colour colour, Integer row, Integer column) {
        super(colour, row, column);
    }

    @Override
    public boolean canMove(Board board, Integer desRow, Integer desColumn) {
        int row = this.getRow(), col = this.getColumn();
        int rowDiff = desRow - row;
        int colDiff = Math.abs(desColumn - col);

        Colour pieceColour = this.getColour();
        if (pieceColour == Colour.WHITE) {
            return (rowDiff == 1 && colDiff == 0) ||
                    (row == 1 && rowDiff == 2 && colDiff == 0) ||
                    (rowDiff == 1 && colDiff == 1 && board.getPiece(desRow, desColumn) != null);
        } else {
            return (rowDiff == -1 && colDiff == 0) ||
                    (row == 6 && rowDiff == -2 && colDiff == 0) ||
                    (rowDiff == -1 && colDiff == 1 && board.getPiece(desRow, desColumn) != null);
        }
    }
}

import java.util.Objects;

public class Rook extends Piece {
    public Rook(Colour colour, Integer row, Integer column) {
        super(colour, row, column);
    }

    @Override
    public boolean canMove(Board board, Integer desRow, Integer desColumn) {
        return Objects.equals(desRow, this.getRow()) || Objects.equals(desColumn, this.getColumn());
    }
}

import java.util.Objects;

public class Queen extends Piece{
    public Queen(Colour colour, Integer row, Integer column) {
        super(colour, row, column);
    }

    @Override
    public boolean canMove(Board board, Integer desRow, Integer desColumn) {
        if(Objects.equals(desRow, this.getRow())){
            return true;
        }
        if(Objects.equals(desColumn, this.getColumn())){
            return true;
        }
        int rowDiff = Math.abs(desRow - this.getRow());
        int columDiff = Math.abs(desColumn - this.getColumn());
        return rowDiff == columDiff;
    }
}

public class Bishop extends Piece {

    public Bishop(Colour colour, Integer row, Integer column) {
        super(colour, row, column);
    }

    @Override
    public boolean canMove(Board board, Integer desRow, Integer desColumn) {
        int rowDiff = Math.abs(desRow - this.getRow());
        int columDiff = Math.abs(desColumn - this.getColumn());
        return rowDiff == columDiff;
    }
}

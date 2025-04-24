public class King extends Piece {
    public King(Colour colour, Integer row, Integer column) {
        super(colour, row, column);
    }

    @Override
    public boolean canMove(Board board, Integer desRow, Integer desColumn) {
        int rowDiff = Math.abs(desRow - this.getRow());
        int columDiff = Math.abs(desColumn - this.getColumn());
        return rowDiff <=1 && columDiff <=1;
    }
}

public class Knight extends Piece {

    public Knight(Colour colour, Integer row, Integer column) {
        super(colour, row, column);
    }

    @Override
    public boolean canMove(Board board, Integer desRow, Integer desColumn) {
        int rowDiff = Math.abs(desRow - this.getRow());
        int columDiff = Math.abs(desColumn - this.getColumn());
        return (rowDiff == 2 && columDiff == 1) || (rowDiff == 1 && columDiff == 2);
    }
}

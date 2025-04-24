public abstract class Piece {
    private Colour colour;
    private Integer row;
    private Integer column;

    public Piece(Colour colour, Integer row, Integer column){
        this.colour = colour;
        this.row = row;
        this.column = column;
    }

    public abstract boolean canMove(Board board, Integer desRow, Integer desColumn);

    public Colour getColour() {
        return colour;
    }

    public Integer getColumn() {
        return column;
    }

    public Integer getRow() {
        return row;
    }

    public void setColumn(Integer column) {
        this.column = column;
    }

    public void setRow(Integer row) {
        this.row = row;
    }
}

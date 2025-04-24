public class Player {
    private String name;
    private Integer id;
    private Colour colour;

    public Player(String name, Integer id, Colour colour){
        this.name = name;
        this.id = id;
        this.colour = colour;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Colour getColour() {
        return colour;
    }

    public void makeMove(Board board, Move move){
        Piece piece = move.getPiece();
        Integer desRow = move.getDesRow();
        Integer desColumn = move.getDesColumn();

        if(board.isValidMove(piece, desRow, desColumn)){
            Integer curRow = piece.getRow();
            Integer currColumn = piece.getColumn();

            board.setPiece(null, curRow, currColumn);

            piece.setColumn(desColumn);
            piece.setRow(desRow);

            board.setPiece(piece, desRow, desColumn);
        }else{
            throw new InvalidMove("Invalid Move!!");
        }
    }
}

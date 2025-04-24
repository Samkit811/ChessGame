import java.awt.*;

public class Board {
    private Piece[][] board;

    public Board() {
        board = new Piece[8][8];
        this.initializeBoard();
    }

    private void initializeBoard(){
        // Initialize white pieces
        board[0][0] = new Rook(Colour.WHITE, 0, 0);
        board[0][1] = new Knight(Colour.WHITE, 0, 1);
        board[0][2] = new Bishop(Colour.WHITE, 0, 2);
        board[0][3] = new Queen(Colour.WHITE, 0, 3);
        board[0][4] = new King(Colour.WHITE, 0, 4);
        board[0][5] = new Bishop(Colour.WHITE, 0, 5);
        board[0][6] = new Knight(Colour.WHITE, 0, 6);
        board[0][7] = new Rook(Colour.WHITE, 0, 7);
        for (int i = 0; i < 8; i++) {
            board[1][i] = new Pawn(Colour.WHITE, 1, i);
        }

        // Initialize black pieces
        board[7][0] = new Rook(Colour.BLACK, 7, 0);
        board[7][1] = new Knight(Colour.BLACK, 7, 1);
        board[7][2] = new Bishop(Colour.BLACK, 7, 2);
        board[7][3] = new Queen(Colour.BLACK, 7, 3);
        board[7][4] = new King(Colour.BLACK, 7, 4);
        board[7][5] = new Bishop(Colour.BLACK, 7, 5);
        board[7][6] = new Knight(Colour.BLACK, 7, 6);
        board[7][7] = new Rook(Colour.BLACK, 7, 7);
        for (int i = 0; i < 8; i++) {
            board[6][i] = new Pawn(Colour.BLACK, 6, i);
        }
    }

    public void setPiece(Piece piece, Integer row, Integer column){
        board[row][column] = piece;
    }

    public Piece getPiece(Integer row, Integer column){
        return board[row][column];
    }

    public Boolean isValidMove(Piece piece, Integer desRow, Integer desColumn){
        if(desRow < 0 || desColumn < 0 || desRow >= 8 || desColumn >= 8){
            throw new InvalidMove("Moving Out of the board!!");
        }
        Piece destPiece = board[desRow][desColumn];
        if(piece == null){
            return false;
        }
        if(destPiece != null && piece.getColour() == destPiece.getColour()){
            return false;
        }
        return piece.canMove(this, desRow, desColumn);
    }

    public Boolean checkMate(Colour colour){
        // Implement the checkmate logic
        return false;
    }

    public Boolean stealMate(Colour colour){
        //Implement the checkmate logic
        return false;
    }
}

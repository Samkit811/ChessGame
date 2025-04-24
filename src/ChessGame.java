import java.util.Objects;
import java.util.Scanner;

public class ChessGame {
    Board board;
    Player player1;
    Player player2;
    Integer currentPlayerId;

    public ChessGame(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;
        this.board = new Board();
        this.currentPlayerId = 0;
    }

    public void startGame(){
        Player player = this.player1;
        while(!this.isGameOver()){
            if(Objects.equals(this.player1.getId(), currentPlayerId)){
                player = this.player1;
            } else {
                player = this.player2;
            }

            System.out.println("Current Player playing: " + player.getName());

            Move move = this.getPlayerMove(player);

            try{
                player.makeMove(this.board, move);
            } catch (Exception e) {
                System.out.println("Try Again!");
                continue;
            }

            currentPlayerId = 1 - currentPlayerId;

        }
        displayWinner(player);
    }

    private Boolean isGameOver(){
        return this.board.checkMate(this.player1.getColour()) || this.board.checkMate(this.player2.getColour()) || this.board.stealMate(this.player1.getColour()) || this.board.stealMate(this.player2.getColour());
    }

    private Move getPlayerMove(Player player){
        // Implement logic
        // For simplicity, let's assume the player enters the move via console input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter source row: ");
        int sourceRow = scanner.nextInt();
        System.out.print("Enter source column: ");
        int sourceCol = scanner.nextInt();
        System.out.print("Enter destination row: ");
        int destRow = scanner.nextInt();
        System.out.print("Enter destination column: ");
        int destCol = scanner.nextInt();

        Piece piece = board.getPiece(sourceRow, sourceCol);
        if (piece == null || piece.getColour() != player.getColour()) {
            throw new IllegalArgumentException("Invalid piece selection!");
        }

        return new Move(player.getColour(), piece, destRow, destCol);
    }

    private void displayWinner(Player player){
        System.out.println("Winning Player: " + player.getName());
    }
}

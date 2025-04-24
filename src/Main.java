public class Main {
    public static void main(String[] args) {
        Player player1 = new Player("Jack", 0, Colour.WHITE);
        Player player2 = new Player("Rajesh", 1, Colour.BLACK);

        ChessGame chessGame = new ChessGame(player1, player2);
        chessGame.startGame();
    }
}
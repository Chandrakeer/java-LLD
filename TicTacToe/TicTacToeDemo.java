package TicTacToe;

import TicTacToe.model.*;
import TicTacToe.Strategy.*;

import java.util.*;

public class TicTacToeDemo {
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Player player1 = new Player("Alice", Symbol.X);
        Player player2 = new Player("Bob", Symbol.O);

        Board board = new Board(3);

        List<WinningStrategy> strategies = new ArrayList<>();

        strategies.add(new RowWinningStrategy());
        strategies.add(new ColumnWinningStrategy());
        strategies.add(new DiagonalWinningStrategy());


        Game game = new Game(
                board,
                player1,
                player2,
                strategies
        );

        while (!game.isGameOver()) {

            board.printBoard();

            System.out.println();
            System.out.println(game.getCurrentPlayer().getName() + "'s Turn");

            System.out.print("Row : ");
            int row = scanner.nextInt();

            System.out.print("Column : ");
            int col = scanner.nextInt();

            boolean success = game.makeMove(row, col);

            if (!success) {
                System.out.println("Invalid Move! Try Again.");
            }
        }

        System.out.println();
        board.printBoard();

        if (game.getStatus() == GameStatus.WINNER) {
            System.out.println("Winner : " + game.getWinner().getName());
        } else {
            System.out.println("Game Drawn!");
        }

        scanner.close();

    }
}

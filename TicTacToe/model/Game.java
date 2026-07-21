package TicTacToe.model;

import TicTacToe.Strategy.WinningStrategy;

import java.util.List;


public class Game {
    
    private final Board board;
    private final Player player1;
    private final Player player2;

    private Player currentPlayer;
    private Player winner;

    private GameStatus status;

    private final List<WinningStrategy> strategies;

    public Game(Board board, Player player1, Player player2, List<WinningStrategy> strategies){

        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.strategies = strategies;

        this.currentPlayer = player1;
        this.status = GameStatus.IN_PROGRESS;
    }

    public boolean makeMove(int row, int col){

        boolean placed = board.placeSymbol(row, col, currentPlayer.getSymbol());

        if(!placed){
            return false;
        }

        // Check Winner
        for(WinningStrategy strategy : strategies){

            if(strategy.checkWinner(board, currentPlayer, row, col)) {

                winner = currentPlayer;
                status = GameStatus.WINNER;
                return true;
            }
        }

        // Draw
        if(board.isFull()){
            status = GameStatus.DRAW;
            return true;
        }

        switchPlayer();
        return true;
    }

    private void switchPlayer(){
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    public boolean isGameOver(){
        return status != GameStatus.IN_PROGRESS;
    }

    public Player getCurrentPlayer(){
        return currentPlayer;
    }

    public Player getWinner(){
        return winner;
    }

    public GameStatus getStatus(){
        return status;
    }

    public Board getBoard(){
        return board;
    }
}

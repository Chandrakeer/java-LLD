package TicTacToe.Strategy;

import TicTacToe.model.Board;
import TicTacToe.model.Player;

public interface WinningStrategy { 
    
    boolean checkWinner(Board board, Player player, int row, int col);
}

package TicTacToe.Strategy;

import TicTacToe.model.Board;
import TicTacToe.model.Player;

/**
 * Strategy to check if a player has won by filling an entire column.
 */
public class ColumnWinningStrategy implements WinningStrategy {
    
    @Override
    public boolean checkWinner(Board board, Player player, int row, int col){

        int size = board.getSize();

        for( int i = 0; i < size; i++){

            if(board.getCell(i, col).getSymbol() != player.getSymbol()){
                return false;
            }
        }
        return true;
    }
}

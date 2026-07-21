package TicTacToe.Strategy;

import TicTacToe.model.Board;
import TicTacToe.model.Player;

public class RowWinningStrategy implements WinningStrategy {
    
    @Override
    public boolean checkWinner(Board board, Player player, int row, int col){
        
        int size = board.getSize();

        for( int j = 0; j < size; j++){

            if(board.getCell(row, j).getSymbol() != player.getSymbol()){
                return false;
            }
        }
        return true;
    }

   
}

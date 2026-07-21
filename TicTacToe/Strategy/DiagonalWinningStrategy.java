package TicTacToe.Strategy;

import TicTacToe.model.Board;
import TicTacToe.model.Player;

public class DiagonalWinningStrategy implements WinningStrategy {
    
    @Override
    public boolean checkWinner(Board board, Player player, int row, int col){
        
        int size = board.getSize();

        // Primary diagonal
        if(row == col){
            boolean win = true;

            for( int i = 0; i < size; i++){

                if(board.getCell(i, i).getSymbol() != player.getSymbol()){
                    win = false;
                    break;
                }
            }

            if(win){
                return true;
            }
        }

        // Secondary diagonal
        if(row + col == size - 1){

            for( int i = 0; i < size; i++){

                if(board.getCell(i, size - 1 - i).getSymbol() != player.getSymbol()){
                    return false;
                }
            }
            return true;
        }


        return false;
    }
}

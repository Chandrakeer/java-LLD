package TicTacToe.model;

public class Board {

    private final int size;
    private final Cell[][] cells;
    private int movesCount;

    public Board(int size){
        this.size = size;
        this.cells = new Cell[size][size];
        this.movesCount = 0;

        initializeBoard();
    }

    private void initializeBoard(){
        for( int i = 0; i < size; i++){
            for( int j = 0; j < size; j++){
                cells[i][j] = new Cell();
            }
        }
    }

    public boolean placeSymbol(int row, int col, Symbol symbol){

        if(!isValidMove(row, col)){
            return false;
        }

        cells[row][col].setSymbol(symbol);
        movesCount++;

        return true;
    }

    private boolean isValidMove(int col, int row){

        if ( row < 0 || row >= size || col < 0 || col >= size){
            return false;
        }

        return cells[row][col].isEmpty();
    }

    // get Cell
    public Cell getCell(int row, int col){
        return cells[row][col];
    }

    public boolean isFull(){
        return movesCount == size * size;
    }

    public int getSize(){
        return size;
    }


    public void printBoard(){

        for( int i = 0; i < size; i++){
            for( int j = 0; j < size; j++){

                System.out.print(cells[i][j].getSymbol());

                if(j != size - 1){
                    System.out.print("|");
                }
            }
            System.out.println();

            if ( i != size - 1){
                System.out.println("-".repeat(size * 4 - 1));
            }
        }
    }
   
}

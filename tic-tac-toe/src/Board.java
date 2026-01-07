public class Board {

    private final int size;
    private final char[][] grid;

    public Board(int size){
        this.size = size;
        this.grid = new char[size][size];

        for ( int i = 0; i < size; i++){
            for( int j = 0; j < size; j++){
                grid[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for ( int i = 0; i < size; i++){
            for ( int j = 0; j < size; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean placeMove(int row, int col, char symbol){

        //check if inside board
        if ( row < 0 || row >= size || col < 0 || col >= size){
            System.out.println("Invalid position!");
            return false;
        }

        if(grid[row][col] != '-'){
            System.out.println("Position already taken!");
            return false;
        }

        grid[row][col] = symbol;
        return true;

    }

    
}

public class Main{

    public static Player switchPlayer(Player current, Player p1, Player p2){
        if ( current == p1) return p2;
        return p1;
    }
    public static void main(String[] args){

        Player p1 = new Player("chandra", 'X');
        Player p2 = new Player("Piyush", 'O');

        System.out.println(p1);
        System.out.println(p2);

        Board board = new Board(3);

        System.out.println("\nCurrent Board:");
        board.printBoard();

        System.out.println("\nPlacing some moves...");

        board.placeMove(0, 0, 'X');
        board.placeMove(1, 1, 'O');
        board.placeMove(0, 2, 'X');

        board.printBoard();

        
    }
}
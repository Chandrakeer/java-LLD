package TicTacToe.model;

public class Player {

    private String name;
    private Symbol symbol;

    public Player(String name, Symbol symbol){
        this.name = name;
        this.symbol = symbol;
    }

    // getter
    public String getName(){
        return name;
    }

    public Symbol getSymbol(){
        return symbol;
    }
    
}

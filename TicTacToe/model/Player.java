package TicTacToe.model;

/**
 * Represents a player in the Tic Tac Toe game.
 */
public class Player {

    private final String name;
    private final Symbol symbol;

    /**
     * Creates a player with a name and symbol.
     * @param name the player's name
     * @param symbol the player's symbol (X or O)
     */
    public Player(String name, Symbol symbol){
        this.name = name;
        this.symbol = symbol;
    }

    /**
     * Gets the player's name.
     * @return the player's name
     */
    public String getName(){
        return name;
    }

    /**
     * Gets the player's symbol.
     * @return the player's symbol (X or O)
     */
    public Symbol getSymbol(){
        return symbol;
    }
    
}

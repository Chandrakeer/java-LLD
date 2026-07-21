package TicTacToe.model;


public class Cell {
    
    private Symbol symbol;

    // Constructor
    public Cell(){
        this.symbol = Symbol.EMPTY;
    }

    // Get Symbol
    public Symbol getSymbol(){
        return symbol;
    }

    // Set Symbol
    public void setSymbol(Symbol symbol){
        this.symbol = symbol;
    }

    // to check if symbol is empty
    public boolean isEmpty(){
        return symbol == Symbol.EMPTY;
    }
}

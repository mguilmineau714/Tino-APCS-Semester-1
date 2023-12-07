import java.util.*;

public class Board {       
    
    /* *** TO BE IMPLEMENTED IN ACTIVITY 4 *** */
    // Attributes
    Deck[] stacks;
    Deck drawPile;

    /**
     *  Sets up the Board and fills the stacks and draw pile from a Deck
     *  consisting of numDecks Decks.  Here are examples:
     *  
     *  # numDecks     #cards in overall Deck
     *      1          13 (all same suit)
     *      2          26 (all same suit)
     *      3          39 (all same suit)
     *      4          52 (all same suit)
     *      
     *  Once the overall Deck is built, it is shuffled and half the cards
     *  are placed as evenly as possible into the stacks.  The other half
     *  of the cards remain in the draw pile.
     */    
    public Board(int numStacks, int numDecks) {
        String[] symbols = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        Deck[] stacks = new Deck[numStacks];
        drawPile = new Deck();
        
        for(int i = 0; i < numStacks; i++) {
            stacks[i] = new Deck();
        }
        
        for(int i = 0; i < values.length; i++) {
            for(int j = 0; j < numDecks; j++) {
                Card addition = new Card(symbols[i], values[i]);
                drawPile.addCard(addition);
            }
        }
        
        drawPile.shuffle();
        
        for(int i = 0; i < numDecks; i++) {
            
        }
    }

    /**
     *  Moves a run of cards from src to dest (if possible) and flips the
     *  next card if one is available.
     */
    public void makeMove(String symbol, int src, int dest) {
        
        
    }

    /** 
     *  Moves one card onto each stack, or as many as are available
     */
    public void drawCards() {
        boolean a = true;
        for(Deck i : stacks) {
            if(i.getSize() == 0) a = false;
        }
        if(a) {
            for(Deck i : stacks) {
                if(drawPile.getSize() != 0) {
                    i.addCard(drawPile.remove(0));
                }
            }
        }
    }

    /**
     *  Returns true if all stacks and the draw pile are all empty
     */ 
    public boolean isEmpty() {
        for(Deck i : stacks) {
            if(i.getSize() != 0)  return false;
        }
        return drawPile.getSize() == 0;
    }

    /**
     *  If there is a run of A through K starting at the end of sourceStack
     *  then the run is removed from the game or placed into a completed
     *  stacks area.
     *  
     *  If there is not a run of A through K starting at the end of sourceStack
     *  then an invalid move message is displayed and the Board is not changed.
     */
    public void clear(int sourceStack) {
        /* *** TO BE IMPLEMENTED IN ACTIVITY 5 *** */
    }

    /**
     * Prints the board to the terminal window by displaying the stacks, draw
     * pile, and done stacks (if you chose to have them)
     */
    public void printBoard() {
        System.out.println("Stacks:");
        for(int i = 0; i < stacks.length; i++) {
            System.out.println(i+1 + ": " + stacks[i].toString());
        }
        System.out.println();
        System.out.println("Draw Pile:");
        System.out.println(drawPile.toString());
    }
}
import java.util.*;

public class DeckTester {
    public static void main(String[] args) {
        String[] symbols = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "T", "J", "Q", "K"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        Deck deck = new Deck();

        for(int i = 0; i < symbols.length; i++) {
            Card a = new Card(symbols[i], values[i]);
            a.setFaceUp(true);
            deck.addCard(a);
        }

        System.out.println("Deck:");
        System.out.println(deck.toString());
        
        // Testing other methods
        System.out.println("\nTesting other methods:");

        // Shuffle
        System.out.println("\nShuffling the deck:");
        deck.shuffle();
        System.out.println(deck.toString());

        // Remove
        System.out.println("\nRemoving a card from the deck:");
        Card removedCard = deck.remove(0);
        System.out.println("Removed card: " + removedCard);
        System.out.println("Remaining deck:");
        System.out.println(deck.toString());

        // Get Size
        System.out.println("\nSize of the deck: " + deck.getSize());

        // Draw
        System.out.println("\nDrawing a card from the deck:");
        Card drawnCard = deck.draw();
        System.out.println("Drawn card: " + drawnCard);
        System.out.println("Remaining deck:");
        System.out.println(deck.toString());

        // TakeTopNCards
        System.out.println("\nTaking the top 3 cards from the deck:");
        Deck topCards = deck.TakeTopNCards(3);
        System.out.println("Top 3 cards:");
        System.out.println(topCards);
        System.out.println("Remaining deck:");
        System.out.println(deck.toString());
    }
}


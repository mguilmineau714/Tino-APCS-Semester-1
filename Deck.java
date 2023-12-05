import java.util.*;

public class Deck {
    ArrayList<Card> deck = new ArrayList();

    public Deck(Deck deck) {
    
    }

    public void shuffle() {
        for(int i = 0; i < deck.size(); i++) {
            int random = (int)(Math.random()*deck.size());
            Card temp = deck.get(i);
            deck.set(i, deck.get(random));
            deck.set(random, temp);
        }
    }

    public String toString() {
        return "a";
    }

    public void add(Card card) {
        
    }
}

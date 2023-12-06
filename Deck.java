import java.util.*;

public class Deck {
    ArrayList<Card> deck = new ArrayList();

    public Deck(ArrayList<Card> deck) {
        this.deck = deck;
    }
    
    public Deck() {
        
    }
    
    @Override
    public String toString() {
        String output = "[";
        int count = 0;
        for(Card i : deck) {
            output += i;
            count++;
            output += count != deck.size() ? " " : "";
        }
        output += "]";
        return output;
    }
    
    public Card remove(int a) {
        return deck.remove(a);
    }
    
    public int getSize() {
        return deck.size();
    }

    public void shuffle() {
        for(int i = 0; i < deck.size(); i++) {
            int random = (int)(Math.random()*deck.size());
            Card temp = deck.get(i);
            deck.set(i, deck.get(random));
            deck.set(random, temp);
        }
    }

    public void addCard(Card card) {
        deck.add(card);
    }
    
    public Card getCard(int a) {
        return deck.get(a);
    }
    
    public Card draw() {
        Card temp = deck.get(deck.size()-1);
        deck.remove(temp);
        return temp;
    }
    
    public Deck TakeTopNCards(int n) {
        Deck output = new Deck();
        for(int i = 0; i < deck.size()-n; i++) {
            output.addCard(deck.get(i));
        }
        return output;
    }
}

public class CardTester {
    public static void main(String[] args) {
        // Creating several cards
        Card card1 = new Card("A", 1);
        Card card2 = new Card("10", 10);
        Card card3 = new Card("K", 13);
        Card card4 = new Card("Q", 12);

        // Testing getSymbol and getValue methods
        System.out.println("Card 1: Symbol = " + card1.getSymbol() + ", Value = " + card1.getValue());
        System.out.println("Card 2: Symbol = " + card2.getSymbol() + ", Value = " + card2.getValue());
        System.out.println("Card 3: Symbol = " + card3.getSymbol() + ", Value = " + card3.getValue());
        System.out.println("Card 4: Symbol = " + card4.getSymbol() + ", Value = " + card4.getValue());

        // Testing isFaceUp method
        System.out.println("\nCard 1 is face up? " + card1.isFaceUp());
        System.out.println("Card 2 is face up? " + card2.isFaceUp());

        // Testing setFaceUp method
        card1.setFaceUp(true);
        card2.setFaceUp(false);
        System.out.println("\nAfter setting face up:");
        System.out.println("Card 1 is face up? " + card1.isFaceUp());
        System.out.println("Card 2 is face up? " + card2.isFaceUp());

        // Testing equals method
        System.out.println("\nAre Card 1 and Card 3 equal? " + card1.equals(card3));
        System.out.println("Are Card 2 and Card 2 equal? " + card2.equals(card2));

        // Testing toString method
        System.out.println("\nCard 1 as String: " + card1.toString());
        System.out.println("Card 2 as String: " + card2.toString());
        System.out.println("Card 3 as String: " + card3.toString());
        System.out.println("Card 4 as String: " + card4.toString());
    }
}


public abstract class Card {
    public String suit;

    enum Suits{
        HEARTS, CLUBS, DIAMONDS, SPADES
    }

    enum FaceCard{
        JACK, QUEEN, KING
    }

    public Card(String suit) {
        this.suit = suit;

    }

    Card(){
        this.suit = suit;
    }






}

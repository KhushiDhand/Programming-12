public abstract class Card{
    public String suit;
    public int rank;

    enum Suits{
        HEARTS, CLUBS, DIAMONDS, SPADES
    }

    enum FaceCard{
        JACK, QUEEN, KING
    }

    public Card(int rank) {
        this.rank  = rank;
    }

    Card(){
        this.suit = suit;

    }






}

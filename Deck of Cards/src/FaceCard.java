import java.util.LinkedList;
import java.util.Stack;

public class FaceCard extends Card{
    public FaceCard faceCard;
    public Suits suit;

    public FaceCard(FaceCard faceCard, Suits suit) {
        this.faceCard = faceCard;
        this.suit = suit;
    }

    @Override
    public String toString(){
        return "Face Card: " + faceCard + " | Suit: " + suit;
    }







}

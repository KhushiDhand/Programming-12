import java.util.LinkedList;
import java.util.Stack;


public class NumberCard extends Card {
    public int number;
    public Suits suit;

    public NumberCard(int number, Suits suit) {
        this.number = number;
        this.suit = suit;
    }

    @Override
    public String toString(){
        return "Number: " + number + " | Suit: " + suit;
    }












}

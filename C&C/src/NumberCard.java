import java.util.LinkedList;
import java.util.Stack;


public class NumberCard extends Card {
    public int number;


    public NumberCard(int number, Suits suit, int rank) {
        super(rank);
    }

    @Override
    public String toString(){
        return "Number: " + number + " | Suit: " + suit;
    }



}

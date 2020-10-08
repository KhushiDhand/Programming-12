import java.util.Comparator;

public class CustomComparator implements Comparator<Card> {
    @Override
    public int compare(Card o, Card t) {
        // if statement: first is card is smaller
        // else if statement: first card is greater;
        // else statement: both cards are equal;

       if(o.rank < t.rank){
           return 0;
       } else if (o.rank > t.rank){
           return 1;
       }else {
           return 2;
       }
    }


}

import java.util.Iterator;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Main {
    //Make a deck of cards
    public static void main(String[] args) {
        //ALL CARDS FOR CLUBS
        Card cc1 = new NumberCard(1, Card.Suits.CLUBS, 14);
        Card cc2 = new NumberCard(2, Card.Suits.CLUBS, 2);
        Card cc3 = new NumberCard(3, Card.Suits.CLUBS, 3);
        Card cc4 = new NumberCard(4, Card.Suits.CLUBS, 4);
        Card cc5 = new NumberCard(5, Card.Suits.CLUBS, 5);
        Card cc6 = new NumberCard(6, Card.Suits.CLUBS, 6);
        Card cc7 = new NumberCard(7, Card.Suits.CLUBS, 7);
        Card cc8 = new NumberCard(8, Card.Suits.CLUBS, 8);
        Card cc9 = new NumberCard(9, Card.Suits.CLUBS, 9);
        Card cc10 = new NumberCard(10, Card.Suits.CLUBS, 10);
        Card cc11 = new FaceCard(Card.FaceCard.JACK, Card.Suits.CLUBS, 11);
        Card cc12 = new FaceCard(Card.FaceCard.QUEEN, Card.Suits.CLUBS, 12);
        Card cc13 = new FaceCard(Card.FaceCard.KING, Card.Suits.CLUBS, 13);

        //ALL CARDS FOR DIAMONDS
        Card cd1 = new NumberCard(1, Card.Suits.DIAMONDS,14);
        Card cd2 = new NumberCard(2, Card.Suits.DIAMONDS, 2);
        Card cd3 = new NumberCard(3, Card.Suits.DIAMONDS, 3);
        Card cd4 = new NumberCard(4, Card.Suits.DIAMONDS, 4);
        Card cd5 = new NumberCard(5, Card.Suits.DIAMONDS, 5);
        Card cd6 = new NumberCard(6, Card.Suits.DIAMONDS, 6);
        Card cd7 = new NumberCard(7, Card.Suits.DIAMONDS, 7);
        Card cd8 = new NumberCard(8, Card.Suits.DIAMONDS, 8);
        Card cd9 = new NumberCard(9, Card.Suits.DIAMONDS, 9);
        Card cd10 = new NumberCard(10, Card.Suits.DIAMONDS, 10);
        Card cd11 = new FaceCard(Card.FaceCard.JACK, Card.Suits.DIAMONDS, 10);
        Card cd12 = new FaceCard(Card.FaceCard.QUEEN, Card.Suits.DIAMONDS, 11);
        Card cd13 = new FaceCard(Card.FaceCard.KING, Card.Suits.DIAMONDS, 12);

        //ALL CARDS FOR SPADES
        Card cs1 = new NumberCard(1, Card.Suits.SPADES, 14);
        Card cs2 = new NumberCard(2, Card.Suits.SPADES,2);
        Card cs3 = new NumberCard(3, Card.Suits.SPADES,3);
        Card cs4 = new NumberCard(4, Card.Suits.SPADES,4);
        Card cs5 = new NumberCard(5, Card.Suits.SPADES,5);
        Card cs6 = new NumberCard(6, Card.Suits.SPADES,6);
        Card cs7 = new NumberCard(7, Card.Suits.SPADES,7);
        Card cs8 = new NumberCard(8, Card.Suits.SPADES,8);
        Card cs9 = new NumberCard(9, Card.Suits.SPADES,9);
        Card cs10 = new NumberCard(10, Card.Suits.SPADES,10);
        Card cs11 = new FaceCard(Card.FaceCard.JACK, Card.Suits.SPADES,11);
        Card cs12 = new FaceCard(Card.FaceCard.QUEEN, Card.Suits.SPADES,12);
        Card cs13 = new FaceCard(Card.FaceCard.KING, Card.Suits.SPADES,13);


        //ALL CARDS FOR HEARTS
        Card ch1 = new NumberCard(1, Card.Suits.HEARTS, 14);
        Card ch2 = new NumberCard(2, Card.Suits.HEARTS,2);
        Card ch3 = new NumberCard(3, Card.Suits.HEARTS,3);
        Card ch4 = new NumberCard(4, Card.Suits.HEARTS,4);
        Card ch5 = new NumberCard(5, Card.Suits.HEARTS,5);
        Card ch6 = new NumberCard(6, Card.Suits.HEARTS,6);
        Card ch7 = new NumberCard(7, Card.Suits.HEARTS,7);
        Card ch8 = new NumberCard(8, Card.Suits.HEARTS,8);
        Card ch9 = new NumberCard(9, Card.Suits.HEARTS,9);
        Card ch10 = new NumberCard(10, Card.Suits.HEARTS,10);
        Card ch11 = new FaceCard(Card.FaceCard.JACK, Card.Suits.HEARTS,11);
        Card ch12 = new FaceCard(Card.FaceCard.QUEEN, Card.Suits.HEARTS,12);
        Card ch13 = new FaceCard(Card.FaceCard.KING, Card.Suits.HEARTS,13);


        Stack<Card> deckOfCards = new Stack<Card>();
        deckOfCards.push(cc1);
        deckOfCards.push(cc2);
        deckOfCards.push(cc3);
        deckOfCards.push(cc4);
        deckOfCards.push(cc5);
        deckOfCards.push(cc6);
        deckOfCards.push(cc7);
        deckOfCards.push(cc8);
        deckOfCards.push(cc9);
        deckOfCards.push(cc10);
        deckOfCards.push(cc11);
        deckOfCards.push(cc12);
        deckOfCards.push(cc13);

        deckOfCards.push(cs1);
        deckOfCards.push(cs2);
        deckOfCards.push(cs3);
        deckOfCards.push(cs4);
        deckOfCards.push(cs5);
        deckOfCards.push(cs6);
        deckOfCards.push(cs7);
        deckOfCards.push(cs8);
        deckOfCards.push(cs9);
        deckOfCards.push(cs10);
        deckOfCards.push(cs11);
        deckOfCards.push(cs12);
        deckOfCards.push(cs13);


        deckOfCards.push(ch1);
        deckOfCards.push(ch2);
        deckOfCards.push(ch3);
        deckOfCards.push(ch4);
        deckOfCards.push(ch5);
        deckOfCards.push(ch6);
        deckOfCards.push(ch7);
        deckOfCards.push(ch8);
        deckOfCards.push(ch9);
        deckOfCards.push(ch10);
        deckOfCards.push(ch11);
        deckOfCards.push(ch12);
        deckOfCards.push(ch13);

        deckOfCards.push(cd1);
        deckOfCards.push(cd2);
        deckOfCards.push(cd3);
        deckOfCards.push(cd4);
        deckOfCards.push(cd5);
        deckOfCards.push(cd6);
        deckOfCards.push(cd7);
        deckOfCards.push(cd8);
        deckOfCards.push(cd9);
        deckOfCards.push(cd10);
        deckOfCards.push(cd11);
        deckOfCards.push(cd12);
        deckOfCards.push(cd13);

        CustomComparator cc = new CustomComparator();
        int result= cc.compare(cs8, cd8);
        if(result==0){
            System.out.println("First Card is smaller");
        } else if(result==1){
            System.out.println("First Card is greater");
        }else {
            System.out.println("Both cards are equal");
        }






    }
}

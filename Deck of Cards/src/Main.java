import java.util.Iterator;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class Main {

    //Make a deck of cards
    public static void main(String[] args) {
        //ALL CARDS FOR CLUBS
        Card cc1 = new NumberCard(1, Card.Suits.CLUBS);
        Card cc2 = new NumberCard(2, Card.Suits.CLUBS);
        Card cc3 = new NumberCard(3, Card.Suits.CLUBS);
        Card cc4 = new NumberCard(4, Card.Suits.CLUBS);
        Card cc5 = new NumberCard(5, Card.Suits.CLUBS);
        Card cc6 = new NumberCard(6, Card.Suits.CLUBS);
        Card cc7 = new NumberCard(7, Card.Suits.CLUBS);
        Card cc8 = new NumberCard(8, Card.Suits.CLUBS);
        Card cc9 = new NumberCard(9, Card.Suits.CLUBS);
        Card cc10 = new NumberCard(10, Card.Suits.CLUBS);
        Card cc11 = new FaceCard(Card.FaceCard.JACK, Card.Suits.CLUBS);
        Card cc12 = new FaceCard(Card.FaceCard.QUEEN, Card.Suits.CLUBS);
        Card cc13 = new FaceCard(Card.FaceCard.KING, Card.Suits.CLUBS);

        //ALL CARDS FOR DIAMONDS
        Card cd1 = new NumberCard(1, Card.Suits.DIAMONDS);
        Card cd2 = new NumberCard(2, Card.Suits.DIAMONDS);
        Card cd3 = new NumberCard(3, Card.Suits.DIAMONDS);
        Card cd4 = new NumberCard(4, Card.Suits.DIAMONDS);
        Card cd5 = new NumberCard(5, Card.Suits.DIAMONDS);
        Card cd6 = new NumberCard(6, Card.Suits.DIAMONDS);
        Card cd7 = new NumberCard(7, Card.Suits.DIAMONDS);
        Card cd8 = new NumberCard(8, Card.Suits.DIAMONDS);
        Card cd9 = new NumberCard(9, Card.Suits.DIAMONDS);
        Card cd10 = new NumberCard(10, Card.Suits.DIAMONDS);
        Card cd11 = new FaceCard(Card.FaceCard.JACK, Card.Suits.DIAMONDS);
        Card cd12 = new FaceCard(Card.FaceCard.QUEEN, Card.Suits.DIAMONDS);
        Card cd13 = new FaceCard(Card.FaceCard.KING, Card.Suits.DIAMONDS);

        //ALL CARDS FOR SPADES
        Card cs1 = new NumberCard(1, Card.Suits.SPADES);
        Card cs2 = new NumberCard(2, Card.Suits.SPADES);
        Card cs3 = new NumberCard(3, Card.Suits.SPADES);
        Card cs4 = new NumberCard(4, Card.Suits.SPADES);
        Card cs5 = new NumberCard(5, Card.Suits.SPADES);
        Card cs6 = new NumberCard(6, Card.Suits.SPADES);
        Card cs7 = new NumberCard(7, Card.Suits.SPADES);
        Card cs8 = new NumberCard(8, Card.Suits.SPADES);
        Card cs9 = new NumberCard(9, Card.Suits.SPADES);
        Card cs10 = new NumberCard(10, Card.Suits.SPADES);
        Card cs11 = new FaceCard(Card.FaceCard.JACK, Card.Suits.SPADES);
        Card cs12 = new FaceCard(Card.FaceCard.QUEEN, Card.Suits.SPADES);
        Card cs13 = new FaceCard(Card.FaceCard.KING, Card.Suits.SPADES);


        //ALL CARDS FOR HEARTS
        Card ch1 = new NumberCard(1, Card.Suits.HEARTS);
        Card ch2 = new NumberCard(2, Card.Suits.HEARTS);
        Card ch3 = new NumberCard(3, Card.Suits.HEARTS);
        Card ch4 = new NumberCard(4, Card.Suits.HEARTS);
        Card ch5 = new NumberCard(5, Card.Suits.HEARTS);
        Card ch6 = new NumberCard(6, Card.Suits.HEARTS);
        Card ch7 = new NumberCard(7, Card.Suits.HEARTS);
        Card ch8 = new NumberCard(8, Card.Suits.HEARTS);
        Card ch9 = new NumberCard(9, Card.Suits.HEARTS);
        Card ch10 = new NumberCard(10, Card.Suits.HEARTS);
        Card ch11 = new FaceCard(Card.FaceCard.JACK, Card.Suits.HEARTS);
        Card ch12 = new FaceCard(Card.FaceCard.QUEEN, Card.Suits.HEARTS);
        Card ch13 = new FaceCard(Card.FaceCard.KING, Card.Suits.HEARTS);




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


        System.out.println("*************ALL ELEMENTS AS PUSHED IN THE STACK THROUGH ENUMERATOR");
        System.out.println("====================================================================");

        Iterator<Card> cardIterator = deckOfCards.iterator();
        while(cardIterator.hasNext()){
            Card temp = cardIterator.next();
            System.out.println(temp);
        }

        // Pop out the element from Stack, it will be the last element
        //i.e. LIFO
        System.out.println("***************When Pop out, the Last Element is pushed out*********");
        Card element = deckOfCards.pop();
        System.out.print(element);






    }
}

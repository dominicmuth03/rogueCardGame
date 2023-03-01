package Cards;
import java.util.*;
public class Deck {
    Vector<Card> deckBuild;
    Queue<Card> drawPile;
    Stack<Card> hand;
    void draw() {

    };
    void applyCard(int i) {
        Card card = this.hand.get(i);
        if (card.canPlay()) {
            card.applyCard();
            //discard card and draw
            hand.remove(i);
            hand.push(drawPile.poll());
            if (card.DOR) { //
                drawPile.add(card);
            }
        }
    };
    void startBattle() {
        Collections.shuffle(deckBuild);
        int len = deckBuild.size();
        while (!drawPile.isEmpty()) {
            drawPile.poll();
        };
        for (int i = 0; i <len; i++) {
            drawPile.add(deckBuild.get(i));
        };
        for (int i = 0; i < 4; i++) {
            hand.push(drawPile.poll());
        }
    }
}

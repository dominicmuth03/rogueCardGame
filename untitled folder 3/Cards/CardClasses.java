package Cards;


abstract class Card {
    int AP;
    boolean DOR; //draw or exile; true if draw, false if remove
    abstract void applyCard();
    abstract boolean canPlay();
}

abstract class SingleTargetCards extends Card {
    abstract int requestTarget();
}


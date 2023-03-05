package Cards;
import Characters.*;

public abstract class Card {
    public String name;
    public String description;
    public String attribute; // maybe convert to int later at create method to return as string later to save proccesing power?
    public int AP; //Action Points
    public boolean DOR; //draw or exile; true if draw, false if remove
    public abstract void cardEffects();
    public void applyCard() {
        if (this.canPlay()) {
            cardEffects();
        } else {
            printCantPlay();
        }
    };
    public boolean canPlay() {
        if (Player.player.AP >= this.AP) {
            Player.player.AP -= this.AP;
            return true;
        }
        return false;
    };
    public int requestTarget() {
        return 0; // change this later
    };
    protected void printCantPlay() {
        //change this later
    };
}

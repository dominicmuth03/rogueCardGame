package Cards.CharacterCards.MausCards.Classic;
import Cards.Card;
import Characters.*;
public class Halfguard extends Card {
    Halfguard() {
        this.name = "Halfguard";
        this.description = "Equips 1d4 + 4 armour";
        this.attribute = "Guard";
        this.AP = 1;
        this.DOR = true;
    };
    public void cardEffects() {
        int guard = 4 + Player.player.d4.roll();
        Player.player.gearUp(guard);
    };
}

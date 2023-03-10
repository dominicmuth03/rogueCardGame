package Cards.CharacterCards.MausCards.Draftable;
import Cards.Card;
import Characters.*;
import Enemies.*;
public class Hunkerdown extends Card {
    Hunkerdown() {
        this.name = "Hunkerdown";
        this.description = "Heal 1d8\nEquips 2d6 + 6 armour";
        this.attribute = "Guard";
        this.AP = 3;
        this.DOR = true;
    };
    public void cardEffects() {
        int healVal = Player.player.d6.roll();
        Player.player.healUp(healVal);
        int guard = 6 + Player.player.d6.rollnTimes(2);
        Player.player.armour += guard;
    };
}

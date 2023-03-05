package Cards.CharacterCards.MausCards.Draftable;
import Cards.Card;
import Characters.*;
import Enemies.*;
public class Wunderhaw extends Card {
    Wunderhaw() {
        this.name = "Wunderhaw";
        this.description = "Deals 1d8 + 2 damage to a single Enemy.\nHeal 1d4.";
        this.attribute = "Blade";
        this.AP = 1;
        this.DOR = true;
    };
    public void cardEffects() {
        int target = this.requestTarget();
        int damage = Player.player.d8.roll() + 2;
        Enemies.enemies[target].takeDamage(damage);
        int healVal = Player.player.d4.roll();
        Player.player.healUp(healVal);
    };
}
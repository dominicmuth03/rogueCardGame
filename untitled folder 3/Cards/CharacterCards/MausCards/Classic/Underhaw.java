package Cards.CharacterCards.MausCards.Classic;
import Cards.Card;
import Characters.*;
import Enemies.*;
public class Underhaw extends Card {
    Underhaw() {
        this.name = "Underhaw";
        this.description = "Deals 2d4 + 2 damage to a single Enemy";
        this.attribute = "Blade";
        this.AP = 1;
        this.DOR = true;
    };
    public void cardEffects() {
        int target = this.requestTarget();
        int damage = 2 + Player.player.d4.roll() + Player.player.d4.roll();
        Enemies.enemies[target].takeDamage(damage);
    };
}

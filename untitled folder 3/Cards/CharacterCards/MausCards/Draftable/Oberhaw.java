package Cards.CharacterCards.MausCards.Draftable;
import Cards.Card;
import Characters.*;
import Enemies.*;
public class Oberhaw extends Card {
    Oberhaw() {
        this.name = "Oberhaw";
        this.description = "Deals 2d6 + 3 damage to a single Enemy";
        this.attribute = "Blade";
        this.AP = 1;
        this.DOR = true;
    };
    public void cardEffects() {
        int target = this.requestTarget();
        int damage = 3 + Player.player.d6.rollnTimes(2);
        Enemies.enemies[target].takeDamage(damage);
    };
}

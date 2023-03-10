package Cards.CharacterCards.MausCards.Draftable;
import Cards.Card;
import Characters.*;
import Enemies.*;
public class Parry extends Card {
    Parry() {
        this.name = "Parry";
        this.description = "Deals 1d4 + 1d6 damage to a single Enemy.\nEquips 1d4 armour";
        this.attribute = "Blade";
        this.AP = 1;
        this.DOR = true;
    };
    public void cardEffects() {
        int target = this.requestTarget();
        int damage = Player.player.d6.roll()  + Player.player.d4.roll();
        Enemies.enemies[target].takeDamage(damage);
        int guard = Player.player.d4.roll();
        Player.player.gearUp(guard);
    };
}

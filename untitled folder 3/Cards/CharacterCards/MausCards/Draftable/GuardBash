package Cards.CharacterCards.MausCards.Draftable;
import Cards.Card;
import Characters.*;
import Enemies.*;
public class GuardBash extends Card {
    GuardBash() {
        this.name = "Guard Bash";
        this.description = "Deals 1d4 + 2 damage to a single Enemy.\nEquips 1d4 + 2 armour";
        this.attribute = "Guard";
        this.AP = 1;
        this.DOR = true;
    };
    public void cardEffects() {
        int target = this.requestTarget();
        int damage = 2 + Player.player.d4.roll();
        Enemies.enemies[target].takeDamage(damage);
        int guard = 4 + Player.player.d4.roll();
        Player.player.gearUp(guard);
    };
}

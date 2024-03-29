package Cards.CharacterCards.MausCards.Classic;
import Cards.Card;
import Characters.*;
import Enemies.*;
public class Mittlehaw extends Card {
    Mittlehaw() {
        this.name = "Mittlehaw";
        this.description = "Deals 1d6 damage to all Enemies";
        this.attribute = "Blade";
        this.AP = 1;
        this.DOR = true;
    };
    public void cardEffects() {
        int damage;
        for (Monster target : Enemies.enemies) {
            damage = Player.player.d6.roll();
            target.takeDamage(damage);
        }
    };
}

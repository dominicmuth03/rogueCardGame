package Cards.CharacterCards.MausCards.Classic;
import Cards.Card;
import Characters.*;
import Enemies.*;
public class Weschelhaw extends Card {
    Weschelhaw() {
        this.name = "Weschelhaw";
        this.description = "Deals 1d4 damage to a single Enemy. \nDeals 1d4 to all Enemies";
        this.attribute = "Blade";
        this.AP = 1;
        this.DOR = true;
    };
    public void cardEffects() {
        int target = this.requestTarget();
        int damage =  Player.player.d4.roll();
        Enemies.enemies[target].takeDamage(damage);
        for (Monster target2 : Enemies.enemies) {
            damage = Player.player.d4.roll();
            target2.takeDamage(damage);
        }
    };
}

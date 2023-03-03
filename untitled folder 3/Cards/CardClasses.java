package Cards;
include package Characters;
include package Enemies;

abstract class Card {
    String name;
    String description;
    String attribute; // maybe convert to int later at create method to return as string later to save proccesing power?
    int AP; //Action Points
    boolean DOR; //draw or exile; true if draw, false if remove
    abstract void cardEffects();
    void applyCard() {
        if (canPlay()) {
            cardEffects();
        } else {
            printCantPlay();
        }
    };
    void canPlay() {
        if (Player.player.AP >= this.AP) {
            Player.player.AP -= this.AP;
            return true;
        }
        return false;
    };
    int requestTarget();
    void printCantPlay();
}

public class Underhaw extends Card {
    Underhaw() {
        name = "Underhaw";
        description = "Deals 2d4 + 2 damage to a single Enemy";
        attribute = "Blade";
        AP = 1;
        DOR = true;
    };
    void cardEffects() {
        int target = requestTarget();
        int damage = 2 + Player.player.d4.roll() + Player.player.d4.roll();
        Enemies.enemies.get(target).takeDamage(damage);
    };
}

public class Mittlehaw extends Card {
    Underhaw() {
        name = "Mittlehaw";
        description = "Deals 1d6 damage to all Enemies";
        attribute = "Blade";
        AP = 1;
        DOR = true;
    };
    void cardEffects() {
        int target = requestTarget();
        int damage = 2 + Player.player.d4.roll() + Player.player.d4.roll();
        Enemies.enemies.get(target).takeDamage(damage);
    };
}

public class Mittlehaw extends Card {
    Underhaw() {
        name = "Mittlehaw";
        description = "Deals 1d6 damage to all Enemies";
        attribute = "Blade";
        AP = 1;
        DOR = true;
    };
    void cardEffects() {
        int target = requestTarget();
        int damage = 2 + Player.player.d4.roll() + Player.player.d4.roll();
        Enemies.enemies.get(target).takeDamage(damage);
    };
}

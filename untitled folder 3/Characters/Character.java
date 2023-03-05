package Characters;

import Die.*;

abstract public class Character { 
    public int AP;
    public int armour;
    int hp; // current hp
    int maxHp; // max hp (to know what to heal to)
    public void beStruckBy(int damage) {
        if (this.armour - damage < 0) {
            this.hp -= this.armour - damage;
            this.armour = 0;
        } else {
            this.armour -= damage;
        }
    }
    public D4 d4;
    public D6 d6;
    public D8 d8;
    public D10 d10;
    public D12 d12;
    public D20 d20;
}
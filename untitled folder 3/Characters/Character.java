package Characters;

import Die.*;

abstract public class Character { 
    public int AP;
    public int armour;
    int hp; // current hp
    int maxHp; // max hp (to know what to heal to)
    //update observers after each function
    public void beStruckBy(int damage) {
        if (this.armour - damage < 0) {
            this.hp -= this.armour - damage;
            this.armour = 0;
        } else {
            this.armour -= damage;
        }
    }
    public void healUp(int health) {
        int gap = this.maxHp - this.hp;
        if (gap >= health) {
            this.hp += health;
        } else if (gap > 0) {
            this.hp = this.maxHp;
        } else {
            assert(this.hp == this.maxHp);
        }
    }
    public void gearUp(int armour) {
        this.armour += armour;
    }
    //dice
    public D4 d4;
    public D6 d6;
    public D8 d8;
    public D10 d10;
    public D12 d12;
    public D20 d20;
    //statuses
    public int freeze;
    public int burn;
    public int poison;
    public void handleStatus() {
        if (this.freeze > 0) {
            this.AP -= this.freeze;
            this.freeze--;
        }
        if (this.burn > 0) {
            this.beStruckBy(this.burn);
            this.burn--;
        }
        if (this.poison > 0) {
            this.beStruckBy(this.poison);
            this.poison--;
        }
    }
}
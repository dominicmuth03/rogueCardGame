package Enemies;

abstract public class Monster {
    int hp;
    int maxHp;
    public void takeDamage(int damage) {
        hp -= damage;
    };
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
}
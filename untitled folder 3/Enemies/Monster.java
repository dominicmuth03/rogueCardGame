package Enemies;

abstract public class Monster {
    public int hp;
    public int maxHp;
    public String name;
    public void takeDamage(int damage) {
        this.hp -= damage;
    };
    public void healUp(int health) {
        int gap = this.maxHp - this.hp;
        if (gap >= health) {
            this.hp += health;
            System.out.println("The " + this.name + " regains " + health + " hp");
        } else if (gap > 0) {
            this.hp = this.maxHp;
            System.out.println("The " + this.name + " regains " + gap + " hp");
        } else {
            assert(this.hp == this.maxHp);
        }
    }
    abstract public void takeTurn();
}
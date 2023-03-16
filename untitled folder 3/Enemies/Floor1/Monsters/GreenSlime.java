package Enemies.Floor1.Monsters;
import Enemies.*;
import Die.DiceSet;
import Characters.Player;
import Game.*;

public class GreenSlime extends Monster {
    GreenSlime() {
        this.maxHp = this.hp = 25;
        this.name = "Green Slime";
    }
    @Override
    public void takeTurn() {
        int turn = Room.turncount % 3;
        switch (turn) {
            case 2:
                System.out.println("The Green Slime used Ooze!");
                System.out.println("The Green Slime wells up in size and oozes everywhere!");
                int healval = DiceSet.d6();
                this.healUp(healval);
                Player.player.poison += 2;
                System.out.println("You've gained 1 poison.");
                //print flavour text
                break;
        
            default:
                System.out.println("The Green Slime used Slime Lob!");
                Player.player.beStruckBy(2 + DiceSet.d4());
                //print flavour text
                break;
        }
    }
}
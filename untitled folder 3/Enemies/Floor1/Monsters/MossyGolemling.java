package Enemies.Floor1.Monsters;
import Enemies.*;
import Die.DiceSet;
import Characters.Player;
import Game.*;


public class MossyGolemling extends Monster {
    MossyGolemling() {
        this.maxHp = this.hp = 35;
        this.name = "Mossy Golemling";
    }
    @Override
    public void takeTurn() {
        int turn = Room.turncount % 2;
        switch (turn) {
            case 1:
                Player.player.beStruckBy(DiceSet.d6() + DiceSet.d8() + 2);
                System.out.println("The Mossy Golemling curls into a ball and rolls rapidly towards you!");
                break;
        
            default:
                //doze off
                //print flavour text
                if (DiceSet.d4() > 2) {
                    System.out.println("The Golemling seems to be dozing off.");
                } else {
                    System.out.println("The Golemling is examining a butterfly.");
                }
                break;
        }
    }
}

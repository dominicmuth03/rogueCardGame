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
                //print flavour text
                break;
        
            default:
                //doze off
                //print flavour text
                break;
        }
    }
}

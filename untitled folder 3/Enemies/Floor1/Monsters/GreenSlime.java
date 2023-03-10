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
                this.healUp(DiceSet.d6());
                Player.player.poison += 2;
                //print flavour text
                break;
        
            default:
                Player.player.beStruckBy(2 + DiceSet.d4());
                //print flavour text
                break;
        }
    }
}
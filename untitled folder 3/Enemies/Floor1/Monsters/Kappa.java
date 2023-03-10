package Enemies.Floor1.Monsters;
import Enemies.*;
import Die.DiceSet;
import Characters.Player;
import Game.*;

public class Kappa extends Monster {
    Kappa() {
        this.maxHp = this.hp = 16;
        this.name = "Kappa";
    }
    @Override
    public void takeTurn() {
        int turn = Room.turncount % 2;
        switch (turn) {
            case 1:
                Player.player.beStruckBy(DiceSet.d6() + 2);
                //print flavour text
                break;
        
            default:
                Player.player.freeze += 1;
                //print flavour text
                break;
        }
    }
}

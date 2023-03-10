package Enemies.Floor1.Monsters;
import Enemies.*;
import Die.DiceSet;
import Characters.Player;
import Game.*;

public class Batty extends Monster {
    Batty() {
        this.maxHp = this.hp = 18;
        this.name = "Batty w/a Bat";
    }
    @Override
    public void takeTurn() {
        int turn = Room.turncount % 4;
        switch (turn) {
            case 1:
                Player.player.beStruckBy(DiceSet.d4(2));
                //print flavour text
                break;
            case 2:
                Player.player.beStruckBy(DiceSet.d4(3));
                //print flavour text
                break;
            case 3:
                Player.player.beStruckBy(DiceSet.d4(4) + 2);
                //print flavour text
                break;
        
            default:
                Player.player.beStruckBy(DiceSet.d4(1));
                //print flavour text
                break;
        }
    }
}
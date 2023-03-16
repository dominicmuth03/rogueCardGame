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
        int turn = DiceSet.d4();
        System.out.println("Batty w/a Bat used Batter up!");
        switch (turn) {
            case 2:
                System.out.println("Second Plate!");
                Player.player.beStruckBy(DiceSet.d4(turn));
                //print flavour text
                break;
            case 3:
                System.out.println("Third Plate!");
                Player.player.beStruckBy(DiceSet.d4(turn));
                //print flavour text
                break;
            case 4:
                System.out.println("Home Run!");
                Player.player.beStruckBy(DiceSet.d4(turn) + 2);
                //print flavour text
                break;
        
            default:
                System.out.println("First Plate!");
                Player.player.beStruckBy(DiceSet.d4(turn));
                //print flavour text
                break;
        }
    }
}
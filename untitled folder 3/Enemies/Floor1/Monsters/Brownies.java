package Enemies.Floor1.Monsters;
import Enemies.*;
import Die.DiceSet;
import Characters.Player;
import Game.*;

public class Brownies extends Monster {
    Brownies() {
        this.maxHp = this.hp = 23;
        this.name = "Box o' Brownies ";
    }
    @Override
    public void takeTurn() {
        int turn = Room.turncount % 2;
        switch (turn) {
            case 1:
                System.out.println("The Box o' Brownies used Fairy Dust!");
                System.out.println("Fairy dust scatters everywhere!");
                for (Monster target : Enemies.enemies) {
                    target.healUp(DiceSet.d4(2));
                }
                //print flavour text
                break;
        
            default:
                System.out.println("The Box o' Brownies used Mischief!");
                Player.player.beStruckBy(2 + DiceSet.d6());
                //print flavour text
                break;
        }
    }
}

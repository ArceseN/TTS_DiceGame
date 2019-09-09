package com.tss.dicegame;

public class Game {

    public static void main(String[] args) {
        //roll each die and get value
        Dice dieOne = new Dice();
        Dice dieTwo = new Dice();

        //variable represents value of one roll of the dice
    int outcome;
        outcome = dieOne.rollDie() + dieTwo.rollDie();

//switch statement that sets rules for winning and losing
        switch (outcome) {

            case 7:
            case 11:
                System.out.println("WIN");
                break;

            case 2:
            case 3:
            case 12:
                System.out.println("LOSE");
                break;

            case 4:
                System.out.println("POINT is 4");
                break;

            case 5:
                System.out.println("POINT is 5");
                break;

            case 6:
                System.out.println("POINT is 6");
                break;

            case 8:
                System.out.println("POINT is 8");
                break;

            case 9:
                System.out.println("POINT is 9");
                break;

            case 10:
                System.out.println("POINT is 10");
                break;
        }

    }
}


//# Mid Course Project
//
//        Given the following rules for the game of dice, create a program that prints out whether you won or lost on each roll. Below are the requirements for this program.
//
//        The player rolls two 6-sided dice (hint: use 1 + (int)(Math.random() * 6) ) to generate a random number between 1 and 6.
//
//        Rolling 7 or 11 on the first try is a WIN
//        Rolling 2, 3 or 12 on the first try is a LOSE
//        Any other roll on the first try becomes the player's POINT
//        If a player rolled POINT, the player continues to roll until one of two things happens:
//        If a player has POINT and rolls the POINT again, it is a WIN
//        If a player has POINT and rolls 7, it is a LOST
//
//        Example runs:
//
//        You rolled 7.
//        You win!
//
//        You rolled 12.
//        You lose!
//
//        You rolled 4. POINT is 4.
//        You rolled 3. POINT is 4.
//        You rolled 11. POINT is 4.
//        You rolled 4.
//        You win!
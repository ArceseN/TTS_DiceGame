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
//while loop to run game again after point
        while (true) {
            int pointRoll;
            pointRoll = dieOne.rollDie() + dieTwo.rollDie();
            if (pointRoll == outcome) {
                System.out.println("You won!");
                return;
            } else if (pointRoll == 7) {
                System.out.println("You lost.");
                return;
            } else {
                System.out.println("Rolling again...");
            }
        }
    }
}
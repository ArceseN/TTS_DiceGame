package com.tss.dicegame;

public class Dice {
    //get a random int between 1 and 6 LOOP

    private int DieValue;

public int rollDie(){
    this.DieValue = ((int) (Math.random()*6) + 1);
    System.out.println(DieValue);
    return DieValue;
}
//public Dice() {
//
//}
}
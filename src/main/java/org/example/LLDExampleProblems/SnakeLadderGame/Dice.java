package org.example.LLDExampleProblems.SnakeLadderGame;

import java.util.concurrent.ThreadLocalRandom;

//Dicecount : To scale when we play with multiple dices
public class Dice {
    int diceCount;
    int start = 1;
    int end = 6;

    public Dice(int count){
        this.diceCount = count;
    }

    public int rollDice(){
        int curr = 0;
        int sum = 0;
        while(curr < diceCount){
            sum += ThreadLocalRandom.current().nextInt(start, end+1);
            curr++;
        }
        return sum;
    }
}

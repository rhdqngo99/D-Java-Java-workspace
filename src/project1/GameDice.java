package project1;

import java.util.Random;

public class GameDice {
    
    private int[] dice;
    private Random rand;

    public GameDice() {
        this.dice = new int[5];
        this.rand = new Random();
    }


    public int[] rollDice() {
        for (int i = 0; i < dice.length; i++) {
            dice[i] = rand.nextInt(6) + 1;
        }
        return dice;
    }


    public void printDice() {
        System.out.print("주사위 결과: ");
        for (int die : dice) {
            System.out.print(die + " ");
        }
        System.out.println();
    }
}

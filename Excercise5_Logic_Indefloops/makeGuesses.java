/*
Write a method called makeGuesses that guesses numbers between 1 and 50 inclusive until it makes a guess of at
least 48 . It should report each guess and at the end should report the total number of guesses made. 

Here is a sample execution:
guess = 43
guess = 47
guess = 45
guess = 27
guess = 49
total guesses = 5
 */
package Excercise5_Logic_Indefloops;

/**
 *
 * @author dani
 */
import java.util.*;
public class makeGuesses {
    public static void main(String[] args){
        makeGuesses();
    }
    
    public static void makeGuesses(){
        Random r = new Random();
        int n = 0;
        int counter = 0;
        while(n<48){
            n = 1+r.nextInt(50);
            counter++;
            System.out.println("guess = "+n);
        }
        System.out.println("total guesses: "+counter);
    }
}

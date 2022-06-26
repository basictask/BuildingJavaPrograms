/*
The program thinks of a number between 0 and 99.
The user is asked to guess this number.
The program answers whether the user has guessed correctly, if not, 
how many of the number's digits match with the guessed number.
The program is robust.
 */
package Chapter5;

/**
 *
 * @author dani
 */
import java.util.*;
public class numberGuess {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        
        int number = r.nextInt(100);
        
        int guess = getGuess(console);
        int numGuesses = 1;
        
        while (guess != number){
            int numMatches = matches(number, guess);
            System.out.println("incorrect. Digits match: " + numMatches);
            guess = getGuess(console);
            numGuesses++;
        }
        
        System.out.println("correct guess.");
        System.out.println("number oof tries: " + numGuesses);
        
    }
    
    public static int matches(int number, int guess){
        int numMatches = 0;
        if(guess / 10 == number / 10 || guess / 10 == number % 10){
            numMatches++;
        }
        if(guess / 10 != number % 10 && (guess % 10 == number / 10 || guess % 10 == number % 10)){
            numMatches++;
        }
    return numMatches;    
    }
    
    public static int getGuess(Scanner console){
        int guess = getInt(console);
        
        while (guess < 0 || guess > 99){
            System.out.println("out of range. try again. ");
            guess = getInt(console);
        }
    return guess;
    }
    
    public static int getInt(Scanner console){
        System.out.print("input guess: ");
        
        while(!console.hasNextInt()){
            console.next();
            System.out.println("not an integer. try again.");
            System.out.print("input guess: ");
        }
    return console.nextInt();
    }
}

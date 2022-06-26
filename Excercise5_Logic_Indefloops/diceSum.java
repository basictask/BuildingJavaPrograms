/*
Write a method called diceSum that accepts a Scanner for the console as a parameter and prompts for a desired
sum, then repeatedly simulates the rolling of 2 six-sided dice until their sum is the desired sum. 
Here is a sample dialogue with the user:
Desired dice sum: 9
4 and 3 = 7
3 and 5 = 8
5 and 6 = 11
5 and 6 = 11
1 and 5 = 6
6 and 3 = 9
 */
package Excercise5_Logic_Indefloops;

/**
 *
 * @author dani
 */
import java.util.*;
public class diceSum {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        diceSum(console);
    }
    
    public static void diceSum(Scanner console){
        Random r = new Random();
        int n = getInt(console);
        int sum = 0; //dummy sum
        while(sum != n){
            int roll1 = 1 + r.nextInt(6);
            int roll2 = 1 + r.nextInt(6);
            sum = roll1+roll2;
            System.out.printf("%d and %d = %d \n", roll1, roll2, sum);
        }
    }
    
    public static int getInt(Scanner console){
        int s = getSum(console);
        
        while(s<1 || s>12){
            System.out.println("integer out of range. again.");
            s = getSum(console);
        }
    return s;
    }
    
    public static int getSum(Scanner console){
        System.out.print("input desired sum: ");
        
        while (!console.hasNextInt()){
            console.next();
            System.out.println("not a number. again.");
            System.out.print("input desired sum: ");
        }
    return console.nextInt();    
    }
}

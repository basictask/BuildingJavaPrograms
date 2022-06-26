/*
Write a method called printFactors that accepts an integer as its parameter and uses a fencepost loop to print the
factors of that number, separated by the word "and" . For example, the factors of the number 24 should print as the
following:
1 and 2 and 3 and 4 and 6 and 8 and 12 and 24

You may assume that the parameter’s value is greater than 0 , or you may throw an exception if it is 0 or negative.
Your method should print nothing if the empty string ( "" ) is passed.
 */
package Excercise5_Logic_Indefloops;

/**
 *
 * @author dani
 */
import java.util.*;
public class printFactors {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("integer to factor: ");
        int num = getInt2(console);
        System.out.println();
        System.out.println(printFactors(num));
    }
    
    public static String printFactors(int n){
        String result = "1";
        int factor = 1;
        while(factor != n){
            factor++;
            if(n % factor == 0){
                result = result + " and " + factor;
            }
        }
        
    return result;
    }
    
    public static int getInt(Scanner console){
        
        while (!console.hasNextInt()){
            console.next();
            System.out.println("incorrect data type. try again.");
            System.out.print("integer to factor: ");
        }
    return console.nextInt();
    }
    
    public static int getInt2(Scanner console){
        int n = getInt(console);
        
        while(n<1){
            System.out.println("string out of range. try again. ");
            System.out.print("integer to factor: ");
            n = getInt(console);
        }
    return n;    
    }
}

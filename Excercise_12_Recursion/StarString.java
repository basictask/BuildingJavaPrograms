/*
Write a recursive method called starString that accepts an integer as a parameter and prints 
to the console a string of stars (asterisks) that is 2 n (i.e., 2 to the n th power) long. 
For example,
starString(0) should print * (because 2^0 == 1)
starString(1) should print ** (because 2^1 == 2)
starString(2) should print **** (because 2^2 == 4)
starString(3) should print ******** (because 2^3 == 8)
starString(4) should print **************** (because 2^4 == 16)
The method should throw an IllegalArgumentException if passed a value less than 0 .
 */
package Excercise_12_Recursion;

/**
 *
 * @author dani
 */
import java.util.*;
public class StarString {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("enter n: ");
        int n = console.nextInt();
        starString(n);
    }
    
    public static void starString(int n){
        if(n<0){
            throw new IllegalArgumentException("Incorrect number");
        }else{
            double num= Math.pow(2, n);
            starPrint(num);
        }
    }
    
    private static void starPrint(double n){
        if(n==0){
            System.out.println();
        }else{
            System.out.print("*");
            starPrint(n-1);
        }
    }
}

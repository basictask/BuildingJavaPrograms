/*
Write a method called gcd that accepts two integers as parameters and returns the greatest common divisor (GCD)
of the two numbers. The GCD of two integers a and b is the largest integer that is a factor of both a and b .
One efficient way to compute the GCD of two numbers is to use Euclid’s algorithm, which states the following:
GCD (a, b)  GCD (b, a % b)
GCD (a, 0)  Absolute value of a
 */
package Excercise5_Logic_Indefloops;

/**
 *
 * @author dani
 */
import java.util.*;
public class gcd {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("input two integers: ");
        int a = console.nextInt();
        int b = console.nextInt();
        
        System.out.println();
        System.out.println("greatest common divisor: " + gcd(a, b));
    }
    
    public static int gcd(int a, int b){
        
        if(a>b){
            
            while (a%b != 0){
                int moda = a%b;
                a = b; 
                b = moda;
            }
            return b;
        
        }else if(a<b){
            
            while (b%a != 0 ){
                int modb = b%a;
                b = a;
                a = modb;
            }
            return a;
        
        }else{
  
            return a;
        }    
    }
}

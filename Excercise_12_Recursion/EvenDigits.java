/*
Write a recursive method called evenDigits that accepts an integer parameter and that returns 
the integer formed by removing the odd digits from it. 
For example, evenDigits(8342116) returns 8426 and evenDigits(-34512) returns 42.
If the number is 0 or has no even digits, such as 35159 or 7, return 0. 
Leading zeros in the result should be ignored.
 */
package Excercise_12_Recursion;

/**
 *
 * @author dani
 */
public class EvenDigits {
    public static void main(String[] args){
        System.out.println("evenDigits(8342116); "+evenDigits(8342116));
        System.out.println("evenDigits(35159); "+evenDigits(35159));
        System.out.println("evenDigits(-34512); "+evenDigits(-34512));
    }
    
    public static int evenDigits(int n){
        double a = 0.1;
        int b = Math.abs((int)even(n, a));
        return b;
    }
    
    private static double even(int n, double a){
        if(n==0){
            return 0;
        }else if(n%2==0){
            a*=10;
            return (n%10)*a + even(n/10, a);
        }else{
            return even(n/10, a);
        }
    }
}

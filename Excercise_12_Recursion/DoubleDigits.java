/*
Write a recursive method called doubleDigits that accepts an integer n as a parameter 
and returns the integer obtained by replacing every digit of n with two of that digit. 

For example, doubleDigits(348) should return 334488 . 
The call doubleDigits(0) should return 0 .

Calling doubleDigits on a negative number should return the negation 
of calling doubleDigits on the corresponding positive number; 
for example, doubleDigits(–789) should return –778899 .
 */
package Excercise_12_Recursion;

/**
 *
 * @author dani
 */
public class DoubleDigits {
    public static void main(String[] args){
        System.out.println(doubleDigits(348));
        System.out.println(doubleDigits(-789));
    }
    
    public static int doubleDigits(int n){
        if(n==0){
            return 0;
        }else{    
            return doubleDigits(n / 10) * 100 + (n % 10) * 10 + n % 10; 
        }
    }
}

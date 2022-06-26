/*
Write a recursive method called sumTo that accepts an integer parameter n and returns a real number,
representing the sum of the first n reciprocals. 
In other words, sumTo(n) returns (1 + 1/2 + 1/3 + 1/4 + ... + 1/n). 

For example, sumTo(2) should return 1.5 . 
The method should return 0.0 if it is passed the value 0, 
and throw an IllegalArgumentException if it is passed a value less than 0.
 */
package Excercise_12_Recursion;

/**
 *
 * @author dani
 */
public class SumTo {
    public static void main(String[] args){
        System.out.println(sumTo(6));
    }
    
    public static double sumTo(int n){
        double zero = 0.0;
        if(n<0){
            throw new IllegalArgumentException("Illegal parameter");
        }else if(n==0){
            return zero; 
        }else{
            return 1.0/n + sumTo(n-1);
        }
    }
}

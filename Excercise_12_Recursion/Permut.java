/*
Write a recursive method called permut that accepts two integers n and r as parameters and returns 
the number of unique permutations of r items from a group of n items. 

For given values of n and r , this value P(n, r) can be computed as follows:
P(n,r) = n!/(n - r)!
For example, permut(7, 4) should return 840 . 
It may be helpful to note that permut(6, 3) returns 120 , or 840 / 7.
 */
package Excercise_12_Recursion;

/**
 *
 * @author dani
 */
public class Permut {
    public static void main(String[] args){
        System.out.println("permut(7, 4): "+permut(7, 4));
        System.out.println("permut(6, 3): "+permut(6, 3));
    }
    
    public static int permut(int n, int r){
        int a = fact(n);
        int b = fact(n-r);
        return a/b;
    }
    
    private static int fact(int n){
        if(n>1){
            return n*fact(n-1);
        }else{
            return 1;
        }
    }
}

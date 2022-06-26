/*
This program generates prime numbers starting from a given integer, in the count given by the user.
 */
package test;
import java.util.*;
/**
 *
 * @author dani
 */
public class Prime {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("enter first number: ");
        int a = console.nextInt();
        System.out.println();
        System.out.print("enter how many numbers: ");
        int n = console.nextInt();
        System.out.println();
        primes(a, n);
        System.out.println();
    }
    
    public static void primes(int a, int n){
        System.out.print(a);
        for(int i=0; i<n;  i++){
            a = next(a);
            System.out.print(", "+a);
        }
    }
    
    public static int next(int a){
        a++;
        while(!isPrime(a)){
            a++;
        }
        return a;
    }
    
    public static boolean isPrime(int a){
        int count = 0;
        for(int i=1; i<=a; i++){
            if(a%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
}

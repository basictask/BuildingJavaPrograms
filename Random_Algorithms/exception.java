package test;

//This program is an example of throwing exceptions.
//In this case, exception is thrown when the user enter a negative number

import java.util.*;
public class exception {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Number to factorialize: ");
        int a = console.nextInt();
        System.out.println("result: "+factorial(a));
    }
    
    public static int factorial(int n){
        if (n<0){
            throw new IllegalArgumentException("Negative n: "+n);
        }
        
        int number = 1;              //a faktoriális mindig 1-el kezdődik
        for (int i=1; i<=n; i++){  
            number *= i;
        }
        return n;
    }
}

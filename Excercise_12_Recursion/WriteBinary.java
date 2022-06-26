/*
Write a recursive method called writeBinary that accepts an integer as a parameter 
and writes its binary representation to the console. 
For example, writeBinary(44) should print 101100 .
 */
package Excercise_12_Recursion;

/**
 *
 * @author dani
 */
import java.util.*;
public class WriteBinary {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("44 to binary: ");
        writeBinary(44);
        System.out.println();
        
        System.out.print("number to translate: ");
        int n = console.nextInt();
        writeBinary(n);
    }
    
    public static void writeBinary(int n){
        if(n==0){
            System.out.println();
        }else if(n==1){
            System.out.print(1);
        }else{
            writeBinary(n/2);
            System.out.print(n%2);
        }
    }
}

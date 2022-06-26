/*
Write a method called writeSequence that accepts an integer n as a parameter and prints to the console 
a symmetric sequence of n numbers composed of descending integers that ends in 1, 
followed by a sequence of ascending integers that begins with 1. 
The following table indicates the output that should be produced for various values of n : 

Method call       Output produced
-----------------------------------------
writeSequence(1); 1
writeSequence(2); 1 1
writeSequence(3); 2 1 2
writeSequence(4); 2 1 1 2
writeSequence(5); 3 2 1 2 3
writeSequence(6); 3 2 1 1 2 3
writeSequence(7); 4 3 2 1 2 3 4
writeSequence(8); 4 3 2 1 1 2 3 4
writeSequence(9); 5 4 3 2 1 2 3 4 5
writeSequence(10); 5 4 3 2 1 1 2 3 4 5

Notice that when n is odd the sequence has a single 1 in the middle, while for even values it has two 1s in the middle. 
Your method should throw an IllegalArgumentException if it is passed a value less than 1 .
 */
package Excercise_12_Recursion;

/**
 *
 * @author dani
 */
public class WriteSequence {
    public static void main(String[] args){
        for(int i=1; i<11; i++){
            System.out.printf("writeSequence(%d): ",i);
            writeSequence(i);
            System.out.println();
        }
    }
    
    public static void writeSequence(int n){
        if(n==0){
            throw new IllegalArgumentException("Illegal parameter");
        }else if(n==1){
            System.out.print(1);
        }else if(n==2){
            System.out.print("1 1");
        }else{
            int num = (n+1)/2;
            System.out.print(num+" ");
            writeSequence(n-2);
            System.out.print(" "+num);
        }
    }
}

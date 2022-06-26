package Excercise_12_Recursion;

/*
Write a recursive method called writeSquares that accepts an integer parameter n and prints the first n squares
separated by commas, with the odd squares in descending order followed by the even squares in ascending order. 

For example, writeSquares(8); prints the following output:
49, 25, 9, 1, 4, 16, 36, 64

A call of writeSquares(1); prints 1 . 
The method should throw an IllegalArgumentException if it is passed a value less than 1.
 */

/**
 *
 * @author Y80L35
 */
public class WriteSquares {
    public static void main(String[] args){
        for(int i=7; i<=9; i++){
            System.out.printf("writeSquares(%d)",i);
            writeSquares(i);
            System.out.println();
        }    
    }
    
    public static void writeSquares(int n){
        if(n==0){
            throw new IllegalArgumentException("illegal parameter");
        }else if(n==1){
            System.out.print("  1  ");
        }else if(n%2==0){
            writeSquares(n-1);
            System.out.print((int)Math.pow(n, 2)+"  ");
        }else{
            System.out.print("  "+(int)Math.pow(n, 2));
            writeSquares(n-1);
        }
    }
}

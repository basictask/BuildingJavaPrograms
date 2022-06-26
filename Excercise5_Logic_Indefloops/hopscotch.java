/*
Write a method called hopscotch that accepts an integer number of “hops” as its parameter and prints a pattern of
numbers that resembles a hopscotch board. 
A “hop” is a three-number sequence where the output shows two num bers on a line, followed by one number on its own line. 
0 hops is a board up to 1; one hop is a board up to 4; two hops is a board up to 7; and so on. 
For example, the call of hopscotch(3); should print the following output:
    1
 2     3
    4
 5     6
    7  
 8     9
   10
A call of hopscotch(0); should print only the number 1. 
If it is passed a negative value, the method should produce no output.
 */
package Excercise5_Logic_Indefloops;

/**
 *
 * @author dani
 */
import java.util.*;
public class hopscotch {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int hops = getInt(console);
        hopscotch(hops);
    }
    
    public static void hopscotch(int n){
        int a = 0; 
        if (n==0){
            System.out.println("   1");
        }else{
            
            System.out.println("   1");    
            for(int i = 2; i <= n*3; i++){
                System.out.print(i);
                i++;
                System.out.println("     "+i);
                i++;
                System.out.println("   "+i);
            }  
        }       
    }
    
    public static int getInt(Scanner console){
        System.out.print("number of hops: ");
        while(!console.hasNextInt()){
            console.next();
            System.out.println("incorrect data type. ");
            System.out.print("number of hops: ");
            
        }
    return console.nextInt();
    }
}

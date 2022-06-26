/*
Write a method called printRange that accepts two integers as arguments and prints the sequence of numbers
between the two arguments, enclosed in square brackets. Print an increasing sequence if the first argument is smaller
than the second; otherwise, print a decreasing sequence. If the two numbers are the same, that number should be
printed between square brackets.

The output produced from these calls should be the following sequences of numbers:
[2, 3, 4, 5, 6, 7]
[19, 18, 17, 16, 15, 14, 13, 12, 11]
[5]
 */

package Excercise4_Conditional;
import java.util.*;
public class printRange {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        System.out.print("int1: ");
        int int1 = console.nextInt();
        
        System.out.print("int1: ");
        int int2 = console.nextInt();
        
        range(int1, int2);
    }
    
    public static void range(int a, int b){
        System.out.print("[");
        if(a<b){
            for (int i=a; i<=b; i++){
                System.out.print(i);
                if (i<b){
                    System.out.print(", ");
                }
            }
        }else if (a>b){
            for (int i=a; i>=b; i--){
                System.out.print(i);
                if(i>b){
                    System.out.print(", ");
                }
            }
        }else if (a==b){
            System.out.print(a);
        }
        System.out.println("]");
    }
}

/*
Write a method called smallestLargest that accepts a Scanner for the console as a parameter and asks the user
to enter numbers, then prints the smallest and largest of all the numbers supplied by the user. You may assume that
the user enters a valid number greater than 0 for the number of numbers to read. Here is a sample execution:
How many numbers do you want to enter? 4
Number 1: 5
Number 2: 11
Number 3: -2
Number 4: 3
Smallest = -2
Largest = 11
*/
package Excercise4_Conditional;
import java.util.*;
public class smallestlargest {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("how many numbers? ");
        int num = console.nextInt();
        smallestLargest(num, console);
    }
    
    public static void smallestLargest(int n, Scanner console){
        int min=n;
        int max=n;
        for (int i = 0; i<n; i++){
            System.out.printf("Number %d: ",i+1);
            int number = console.nextInt();
            if (number>max){
                max = number;
            }else if (number<min){
                min = number;
            }
        }
        System.out.println();
        System.out.println("min: "+min);
        System.out.println("max: "+max);
    }
}

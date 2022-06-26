/*
Write a method called printAverage that uses a sentinel loop to repeatedly prompt the user for numbers. Once the
user types any number less than zero, the method should display the average of all nonnegative numbers typed.
Display the average as a double . Here is a sample dialogue with the user:
Type a number: 7
Type a number: 4
Type a number: 16
Type a number: –4
Average was 9.0

If the first number that the user types is negative, do not print an average:
Type a number: –2
 */
package Excercise5_Logic_Indefloops;

/**
 *
 * @author dani
 */
import java.util.*;
public class printAverage {
    public static void main(String[] args){
        printAverage();
    }
    
    public static void printAverage(){
        Scanner console = new Scanner(System.in);
        int counter = 0; 
        int sentinel = 0;
        int sum = 0;
        
        while(sentinel >= 0){
            System.out.print("Type a number: ");
            int n = console.nextInt();
            if(n>=0){
                sum += n;
                counter++;
            }
            sentinel = n;
        }
        if(counter == 0){
            System.out.println();
        }else{
            double average = sum / counter;
            System.out.printf("average was: %2f \n", average);
        }
    }
}

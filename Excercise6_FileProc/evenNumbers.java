/*
Write a method called evenNumbers that accepts a Scanner reading input from a file with a series of integers, and
report various statistics about the integers to the console. 

Report the: 
total number of numbers, 
the sum of the numbers, 
the count of even numbers,
and the percent of even numbers.

For example, if the input file contains the following text:
5 7 2 8 9 10 12 98 7 14 20 22 420
Then the method should produce the following console output:
12 numbers, sum = 214
8 evens (66.67%)
 */
package Excercise6_FileProc;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class evenNumbers {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("evenNumbers.txt"));
        
        int total = 0;
        int sum = 0;
        int etotal = 0;
        
        while (input.hasNext()){
            int next = input.nextInt();
            
            if(next%2 == 1){
                etotal++;
            }
            total++;
            sum+=next;
        }
        double percent = (etotal * 100.0f)/total;
        System.out.printf("%3d numbers, sum = %3d \n", total, sum );
        System.out.printf("%3d evens, (%.2f%%)", etotal, percent);
    }    
}

/*
Write a method called negativeSum that accepts a Scanner reading input from a file containing a series of
integers, and print a message to the console indicating whether the sum starting from the first number is ever negative.
You should also return true if a negative sum can be reached and false if not. 

For example, suppose the file contains the following text:
38 4 19 -27 -15 -3 4 19 38

Your method would consider the sum of just one number (38), the first two numbers (38  4), the first three
numbers (38  4  19), and so on to the end. None of these sums is negative, so the method would produce the
following output and return false :
no negative sum

If the file instead contains the following numbers:
14 7 -10 9 -18 -10 17 42 98

The method finds that a negative sum of 8 is reached after adding the first six numbers. It should output the
following to the console and return true :
sum of -8 after 6 steps
 */
package Excercise6_FileProc;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class negativeSum {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("negativesum.txt"));
        
        int sum = 0;
        int counter = 0;
        
        while (input.hasNextInt() && sum>=0){
            if(input.hasNextInt()){
                int next = input.nextInt();
                sum += next;
                counter++;
                //System.out.println("sum:" + sum);
            }        
        }
        
        if(sum<0){
            System.out.printf("sum of %d after %d steps \n", sum, counter);
        }else{
            System.out.println("no negative sum");
        }
    }
}

/*
This program reads input from a file and computes the sum of all the numbers included in the file
 */
package Chapter6;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class ShowSum {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("/home/dani/NetBeansProjects/test/files/numbers.dat"));
        double sum = 0.0;
        int count = 0;
        
        while(input.hasNext()){
            double number = input.nextDouble();
            count++;
            System.out.printf("number %d: %5.2f \n", count, number);
            sum += number;
            
        }
    }
}

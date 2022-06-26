/*
This program reads an input file of hours worked by various
employees and reports the total hours worked by each.
The data ca be found in "hours.dat"
 */
package Chapter6;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class hoursWorked {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("/home/dani/NetBeansProjects/test/files/hours.dat"));
        
        process(input);
    }
    
    public static void process(Scanner input){
            while(input.hasNext()){
                String name = input.next();
                double sum = 0;
                while(input.hasNextDouble()){
                    double hours = input.nextDouble();
                    sum += hours;
                }
                System.out.printf("%8s has worked %.2f hours. \n", name, sum);
            }
    }
}

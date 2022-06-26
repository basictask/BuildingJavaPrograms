/*
This program reads an input file of hours worked by various
employees and reports the total hours worked by each.
The main change between the previous version is that this version processes the input line-by-line.
The data ca be found in "hours.dat"
Each line starts with a worker ID, followed by worker name, followed by hours worked on a week.
The task is to sum up hours worked, and print it with employee ID and name.
 */
package Chapter6;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class hoursWorked_2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("/home/dani/NetBeansProjects/test/files/hours2.dat"));
        
        while(input.hasNextLine()){
            String text = input.nextLine();
            process(text);
        }
    }
    
    public static void process(String text){
        Scanner data = new Scanner(text);
        int ID = data.nextInt();
        String name = data.next();
        double sum = 0;
        
        while(data.hasNextDouble()){
            double hours = data.nextDouble();
            sum += hours;
        }
        System.out.printf("%8s (ID: %3d) has worked %.2f hours this week. \n",name, ID, sum);
    }
}

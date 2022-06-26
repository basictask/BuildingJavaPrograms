/*
This program asks the uer how many days of temperature they want to input, 
then the daily maximum temperature of said days
then computes an average
tehn reports how many days were above average
 */
package Chapter7;

/**
 *
 * @author dani
 */
import java.util.*;
public class averageTemp{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("enter number of days to measure: ");
        int numdays = console.nextInt();
        int temps[] = new int [numdays];
        
        int sum = 0;
        for(int i = 0; i<numdays; i++){
            System.out.printf("enter day %d maximum: ", i+1);
            temps[i] = console.nextInt();
            sum += temps[i];
        }
        
        double average = sum / numdays;
        int above = 0;
        int maximum = 0;
        for(int i = 0; i<numdays; i++){
            if(temps[i] > average){
                above++;
            }
            if(temps[i] > maximum){
                maximum = temps[i];
            }
        }
        
        System.out.println();
        System.out.println("average temperature: "+average);
        System.out.println("maximum temperature: "+maximum);
        System.out.println("days above average: "+above);
    }
}
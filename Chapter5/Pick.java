/*
This program picks numbers from
1 to 10 until a particular number comes up, 
and counts how many tries did it take to get to that number
 */

package Chapter5;
import java.util.*;
public class Pick {
    public static void main(String[] args){
        
        Scanner console = new Scanner(System.in);
        Random r = new Random();
        
        System.out.print("Pick a number between 1 and 10: ");
        int number = console.nextInt();
        
        int counter = 0;
        int result = -1;
        
        while (result != number){
            result = r.nextInt(11);
            counter++;
            System.out.println("Current number: " + result);    
        }
        
        System.out.println("number of iterations: "+counter);
    }
}

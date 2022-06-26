/*
This program decides whether a token input by the user can be interpreted as an integer, double, and string.
 */
package Chapter5;

/**
 *
 * @author dani
 */
import java.util.*;
public class examineinput {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("token? ");
        System.out.println("hasNextInt: " + console.hasNextInt());
        System.out.println("hasNextDouble = " + console.hasNextDouble());
        System.out.println("hasNext = " + console.hasNext());
        
    }
    
}

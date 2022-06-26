/*
This program asks for the age of the user and keep prompting until the user has given an integer
 */
package Chapter5;

/**
 *
 * @author dani
 */
import java.util.*;
public class giveint {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String prompt = "input your age: ";
        getInt(console, prompt);
    }
    
    public static int getInt(Scanner console, String prompt){
        
        System.out.print(prompt);
        while(!console.hasNextInt()){
            console.next();
            System.out.println("incorrect data type. try again.");
            System.out.println(prompt);
        }
    return console.nextInt();
    }
}

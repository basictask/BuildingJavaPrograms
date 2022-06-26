/*
this program reverses the lines of a text file.
 */
package Chapter_12;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class Reverse {
    public static void main(String[] args) throws FileNotFoundException{
       Scanner input = new Scanner(new File("fun.txt")); 
       reverse(input);
    }
    
    public static void reverse(Scanner input){
        while(input.hasNextLine()){
            String line = input.nextLine();
            reverse(input);
            System.out.println(line);
        }
    }
}

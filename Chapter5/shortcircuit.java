/*
This program takes a string as an input and returns the first word of this string.
 */
package Chapter5;

/**
 *
 * @author dani
 */
import java.util.*;
public class shortcircuit {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("input string: ");
        String str = console.nextLine();
        System.out.println(firstWord(str));
    }
    
    public static String firstWord(String s){
        int start = 0;
        while(start < s.length() && s.charAt(start) == ' '){
            start++;
        }
        int stop = start;
        
        while(stop < s.length() && s.charAt(stop) != ' '){
            stop++;
        }
    return s.substring(start, stop);
    }
}

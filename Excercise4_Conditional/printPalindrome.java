/*
Write a method called printPalindrome that accepts a Scanner for the console as a parameter, and prompts the
user to enter one or more words and prints whether the entered String is a palindrome (i.e., reads the same
forwards as it does backwards, like "abba" or "racecar") .
For an added challenge, make the code case-insensitive, so that words like “Abba” and “Madam” will be
considered palindromes.
 */
package Excercise4_Conditional;

/**
 *
 * @author dani
 */
import java.util.*;
public class printPalindrome {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println(printPalindrome(console));
    }
    
    public static boolean printPalindrome(Scanner console){
        System.out.print("Input your word: ");
        String s = console.next();
        int l = s.length();
        String rev = "";
        
        for(int i=0; i<l; i++){
            rev = s.charAt(i) + rev;
        }
        
        if(rev.equalsIgnoreCase(s)){
            return true;
        }else{
            return false;
        }
    }
}

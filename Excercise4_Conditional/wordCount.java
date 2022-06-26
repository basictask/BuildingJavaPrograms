/*
Write a method called wordCount that accepts a String as its parameter and returns the number of words in
the String . 
A word is a sequence of one or more nonspace characters (any character other than ' ' ). 
For example, the call wordCount("hello") should return 1 , the call wordCount("how are you?") should return 3 , 
the call wordCount(" this string has wide spaces ") should return 5 , and the call wordCount(" ") should
return 0 .
 */
package Excercise4_Conditional;

/**
 *
 * @author dani
 */
import java.util.*;
public class wordCount {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Input sentence: ");
        String sentence = console.nextLine();
        System.out.println("Number of words in sentence: " + wordCount(sentence));
    }
    
    public static int wordCount(String s){
        int n = 0;
        int l = s.length();
        if(s.length()>0){
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i)==' ' ){
                    n++;
                }
            }
        }
        
    return n;  
    }
}
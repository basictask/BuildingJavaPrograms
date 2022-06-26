/*
Write a method maxLength that accepts a set of strings as a parameter and that returns 
the length of the longest string in the list. 
If your method is passed an empty set, it should return 0 .
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class MaxLength {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("hamlet.txt"));
        HashSet<String> set = new HashSet<String>();
        
        while(input.hasNext()){
            String next = input.next().toLowerCase();
            set.add(next);
        }
        
        System.out.println("length of max: "+maxLength(set));
    }
    
    public static int maxLength(HashSet<String> set){
        String max = "";  
        
        for(String s : set){
            if(s.length() > max.length()){
                max = s;
            }
        }
        
        System.out.println("max: "+max);
        return max.length();
    }
}    
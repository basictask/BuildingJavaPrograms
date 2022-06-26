/*
Write a method removeEvenLength that accepts a set of strings as a parameter and that removes all of the strings
of even length from the set.
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class RemoveEvenLength {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("hamlet.txt"));
        TreeSet<String> set = new TreeSet<String>();
        
        while(input.hasNext()){
            String next = input.next().toLowerCase();
            set.add(next);
        }
        
        System.out.println("before: "+set);
        
        System.out.println("after: "+remove(set));
    }
    
    public static TreeSet<String> remove(TreeSet<String> set){
        TreeSet<String> result = new TreeSet<String>();
        
        for(String s : set){
            if(s.length() % 2 != 0){
                result.add(s);
            }
        }
        return result;
    }
}

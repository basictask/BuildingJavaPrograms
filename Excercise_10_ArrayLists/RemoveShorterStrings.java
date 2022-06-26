/*
Write a method called removeShorterStrings that accepts an ArrayList of strings as a parameter,
and removes from each pair of values the shorter string in the pair. 
If the list is of odd length, the final element is unchanged. 

For example, suppose that a list contains ["four", "score", "and", ""seven", "years", "ago", "our"] . 
In the first pair ( "four" and "score") the shorter string is "four" . 
In the second pair ("and" and "seven") the shorter string is "and" . 
In the third pair ("years" and "ago" ) the shorter string is "ago" . 
Your method should remove these shorter strings, changing the list to store ["score", "seven", "years", "our"] . 
If both strings in a pair have the same length, remove the first string in the pair.
 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */
import java.util.*;
public class RemoveShorterStrings {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("four");
        list.add("score");
        list.add("and");
        list.add("seven");
        list.add("years");
        list.add("ago");
        list.add("our");
        
        System.out.println("before: "+list);
        removeShorter(list);
        System.out.println("after: "+list);
    }
    
    public static ArrayList<String> removeShorter(ArrayList<String> list){
        int n;
        if(list.size()%2 == 1){
            n = list.size()-2;
        }else{
            n = list.size();
        }
        
        for(int i=n; i>=0; i-=2){
            String a = list.get(i);
            String b = list.get(i-1);
            
            if(a.length() < b.length()){
                list.remove(a);
            }else if(a.length() > b.length()){
                list.remove(b);
            }else{
                list.remove(b);
            }
        }
        return list;
    }
}

/*
Write a method called clump that accepts an ArrayList of strings as a parameter, 
and replaces each pair of strings with a single string that consists of 
the two original  strings in parentheses separated by a space. 
If the list is of odd length, the final element is unchanged. 

For example, suppose that a list contains ["four", "score", "and", "seven", "years", "ago", "our" ]. 
Your method should change the list to store ["(four score)", "(and seven)", "(years ago)", "our"].
 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */
import java.util.*;
public class Clump {
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
        clump(list);
        System.out.println("after: "+list);
    }
    
    public static ArrayList<String> clump(ArrayList<String> list){
        int n;
        if(list.size()%2 == 1){
            n = list.size()-2;
        }else{
            n = list.size()-1;
        }
        for(int i = 0; i<list.size()-1; i++){
            String a = list.get(i);
            String b = list.get(i+1);
            String c = "("+a + " " + b+")";
            list.set(i, c);
            list.remove(i+1);    
        }
        return list;
    }
}

/*
Write a method called removeInRange that accepts three parameters, 
an ArrayList of Strings, a beginning String , and an ending String , 
and removes from the list any String s that fall alphabetically between the start and end Strings. 

For example, if the method is passed a list containing the elements  (“to”, “be”, “or”, “not”, “to”, “be”, “that”, “is”, “the”, “question”), 
“free” as the start String , and “rich” as the end String , 
the list’s elements should be changed to (“to”, “be”, “to”, “be”, “that”, “the”). 

The “or”, “not”, “is”, and “question” should be removed because they occur alphabetically between “free” and “rich”. 
You may assume that the start String alphabetically precedes the ending String .
 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */
import java.util.*;
public class RemoveInRange {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("to");
        list.add("be");
        list.add("or");
        list.add("not");
        list.add("to");
        list.add("be");
        list.add("that");
        list.add("is");
        list.add("the");
        list.add("question");
        
        System.out.println("before: "+list);
        remove(list, "free", "rich");
        System.out.println("after: "+list);
    }
    
    public static ArrayList<String> remove(ArrayList<String> list, String begin, String end){       
        for(int i = list.size()-1; i>=0; i--){
            int i1 = begin.compareTo(list.get(i));
            int i2 = end.compareTo(list.get(i));
            if(i1 < 0 && i2 > 0){
                list.remove(list.get(i));
            }
        }
        return list;
    }
}

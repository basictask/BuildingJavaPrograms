/*
Write a method called removeDuplicates that takes as a parameter a sorted ArrayList of Strings
and eliminates any duplicates from the list. 
For example, if the list stores the values (“be”, “be”, “is”, “not”, “or”, “question”, “that”, “the”, “to”, “to”) 
before the method is called, it should store the values (“be”, “is”, “not”, “or”, “question”, “that”, “the”, “to”) 
after the method finishes executing. 
Because the values will be sorted, all of the duplicates will be grouped together. 
Assume that the ArrayList contains only String values, but keep in mind that it might be empty.
 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */
import java.util.*;
public class RemoveDuplicates {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("be");
        list.add("be");
        list.add("is");
        list.add("not");
        list.add("or");
        list.add("question");
        list.add("that");
        list.add("the");
        list.add("to");
        list.add("to");
        
        System.out.println("before: "+list);
        list = removeDuplicates(list);
        System.out.println("after: "+list);
        
    }
    
    public static ArrayList<String> removeDuplicates(ArrayList<String> list){
        ArrayList<String> result = new ArrayList<String>();
        
        Collections.sort(list);
        
        result.add(list.get(0));
        for(int i=1; i<list.size(); i++){
            if(!list.get(i-1).equals(list.get(i))){
                result.add(list.get(i));
            }
        }
        return result;
    }
}    
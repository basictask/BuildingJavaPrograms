/*
Write a method called removeZeroes that takes as a parameter an ArrayList of integers, 
and eliminates any occurrences of the number 0 from the list. 
For example, if the list stores the values (0, 7, 2, 0, 0, 4, 0) before the method is called, 
it should store the values (7, 2, 4) after the method finishes executing.
 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */
import java.util.*;
public class RemoveZeros {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(0);
        list.add(7);
        list.add(2);
        list.add(0);
        list.add(0);
        list.add(4);
        list.add(0);
        
        System.out.println("before: "+list);
        removeZeros(list);
        System.out.println("affter: "+list);
        
    }
    
    public static ArrayList<Integer> removeZeros(ArrayList<Integer> list){
        for(int i = list.size()-1; i>=0; i--){
            if(list.get(i) == 0){
                list.remove(i);
            }
        }
        return list;
    }
}

/*
Write a method countUnique that accepts a list of integers as a parameter 
and returns the number of unique integer values in the list. 
Use a set as auxiliary storage to help you solve this problem. 
For example, if a list contains the values (3, 7, 3, –1, 2, 3, 7, 2, 15, 15) , your method should return 5 . 
The empty list contains 0 unique values.
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.util.*;
public class CountUnique {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        list.add(3);
        list.add(7);
        list.add(3);
        list.add(-1);
        list.add(2);
        list.add(7);
        list.add(2);
        list.add(15);
        list.add(15);
        
        
        System.out.println("your list: "+list);
        System.out.println("unique elements: "+countUnique(list));
    }
    
    public static int countUnique(ArrayList<Integer> list){
        HashSet<Integer> set = new HashSet<Integer>();
        
        set.addAll(list);
        //System.out.println(set);
        return set.size();
    }
}

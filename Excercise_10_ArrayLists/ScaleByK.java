/*
Write a method called scaleByK that takes an ArrayList of integers as a parameter,
and replaces every integer of value K with K copies of itself. 
For example, if the list stores the values (4, 1, 2, 0, 3) before the method is called, 
it should store the values (4, 4, 4, 4, 1, 2, 2, 3, 3, 3) after the method finishes executing. 
Zeroes and negative numbers should be removed from the list by this method.
 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */
import java.util.*;
public class ScaleByK {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(1);
        list.add(2);
        list.add(0);
        //list.add(-1);
        list.add(3);
        
        System.out.println(list);
        list = scaleByK(list);
        System.out.println(list);
    }
    
    public static ArrayList<Integer> scaleByK(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i=0; i<list.size(); i++){
            int n = list.get(i);
            if(n>0){
                for(int j=0; j<n; j++){
                    result.add(n);
                }
            }
        }
        return result;
    }
}

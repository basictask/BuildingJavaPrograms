/*
Write a method called minToFront that takes an ArrayList of integers,
as a parameter and moves the minimum value in the list to the front, 
otherwise preserving the order of the elements. 
For example, if a variable called list stores (3, 8, 92, 4, 2, 17, 9), 
the value 2 is the minimum, so your method should modify the list 
to store the values (2, 3, 8, 92, 4, 17, 9).
 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */
import java.util.*;
public class MinToFront {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(8);
        list.add(92);
        list.add(4);
        list.add(2);
        list.add(17);
        list.add(9);
        list.add(2);
        
        System.out.println("before: "+list);
        minToFront(list);
        System.out.println("after: "+list);
    }
    
    public static ArrayList<Integer> minToFront(ArrayList<Integer> list){
        int min = list.get(0);
        int index = 0;
        for(int i = 0; i<list.size(); i++){
            if(list.get(i)<=min){
                min = list.get(i);
                list.remove(i);
                list.add(0, min);
            }
        }
        return list;
    }
}

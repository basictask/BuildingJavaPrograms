/*
Write a method called reverse3 that accepts an ArrayList of integer values as a parameter, 
and reverses each successive sequence of three values in the list. 
If the list has extra values that are not part of a sequence of three, those values are unchanged. 

For example, if a list stores values [3, 8, 19, 42, 7, 26, 19, -8] , 
after the call the list should store the values [19, 8, 3, 26, 7, 42, 19, -8].

The first sequence of three (3, 8, 19) has been reversed to be (19, 8, 3). 
The second sequence (42, 7, 26) has been reversed to be (26, 7, 42), and so on.

Notice that 19 and –8 are unchanged because they were not part of a sequence of three values.
 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */
import java.util.*;
public class Reverse3 {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(8);
        list.add(19);
        list.add(42);
        list.add(7);
        list.add(26);
        list.add(19);
        list.add(-8);
        
        System.out.println("before: "+list);
        reverse3(list);
        System.out.println("after: "+list);
    }
    
    public static ArrayList<Integer> reverse3(ArrayList<Integer> list){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int a = list.size()%3;
        for(int i = 0; i<list.size()-a; i+=3){
            int n1 = list.get(i);
            int n2 = list.get(i+2);
            list.set(i, n2);
            list.set(i+2, n1);
            
        }
        return list;
    }
}

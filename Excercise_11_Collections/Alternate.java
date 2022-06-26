/*
Write a method called alternate that accepts two List s as its parameters and returns a new List containing alter-
nating elements from the two lists, in the following order:

First element from first list
First element from second list
Second element from first list
Second element from second list
Third element from first list
Third element from second list

If the lists do not contain the same number of elements, the remaining elements from the longer list should be placed
consecutively at the end. For example, for a first list of (1, 2, 3, 4, 5) and a second list of (6, 7, 8, 9,
10, 11, 12) , a call of alternate(list1, list2) should return a list containing (1, 6, 2, 7, 3, 8, 4, 9,
5, 10, 11, 12) .
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.util.*;
public class Alternate {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        
        list2.add(10);
        list2.add(20);
        list2.add(30);
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);
        
        
        ArrayList<Integer> result = alternate(list1, list2);
        System.out.println(result);
    }
    
    public static ArrayList<Integer> alternate(ArrayList<Integer> list1, ArrayList<Integer> list2){
        ArrayList<Integer> result = new ArrayList<Integer>();        
        Iterator<Integer> itr1 = list1.iterator();
        Iterator<Integer> itr2 = list2.iterator();
        
        while(itr1.hasNext() || itr2.hasNext()){
            
            if(itr1.hasNext()){
                int next = itr1.next();
                result.add(next);
            }
            if(itr2.hasNext()){
                int next = itr2.next();
                result.add(next);
            }
        }
  
        return result;
    }
}

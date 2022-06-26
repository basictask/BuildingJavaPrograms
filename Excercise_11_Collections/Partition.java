/*
Write a method called partition that accepts a list of integers and an integer value E as its parameter, 
and rearranges (partitions) the list so that all the elements with values less than E 
occur before all elements with values greater than E . The exact order of the elements is unimportant, 
so long as all elements less than E appear before all elements greater than E . 

For example, for the linked list (15, 1, 6, 12, –3, 4, 8, 21, 2, 30, –1, 9) , one acceptable ordering of
the list after a call of partition(list, 5) would be (–1, 1, 2, 4, –3, 12, 8, 21, 6, 30, 15, 9). 

You may assume that the list contains no duplicates and does not contain the element value E .
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.util.*;
public class Partition {
    public static void main(String[] args){
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(15);
        list.add(1);
        list.add(6);
        list.add(12);
        list.add(-3);
        list.add(4);
        list.add(8);
        list.add(21);
        list.add(2);
        list.add(30);
        list.add(-1);
        list.add(9);
        
        System.out.println(partition(list, 5));
    }
    
    public static LinkedList<Integer> partition(LinkedList<Integer> list, int target){
        Iterator<Integer> itr = list.iterator();
        LinkedList<Integer> result = new LinkedList<Integer>();
        while(itr.hasNext()){
            int next = itr.next();
            if(next < target){
                result.add(0, next);
            }else{
                result.add(next);
            }
        }
        return result;
    }
}

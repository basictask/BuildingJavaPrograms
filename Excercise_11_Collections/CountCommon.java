/*
Write a method countCommon that accepts two lists of integers as parameters and returns 
the number of unique integers that occur in both lists.
For example, if one list contains the values ( 3, 7, 3, –1, 2, 3, 7, 2, 15, 15) 
and the other list contains the values (–5, 15, 2, –1, 7, 15, 36) , 
your method should return 4 because the elements –1, 2, 7, and 15 occur in both lists.
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.util.*;
public class CountCommon {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        
        Random r = new Random();
        
        for(int i = 0; i<10; i++){
            int n1 = r.nextInt(30);
            int n2 = r.nextInt(30);
            list1.add(n1);
            list2.add(n2);
        }
        
        Collections.sort(list1);
        Collections.sort(list2);
        
        System.out.println("list 1: "+list1);
        System.out.println("list 2: "+list2);
        
        System.out.println();
        
        System.out.println("number of common elements: "+common(list1, list2));
    }
    
    public static int common(ArrayList<Integer> list1, ArrayList<Integer> list2){
        HashSet<Integer> set = new HashSet<Integer>(list1);
        set.retainAll(list2);
        
        System.out.println("common elements: "+set);
        return set.size();
    }
}

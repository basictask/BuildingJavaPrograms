/*
Write a method called symmetricSetDifference that accepts two Set s as parameters and returns a new Set
containing their symmetric set difference 
(that is, the set of elements contained in either of the two sets but not in both). 
For example, the symmetric difference between the sets {1, 4, 7, 9} and {2, 4, 5, 6, 7} is {1, 2, 5, 6, 9} .
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.util.*;
public class SymmetricDifference {
    public static void main(String[] args){
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        
        set1.add(1);
        set1.add(4);
        set1.add(7);
        set1.add(9);
        
        set2.add(2);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        set2.add(7);
        
        System.out.println("set1: "+set1);
        System.out.println("set2: "+set2);
        
        System.out.println("symmetric difference: "+difference(set1, set2));
    }
    
    public static HashSet<Integer> difference(HashSet<Integer> set1, HashSet<Integer> set2){
        HashSet<Integer> retain = new HashSet<Integer>(set1);
        HashSet<Integer> common = new HashSet<Integer>(set1);
        HashSet<Integer> result = new HashSet<Integer>();
        retain.retainAll(set2);
        common.addAll(set2);
        
        for(int n : common){
            if(!retain.contains(n)){
                result.add(n);
            }
        }
        
        return result;
    }
}

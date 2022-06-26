/*
Write a method hasOdd that accepts a set of integers as a parameter and returns true if the set contains at least one
odd integer and false otherwise. If passed the empty set, your method should return false .
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */

import java.util.*;
public class HasOdd {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<Integer>();
        
        set.add(8);
        set.add(4);
        set.add(2);
        set.add(6);
        set.add(10);
        
        System.out.println("has odd? "+hasOdd(set));
    }
    
    public static boolean hasOdd(HashSet<Integer> set){
        for(int n : set){
            if(n%2 != 0){
                return true;
            }
        }
        return false;
    }
}

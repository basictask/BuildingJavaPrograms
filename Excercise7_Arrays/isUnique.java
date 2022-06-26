/*
Write a method called isUnique that accepts an array of integers as a parameter and returns a boolean value indicating 
whether or not the values in the array are unique ( true for yes, false for no). 
The values in the list are considered unique if there is no pair of values that are equal. 
For example, if passed an array containing {3, 8, 12, 2, 9, 17, 43, -8, 46}, your method should return true, 
but if passed {4, 7, 3, 9, 12, -47, 3, 74}, your method should return false because the value 3 appears twice.
 */
package Excercise7_Arrays;

/**
 *
 * @author dani
 */
import java.util.*;
public class isUnique {
    public static void main(String[] args){
        int[] list1 = {3, 8, 12, 2, 9, 17, 43, -8, 46};
        int[] list2 = {4, 7, 3, 9, 12, -47, 3, 74};
        sort(list1);
        sort(list2);
        System.out.println(Arrays.toString(list1));
        System.out.println(Arrays.toString(list2));
        System.out.println();
        System.out.println(isUnique(list1));
        System.out.println(isUnique(list2));
        
    }
    
    public static boolean isUnique(int[] list){
        for(int i = 0; i<list.length-1; i++){
            if(list[i] == list[i+1]){
                return false;
            }
        }
        return true;
    }
    
    public static int[] sort(int[] list){
        for(int i = 0; i<list.length-1; i++){
            int index = i;
            for(int j = i+1; j<list.length; j++){
                if(list[j] < list[index]){
                    index = j;
                }
            }
            int smaller = list[index];
            list[index] = list[i];
            list[i] = smaller;
        }
        return list;
    }
    
    
}

/*
Write a method called minGap that accepts an integer array as a parameter and returns the minimum difference or
gap between adjacent values in the array, where the gap is defined as the later value minus the earlier value. 

For example, in the array {1, 3, 6, 7, 12}, the first gap is 2 (3  1), the second gap is 3 (6  3), the third gap is 1 (7  6),
and the fourth gap is 5 (12  7). So your method should return 1 if passed this array. 

The minimum gap could be a negative number if the list is not in sorted order. 
If you are passed an array with fewer than two elements, return 0.
 */
package Excercise7_Arrays;

/**
 *
 * @author dani
 */
//import java.util.*;
public class minGap {
    public static void main(String[] args){
        int[] list = {1, 3, 6, 7, 12};
        //sort(list);
        System.out.println("the minimum gap is: "+minGap(list));
    }
    
    public static int minGap(int[] list){
        int len = list.length;
        if(len<2){
            return 0;
        }else{
            int mingap = list[1]-list[0];
            for(int i = 0; i<len-1; i++){
                if(mingap > list[i+1] - list[i]){
                    mingap = list[i+1] - list[i];
                }
            }
            return mingap;
        }
    }
    
    public static int[] sort(int[] list){
        for(int i = 0; i<list.length-1; i++){
            int index = i;
            for(int j = i+1; j<list.length; j++){
                if(list[j]<list[index]){
                    index = j;
                }
            }
            int smaller = list[index];
            list[index] = list[i];
            list[i] = smaller;
        }
        //System.out.println(Arrays.toString(list));
        return list;
    }
}

/*
Write a method called median that accepts an array of integers as its parameter and returns the median of the num-
bers in the array. The median is the number that appears in the middle of the list if you arrange the elements in order.
Assume that the array is of odd size (so that one sole element constitutes the median) and that the numbers in the
array are between 0 and 99 inclusive. 
For example, the median of {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17} is 5 
and the median of {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27} is 25.
 */
package Excercise7_Arrays;

/**
 *
 * @author dani
 */
import java.util.*;
public class median {
    public static void main(String[] args){
        int[] list1 = {5, 2, 4, 17, 55, 4, 3, 26, 18, 2, 17};
        int[] list2 = {42, 37, 1, 97, 1, 2, 7, 42, 3, 25, 89, 15, 10, 29, 27};
        sort(list1);
        System.out.println(median(list1));
        sort(list2);
        System.out.println(median(list2));
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
        System.out.println(Arrays.toString(list));
    return list;
    }
    
    public static int median(int[] list){
        int len = list.length;
        //System.out.println(len);
        System.out.print("median of list: ");
    return list[len/2];    
    }
}

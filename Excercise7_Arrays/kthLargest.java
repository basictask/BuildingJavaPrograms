package Excercise7_Arrays;

/*
Write a method called kthLargest that accepts an integer k and an array a as its parameters and returns the ele-
ment such that k elements have greater or equal value. If k = 0 , return the largest element; if k = 1 , return the
second-largest element, and so on. 
For example, if the array passed contains the values {74, 85, 102, 99, 101, 56, 84} and the integer k passed is 2, 
your method should return 99 because there are two values at least as large as 99 (101 and 102). 
Assume that 0 ≤ k < a.length. (Hint: Consider sorting the array or a copy of the array first.)
 
{74, 85, 102, 99, 101, 56, 84}
{  ,   ,    ,   ,    ,   ,   }

*/

/**
 *
 * @author Y80L35
 */
import java.util.*;
public class kthLargest {
    public static void main(String[] args){
        int[] list = {74, 85, 102, 99, 101, 56, 84, 104};
        int k = 3;
        int[] sorted = sort(list);
        System.out.println(kthLargest(sorted, k));
    }
    
    public static int kthLargest(int[] a, int k){
        Arrays.sort(a);
        return a[a.length-k-1];
    }
    
    public static int[] sort(int[] list){
        int[] sorted = new int[list.length-1];
        int max = list[0];
        for(int i = 0; i<list.length; i++){
            if(max<list[i]){
                max = list[i];
            }
        }
        
        int count = 0;
        int count2 = 0;
        while(count != max){
            for(int i = 0; i<list.length; i++){
                if(count == list[i]){
                    sorted[count2] = list[i];
                    count2++;
                }
            }
            count++;
        }
        System.out.println(Arrays.toString(sorted));
        return sorted;
    }
}

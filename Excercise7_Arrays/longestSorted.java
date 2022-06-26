/*
Write a method called longestSortedSequence that accepts an array of integers as a parameter and returns the
length of the longest sorted (nondecreasing) sequence of integers in the array. 

For example, in the array {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12}, 
the longest sorted sequence in the array has four values in it (the sequence -3, 0, 14, 207), 
so your method would return 4 if passed this array. 
Sorted means nondecreasing, so a sequence could contain duplicates. 
Your method should return 0 if passed an empty array.
 */
package Excercise7_Arrays;

/**
 *
 * @author dani
 */
public class longestSorted {
    public static void main(String[] args){
        int[] list = {3, 8, 10, 1, 9, 14, -3, 0, 14, 207, 56, 98, 12};
        System.out.println(longestSortedSequence(list));
    }
    
    public static int longestSortedSequence(int[] list){
        int len = list.length;
        if (len == 0){
            return 0;
        }
        
        int count = 0;
        int max = 0;
        for (int i = 0; i<len-1; i++){
            if(list[i] < list[i+1]){
                count++;
                if(count > max){
                    max = count;
                }
            }else if(list[i] > list[i+1]){
                count = 0;
            }
        }
        return max+1;
    }
}

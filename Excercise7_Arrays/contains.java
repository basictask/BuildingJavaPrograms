/*
Write a method called contains that accepts two arrays of integers a1 and a2 as parameters and that returns a
boolean value indicating whether or not the sequence of elements in a2 appears in a1 ( true for yes, false for no).
The sequence must appear consecutively and in the same order. 
For example, consider the following arrays:
int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
int[] list2 = {1, 2, 1};

The call of contains(list1, list2) should return true because the sequence of values in list2 {1, 2, 1} is con-
tained in list1 starting at index 5. 
If list2 had stored the values {2, 1, 2}, the call of contains(list1, list2) would return false . 
Any two lists with identical elements are considered to contain each other. 
Every array contains the empty array, and the empty array does not contain any arrays other than the empty array itself.
 */
package Excercise7_Arrays;

/**
 *
 * @author dani
 */
public class contains {
    public static void main(String[] args){
        int[] list1 = {1, 6, 2, 1, 4, 1, 2, 1, 8};
        int[] list2 = {1, 2, 1};
        int[] list3 = {2, 1, 2};
        System.out.println(contains(list1, list3));
    }
    
    public static boolean contains(int[] list1, int[] list2){
        int len2 = list2.length;
        for(int i = 0; i<list1.length; i++){
            if(list1[i] == list2[0]){
                int j = 0;
                while(list1[i+j] == list2[j]){
                    j++;
                    if(j == len2){
                        return true;
                    }
                }
            }
        }
        return false;
    }    
}
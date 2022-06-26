/*
Write a method called range that returns the range of values in an array of integers. 
The range is defined as 1 more than the difference between the maximum and minimum values in the array. 

For example, if an array called list contains the values {36, 12, 25, 19, 46, 31, 22}, 
the call of range(list) should return 35 (46 - 12 + 1). 
You may assume that the array has at least one element.
 */
package Excercise7_Arrays;

/**
 *
 * @author dani
 */
public class range {
    public static void main(String[] args){
        int[] list = {36, 12, 25, 19, 46, 31, 22};
        range(list);
    }
    
    public static void range(int[] list){
        int max = list[0];
        int min = list[0];
        for(int n : list){
            if (n > max){
                max = n;
            }
            if (n < min){
                min = n;
            }
        }
        int range = max-min+1;
        System.out.printf("%d (%d - %d + 1) \n", range, max, min);
    }
}

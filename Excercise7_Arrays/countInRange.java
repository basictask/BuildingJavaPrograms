/*
Write a method called countInRange that accepts an array of integers, a minimum value, and a maximum value as
parameters and returns the count of how many elements from the array fall between the minimum and maximum (inclusive). 
For example, in the array {14, 1, 22, 17, 36, 7, 43, 5}, for minimum value 4 and maximum value 17,
there are four elements whose values fall between 4 and 17 .
 */
package Excercise7_Arrays;

/**
 *
 * @author dani
 */
public class countInRange {
    public static void main(String[] args){
        int[] list = {14, 1, 22, 17, 36, 7, 43, 5};
        int min = 4;
        int max = 17;
        System.out.println(countInRange(list, min, max));
    }
    
    public static int countInRange(int[] list, int min, int max){
        int count = 0;
        for(int n : list){
            if(n>=min && n<=max){
                count++;
            }
        }
        return count;
    }
}

/*
Write a method called lastIndexOf that accepts an array of integers and an integer value as its parameters and returns
the last index at which the value occurs in the array. 
The method should return –1 if the value is not found. 
For example, in the array {74, 85, 102, 99, 101, 85, 56}, the last index of the value 85 is 5.
 */
package Excercise7_Arrays;

/**
 *
 * @author dani
 */
public class lastIndexOf {
    public static void main(String[] args){
        int[] list = {74, 85, 102, 99, 101, 85, 56};
        int num = 85;
        System.out.println(lastIndexOf(list, num));
    }
    
    public static int lastIndexOf(int[] list, int num){
        int index = -1; 
        for(int i = 0; i<list.length; i++){
            if(list[i] == num ){
                index = i; 
            }
        }
        return index;
    }
}

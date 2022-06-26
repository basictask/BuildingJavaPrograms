/*
Write a method called mode that returns the most frequently occurring element of an array of integers. 
Assume that the array has at least one element and that every element in the array has a value between 0 and 100 inclusive. 
Break ties by choosing the lower value. 
For example, if the array passed contains the values {27, 15, 15, 11, 27}, your method should return 15 . 
Can you write a version of this method that does not rely on the values being between 0 and 100?
 */
package Excercise7_Arrays;

import java.util.Arrays;

/**
 *
 * @author dani
 */
public class mode {
    public static void main(String[] args){
        int[] list = {27, 15, 15, 11, 27};
        System.out.println(mode(list));
    }
    
    public static int mode(int[] list){
        int mx = 0;
        for(int i = 0; i<list.length; i++){
            if(list[i]>mx){
                mx = list[i];
            }
        }
        
        int[] count = new int[mx+1];
        for(int i = 0; i<list.length; i++){
            int next = list[i];
            count[next]++;
        }
        
        int max = 0; 
        for(int i = 0; i<count.length; i++){
            if(count[i]>max){
                max = count[i];
            }
        }
        //System.out.println(Arrays.toString(count));
        System.out.println("number of occurences: "+max);
        System.out.print("number: ");
        return list[max];
    }
}

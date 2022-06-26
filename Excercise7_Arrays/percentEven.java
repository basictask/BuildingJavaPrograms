/*
Write a method called percentEven that accepts an array of integers as a parameter,
and returns the percentage of even numbers in the array as a real number. 
For example, if the array stores the elements {6, 2, 9, 11, 3}, then your method should return 40.0 . 
If the array contains no even elements or no elements at all, return 0.0 . 
*/
package Excercise7_Arrays;

/**
 *
 * @author dani
 */
import java.util.*;
public class percentEven {
    public static void main(String[] args){
        int[] list = {6, 2, 9, 11, 3};
        sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println("even numbers: "+percentEven(list)+"%");
    }
    
    public static double percentEven(int[] list){
        int len = list.length;
        double even = 0.0;
        double odd = 0.0;
        if (len == 0){
            return 0.0;
        }else{
            for(int i = 0; i<len; i++){
                if(list[i]%2 == 0){
                    even++;
                }
            }    
        }
        double percent = even*100/len;
        return percent;
    }
            
    public static int[] sort(int[] list){
        for(int i = 0; i<list.length-1; i++){
            int index = i;
            for (int j = i+1; j<list.length; j++){
                if(list[j]<list[index]){
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

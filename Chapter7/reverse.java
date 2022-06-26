/*
This program reverses the contents of an array. The array is built initially.
 */
package Chapter7;

/**
 *
 * @author dani
 */
import  java.util.*;
public class reverse {
    public static void main(String[] args){
        int[] list = new int[10];
        for(int i = 0; i < list.length; i++){
            list[i] = i*2+1;
        }
        
        reverse(list);
        
        System.out.println(Arrays.toString(list));
    }
    
    public static void swap(int[] list, int i, int j){
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
    }
    
    public static void reverse(int[] list){
        for(int i = 0; i<list.length/2; i++){
            int j = list.length-i-1;
            swap(list, i, j);
        }
    }
}

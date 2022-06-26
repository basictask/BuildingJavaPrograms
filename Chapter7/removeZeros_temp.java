/*
This program takes an array and moves all the zeros in the array into the end of the array.
This program uses a temporary array to solve the problem.
 */
package Chapter7;

import java.util.Arrays;

/**
 *
 * @author dani
 */
public class removeZeros_temp {
    public static void main(String[] args){
        int[] list = {7, 0, 12, 3, 5, 8, 0, 48, 0, 0, 12, 56, 0, 62};
        System.out.println("before: "+Arrays.toString(list));
        removeZeros(list);
        System.out.println("after: "+Arrays.toString(list));
    }
    
    public static int[] removeZeros(int[] list){
        int[] temp = new int[list.length];
        int count = 0;
        for(int i = 0; i<list.length; i++){
            if(list[i] != 0){
                temp[count] = list[i];
                count++;
            }
        }
        for(int i=0; i<list.length; i++){
            list[i] = temp[i];
        }
        return list;
    }    
}

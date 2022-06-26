/*
This program takes the last element of an array and pushes it to the first location of the array.
 */
package Chapter7;

/**
 *
 * @author dani
 */
import java.util.*;
public class rotateRight {
    public static void main(String[] args){
        int[] list = {4, 7, 3, 1, 9, 5};
        System.out.println("before: "+Arrays.toString(list));
        rotateRight(list);
        System.out.println("before: "+Arrays.toString(list));
    }
    
    public static int[] rotateRight(int[] list){
        int last = list[list.length-1];
        for(int i=list.length-1; i>0; i--){
            list[i] = list[i-1];
        }
        list[0] = last;
        return list;
    }
}

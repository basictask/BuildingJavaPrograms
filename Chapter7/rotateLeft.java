/*, 
This program takes the first element of an array and pushes it to the last lovation of the array.
 */
package Chapter7;

/**
 *
 * @author dani
 */
import java.util.*;
public class rotateLeft {
    public static void main(String[] args){
        int[] list = {5, 7, 9, 12, 4};
        System.out.println("before: "+Arrays.toString(list));
        rotateLeft(list);
        System.out.println("after: "+Arrays.toString(list));
    }
    
    public static int[] rotateLeft(int[] list){
        int first = list[0];
        for(int i = 0; i<list.length-1; i++){
            list[i] = list[i+1];            
        }
        list[list.length-1] = first;
        return list;
    }
}

/*
This program takes an array and moves all the zeros in the array into the end of the array.
 */
package Chapter7;

/**
 *
 * @author dani
 */
import java.util.Arrays;
public class removeZeros {
    public static void main(String[] args){
       int[] list = {8, 12, 0, 4, 65, 0, 9, 0, 0, 78, 5, 0};
       System.out.println("before: "+Arrays.toString(list));
       removeZeros(list);
       System.out.println("after: "+Arrays.toString(list));
    }
    
    public static int[] removeZeros(int[] list){
        int count = 0;
        for(int i = 0; i<list.length; i++){
            if(list[i] != 0){
                list[count] = list[i];
                count++;
            }
        }
        for(int i = count; i<list.length; i++){
            list[i] = 0;
        }
    return list;
    }
}

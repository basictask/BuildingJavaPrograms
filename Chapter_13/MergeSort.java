/*
this program implements the merge sort algorythm
 */
package Chapter_13;

/**
 *
 * @author dani
 */
import java.util.*;
public class MergeSort {
    public static void main(String[] args){
        int[] list = {14, 32, 67, 76, 23, 41, 58, 85};
        System.out.println("unsorted: "+Arrays.toString(list));
        System.out.println();
        mergeSort(list);
        System.out.println("sorted: "+Arrays.toString(list));
    }
    
    public static void mergeSort(int[] list){
        if(list.length>1){
            int[] left = Arrays.copyOfRange(list, 0, list.length/2);
            int[] right = Arrays.copyOfRange(list, list.length/2, list.length);
            
            mergeSort(left);
            mergeSort(right);
            
            merge(list, left, right);
        }
    }
    
    public static void merge(int[] result, int[] left, int[] right){
        int i1=0;
        int i2=0;
        for(int i=0; i<result.length; i++){
            if(i2>right.length || (i1<left.length && left[i1] <= right[i2])){
                result[i] = left[i1];
                i1++;
            }else{
                result[i] = right[i2];
                i2++;
            }
        }
    }
}

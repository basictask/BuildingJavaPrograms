/*

 */
package Excercise_13_Search_Sort;

/**
 *
 * @author dani
 */
import java.util.*;
public class SelectionSort_dual {
    public static void main(String[] args){
        Random r = new Random();
        int[] list = new int[20];
        
        for(int i=0; i<list.length; i++){
            int n = r.nextInt(100)+1;
            list[i] = n;
        }
        System.out.println("shuffled list: "+Arrays.toString(list));
        selectionSort(list);
        
        System.out.println("sorted list: "+Arrays.toString(list));
    }
    
    public static void selectionSort(int[] list){
        int len = list.length-1;
        for(int i=0; i<len; i++){
            int smallest = i;
            int largest = len;
            for(int j=i+1; j<len; j++){
                if(list[j]<list[smallest]){
                    smallest = j;
                }else if(list[j]>list[largest]){
                    largest = j;
                }
            }
            int smaller = list[smallest];
            list[smallest] = list[i];
            list[i] = smaller;
            int larger = list[largest];
            list[largest] = list[len];
            list[len] = larger;
        }
    }
}

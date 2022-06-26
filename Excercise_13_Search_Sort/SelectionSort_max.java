/*

 */
package Excercise_13_Search_Sort;

/**
 *
 * @author dani
 */
import java.util.*;
public class SelectionSort_max {
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
        for(int i=list.length-1; i>=0; i--){
            int largest = i;
            for(int j=i-1; j>=0; j--){
                if(list[j]>list[largest]){
                    largest = j;
                }
            }
            int larger = list[largest];
            list[largest] = list[i];
            list[i] = larger;
        }
    }
}

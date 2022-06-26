/*

 */
package Chapter_13;

/**
 *
 * @author dani
 */
import java.util.*;
public class SelectionSort {
    public static void main(String[] args){
        Random r = new Random();
        int[] list = new int[20];
        for(int i=0; i<list.length-1; i++){
            int n = r.nextInt(100)+1;
            list[i] = n;
        }
        System.out.println("shuffled list: "+Arrays.toString(list));
        selectionSort(list);
        System.out.println();
        System.out.println("sorted list: "+Arrays.toString(list));
    }
    
    public static void selectionSort(int[] list){
        for(int i=0; i<list.length-1; i++){
            int smallest = i;
            for(int j=i+1; j<list.length; j++){
                if(list[j]<list[smallest]){
                    smallest=j;
                }
            }
            int smaller = list[smallest];
            list[smallest] = list[i];
            list[i] = smaller;
        }
    }        
}

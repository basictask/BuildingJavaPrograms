/*
Implement an algorithm to shuffle an array of numbers or objects. 
The algorithm for shuffling should be the following:

for (each index i) {
    choose a random index j where i<=j .
    swap the elements at indexes i and j.
}


Implement a “bogus” sorting algorithm called bogo sort that uses your shuffling 
algorithm from the previous exe cise to sort an array of numbers. 
The bogo sort algorithm is the following:

while (array is not sorted) {
    shuffle array.
}

*/
package Excercise_13_Search_Sort;

import java.util.Arrays;

/**
 *
 * @author dani
 */
import java.util.*;
public class Shuffle {
    public static void main(String[] args){
        int[] list = new int[10];
        for(int i=0; i<list.length; i++){
            list[i]=i;
        }
        System.out.println("list: "+Arrays.toString(list));
        System.out.println();
        list = shuffle(list);
        System.out.println("shuffle: "+Arrays.toString(list));
        System.out.println();
        bogoSort(list);
        System.out.println("bogo sort: "+Arrays.toString(list));
    }
    
    public static int[] shuffle(int[] list){
        Random r = new Random();
        int len = list.length;
        for(int i=0; i<len; i++){
            int n = r.nextInt(len-i)+i;
            int a = list[i];
            int b = list[n];
            list[i] = b;
            list[n] = a;
        }
        return list;
    }
    
    public static void bogoSort(int[] list){
        int count = 0; 
        while(!isSorted(list)){
            list = shuffle(list);
            System.out.println(Arrays.toString(list));
            count++;
        }
        System.out.println("number of iterations: "+count);
    }
    
    public static boolean isSorted(int[] list){
        for(int i=1; i<list.length; i++){
            if(list[i] < list[i-1]){
                return false;
            }
        }
        return true;
    }
}

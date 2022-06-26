/*
Write a method called priceIsRight that mimics the guessing rules from the game show The Price is Right. 
The method accepts as parameters an array of integers representing the contestants’ bids and an integer representing a correct price. 
The method returns the element in the bids array that is closest in value to the correct price without
being larger than that price. 
For example, if an array called bids stores the values {200, 300, 250, 1, 950, 40}, 
the call of priceIsRight(bids, 280) should return 250, since 250 is the bid closest to 280 without going over 280.
If all bids are larger than the correct price, your method should return -1.
 */
package Excercise7_Arrays;

/**
 *
 * @author dani
 */
import java.util.*;
public class priceIsRight {
    public static void main(String[] args){
        int[] list = {200, 300, 250, 5, 950, 40};
        int bid = 280;
        sort(list);
        //System.out.println(Arrays.toString(list));
        System.out.println(priceIsRight(list, bid));
    }
    
    public static int priceIsRight(int[] list, int bid){
        if(bid<list[0]){
            return -1;
        }else{
            int count = 0;
            while(list[count]<bid){
                if(list[count]<bid){
                    count++;
                }
            }
        return list[count-1];
        }
    }
    
    public static int[] sort(int[] list){
        for(int i = 0; i<list.length-1; i++){
            int index = i;
            for(int j = i+1; j<list.length; j++){
                if(list[j] < list[index]){
                    index = j;
                }
            }
            int smaller = list[index];
            list[index] = list[i];
            list[i] = smaller;
        }
        return list;
    }
}

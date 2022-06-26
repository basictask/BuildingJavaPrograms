/*
Write a method maxOccurrences that accepts a list of integers as a parameter and returns the number of times
the most frequently occurring integer (the “mode”) occurs in the list.
If the list is empty, return 0 .
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.util.*;
public class MaxOccurences {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Random r = new Random();
        
        for(int i = 0; i<10; i++){
            int n = r.nextInt(15);
            list.add(n);
        }
        
        System.out.println("list: "+list);
        
        System.out.println("number of most occurences: "+maxOccurences(list));
    }
    
    public static int maxOccurences(ArrayList<Integer> list){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        if(list.isEmpty()){
            return 0;
        }
        
        for(int n : list){
            if(map.containsKey(n)){
                int occ = map.get(n);
                map.put(n, occ+1);
            }else{
                map.put(n, 1);
            }
        }
        
        int max = 0;
        
        for(int n : map.values()){
            if(n > max){
                max = n;
            }
        }
        
        return max;
    }
}

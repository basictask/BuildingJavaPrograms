/*
Write a method called rarest that accepts a map whose keys are strings and whose values are integers 
as a parameter and returns the integer value that occurs the fewest times in the map. 
If there is a tie, return the smaller integer value.
If the map is empty, throw an exception.
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.util.*;
public class Rarest {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        map.put("a", 32);
        map.put("b", 11);
        map.put("c", 27);
        map.put("d", 43);
        map.put("e", 27);
        map.put("f", 14);
        map.put("g", 14);
        map.put("h", 32);
        map.put("h", 11);
        map.put("i", 27);
        
        System.out.println("map: "+map.toString());
        
        System.out.println("rarest element: "+rarest(map));
    }
    
    public static int rarest(HashMap<String, Integer> map){
        TreeMap<Integer, Integer> occur = new TreeMap<Integer, Integer>();
        
        if(map.isEmpty()){
            throw new IllegalArgumentException();
        }
        
        for(String s : map.keySet()){
            int n = map.get(s);
            if(!occur.containsKey(n)){
                occur.put(n, 1);
            }else{
                int a = occur.get(n)+1;
                occur.put(n, a);
            }
        }
        
        //System.out.println("occur: "+occur.toString());
        int smlst = 100;
        int minocc = 100;
        
        TreeMap<Integer, Integer> map2 = occur; 
        
        for(int n : occur.keySet()){
            int occurence = occur.get(n);
            if(occurence < minocc){
                minocc = occurence;
            }
        }
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for(int n : occur.keySet()){
            int occurence = occur.get(n);
            if(occurence == minocc){
                arr.add(n);
            }
        }
        int min = arr.get(0);
        
        for(int n : arr){
            if(n <= min){
                smlst = n;
            }
        }
        
        return smlst;
    }
}

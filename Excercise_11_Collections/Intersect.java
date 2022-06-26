/*
Write a method intersect that accepts two maps whose keys are strings and whose values are integers as parameters
and returns a new map containing only the key/value pairs that exist in both of the parameter maps. 

In order for a key/value pair to be included in your result, not only do both maps need to contain a mapping for that key, 
but they need to map it to the same value. 

For example, 
if the two maps passed are {Janet=87, Logan=62, Whitaker=46, Alyssa=100, Stefanie=80, Jeff=88, Kim=52, Sylvia=95} 

and {Logan=62, Kim=52, Whitaker=52, Jeff=88, Stefanie=80, Brian=60, Lisa=83, Sylvia=87} , 

your method would return the following new map 
(the order of the key/value pairs does not matter): {Logan=62, Stefanie=80, Jeff=88, Kim=52}
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.util.*;
public class Intersect {
    public static void main(String[] args){
        HashMap<String, Integer> map1= new HashMap<String, Integer>();
        HashMap<String, Integer> map2= new HashMap<String, Integer>();
        
        map1.put("Janet", 87);
        map1.put("Logan", 62);
        map1.put("Whitaker", 46);
        map1.put("Alyssa", 100);
        map1.put("Stefanie", 80);
        map1.put("Jeff", 88);
        map1.put("Kim", 52);
        map1.put("Sylvia", 95);
        
        map2.put("Logan", 62);
        map2.put("Kim", 52);
        map2.put("Whitaker", 52);
        map2.put("Jeff", 88);
        map2.put("Stefanie" , 80);
        map2.put("Brian", 60);
        map2.put("Lisa", 83);
        map2.put("Sylvia", 87);
        
        HashMap<String, Integer> result = intersect(map1, map2);
        
        System.out.println(result.toString());
    }
    
    public static HashMap<String, Integer> intersect(HashMap<String, Integer> map1, HashMap<String, Integer> map2){
        HashMap<String, Integer> result = new HashMap<String, Integer>();
        
        Set<String> set = map1.keySet();
        
        for(String s : set){
            int n1 = map1.get(s);
            
            if(map2.containsKey(s) && map2.get(s) == n1){
                result.put(s, n1);
            }
        }
        return result;
    }
}

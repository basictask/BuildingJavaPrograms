/*
Write a method called reverse that accepts a map from strings to strings as a parameter 
and returns a new map that is the reverse of the original. 
The reverse of a map is a new map that uses the values from the original as its keys 
and the keys from the original as its values. 

Since a map’s values need not be unique but its keys must be, you should have each value map to a set of keys. 
In other words, if the original map maps keys of type K to values of type V, 
the new map should map keys of type V to values that are Set s containing elements of type K. 

For example, the map {42=Marty, 81=Sue, 17=Ed, 31=Dave, 56=Ed, 3=Marty, 29=Ed} 
has a reverse of {Marty=[42, 3], Sue=[81], Ed=[17, 56, 29], Dave=[31]} . 
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.util.*;
public class Reverse {
    public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        
        map.put(42, "Marty");
        map.put(81, "Sue");
        map.put(17, "Ed");
        map.put(31, "Dave");
        map.put(56, "Ed");
        map.put(31, "Dave");
        map.put(56, "Ed");
        map.put(3, "Marty");
        map.put(29, "Ed");
        
        System.out.println("original map: "+map.toString());
        
        HashMap<String, HashSet<Integer>> result = reverse(map);
        
        System.out.println("reversed: "+result.toString());
    }
    
    public static HashMap<String, HashSet<Integer>> reverse(HashMap<Integer, String> map){
        HashMap<String, HashSet<Integer>> result = new HashMap<String, HashSet<Integer>>();
        
        for(int n : map.keySet()){
            String s = map.get(n);
            
            if(!result.containsKey(s)){
                
                HashSet<Integer> set = new HashSet<Integer>();
                set.add(n);
                result.put(s, set);
            
            }else{
                
                HashSet<Integer> set = result.get(s);
                set.add(n);
                result.put(s, set);
            }
        }
        return result;
    }
}

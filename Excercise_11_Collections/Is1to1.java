/*
Write a method called is1to1 that accepts a map whose keys and values are strings as its parameter,
and returns true if no two keys map to the same value. 

For example, {Marty=206–9024, Hawking=123–4567, Smith=949–0504, Newton=123–4567} should return false,
but {Marty=206–9024, Hawking=555–1234, Smith=949–0504, Newton=123–4567} should return true. 
The empty map is considered 1-to-1 and returns true .
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.util.*;
public class Is1to1 {
    public static void main(String[] args){
        HashMap<String, String> map1 = new HashMap<String, String>();
        HashMap<String, String> map2 = new HashMap<String, String>();
        
        map1.put("Marty", "206-9024");
        map1.put("Hawking", "123-4567");
        map1.put("Smith", "949-0504");
        map1.put("Newton", "123-4567");
        
        map2.put("Marty", "206-9024");
        map2.put("Hawking", "555-1234");
        map2.put("Smith", "949-0504");
        map2.put("Newton", "123-4567");
        
        System.out.println("map1: "+map1.toString());
        System.out.println("map2: "+map2.toString());
        
        System.out.println();
        
        System.out.println("map1 unique? "+is1to1(map1));
        System.out.println("map2 unique? "+is1to1(map2));
    }
    
    public static boolean is1to1(HashMap<String, String> map){
        Set<String> kset = map.keySet();
        HashSet<String> vset = new HashSet<String>();
        
        for(String s : map.values()){
            vset.add(s);
        }
        
        return kset.size() == vset.size();
    }
}

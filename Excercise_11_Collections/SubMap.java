/*
Write a method called subMap that accepts two maps from strings to strings as its parameters,
and returns true if every key in the first map is also contained in the second map,
and maps to the same value in the second map. 

For example, {Smith=949–0504, Marty=206–9024} is a submap of 
{Marty=206–9024, Hawking=123–4567, Smith=949–0504, Newton=123–4567} . 
The empty map is a submap of every map.
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.util.*;
public class SubMap {
    public static void main(String[] args){
        HashMap<String, String> map1 = new HashMap<String, String>();
        HashMap<String, String> map2 = new HashMap<String, String>();
        
        map1.put("Smith", "949-0504");
        map1.put("Marty", "206-9024");
        
        map2.put("Marty", "206-9024");
        map2.put("Hawking", "123-4567");
        map2.put("Smith", "949-0504");
        map2.put("Newton", "123-4567");
        
        System.out.println("map 1: "+map1.toString());
        System.out.println("map 2: "+map2.toString());
        
        System.out.println();
        
        System.out.println("submaps? "+submap(map1, map2));
    }
    
    public static boolean submap(HashMap<String, String> map1, HashMap<String, String>map2){
        int shrtr; 
        
        if(map1.size() < map2.size()){
            shrtr = map1.size();
        }else{
            shrtr = map2.size();
        }
        
        int count = 0;
        
        for(String s : map1.keySet()){
            if(!map2.keySet().contains(s)){
                return false;
            }else{
                String v2 = map2.get(s);
                String v1 = map1.get(s);
                if(v1.equals(v2)){
                    count++;
                    if(count == shrtr){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}   

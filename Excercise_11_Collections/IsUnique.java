/*
Write a method isUnique that accepts a map whose keys and values are strings as a parameter 
and returns true if no two keys map to the same value (and false if any two or more keys do map to the same value). 

For example, if the map contains the following key/value pairs, your method would return true : 
{Marty=Stepp, Stuart=Reges, Jessica=Miller, Amanda=Camp, Hal=Perkins} . 

But calling it on the following map would return false, because of two mappings for Perkins and Reges : 
{Kendrick=Perkins, Stuart=Reges, Jessica=Miller, Bruce=Reges, Hal=Perkins}
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.util.*;
public class IsUnique {
    public static void main(String[] args){
        HashMap<String, String> map1 = new HashMap<String, String>();
        HashMap<String, String> map2 = new HashMap<String, String>();
        
        map1.put("Marty", "Stepp");
        map1.put("Stuart", "Reges");
        map1.put("Jessica", "Miller");
        map1.put("Amanda", "Camp");
        map1.put("Hal", "Perkins");
        
        map2.put("Kendrick", "Perkins");
        map2.put("Stuart", "Reges");
        map2.put("Jessica", "Miller");
        map2.put("Bruce", "Reges");
        map2.put("Hal", "Perkins");
        
        System.out.println("map1 is unique: "+isUnique(map1));
        System.out.println("map2 is unique: "+isUnique(map2));    
    }
    
    public static boolean isUnique(HashMap<String, String> map){
        HashSet<String> set = new HashSet<String>();
            
        for(String s : map.values()){
            String low = s.toLowerCase();
            set.add(low);
        }
            
        if(set.size() < map.size()){
            return false;
        }else{
            return true;
        }
    }
}

/*
This program demonstrates the behaviour of maps
 */
package Chapter_11;

/**
 *
 * @author dani
 */
import java.util.*;
public class Map_2 {
    public static void main(String[] args){
        Map<Integer, String> ssnMap = new HashMap<Integer, String>();
        ssnMap.put(867530912, "Jenny");
        ssnMap.put(239876305, "Stuart Reges");
        ssnMap.put(504386382, "Marty Stepp");
        
        Set<Integer> ssnSet = ssnMap.keySet();
        for(int ssn : ssnSet){
            System.out.println("SSN: "+ssn);
        }
        
        System.out.println();
        
        Collection<String> names = ssnMap.values();
        for(String name : names){
            System.out.println("names: "+name);
        }
        
        System.out.println();
        
        for(int ssn : ssnMap.keySet()){
            String name = ssnMap.get(ssn);
            System.out.println(name + "'s ssn is: " + ssn);
        }
    }
}

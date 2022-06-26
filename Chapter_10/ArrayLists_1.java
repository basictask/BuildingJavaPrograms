/*
this is a basic program to demonstrate basic operations with ArrayLists 
 */
package Chapter_10;

/**
 *
 * @author dani
 */
import java.util.*;
public class ArrayLists_1 {
    public static void main(String[] args){        
        ArrayList<String> list = new ArrayList<String>();
        
        System.out.println("add");
        
        list.add("Tool");
        list.add("Phish");
        list.add("Pink Floyd");
        list.add(1, "U2");
        System.out.println("List: " + list);
        
        System.out.println("remove");
        
        list.remove(0);
        list.remove(1);
        System.out.println("List: " + list);
        
        System.out.println("loop");
        
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            sum += s.length();
        }
        System.out.println("Total of lengths: "+sum);
        
        System.out.println("set");
        
        list.set(0, "The Violent Femmes");
        
        System.out.println("List: " + list);
        
        list.clear();
        
        System.out.println("clear");
        
        System.out.println("List: " + list);
    }   
}

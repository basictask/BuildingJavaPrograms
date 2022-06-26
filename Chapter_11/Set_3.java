/*
this program demonstrates set operations
 */
package Chapter_11;

/**
 *
 * @author dani
 */
import java.util.*;
public class Set_3 {
    public static void main(String[] args){
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");
        set1.add("e");
        set1.add("f");
        
        set2.add("c");
        set2.add("d");
        set2.add("e");
        set2.add("f");
        set2.add("g");
        set2.add("h");
        
        System.out.println("total number of contained elements: "+totalElements(set1, set2));
        System.out.println();
        
        commonElements(set1, set2);
    }
    
    public static int totalElements(Set<String> set1, Set<String> set2){
        Set<String> union = new HashSet<String>(set1);
        union.addAll(set2);
        return union.size();
    }
    
    public static void commonElements(Set<String> set1, Set<String> set2){
        Set<String> intersection = new HashSet<String>(set1);
        intersection.retainAll(set2);
        System.out.println("common elements: "+intersection);
    }
}

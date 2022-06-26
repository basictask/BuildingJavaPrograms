/*
This program demonstrates the use of sets
 */
package Chapter_11;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class Set_2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("hamlet.txt"));
        List<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i<15; i++){
            numbers.add(i);
        }
        
        System.out.println("dublicates: "+hasDuplicates(numbers));
    }
    
    public static boolean hasDuplicates(List<Integer> list){
        Set<Integer> set = new HashSet<Integer>(list);
        return set.size() < list.size();
    }
}

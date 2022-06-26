/*
This program demonstrates the work of iterators
 */
package Chapter_11;

/**
 *
 * @author dani
 */
import java.util.*;
import java.io.*;
public class Iterator_1 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("hamlet.txt")); 
        LinkedList<String> list = new LinkedList<String>();
        
        while(input.hasNext()){
            String next = input.next();
            list.add(next);
        }
        
        System.out.println("before: "+list);
        
        remove(list);
        
        System.out.println("after: "+list);
        
        print(list);
        
        System.out.println("longest: "+longest(list));
        
    }
    
    public static void remove(LinkedList<String> list){
        Iterator<String> itr = list.iterator();
        
        while(itr.hasNext()){
            String element = itr.next();
            if(element.length()%2 == 0){
                itr.remove();
            }
        }
    }
    
    public static String longest(LinkedList<String> list){
        Iterator<String> itr = list.iterator();
        String longest = list.get(0);
        while(itr.hasNext()){
            String current = itr.next();
            if(current.length() > longest.length()){
                longest = current;
            }
        }
        return longest;
    }
    
    public static void print(LinkedList<String> list){
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            String word = itr.next();
            System.out.println(word);
        }
    }
}

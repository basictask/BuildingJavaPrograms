/*
this program demonstrates how to add to and remove from an arraylist
 */
package Chapter_10;

/**
 *
 * @author dani
 */
import java.util.*;
public class AddRemove {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("four");
        list.add("score");
        list.add("and");
        list.add("seven");
        list.add("years");
        list.add("ago");
        
        System.out.println("add");
        tildeadd(list);
        System.out.println("list: "+list);
        
        System.out.println();
        
        System.out.println("remove");
        tilderemove(list);
        System.out.println("list: "+list);
        
        System.out.println();
        
        System.out.println("remove target");
        ArrayList<String> letters = new ArrayList<String>();
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("a");
        letters.add("b");
        letters.add("c");
        letters.add("a");
        letters.add("b");
        letters.add("c");
        removetrgt(letters, "a");
        System.out.println("letters: "+letters);
        
        System.out.println();
        
        int[] ints = {3, 4, 5, 8, 12, 15, 21};
        ArrayList<Integer> numbers = add(ints);
        System.out.println("list before split: "+numbers);
        split(numbers);
        System.out.println("list after split: "+numbers);
    }
    
    public static void tildeadd(ArrayList<String> list){
        for(int i = 0; i<list.size(); i+=2){
            list.add(i, "~");
        }
    }
    
    public static void tilderemove(ArrayList<String> list){
        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }
    }
    
    public static void removetrgt(ArrayList<String> list, String target){
        for (int i = list.size()-1; i >= 0; i--) {
            if(list.get(i).equals(target)){
                list.remove(i);
            }
        }
    }
    
    public static ArrayList<Integer> add(int[] data){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int n : data){
            list.add(n);
        }
        return list;
    }
    
    public static void split(ArrayList<Integer> list){
        for(int i = 0; i < list.size()-1; i+=2){
            int n = list.get(i);
            list.set(i, n/2 + n%2);
            list.add(i+1, n/2);        
        }
    }
}

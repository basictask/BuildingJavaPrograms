/*
Write a method called doubleList that takes an ArrayList of Strings as a parameter, 
and replaces every String with two of that same String. 
For example, if the list stores the values (“how”, “are”, “you?”) before the method is called, 
it should store the values (“how”, “how”, “are”, “are”, “you?”, “you?”) after the method finishes executing.
 */

/*
Write a method called stutter that accepts an ArrayList of strings as a parameter and that 
replaces every string with two of that string. 
For example, if the list stores the values [“how”, “are”, “you?”], 
after the call it should store [“how”, “how”, “are”, “are”, “you?”, “you?”].
*/
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */
import java.util.*;
public class DoubleList {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("how");
        list.add("are");
        list.add("you?");
        doubleList(list);
        System.out.println(list);
    }
    
    public static ArrayList<String> doubleList(ArrayList<String> list){
        for(int i = 0; i<list.size(); i+=2){
            list.add(i, list.get(i));
        }
        return list;
    }
}

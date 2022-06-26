/*
Write a method called markLength4 that accepts an ArrayList of strings as a parameter 
and that places a string of four asterisks "****" in front of every string of length 4. 

For example, suppose that a variable called list contains the values 
[“this”, “is”, “lots”, “of”, “fun”, “for”, “Java”, “coders”]. 
The call of markLength4(list); should change the list to store the values 
[“****”, “this”, “is”, “****”, “lots”, “of”, “fun”, “for”, “****”, “Java”, “coders”].
 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */import java.util.*;
public class MarkLength4 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("this");
        list.add("is");
        list.add("lots");
        list.add("of");
        list.add("fun");
        list.add("for");
        list.add("Java");
        list.add("coders");
        
        System.out.println("before: "+list);
        mark4(list);
        System.out.println("after: "+list);
    }
    
    public static ArrayList<String> mark4(ArrayList<String> list){
        for(int i=0; i<list.size(); i++){
            String next = list.get(i);
            if(next.length()==4){
                list.add(i, "****");
                i++;
            }
        }
        return list;
    }
}

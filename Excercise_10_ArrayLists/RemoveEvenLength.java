/*
Write a method called removeEvenLength that takes an ArrayList of Strings 
as a parameter and removes all of the Strings of even length from the list.
 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */
import java.util.*;
import java.io.*;
public class RemoveEvenLength{
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("sample.txt"));
        ArrayList<String> list = add(input);
        System.out.println("before: "+list);
        
        ArrayList<String> removed = removeEven(list);
        System.out.println("after: "+removed);
    }
    
    public static ArrayList<String> add(Scanner input){
        ArrayList<String> result = new ArrayList<String>();
        while(input.hasNext()){
            String next = input.next();
            result.add(next);
        }
        return result;
    }
    
    public static ArrayList<String> removeEven(ArrayList<String> list){
        ArrayList<String> result = new ArrayList<String>();
        int len = list.size();
        for(int i = 0; i<len; i++){
            String next = list.get(i);
            if(next.length() % 2 == 0 ){
                result.add(next);
            }
        }
        return result;
    }
}

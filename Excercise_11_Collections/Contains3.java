/*
Write a method contains3 that accepts a list of strings as a parameter and returns true
if any single string occurs at least 3 times in the list, and false otherwise. 
 */
package Excercise_11_Collections;

/**
 *
 * @author dani
 */
import java.util.*;
import java.io.*;
public class Contains3 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("hamlet.txt"));
        ArrayList<String> list = new ArrayList<String>();
        
        while(input.hasNext()){
            String next = input.next().toLowerCase();
            list.add(next);
        }
        
        System.out.println("3 occurences: "+occurs3(list));
    }
    
    public static boolean occurs3(ArrayList<String> list){
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        for(String s : list){
            if(map.containsKey(s)){
                int n = map.get(s);
                map.put(s, n+1);
            }else{
                map.put(s, 1);
            }
        }
        
        System.out.println(map.toString());
        
        for(int n : map.values()){
            if(n>=3){
                return true;
            }
        }
        return false;
    }
}

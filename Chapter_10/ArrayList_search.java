/*
this program demonstrates searching methods inside an ArrayList
 */
package Chapter_10;

/**
 *
 * @author dani
 */
import java.util.*;
import java.io.*;
public class ArrayList_search {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("names_2.txt"));
        ArrayList<String> list = new ArrayList<String>();
        while(input.hasNext()){
            String s = input.next();
            if(!list.contains(s)){
                list.add(s);
            }
        }
        System.out.println("List: "+list);
        
        replace(list, "Maria", "Dani");
        
        System.out.println("List: "+list);
    }
    
    public static void replace(ArrayList<String> list, String target, String replacement){
        int index = list.indexOf(target);
        if(index >= 0){
            list.set(index, replacement);
        }
    }
}

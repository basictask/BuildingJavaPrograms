/*
Write a method called swapPairs that switches the order of values in an ArrayList of String s in a pairwise fashion. 
Your method should switch the order of the first two values, then switch the order of the next two, 
then the next two, and so on. 
If the number of values in the list is odd, the method should not move the final element. 

For example, if the list initially stores (“to”, “be”, “or”, “not”, “to”, “be”, “hamlet”), your method should change the
list’s contents to (“be”, “to”, “not”, “or”, “be”, “to”, “hamlet”).
 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */
import java.util.*;
public class SwapPairs {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<String>();
        list.add("to");
        list.add("be");
        list.add("or");
        list.add("not");
        list.add("to");
        list.add("be");
        list.add("hamlet");
        
        System.out.println(list);
        System.out.println("swap");
        ArrayList<String> swapped = swapPairs(list);
        System.out.println(swapped);
    }
    
    public static ArrayList<String> swapPairs(ArrayList<String> list){
        ArrayList<String> result = new ArrayList<String>();
        int len = list.size();
        if(len%2 == 0){
            for(int i = 0; i<len; i+=2){
                result.add(list.get(i+1));
                result.add(list.get(i));
            }
        }else{
            for(int i = 0; i<len-2; i+=2){
                result.add(list.get(i+1));
                result.add(list.get(i));
            }
            result.add(list.get(len-1));
        }
        return result;
    }
}

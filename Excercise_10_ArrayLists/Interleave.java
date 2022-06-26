/*
Write a method called interleave that accepts two ArrayList s of integers a1 and a2 as parameters,
and inserts  the elements of a2 into a1 at alternating indexes. 
If the lists are of unequal length, the remaining elements of the longer list are left at the end of a1. 


For example, if a1 stores [10, 20, 30] and a2 stores [4, 5, 6, 7, 8], 
the call of interleave(a1, a2); should change a1 to store [10, 4, 20, 5, 30, 6, 7, 8]. 

If a1 had stored [10, 20, 30, 40, 50] and a2 had stored [6, 7, 8], 
the call of interleave(a1, a2); would change a1 to store [10, 6, 20, 7, 30, 8, 40, 50].
 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */
import java.util.*;
public class Interleave {
    public static void main(String[] args){
        ArrayList<Integer> a1 = new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        ArrayList<Integer> a3 = new ArrayList<Integer>();
        ArrayList<Integer> a4 = new ArrayList<Integer>();
        
        a1.add(10);
        a1.add(20);
        a1.add(30);
        
        a2.add(4);
        a2.add(5);
        a2.add(6);
        a2.add(7);
        a2.add(8);
        
        a3.add(10);
        a3.add(20);
        a3.add(30);
        a3.add(40);
        a3.add(50);
        
        a4.add(6);
        a4.add(7);
        a4.add(8);
        
        System.out.println("a1: "+a1);
        System.out.println("a2: "+a2);
        System.out.println("a3: "+a3);
        System.out.println("a4: "+a4);
        
        System.out.println();
        
        ArrayList<Integer> inter1 = interleave(a1, a2);
        System.out.println("interleave(a1, a2): "+inter1);
        
        ArrayList<Integer> inter2 = interleave(a3, a4);
        System.out.println("interleave(a3, a4): "+inter2);
    }
    
    public static ArrayList<Integer> interleave(ArrayList<Integer> a1, ArrayList<Integer> a2){
        ArrayList<Integer> result = new ArrayList<Integer>();
        int len1 = a1.size();
        int len2 = a2.size();
        int longer;
        ArrayList<Integer> seq;
        
        
        if(len1 > len2){
            longer = len1;
            seq = a1;
        }else{
            longer = len2;
            seq = a2;
        }
        
        int i = 0;
        int j = 0;
        while(i < longer){
            result.add(i, a1.get(j));
            result.add(i+1, a2.get(j));
            i+=2;
            j+=1;
        }
        
        for(int k = j; k < seq.size(); k++){
            result.add(seq.get(k));
        }
        return result;
    }
}

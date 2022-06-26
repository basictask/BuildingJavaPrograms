/*
Write a method called rangeBetweenZeroes that takes as a parameter an ArrayList of integers 
and returns the number of indexes apart the two furthest occurrences of the number 0 are. 
For example, if the list stores the values (7, 2, 0, 0, 4, 0, 9, 0, 6, 4, 8) when the method is called, 
it should return 6 , because the occurrences of 0 that are furthest apart are at indexes 2 and 7, 
and the range 2 through 7 has six elements. 
If only one 0 occurs in the list, your method should return 1 . 
If no 0 s occur, your method should return 0 .
 */
package Excercise_10_ArrayLists;

/**
 *
 * @author dani
 */
import java.util.*;
public class RangeBetweenZeroes {
    public static void main(String[] args){
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        Random r = new Random();
        
        for(int i=0; i<15; i++){  //first case: any number of zeroes
            int n = r.nextInt(3);
            list1.add(n);
        }
        for(int i=0; i<15; i++){  //second case: no zeroes
            int n = r.nextInt(2)+1;
            list2.add(n);
        }
        for(int i=0; i<14; i++){ //third case: one zero
            int n = r.nextInt(2)+1;
            list3.add(n);
        }
        int m = r.nextInt(15);
        list3.add(m, 0);
        
        System.out.println("list1: "+list1+" range: "+range(list1));
        System.out.println("list2: "+list2+" range: "+range(list2));
        System.out.println("list3: "+list3+" range: "+range(list3));
    }
    
    public static int range(ArrayList<Integer> list){
        int minz = 0;
        int maxz = list.size()-1;
        
        while(list.get(minz) != 0){
            minz++;
            if(minz == maxz && minz != 0){
                return 0;
            }
        }
        
        while(list.get(maxz) != 0){
            maxz--;
        }
        
        if(minz == maxz){
            return 1;
        }else{
            return maxz-minz+1;
        }
    }
}

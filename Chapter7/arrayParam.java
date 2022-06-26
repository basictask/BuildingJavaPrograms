/*
this is a sample program which uses arrays as parameters and return values
 */
package Chapter7;

/**
 *
 * @author dani
 */
import java.util.*;
public class arrayParam {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("input list length: ");
        int len = console.nextInt();
        
        int[] list = buildOddArray(len);
        
        incrementAll(list);
        
        print(list);
        
        System.out.println("count of number 8: " + count(list, 8));
        
        replace(list, 10, 150);
        
        print(list);
    }
    
    public static int[] buildOddArray(int n){
        int[] list = new int[n];
        for(int i=0; i<list.length; i++){
            list[i] = i*2+1;
        }
    return list;
    }
    
    public static int[] incrementAll(int[] data){
        for(int i = 0; i<data.length; i++){
            data[i]++;
        }
    return data;
    }
    
    public static void print(int[] list){
        if(list.length == 0){
            System.out.println("empty list");
        }else{
            System.out.print("[" + list[0]);
            for(int i=1; i<list.length; i++){
                System.out.print(", " + list[i]);
            }
            System.out.println("]");
        }
    }
    
    public static int count(int[] list, int target){
        int count = 0;
        for(int n : list){
            if(n == target){
                count++;
            }
        }
    return count;
    }
    
    public static void replace(int[] list, int target, int replace){
        for(int i = 0; i < list.length; i++){
            if(list[i] == target){
                list[i] = replace;
            }
        }
    }
}
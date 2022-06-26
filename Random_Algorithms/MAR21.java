/*

 */
package test;
import java.util.*;
/**
 *
 * @author Daniel Kuknyo
 */
public class MAR21 {
    public static void main(String[] args){
        Random r = new Random();
        
        int[] tomb1 = new int[5];
        String[] tomb2 = {"alma", "korte", "meggy"};
        System.out.println(Arrays.toString(tomb1));
        System.out.println(Arrays.toString(tomb2));
        tomb1[3] = 5 ;
        System.out.println(Arrays.toString(tomb1));
        System.out.println("-----------");
        
        for (int i = 0; i < tomb1.length; i++) {
            tomb1[i] = r.nextInt(10);
            System.out.println(tomb1[i]);
        }
    }
}

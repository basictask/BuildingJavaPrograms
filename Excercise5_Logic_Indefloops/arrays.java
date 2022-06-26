/*

 */
package Excercise5_Logic_Indefloops;
import java.io.*;
import java.util.*;
/**
 *
 * @author Daniel Kuknyo
 */
public class arrays {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("kovetkezo elem: ");
            arr[i] = console.nextInt();
            System.out.println();
        }
    }
}

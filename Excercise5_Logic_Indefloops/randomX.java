/*
Write a method called randomX that prints a lines that contain a random number of “x” characters (between 5 and 20
inclusive) until it prints a line that contains 16 or more characters. For example, the output might look like the following:

xxxxxxx
xxxxxxxxxxxxxxx
xxxxxxxxxxxx
xxxxxxxxxxxxxx
xxxxxx
xxxxxxxxxxx
xxxxxxxxxxxxxxxxx
 */
package Excercise5_Logic_Indefloops;

/**
 *
 * @author dani
 */
import java.util.*;
public class randomX {
    public static void main(String[] args){
        randomx();
    }
   
    public static void randomx(){
        Random r = new Random();
        int n = 0;
        while(n<16){
            n = 5+r.nextInt(16);
            for(int i=0; i<n; i++){
                System.out.print("x");
            }
            System.out.println();              //to see number of x's put n in prentheses.
            
        }
    }
}

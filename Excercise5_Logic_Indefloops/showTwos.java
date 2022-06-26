/*
Write a method called showTwos that shows the factors of 2 in a given integer. For example, consider the following
calls:
showTwos(7);
showTwos(18);
showTwos(68);
showTwos(120);
These calls should produce the following output:
7 = 7
18 = 2 * 9
68 = 2 * 2 * 17
120 = 2 * 2 * 2 * 15
 */
package Excercise5_Logic_Indefloops;

/**
 *
 * @author dani
 */
import java.util.*;
public class showTwos {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("enter number: ");
        int number = console.nextInt();
        showTwos(number);
    }
    
    public static void showTwos(int n){
        System.out.print(n + " = ");
        while(n % 2 == 0 ){
        System.out.print("2 * ");
        n = n / 2;    
        }
        System.out.println(n);
    }
}

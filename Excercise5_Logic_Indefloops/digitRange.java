/*
Write a method named digitRange that accepts an integer as a parameter and returns the range of values of its dig-
its. The range is defined as 1 more than the difference between the largest and smallest digit value. 
For example, the call of digitRange(68437) would return 6,
because the largest digit value is 8 and the smallest is 3, so 8 - 3 + 1 = 6. 
If the number contains only one digit, return 1 . 
You should solve this problem without using a String .
 */
package Excercise5_Logic_Indefloops;

/**
 *
 * @author dani
 */
import java.util.*;
public class digitRange {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("input integer: ");
        int n = console.nextInt();
        System.out.println(digitRange(n));
    }
    
    public static int digitRange(int n){
        int max = 0;
        int min = 10;
        int factor = 1;
        while (factor < n){
            int digit = (n % (factor*10))/factor;
            if (digit > max){
                max = digit;
            }else if(digit < min){
                min = digit;
            }
            factor = factor*10;
        }
    return max-min+1;
    }
}

/*
Write a method called pow that accepts a base and an exponent as parameters and returns the base raised to the given
power. For example, the call pow(3, 4) should return 3 * 3 * 3 * 3 , or 81 . Assume that the base and exponent
are nonnegative.
 */

/*
Modify your pow method from Exercise 4 to make a new method called pow2 that uses the type double for the first
parameter and that works correctly for negative numbers. For example, the call pow2(–4.0, 3) should return –4.0
* –4.0 * –4.0 , or –64.0 , and the call pow2(4.0, –2) should return 1 / 16 , or 0.0625 .
*/

package Excercise4_Conditional;
import java.util.*;
public class pow {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        System.out.print("input number: ");
        double n = console.nextDouble();
        System.out.print("input power: ");
        double p = console.nextDouble();
        
        System.out.printf("%.0f on the power  of %.0f equals: %.0f \n", n, p, + power(n, p));
    }
    
    public static double power(double a, double b){
        double result = a;
        for (int i = 1; i<b; i++){
            result = result*a;
        }
    return result;    
    }
}

/*
Write a method called evenSumMax that accepts a Scanner for the console as a parameter. The method should
prompt the user for a number of integers, then prompt the integer that many times. Once the user has entered all the
integers, the method should print the sum of all the even numbers the user typed, along with the largest even number
typed. You may assume that the user will type at least one nonnegative even integer. Here is an example dialogue:
How many integers? 4
Next integer? 2
Next integer? 9
Next integer? 18
Next integer? 4
Even sum = 24, even max = 18
 */
package Excercise4_Conditional;
import java.util.*;
public class evenSumMax {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        evenSumMax(console);        
    }
    
    public static void evenSumMax(Scanner console){
        System.out.print("how many integers? ");
        int num = console.nextInt();
        int sum = 0;
        int max = 0;
        
        for(int i = 0; i<num; i++){
            System.out.print("Next integer? ");
            int n = console.nextInt();
            if (n%2 != 0){
                sum +=n;
                if(n > max){
                    max = n;
                }
            }
        }
        System.out.printf("Even sum = %d, even max = %d \n", sum, max);
    }
}

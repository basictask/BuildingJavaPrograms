/*

 */
package test;

/**
 *
 * @author dani
 */
import java.util.*;
public class newd {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        for (int i = 0; i < 10; i++) {
            if(i%2 == 1){
                System.out.print(i+", ");
            }
        }
        
        int sum = 0;
        int num = 3;
        for (int i = 0; i < 3; i++) {
            System.out.print("enter number: ");
            int n = console.nextInt();
            sum += n;
        }
        System.out.println("average: "+ ((double)sum/num));
    }
}

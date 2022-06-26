/*

 */
package Chapter5;

/**
 *
 * @author dani
 */
import java.util.*;
public class booleanflag {
    public static Scanner console = new Scanner(System.in);
    public static void main(String[] args){
        double sum = 0.0;
        boolean negative = false;
        System.out.print("how many numbers? ");
        int total = console.nextInt();
        
        for (int i = 0; i<total; i++){
            System.out.print("enter number to add: ");
            double next = console.nextDouble();
            sum += next;
            if (sum < 0){
                negative = true;
            }
        }
        if (negative){
            System.out.println("sum went negative");
        } else {
            System.out.println("sum never went negative");
        }
    }
}

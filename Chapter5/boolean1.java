/*

 */
package Chapter5;

/**
 *
 * @author dani
 */
import java.util.*;
public class boolean1 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("imput number: ");
        int n = console.nextInt();
        bool(n);
    }
    
    public static void bool(int num){
        boolean positive = (num > 0);
        if(positive){
            System.out.println("positive");
        }else{
            System.out.println("not positive");
        }
    }
    
}

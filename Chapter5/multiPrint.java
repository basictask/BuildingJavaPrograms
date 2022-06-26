/*
fencepost algorithm with conditional execution

first solution, with condition inside loop

 */
package Chapter5;

/**
 *
 * @author dani
 */
import java.util.*;
public class multiPrint {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("input word and number of times to iterate: ");
        String str = console.next();
        int num = console.nextInt();
        
        multiPrint(str, num);
    }
    
    public static void multiPrint(String s, int n){
        System.out.print("[");
        for(int i=0; i<n; i++){
            System.out.print(s);
            if(i<n-1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}

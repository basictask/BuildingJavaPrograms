/*
Fencepost algrithm with conditional execution

second solution, with condition outside loop

 */
package Chapter5;

/**
 *
 * @author dani
 */
import java.util.*;
public class multiPrint2 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("input word and number of times to iterate: ");
        String str = console.next();
        int num = console.nextInt();
        
        multiPrint(str, num);
    }
    
    public static void multiPrint(String s, int n){
        if (n == 0){
            System.out.println("[]");
        }else{
            System.out.print("[");
            for(int i=0; i<n-1; i++){
                System.out.print(s + ", ");
            }
            System.out.println(s+"]");
        }    
    }
}


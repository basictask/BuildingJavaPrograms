/*

 */
package test;

/**
 *
 * @author dani
 */
import java.util.*;
public class Feladat_9 {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("enter number: ");
        int n = console.nextInt();
        
        System.out.println(nextPrime(n));
    }
    
    public static boolean isPrime (int n){
        int count = 0;
        
        for(int i=1; i<=n; i++){
            if(n % i == 0){
                count++;
            }
        }
        
        if(count == 2){
            return true;
        }
        
        return false;
    }
    
    public static int nextPrime (int n){
        boolean b1 = false;
        int a = n;
        
        while(b1 != true ){
            a++;
            b1 = isPrime(a);
        }
        
        boolean b2 = false;
        int b = n;
        
        while(b2 != true){
            b--;
            b2 = isPrime(b);
        }
        
        System.out.println("over: "+a);
        System.out.println("under: "+b);
        System.out.println();
        
        int a1 = n-b;
        int a2 = a-n;
        
        if(a1 < a2){
            return b;
        }else{
            return a;
        }
    }
}

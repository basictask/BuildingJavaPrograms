/*
This program tells you all the prime numbers up to a given maximum
 */
package Chapter_11;

/**
 *
 * @author dani
 */
import java.util.*;
public class Sieve {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("enter maximum: ");
        int max = console.nextInt();
        List<Integer> primes = sieve(max);
        System.out.println(primes);
        
    }
    
    public static List<Integer> sieve(int max){
        List<Integer> primes = new LinkedList<Integer>();
        List<Integer> numbers = new LinkedList<Integer>();
        
        for(int i = 2; i<=max; i++){
            numbers.add(i);
        }
        
        while(!numbers.isEmpty()){
            int front = numbers.remove(0);
            primes.add(front);
            
            Iterator<Integer> itr = numbers.iterator();
            while(itr.hasNext()){
                int current = itr.next();
                if(current % front == 0){
                    itr.remove();
                }
            }
        }
        return primes;
    }
}

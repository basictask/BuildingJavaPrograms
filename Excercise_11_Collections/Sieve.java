/*
This program tells you all the prime numbers up to a given maximum
 */
package Excercise_11_Collections;

/*
Modify the Sieve program developed in Section 11.1 to make two optimizations. 
First, instead of storing all integers up to the maximum in the numbers list, 
store only 2 and all odd numbers from 3 upward. Second, write code to ensure 
that if the first number in the numbers list ever reaches the square root of the maximum, 
all remaining values from the numbers list are moved into the primes list. 
*/

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
            if(i%2 != 0){
                numbers.add(i);
            }
        }
        
        while(!numbers.isEmpty()){
            int front = numbers.remove(0);
            
            if(front == Math.sqrt(max)){
                for(int n : numbers){
                    primes.add(n);
                }
                return primes;
            }
            
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

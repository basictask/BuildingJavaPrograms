/*
Write a method called consecutive that accepts three integers as parameters and returns true if they are three
consecutive numbers—that is, if the numbers can be arranged into an order such that, assuming some integer k ,
the parameters’ values are k , k + 1 , and k + 2.

Your method should return false if the integers are not consecutive.

Note that order is not significant; your method should return the same result for the same three integers passed in any order.
For example, the calls consecutive(1, 2, 3) , consecutive(3, 2, 4) , and consecutive(–10, –8, –9) would return true . 
The calls consecutive(3, 5, 7) , consecutive(1, 2, 2) , and consecutive(7, 7, 9) would return false .
 */
package Excercise5_Logic_Indefloops;

/**
 *
 * @author dani
 */
import java.util.*;
public class consecutive {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("enter 3 integers: ");
        int n1 = console.nextInt();
        int n2 = console.nextInt();
        int n3 = console.nextInt();
        System.out.println(consecutive(n1, n2, n3));
    }
    
    public static boolean consecutive(int numberOne,int numberTwo,int numberThree) {
    if(((numberTwo==numberOne-1) && (numberThree== numberTwo-1)) || 
            ((numberTwo==numberOne+1) && (numberThree==numberTwo+1)) || 
            ((numberTwo==numberOne+2) && (numberThree==numberOne+1)) || 
            ((numberTwo==numberOne-1) && (numberThree==numberOne+1)) || 
            ((numberTwo==numberOne-2) && (numberThree==numberOne-1)) ||
            ((numberTwo==numberOne+1) && (numberThree==numberOne-1))){
        return true;
    }else{
        return false;
    }
}
}

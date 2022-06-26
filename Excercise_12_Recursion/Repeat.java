/*
Write a recursive method called repeat that accepts a string s and an integer n as parameters 
and that returns s concatenated together n times. 

For example, repeat("hello", 3) returns "hellohellohello", 
and repeat("ok", 1) returns "ok" , and repeat("bye", 0) returns "". 

String concatenation is an expensive operation, so for an added challenge 
try to solve this problem while performing fewer than n concatenations.
 */
package Excercise_12_Recursion;

/**
 *
 * @author dani
 */
public class Repeat {
    public static void main(String[] args){
        System.out.println("repeat(hello, 3):  "+repeat("hello", 3));
        System.out.println("repeat(ok, 1):  "+repeat("ok", 1));
        System.out.println("repeat(bye, 0):  "+repeat("bye", 0));
    }
    
    public static String repeat(String s, int n){
        if(n<0){
            throw new IllegalArgumentException();
        }else if(n==0){
            return "";
        }else if(n==1){
            return s;
        }else if(n%2==0){
            return s.concat(repeat(s, n-1));
        }else{
            String a = s+s;
            return a.concat(repeat(s, n-2));
        }
    }
}

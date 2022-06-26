/*
Write a method called toBinary that accepts an integer as a parameter and returns a String containing that
integer’s binary representation. For example, the call of printBinary(44) should return "101100" .
 */
package Excercise5_Logic_Indefloops;

/**
 *
 * @author dani
 */
import java.util.*;
public class toBinary {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("input number: ");
        int number = console.nextInt();
        System.out.println("binary representation: "+toBinary(number));
    }
    
    public static String toBinary(int n){
        String bin = "";
        while(n>0){
            
            if(n%2==1){
                bin = "1"+bin;
            }else{
                bin = "0"+bin;
            }
            n = n/2;
        }
    return bin;
    }
}

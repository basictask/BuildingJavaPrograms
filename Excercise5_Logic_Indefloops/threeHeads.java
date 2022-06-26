/*
Write a method called threeHeads that repeatedly flips a coin until the results of the coin toss are three heads in a
row. You should use a Random object to make it equally likely that a head or a tail will appear. Each time the coin is
flipped, display H for heads or T for tails. When three heads in a row are flipped, the method should print a congrat-
ulatory message. 
Here is a possible output of a call to the method:
T T H T T T H T H T H H H
Three heads in a row!
 */
package Excercise5_Logic_Indefloops;

/**
 *
 * @author dani
 */
import java.util.*;
public class threeHeads {
    public static void main(String[] args){
        System.out.println(threeHeads());
        System.out.println("Three heads in a row!");
    }
    
    public static String threeHeads(){
        Random r = new Random();
        int n = 0;
        String result = "";
        while (n != 3){
            int coin = r.nextInt(2);
            if (coin == 0){
                result = result + "H ";
                n++;
            }else{
                result = result + "T ";
                n = 0;
            }
        }
    return result;
    }
    
}

/*
This program rolls two dices until the sum of the two rolls will be a given number
*/
package Chapter5;
import java.util.*;
public class Dice {
    public static void main(String[] args){
        Random r = new Random();
        int sum = 0;
        
        while(sum<12){
            int d1 = r.nextInt(6)+1;
            int d2 = r.nextInt(6)+1;
            sum = d1+d2;
            System.out.printf("roll1: %d, roll2: %d, sum: %d \n", d1, d2, sum);
        }        
    }
}

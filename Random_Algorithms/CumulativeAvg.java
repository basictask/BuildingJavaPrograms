package test;

/* This program calculates the average of numbers entered by the user
and how many negative numbers the user entered.
*/

import java.util.*;
public class CumulativeAvg {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        System.out.print("How many numbers? ");
        int total = console.nextInt();
        
        double sum = 0;
        int negatives = 0;
        int numbers = 0;
        
        for (int i = 1; i <= total; i++){
            System.out.print("Input number #"+i+": ");
            double next = console.nextDouble();
            sum += next;
            
            if (next < 0){
                negatives += 1;
                numbers += 1;
            } else {
                numbers += 1;
            }    
        }
        
        if (sum >= 0){
            System.out.println();
            System.out.println("Average of numbers: "+sum/numbers);
            System.out.println("Negatives entered: "+negatives);
        }else{
            System.out.println();
            System.out.println("No numbers to average");
            System.out.println("Negatives entered: "+negatives);
        }
    }
}

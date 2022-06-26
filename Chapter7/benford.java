/*
This program finds the distribution of leading digits in a set of positive integers.
The program is useful for exploring the phenomenon known as Benford's Law.
 */
package Chapter7;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class benford {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("benford.txt"));
        int[] count = countDigits(input);
        reportResults(count);
    }
    
    public static int firstDigit(int n){
        int result = Math.abs(n);
        while(result >= 10){
            result = result / 10;
        }
        return result;
    }
    
    public static int[] countDigits(Scanner input){
        int[] count = new int[10];
        while(input.hasNextInt()){
            int next = input.nextInt();
            count[firstDigit(next)]++;
        }
        return count;
    }

    public static int sum(int[] data){
        int sum = 0;
        for(int n : data){
            sum+=n;
        }
        return sum;
    }
    
    public static void reportResults(int[] count){
        if(count[0] > 0){
            System.out.println("excluding"+count[0]+"zeros");
        }
        int total = sum(count)-count[0];
        System.out.println("digit count percent: ");
        for(int i = 1; i<count.length; i++){
            double pct = count[i]*100/total;
            System.out.printf("%5d %5d %6.2f\n", i, count[i], pct);
        }
        System.out.printf("Total %5d %6.2f\n", total, 100.0);
    }
}

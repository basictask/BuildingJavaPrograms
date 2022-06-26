/*
This program takes students grades from a file and counts the occurences of each grades 0-4.
 */
package Chapter7;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class tally {
    public static void main(String[] args) throws FileNotFoundException { 
        Scanner input = new Scanner(new File("grades.txt"));
        int[] count = new int[5];
        while(input.hasNextInt()){
            int next = input.nextInt();
            count[next]++;
        }
        
        System.out.println("Grade\tOccurence");
        for(int i=0; i<count.length; i++){
            System.out.println(i+"\t"+count[i]);
        }
    }
}

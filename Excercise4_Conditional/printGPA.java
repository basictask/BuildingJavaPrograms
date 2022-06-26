/*
Write a method called printGPA that accepts a Scanner for the console as a parameter and calculates a student’s
grade point average. The user will type a line of input containing the student’s name, then a number that represents
the number of scores, followed by that many integer scores. Here are two example dialogues:

Enter a student record: Maria 5 72 91 84 89 78
Maria's grade is 82.8

Enter a student record: Jordan 4 86 71 62 90
Jordan's grade is 77.25

Maria’s grade is 82.8 because her average of (72 + 91 + 84 + 89 + 78) / 5 equals 82.8.
 */

package Excercise4_Conditional;
import java.util.*;
public class printGPA {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println(printGPA(console));
    }
    
    public static int printGPA(Scanner console){
        int sum = 0;
        System.out.print("Enter a student record :");
        String name = console.next();
        int n = console.nextInt();
        
        for(int i=0; i<n; i++){
            int m = console.nextInt();
            sum += m;
        }
        
    return sum/n;    
    }
    
}

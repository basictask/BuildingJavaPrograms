package test;

/*Ez a program bekér a felhasználótól egy számot, 
majd összead annyi darab felhasználótól bekért számot.
*/
import java.util.*;

public class howManyNumbers {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        System.out.print("How many numbers do you have? ");
        int a = console.nextInt();
        double sum = 0.0;
        
        for (int i=1; i<=a; i++){
            System.out.print("number to add: ");
            double next = console.nextDouble();
            sum += next;
        }
        System.out.println("The sum of the numbers you have entered: "+sum);
    }
}

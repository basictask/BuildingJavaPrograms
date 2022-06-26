/*Write a method called repl that accepts a String and a number of repetitions as parameters and returns the
String concatenated that many times. For example, the call repl("hello", 3) should return
"hellohellohello" . If the number of repetitions is zero or less, the method should return an empty string.*/

package Excercise4_Conditional;
import java.util.*;
public class repl {
    static Scanner console = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("input string: ");
        String word = console.next();
        System.out.print("input number of repetitions: ");
        int num = console.nextInt();
        
        System.out.println(rep(word, num));
    }
  
    public static String rep(String s, int n){
        String result = "";
        for (int i=0; i<=n; i++){
            result = result+s;
        }
    return result;
    }
}

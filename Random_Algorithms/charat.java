/* This program returns a given character's index inside a given string. 
 */
package test;
import java.util.*;

public class charat {
    public static void main(String[] args){
        
        Scanner console = new Scanner(System.in);
        System.out.print("Input string: ");
        String str = console.nextLine();
        System.out.print("Input character: ");
        char cha = console.next().charAt(0);
        
        System.out.println(at(cha, str));
    }
    
    public static int at(char ch, String s){
        int l = s.length();
        for(int i=0; i < l; i++){
            if (s.charAt(i)==ch){
                return i+1;
            }
        }
        return -1;
    }
}

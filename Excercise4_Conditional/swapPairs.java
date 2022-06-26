/*
 Write a method called swapPairs that accepts a String as a parameter and returns that String with each pair of
adjacent letters reversed. If the String has an odd number of letters, the last letter is unchanged. 
For example, the call swapPairs("example") should return "xemalpe" and the call swapPairs("hello there") should return
"ehll ohtree" .

example xemalpe
 */
package Excercise4_Conditional;
import java.util.*;
public class swapPairs {
    public  static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Input your sentence: ");
        String str = console.nextLine();
        System.out.println(swapPairs(str));
    }
    
    public static String swapPairs(String s){
        int l = s.length();
        String result = "";
        
        if (l%2 == 0){
            for (int i = 0; i<l; i+=2){
                String a = Character.toString(s.charAt(i));
                String b = Character.toString(s.charAt(i+1));
                String c = b.concat(a);
                
                result = result + c;
                
            }
            
        }else if (l%2==1){
            for(int i=0; i<l-1; i+=2){
                String a = Character.toString(s.charAt(i));
                String b = Character.toString(s.charAt(i+1));
                String c = b.concat(a);
                
                result = result + c;
            }
            result = result + s.charAt(l-1);
            
        }
        return result;
    }
}

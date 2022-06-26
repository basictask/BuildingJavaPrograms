/*
Write a recursive method called isReverse that accepts two strings as parameters and returns true 
if the two strings contain the same sequence of characters as each other but in the opposite order, 
and false otherwise. 
For example, the call of isReverse("hello", "eLLoH") would return true . 
The empty string, as well as any one-letter string, is considered to be its own reverse.
 */
package Excercise_12_Recursion;

/**
 *
 * @author dani
 */
public class IsReverse {
    public static void main(String[] args){
        System.out.println("(Hello, olleh): "+isReverse("Hello", "olleh"));
        System.out.println("empty string: "+isReverse("", ""));
    }
    
    public static boolean isReverse(String s1, String s2){
        if(s1.isEmpty() && s2.isEmpty()){
            return true;
        }
        
        String result = "";
        s1 = s1.toLowerCase();
        
        for(int i=s2.length()-1; i>=0; i--){
            result += s2.charAt(i);
        }
        s2 = result.toLowerCase();
        
        int count = 0;
        boolean b = reverse(s1, s2, count);    
        return b;
    }
    
    private static boolean reverse(String s1, String s2, int count){
        char c1 = s1.charAt(count);
        char c2 = s2.charAt(count);
        
        if(c1 != c2){
            return false;
        }else if(count == s1.length()-1){
            return true;
        }else{
            return reverse(s1, s2, count+1);
        }        
    }
}

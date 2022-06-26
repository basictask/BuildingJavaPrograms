/*
This program reverses the contents of a string, and counts how many times a specific letter occurs in the string.
 */
package Chapter7;

/**
 *
 * @author dani
 */
public class reverseString {
    public static void main(String[] args){
        String s = "This is a sample string to reverse.";
        count(s, 'i');
        System.out.println("Your string reversed: "+reverse (s));
    }
    
    public static void count(String s, char ch){
        int count = 0;
        for(int i = 0; i<s.length(); i++){
            if(ch == s.charAt(i)){
                count++;
            }
        }
        System.out.println("number of occurences: "+count);
    }
    
    public static String reverse(String s){
        String result = "";
        for(int i = 0; i<s.length(); i++){
            result = s.charAt(i)+result;
        }
        return result;
    }
}

/* Write a method called wordCount that accepts a String as its parameter and returns the number of words in 
the String. A word is a sequence of one or more nonspace characters (any character other than ' '). For example,
the call wordCount("hello") should return 1, the call wordCount("how are you?") should return 3, the call
wordCount(" this string has wide spaces ") should return 5, and the call wordCount(" ") should
return 0. */
import java.util.Arrays;

public class wordCount {
    public static void main(String[] args){
        String s1 = "hello";
        String s2 = "  wide  space  row  ";
        String s3 = "simple row of words";
        
        count(s1);
        count(s2);
        count(s3);
    }

    public static void count(String s){
        s = s.replaceAll("^\\s+", "");
        
		String[] arr = s.split("\\s+");
        
		System.out.println(Arrays.toString(arr));
        System.out.println("Number of words: " + arr.length);
        System.out.println("");
    }
}

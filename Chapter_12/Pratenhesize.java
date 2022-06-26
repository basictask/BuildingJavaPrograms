/*
this program puts n parentheses around a string, throws an exception when passed a negative number
 */
package Chapter_12;

/**
 *
 * @author dani
 */
public class Pratenhesize {
    public static void main(String[] args){
        System.out.println(parenthesize("hello", 4));
        System.out.println(parenthesize("john", 1));
        System.out.println(parenthesize("blow", 0));
        System.out.println(parenthesize("snow", -2));        
    }
    
    public static String parenthesize(String s, int n){
        if(n<0){
            throw new IllegalArgumentException();
        }else if(n==0){
            return s;
        }else{
            return "(" + parenthesize(s, n-1) + ")";
        }
    }
}

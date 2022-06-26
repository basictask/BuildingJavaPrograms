package test;

import java.util.*;
public class capital {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        
        System.out.print("input word: ");
        String word = console.next();
        
        System.out.println(capital(word));
    }
    
    public static String capital(String word){
        
        char ch = word.charAt(0);
        String result;
        if ( Character.isUpperCase(ch)){
            result = "true";
        }else{
            result = "false";
        }
    return result;
    }
    
    
    
}

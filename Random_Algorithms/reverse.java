package test;

//This program reverses a text given by the user

import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Input text: ");
        String txt = console.next();
        String rev = reverse(txt);
        System.out.println("reversed: "+rev);
    }
    
    public static String reverse(String text){
        String result="";
        for (int i=0; i<text.length(); i++){
            result=text.charAt(i)+result;
        }
    return result;
    }
}

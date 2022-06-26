
package test;

//This program prints the characters of a string below eachother

import java.util.*;
public class printVertical {
    public static void printstring(String szo){
        for (int i = 1; i<= szo.length(); i++){
            System.out.println("#"+i+": "+ szo.charAt(i));
        }
    }
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = console.next();
        printstring(text);
    }
}

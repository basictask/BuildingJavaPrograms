package test;

//This program calulates how many times a character occurs in a text
//Both input by the user

import java.util.*;
public class charcount{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
 
        System.out.println("number of characters in input: " + charcount(console));
    }
    
    public static int charcount(Scanner console){
        
        System.out.print("input text: ");
        String text = console.nextLine();
        
        System.out.print("input character: ");
        char ch = console.next(".").charAt(0); 
        
        int found = 0;
        for(int i=0; i<text.length(); i++){
            if (ch == text.charAt(i)){
                found++;
            }
        }
        return found;
    }
}

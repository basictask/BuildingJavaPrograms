/*
Write a method called randomLines that prints between 5 and 10 random strings of letters (between “a” and “z”), one
per line. Each string should have random length of up to 80 characters.
 */
package Excercise5_Logic_Indefloops;

/**
 *
 * @author dani
 */
import java.util.*;
public class randomLines {
    public static void main(String[] args){
        randomLines();
    }
    
    public static void randomLines(){
        Random r = new Random();
        int row = 5+r.nextInt(5);
        
        for(int i=0; i<row; i++){
            int line = r.nextInt(81);
            int n = 0;
            while(n<line){
                int ch = 97+r.nextInt(26);
                System.out.print((char)ch);
                n++;
            }
            System.out.println();
        }
    }
}

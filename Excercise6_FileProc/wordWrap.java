/*
Write a method called wordWrap that accepts a Scanner representing an input file as its parameter and outputs each
line of the file to the console, word-wrapping all lines that are longer than 60 characters. For example, if a line con-
tains 112 characters, the method should replace it with two lines: one containing the first 60 characters and another
containing the final 52 characters. A line containing 217 characters should be wrapped into four lines: three of length
60 and a final line of length 37.
 */
package Excercise6_FileProc;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class wordWrap {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = getFile();
        wordWrap(input);
        
    }
    
    public static void wordWrap(Scanner input){
        if(input.hasNextLine()){
            while(input.hasNextLine()){
                String line = input.nextLine();
                int count = 0;
                while (count<line.length()){
                    int l = line.length();
                    int rest=0;
                    if((line.substring(count, l).length())>60){
                        rest = 60;
                    }else{
                        rest = line.substring(count, l).length();
                    }
                    System.out.println(line.substring(count,count+rest-1));
                    count+=rest;
                }                
            }
        }
    }
    
    public static Scanner getFile()throws FileNotFoundException{
        Scanner console = new Scanner(System.in);
        System.out.print("input file name: ");
        File f = new File(console.nextLine());
        while(!f.canRead()){
            System.out.println("404");
            System.out.print("input file name: ");
            f = new File(console.nextLine());
        }
    return new Scanner(f);
    }
}

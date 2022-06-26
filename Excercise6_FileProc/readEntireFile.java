/*
Write a method called readEntireFile that accepts a Scanner representing an input file as its parameter, then
reads that file and returns its entire text contents as a String .
 */
package Excercise6_FileProc;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class readEntireFile {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = getFile();
        System.out.println(content(input));
    }
    
    public static Scanner getFile()throws FileNotFoundException{
        Scanner console = new Scanner(System.in);
        System.out.println("input file to read: ");
        File f = new File(console.nextLine());
        while(!f.canRead()){
            System.out.println("404");
            System.out.println("try again: ");
            f = new File(console.nextLine());
        }
    return new Scanner(f);
    }
    
    public static String content(Scanner input){
        String result = "";
        if(input.hasNextLine()){
            while(input.hasNextLine()){
                String line = input.nextLine();
                result = result + line + "\n";
            }
        }
    return result;
    }
}

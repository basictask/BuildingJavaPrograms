/*
This program prints random characters into given-length lines. output is a file
 */
package Excercise6_FileProc;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class printlinestofile {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(System.in);
        PrintStream output = new PrintStream(new File("randlin.txt"));
        Random r = new Random();
        System.out.print("input how many lines: ");
        int lnum = console.nextInt();
        
        for(int i = 0; i<lnum; i++){
            int n = 0;
            int llen = 20+r.nextInt(60);
            while(n<llen){
                int ch = 97+r.nextInt(26);
                output.print((char)ch);
                n++;
            }
            output.println();
        } 
    }
}

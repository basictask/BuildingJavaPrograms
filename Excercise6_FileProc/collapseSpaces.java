/*
Write a method called collapseSpaces that accepts a Scanner representing an input file as its parameter, then
reads that file and outputs it with all its tokens separated by single spaces, collapsing any sequences of multiple
spaces into single spaces. 
For example, consider the following text:

many   spaces   on   this   line!

If this text were a line in the file, the same line should be output as follows:

many spaces on this line!
 */
package Excercise6_FileProc;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class collapseSpaces {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("collapsespaces.txt"));
        
        while(input.hasNextLine()){
            String line = input.nextLine();
            fixer(line);
        }
    }
    
    public static void fixer(String line){
        Scanner data = new Scanner(line);
        if(data.hasNext()){
            System.out.print(data.next());
            while(data.hasNext()){
                System.out.print(" "+data.next());
            }
            System.out.println();
        }
    }
}

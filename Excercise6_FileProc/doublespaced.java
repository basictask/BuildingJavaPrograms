/*
Write a method called doubleSpace that accepts a Scanner for an input file and a PrintStream for an output file
as its parameters, writing into the output file a double-spaced version of the text in the input file. 
You can achieve this task by inserting a blank line between each line of output.
 */
package Excercise6_FileProc;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class doublespaced {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner data = new Scanner(System.in);
        Scanner input = getFile();
        PrintStream output = new PrintStream(new File("doubleSpaces.txt"));
        
        while(input.hasNextLine()){
            String line = input.nextLine();
            doubler(line, output);
            doubler(line, System.out);
        }
    }
    
    public static void doubler(String line, PrintStream output){
        Scanner sca = new Scanner(line);
        if (sca.hasNext()){
            output.print(sca.next());
            while (sca.hasNext()){
                output.print("  "+sca.next());
            }
            output.println();
            output.println();
        }
    }
    
    public static Scanner getFile() throws FileNotFoundException{
        Scanner console = new Scanner(System.in);
        System.out.print("input file to read: ");
        File f = new File(console.nextLine());
        while(!f.canRead()){
            System.out.println("404");
            System.out.print("input file to read: ");
            f = new File(console.nextLine());
        }
    return new Scanner(f);
    }
}

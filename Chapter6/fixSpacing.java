/*
The purpose of this program is to read a file, which has too many spaces between words,      
and produce an output file, where the spacing is fixed.
spaced.txt ---->  unspaced.txt
 */
package Chapter6;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class fixSpacing {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new File("spaced.txt"));
        PrintStream output = new PrintStream(new File("unspaced.txt"));
        
        while(input.hasNextLine()){
            String line = input.nextLine();
            fixer(line, output);
            fixer(line, System.out);
        }
    }
    
    public static void fixer(String line, PrintStream output){
        Scanner data = new Scanner(line);
        
        if (data.hasNext()){
            output.print(data.next());
            while(data.hasNext()){
                output.print(" "+data.next());
                
            }    
        output.println();
        }
    }
}    

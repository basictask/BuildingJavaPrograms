/*
The purpose of this program is to read a file, which has too many spaces between words,      
and produce an output file, where the spacing is fixed.
The filename is innput by the user.
spaced.txt ---->  unspaced.txt

 */
package Chapter6;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class fixSpacing_2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner console = new Scanner(System.in);
        Scanner input = getInput(console);
        PrintStream output = new PrintStream(new File("unspaced.txt"));
        
        while(input.hasNextLine()){
            String line = input.nextLine();
            fixer(line, output);
            fixer(line, System.out);
        }
    }
    
    public static Scanner getInput(Scanner console) throws FileNotFoundException{
        System.out.print("input filename: ");
        File f = new File(console.nextLine());
        while(!f.canRead()){
            System.out.println("404");
            System.out.print("input filename: ");
            f = new File(console.nextLine());
        }
    return new Scanner(f);
    }
    
    public static void fixer(String line, PrintStream output){
        Scanner data = new Scanner(line);
        if(data.hasNext()){
            output.print(data.next());
            while(data.hasNext()){
                output.print(" "+data.next());
            }
        }
        output.println();
    }
}

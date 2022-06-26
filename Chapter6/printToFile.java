/*
This program  prints a sample sentence to a file.
 */
package Chapter6;

/**
 *
 * @author dani
 */
import java.io.*;
public class printToFile {
    public static void main(String[] args) throws FileNotFoundException{
        PrintStream output = new PrintStream(new File("hello.txt"));
        output.println("Hello world.");
    }
}

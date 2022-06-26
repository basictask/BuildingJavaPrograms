/*
Modify the preceding wordWrap method so that it outputs the newly wrapped text back into the original file. (Be
careful—don’t output into a file while you are reading it!) Also, modify it to use a class constant for the maximum
line length rather than hard-coding 60.
The file storing the default lines is wordwrap.txt
 */
package Excercise6_FileProc;

/**
 *
 * @author dani
 */
import java.io.*;
import java.util.*;
public class wordWrap_2 {
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = getFile();
        PrintStream output = new PrintStream(new File("wordwrap.txt"));
        wordWrap(input, output);
    }
    
    public static void wordWrap(Scanner input, PrintStream output){
        Scanner data = new Scanner(System.in);
        System.out.print("input line length: ");
        int llen = data.nextInt();
        
        if(input.hasNextLine()){
            while(input.hasNextLine()){
                String line = input.nextLine();
                int count = 0;
                while (count<line.length()){
                    int l = line.length();
                    int rest=0;
                    if((line.substring(count, l).length())>llen){
                        rest = llen;
                    }else{
                        rest = line.substring(count, l).length();
                    }
                    output.println(line.substring(count,count+rest-1));
                    count+=llen;
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

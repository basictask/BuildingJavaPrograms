/*
This program grabs the items from a directory and outputs them into a .csv file.
 */
package test_2;
import java.util.*;
import java.io.*;
public class DirItemsTocsv {
    public static void main(String[] args) throws FileNotFoundException{
        File f = new File("C:\\Users\\Daniel Kuknyo\\Documents\\NetBeansProjects\\test\\THG");
        
        if(!f.exists()){
            System.out.println("404");
        }else{
            tocsv(f);
        }
    }
    
    public static void tocsv(File f) throws FileNotFoundException{
        PrintStream output = new PrintStream(new File("thgnames.csv"));
        for (File sub : f.listFiles()) {
            output.println(sub);
        }
    }
}
